import dotty.tools.dotc.ast.tpd
import scala.annotation.{MacroAnnotation, experimental, tailrec}
import scala.collection.immutable.{AbstractSeq, LinearSeq}
import scala.compiletime.*
import scala.deriving.Mirror
import scala.quoted.*
import scala.quoted.runtime.impl.{ExprImpl, QuotesImpl, SpliceScope}

// TODO: Tidy up syntax.
trait DataSource extends Selectable {
  // These need to be visible members of the result otherwise if fails to compile, saying that they are not a member.
  def selectDynamic(name: String): Any
//  def applyDynamic(name: String)(args: Any*): Any
}

transparent inline def data[T](source: T) =
  ${ dataImpl[T]('source) }

@experimental
private def dataImpl[T: Type](source: Expr[T])(using Quotes): Expr[Any] =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*
//  import quotes.reflect.*

  val quotesImpl: QuotesImpl = quotes.asInstanceOf[QuotesImpl]
  implicit val context = quotesImpl.ctx

  val LocalParamAccessor = Flags.Local | Flags.ParamAccessor | Flags.Private

  def unsafeToExpr[A](tree: Tree): Expr[A] =
    // There doesn't seem to be any other way to convert a Definition to an Expr[Unit] despite being able to do that
    // with quotes. We can't use quotes since you cannot splice in parts of expressions which is what you need to be
    // able to do to support arbitrary number of parameters etc.
    // HINT: Take a look at dotty.tools.dotc.typer.QuotesAndSplices
    ExprImpl(tree.asInstanceOf[tpd.Tree], SpliceScope.getCurrent).asInstanceOf[Expr[A]]

  // NOTE: Don't forget that any constructor parameters also need a ValDef if you want them to be accessible.
  def replacePrimaryConstructor(
      cls: Symbol,
      clsDef: ClassDef,
      paramNames: List[String],
      paramInfosExp: MethodType => List[TypeRepr],
      rhsFn: List[List[Tree]] => Option[Term] = _ => None
  ): ClassDef =
    // It seems we have to use a really convoluted process to specify our own constructor.
    val DefDef(ctorName, _, _, _) = clsDef.constructor
    val ctorMethodType = MethodType(paramNames)(paramInfosExp, _ => cls.typeRef)
    val ctorSym = Symbol.newMethod(cls, ctorName, ctorMethodType, Flags.Synthetic, Symbol.noSymbol)
    // TODO: How else do we replace the primary constructor?
    //  newClass adds one for us but doesn't allow us to add params etc.
    cls.asInstanceOf[dotty.tools.dotc.core.Symbols.ClassSymbol]
      .replace(
        cls.primaryConstructor.asInstanceOf[dotty.tools.dotc.core.Symbols.Symbol],
        ctorSym.asInstanceOf[dotty.tools.dotc.core.Symbols.Symbol]
      )
    val ctorDef = DefDef(ctorSym, rhsFn)
    ClassDef.copy(clsDef)(clsDef.name, ctorDef, clsDef.parents, None, clsDef.body)

  val sourceTpe = TypeRepr.of[T]
  val sourceSym = sourceTpe.typeSymbol
  val sourceTypeRef = sourceSym.typeRef

  type Fields = List[(String, TypeRepr)]

  def productFields[Labels <: Tuple: Type, Types <: Tuple: Type]: Fields =
    @tailrec
    def loop[Labels2 <: Tuple: Type, Types2 <: Tuple: Type](result: Fields): Fields =
      Type.of[Labels2] match {
        case '[EmptyTuple] => result
        case '[tLabel *: tLabelTail] =>
          Type.of[Types2] match {
            case '[EmptyTuple] => result
            case '[t *: tTail] =>
              val label: String = Type.valueOfConstant[tLabel].get.toString
              val tpe = TypeRepr.of[t]
              loop[tLabelTail, tTail](label -> tpe :: result)
          }
      }
    loop[Labels, Types](Nil).reverse
  end productFields

  def dataRefinementType(fields: Fields): TypeRepr =
    fields.foldLeft(RecursiveType(_ => TypeRepr.of[DataSource])) {
      case (result, (label, tpe)) =>
        val resultWithField = Refinement(result, label, tpe)
        // FIXME: What type to use?
        //val withResultType = result.recThis
        val withResultType = TypeRepr.of[Any]
        val withMethodType = MethodType(List(label))(_ => List(tpe), _ => withResultType)
        // TODO: Ensure that there is no name conflict.
        val resultWithMethod = Refinement(resultWithField, s"with${label.capitalize}", withMethodType)
        RecursiveType(_ => resultWithMethod)
    }
  end dataRefinementType

  def dataClass(fields: Fields): (Symbol, ClassDef) =
    val name = Symbol.freshName("Data")
    // TODO: Copy the parents (if not sealed).
    val parents = List(TypeTree.of[Object], TypeTree.of[DataSource], TypeTree.of[Selectable])
    val sourceParamName = Symbol.freshName("source")
    def decls(cls: Symbol) =
      List(
        Symbol.newVal(cls, sourceParamName, sourceTpe, LocalParamAccessor, cls), //Symbol.noSymbol),
        Symbol.newMethod(cls, "selectDynamic", MethodType(List("name"))(_ => List(TypeRepr.of[String]), _ => TypeRepr.of[Any]))
      )
    val cls = Symbol.newClass(Symbol.spliceOwner, name, parents.map(_.tpe), decls, selfType = None)
    // NOTE: Do not forget to put the symbol in the decls!
    //  If you do then the code looks fine but it's not a real member and you get really confusing errors.
    val body = List[Statement](
      ValDef(
        cls.declaredField(sourceParamName),
        None
      ),
      DefDef( //
        cls.methodMember("selectDynamic").head,
        _ => Some(Match(
          selector = '{ "name" }.asTerm,
          cases = fields.map {
            case (label, _) => CaseDef(
              pattern = Literal(StringConstant(label)),
              guard = None,
              rhs = Select(
                qualifier = Ident(TermRef(This(cls).tpe, sourceParamName)),
                symbol = sourceSym.fieldMember(label)
              )
            )
          }
        ))
      )
    )
    val clsDef = replacePrimaryConstructor(
      cls = cls,
      clsDef = ClassDef(cls, parents, body),
      paramNames = List(sourceParamName),
      paramInfosExp = _ => List(sourceTypeRef),
      rhsFn = _ => None
    )
    cls -> clsDef
  end dataClass

  // TODO: Remove the get
  // TODO: Add fallback cases everywhere
  Expr.summon[Mirror.ProductOf[T]].get match
    case '{
      type mels <: Tuple
      type mets <: Tuple
      $m: Mirror.ProductOf[T] {
        type MirroredElemLabels = `mels`
        type MirroredElemTypes = `mets`
      }
    } =>
      val fields = productFields[mels, mets]
      val (cls, clsDef) = dataClass(fields)
      val tData = dataRefinementType(fields).asType
      val newCls = Apply(Select(New(TypeIdent(cls)), cls.primaryConstructor), List(source.asTerm))
      // TODO: Why do we have to match here? tData.Underlying doesn't seem to work.
      tData match {
        case '[data] =>
          '{
             ${unsafeToExpr(Block(stats = List(clsDef), expr = newCls))}.asInstanceOf[data]
          }
      }

end dataImpl
