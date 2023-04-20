import scala.annotation.tailrec
import scala.compiletime.*
import scala.deriving.Mirror
import scala.quoted.*

transparent inline def data[T](source: T) =
  ${ dataImpl[T]('source) }

private def refinedTypeWithDataMethods[Labels <: Tuple: Type, Types <: Tuple: Type](using Quotes): quotes.reflect.TypeRepr =
  import quotes.reflect.*
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

private def dataImpl[T: Type](source: Expr[T])(using Quotes): Expr[Any] =
  import quotes.reflect.*

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
      val x: quotes.reflect.TypeRepr = refinedTypeWithDataMethods[mels, mets]
      println(x.show)
      val z: Type[?] = x.asType
      z match {
        case '[z] =>
          '{
            class Data {

            }
            (new Data).asInstanceOf[z]
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
