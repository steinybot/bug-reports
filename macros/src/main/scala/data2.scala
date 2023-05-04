import scala.quoted.*

class SelectMe extends Selectable {
  def selectDynamic(name: String): Any = name match
    case "name" => "Bob"
    case "me" => this
}

transparent inline def thing =
  ${ thingImpl }

def thingImpl(using Quotes): Expr[Any] =
  import quotes.reflect._

  val refinementType =
    RecursiveType { recursiveType =>
      Refinement(
        Refinement(
          recursiveType,
          "name",
          TypeRepr.of[String]
        ),
        "me",
        recursiveType.recThis
      )
    }.asType

  val result = refinementType match
    case '[t] => '{
      (new SelectMe).asInstanceOf[t]
    }
  println(result.show)
  result

def thing2 = new SelectMe().asInstanceOf[java.lang.Object {
  val name: java.lang.String
  val me: this.type
}]
