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
  val alice = Person("Alice", 21)

  val aliceData = Person.data(alice)
  println(aliceData.firstName)
  println(aliceData.withFirstName("Claire"))

  val bobData = Person.DataImpl("Bob", 34)
  println(bobData.firstName)
  println(bobData.withFirstName("Dave"))
}