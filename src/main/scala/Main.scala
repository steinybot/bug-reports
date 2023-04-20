import scala.deriving.Mirror
import reflect.Selectable.reflectiveSelectable

trait WithSelf {
  type Self
}

type PersonData = WithSelf {
  val name: String
  def withName(name: String): Self
}

case class Person(name: String) extends WithSelf {
  type Self = Person
  def withName(name: String): Self = copy(name = name)
}

object Main extends App {
  val alice: PersonData = Person("Alice")
  println(alice.name)
  println(alice.withName("Bonnie"))
}