import scala.annotation.{experimental, nowarn, tailrec}
// TODO: Get rid of this.
import scala.compiletime.*
import scala.deriving.Mirror
import scala.quoted.*

// TODO: Tidy up syntax.
trait DataSource extends Selectable {
  // These need to be visible members of the result otherwise if fails to compile, saying that they are not a member.
  def selectDynamic(name: String): Any
  def applyDynamic(name: String)(args: Any*): Any
}

transparent inline def data[T](source: T) =
  ${ dataImpl[T]('source) }

@experimental
private def dataImpl[T: Type](source: Expr[T])(using Quotes): Expr[Any] =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*
//  import quotes.reflect.*

  val LocalParamAccessor = Flags.Local | Flags.ParamAccessor | Flags.Private

  // scala.annotation.{experimental, nowarn}
  //val NoWarnSymbol = Symbol.unique(Symbol.unique(defn.ScalaPackage, "annotation"), "nowarn")
  val NoWarn = TypeRepr.of[scala.annotation.nowarn].typeSymbol

  // TODO: Update the symbol before creating the initial ClassDef.
  // NOTE: Don't forget that any constructor parameters also need a ValDef if you want them to be accessible.
  // See https://users.scala-lang.org/t/unable-to-set-primary-constructor-for-symbol-newclass-oversight-or-intentional/9277
  def replacePrimaryConstructor(
      cls: Symbol,
      clsDef: ClassDef,
      paramNames: List[String],
      paramInfosExp: MethodType => List[TypeRepr],
      rhsFn: List[List[Tree]] => Option[Term] = _ => None,
      body: Symbol => List[Statement]
  ): ClassDef =
    // It seems we have to use a really convoluted process to specify our own constructor.
    val quotesImpl = quotes.asInstanceOf[scala.quoted.runtime.impl.QuotesImpl]
    given dotty.tools.dotc.core.Contexts.Context = quotesImpl.ctx
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
    ClassDef.copy(clsDef)(clsDef.name, ctorDef, clsDef.parents, None, body(cls))

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
    RecursiveType { recursiveType =>
      fields.foldLeft[TypeRepr](TypeRepr.of[DataSource]) {
        case (result, (label, tpe)) =>
          val resultWithField = Refinement(result, label, tpe)
          val withResultType = AnnotatedType(
            recursiveType.recThis,
            // TODO: This could easily be abstracted.
            // TODO: How do we apply the defaults?
            //  See https://users.scala-lang.org/t/how-to-apply-no-args-a-termmethod-with-a-default-argument/9278
            Select(New(TypeTree.ref(NoWarn)), NoWarn.primaryConstructor).appliedTo('{""}.asTerm)
          )
          val withMethodType = MethodType(List(label))(_ => List(tpe), _ => withResultType)
          // TODO: Ensure that there is no name conflict.
          //  Make sure to keep the name in sync with the DefDef above and below.
          Refinement(resultWithField, s"with${label.capitalize}", withMethodType)
      }
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
        Symbol.newMethod(
          cls,
          "selectDynamic",
          MethodType(List("name"))(
            _ => List(TypeRepr.of[String]),
            _ => TypeRepr.of[Any]
          )
        ),
        Symbol.newMethod(
          cls,
          "applyDynamic",
          MethodType(List("name"))(
            _ => List(TypeRepr.of[String]),
            _ => MethodType(List("args"))(
              _ => List(
                AppliedType(defn.RepeatedParamClass.typeRef, List(TypeRepr.of[Any]))
//                AnnotatedType(
//                  AppliedType(TypeRepr.of[Seq], List(TypeRepr.of[Any])),
//                  Apply(Select(New(TypeTree.ref(defn.RepeatedAnnot)), defn.RepeatedAnnot.primaryConstructor), Nil)
//                )
              ),
              _ => TypeRepr.of[Any]
            )
          )
        )
      )
    // TODO: Make this a value class.
    val cls = Symbol.newClass(Symbol.spliceOwner, name, parents.map(_.tpe), decls, selfType = None)
    val sourceParam = Ident(TermRef(This(cls).tpe, sourceParamName))
    // NOTE: Do not forget to put the symbol in the decls!
    //  If you do then the code looks fine but it's not a real member and you get really confusing errors.
    def body(cls: Symbol) = List[Statement](
      ValDef(
        cls.declaredField(sourceParamName),
        None
      ),
      DefDef( //
        cls.methodMember("selectDynamic").head,
        {
          case (name :: Nil) :: Nil => Some(Match(
            selector = name.asExpr.asTerm,
            cases = fields.map {
              case (label, _) => CaseDef(
                pattern = Literal(StringConstant(label)),
                guard = None,
                rhs = Select(
                  qualifier = sourceParam,
                  symbol = sourceSym.fieldMember(label)
                )
              )
            }
          ))
        }
      ),
      DefDef( //
        cls.methodMember("applyDynamic").head,
        {
          case (name :: Nil) :: (value :: Nil) :: Nil => Some(Match(
            selector = name.asExpr.asTerm,
            cases = fields.map {
              case (label, tpe) => CaseDef(
                pattern = Literal(StringConstant(s"with${label.capitalize}")),
                guard = None,
                rhs = Apply(
                  Select(New(TypeIdent(cls)), cls.primaryConstructor),
                  List(Apply(
                    Select.unique(sourceParam, "copy"),
                    List(NamedArg(
                      label,
                      // TODO: Use Term.appliedToType here.
                      TypeApply(
                        Select.unique(
                          // TODO: Use Term.appliedTo here.
                          Apply(Select.unique(value.asExpr.asTerm, "apply"), List('{0}.asTerm)),
                          "asInstanceOf"
                        ),
                        List(TypeTree.ref(tpe.typeSymbol))
                      )
                    ))
                  ))
                )
              )
            }
          ))
        }
      )
    )
    val clsDef = replacePrimaryConstructor(
      cls = cls,
      clsDef = ClassDef(cls, parents, Nil),
      paramNames = List(sourceParamName),
      paramInfosExp = _ => List(sourceTypeRef),
      rhsFn = _ => None,
      body
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
      val result = tData match {
        case '[data] =>
          '{
             ${Block(stats = List(clsDef), expr = newCls).asExpr}.asInstanceOf[data]
          }
      }
      println(result.show)
      result

end dataImpl
