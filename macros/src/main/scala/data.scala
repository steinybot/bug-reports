import scala.annotation.tailrec
import scala.compiletime.*
import scala.deriving.Mirror
import scala.quoted.*

transparent inline def data[T](source: T) =
  ${ dataImpl[T]('source) }

private def dataRefinementType[Labels <: Tuple: Type, Types <: Tuple: Type](using Quotes): quotes.reflect.TypeRepr =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*

  @tailrec
  def loop[Labels <: Tuple: Type, Types <: Tuple: Type](result: RecursiveType): TypeRepr =
    Type.of[Labels] match {
      case '[EmptyTuple] => result
      case '[tLabel *: tLabelTail] =>
        Type.of[Types] match {
          case '[EmptyTuple] => result
          case '[tpe *: tpeTail] =>
            val label: String = Type.valueOfConstant[tLabel].get.toString
            val tpeRepr = TypeRepr.of[tpe]
            val resultWithField = Refinement(result, label, tpeRepr)
            // FIXME: What type to use? Can we get rid of the recursive thing?
            //val withResultType = result.recThis
            val withResultType = TypeRepr.of[Any]
            val withMethodType = MethodType(List("value"))(_ => List(tpeRepr), _ => withResultType)
            val resultWithMethod = Refinement(resultWithField, s"with${label.capitalize}", withMethodType)
            val newResult = RecursiveType(_ => resultWithMethod)
            loop[tLabelTail, tpeTail](newResult)
        }
    }
  loop[Labels, Types](RecursiveType(_ => TypeRepr.of[Any]))

private def dataCaseClass[Labels <: Tuple: Type, Types <: Tuple: Type](using Quotes): quotes.reflect.ClassDef =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*

  val name = Symbol.freshName("Data")
  // TODO: Copy the parents including the source type itself (if applicable).
  val parents = List(TypeRepr.of[Object])
  val cls = Symbol.newClass(Symbol.spliceOwner, name, parents, decls, selfType = None)

  @tailrec
  def loop[Labels <: Tuple: Type, Types <: Tuple: Type](result: List[Statement]): List[Statement] =
    Type.of[Labels] match {
      case '[EmptyTuple] => result
      case '[tLabel *: tLabelTail] =>
        Type.of[Types] match {
          case '[EmptyTuple] => result
          case '[tpe *: tpeTail] =>
            val label: String = Type.valueOfConstant[tLabel].get.toString
            val tpeRepr = TypeRepr.of[tpe]

        }
    }
  val body = loop[Labels, Types](RecursiveType(_ => TypeRepr.of[Any]))
  ClassDef(cls, parents, body)

private def dataImpl[T: Type](source: Expr[T])(using Quotes): Expr[Any] =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*

  Expr.summon[Mirror.ProductOf[T]].get match
    case '{
      type mels <: Tuple
      type mets <: Tuple
      $m: Mirror.ProductOf[T] {
        type MirroredElemLabels = `mels`
        type MirroredElemTypes = `mets`
      }
    } =>
      TypeRepr.of[String].asType
      val x: TypeRepr = dataRefinementType[mels, mets]
      println(x.show)
      val z: Type[?] = x.asType
      z match {
        case '[z] =>
          val dataSymbol = Symbol.newClass()
          val data = ClassDef()
          '{
            case class Data(name: String) {
              def withName(value: String) = copy(name = value)
            }
            PersonData(source.name): z
          }
      }

//
//      Type.of[mels] match
//        case '[mel *: melTail] =>
//          val label = Type.valueOfConstant[mel].get.toString
//
//          Refinement(TypeRepr.of[Data], label, TypeRepr.of[String]).asType match
//            case '[tpe] =>
//              val res = '{
//                val p = Data()
//                p.asInstanceOf[tpe]
//              }
//              println(res.show)
//              res
