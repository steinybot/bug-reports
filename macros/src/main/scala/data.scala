import dotty.tools.dotc.ast.tpd
import scala.annotation.{MacroAnnotation, experimental, tailrec}
import scala.collection.immutable.{AbstractSeq, LinearSeq}
import scala.compiletime.*
import scala.deriving.Mirror
import scala.quoted.*
import scala.quoted.runtime.impl.{ExprImpl, QuotesImpl, SpliceScope}

transparent inline def data[T](source: T) =
  ${ dataImpl[T]('source) }

@experimental
private def dataImpl[T: Type](source: Expr[T])(using Quotes): Expr[Any] =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*
//  import quotes.reflect.*

  val quotesImpl: QuotesImpl = quotes.asInstanceOf[QuotesImpl]
  implicit val context = quotesImpl.ctx

  def unsafeToExpr[A](tree: Tree): Expr[A] =
    // HINT: Take a look at dotty.tools.dotc.typer.QuotesAndSplices
    ExprImpl(tree.asInstanceOf[tpd.Tree], SpliceScope.getCurrent).asInstanceOf[Expr[A]]

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
    fields.foldLeft(RecursiveType(_ => TypeRepr.of[Any])) {
      case (result, (label, tpe)) =>
        val resultWithField = Refinement(result, label, tpe)
        // FIXME: What type to use? Can we get rid of the recursive thing?
        //val withResultType = result.recThis
        val withResultType = TypeRepr.of[Any]
        val withMethodType = MethodType(List("value"))(_ => List(tpe), _ => withResultType)
        // TODO: Ensure that there is no name conflict.
        val resultWithMethod = Refinement(resultWithField, s"with${label.capitalize}", withMethodType)
        RecursiveType(_ => resultWithMethod)
    }
  end dataRefinementType

  def dataClass(fields: Fields): (Symbol, ClassDef) =
    val name = Symbol.freshName("Data")
    // TODO: Copy the parents (if not sealed).
    val parents = List(TypeTree.of[Object], TypeTree.of[Selectable])
    def decls(cls: Symbol) =
      List.empty[Symbol]
    val cls = Symbol.newClass(Symbol.spliceOwner, name, parents.map(_.tpe), decls, selfType = None)
//    val ctor = DefDef(cls.primaryConstructor)
//    val dataFields = fields.foldLeft(List.empty[Statement]) {
//      case (result, (label, tpeRepr)) =>
//        // TODO: Copy the flags from the source.
//        val fieldSym = Symbol.newVal(cls, label, tpeRepr, Flags.EmptyFlags)
//        ValDef(fieldSym)
//    }
    val body = List.empty[Statement]
    cls -> ClassDef(cls, parents, body)
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
      val tData = dataRefinementType(fields).asType
      val (cls, clsDef) = dataClass(fields)
      val newCls = Apply(Select(New(TypeIdent(cls)), cls.primaryConstructor), Nil)
      // TODO: Why do we have to match here?
      tData match {
        case '[data] =>
          '{
             ${unsafeToExpr(Block(stats = List(clsDef), expr = newCls))}.asInstanceOf[data]
          }
      }

end dataImpl
