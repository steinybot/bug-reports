import scala.deriving.Mirror
import reflect.Selectable.reflectiveSelectable

trait WithSelf {
  type Self
}

case class Person(firstName: String, age: Int)

object Person {

  type Data = WithSelf {
    val firstName: String
    def withFirstName(value: String): Self
    val age: Int
    def withAge(value: Int): Self
  }

  case class DataImpl(firstName: String, age: Int) extends WithSelf {
    type Self = DataImpl
    def withFirstName(value: String): Self = copy(firstName = value)
    def withAge(value: Int): Self = copy(age = value)
  }

  def data(person: Person): Data = DataImpl(person.firstName, person.age)
}

object Main extends App {
  // This does not work.
  val alice = Person.data(Person("Alice", 21))
  println(alice.firstName)
  println(alice.withFirstName("Claire"))

  // This works fine.
  val bob = Person.DataImpl("Bob", 34)
  println(bob.firstName)
  println(bob.withFirstName("Dave"))
}