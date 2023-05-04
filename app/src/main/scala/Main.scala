import reflect.Selectable.reflectiveSelectable
import scala.annotation.experimental
import scala.language.reflectiveCalls

//@experimental
//@inspect
class MainData(source: Person) extends DataSource with Selectable {
  def selectDynamic(name: String): Any = name match {
    case "name" => source.name
  }
  def applyDynamic(name: String)(args: Any*): Any = name match {
    case "withName" => new MainData(source.copy(name = args(0).asInstanceOf[String]))
  }
}

type Ref = MainData {
  // Can we leave this abstract and refine it with "itself" later?
  // For example:
  //   type Ref = { type Self }
  //   type DataRef = Data & Ref { type Self = Data & Ref }
//  type Self = this.type
  def name: String
  // Have to use this.type because of:
  // - https://github.com/lampepfl/dotty/issues/17380
  // - https://github.com/lampepfl/dotty/issues/17381
  def withName(newName: String): this.type
}

def manualData(person: Person) = new MainData(person).asInstanceOf[Ref]

case class Person(name: String)

object Person:
//  val eg = manualData(Person(""))
//  type Data = Ref
  given Conversion[Person, MainData {
    // Can we leave this abstract and refine it with "itself" later?
    // For example:
    //   type Ref = { type Self }
    //   type DataRef = Data & Ref { type Self = Data & Ref }
    //  type Self = this.type
    def name: String
    // Have to use this.type because of:
    // - https://github.com/lampepfl/dotty/issues/17380
    // - https://github.com/lampepfl/dotty/issues/17381
    def withName(newName: String): this.type
  }] = manualData
  // TODO: Convert the other way.
  //given Conversion[Data, Person] = manualData

//@experimental
//@inspect
//object Container {
//  type Refine = {
//    def foo: this.type
//  }
//  //
////  def foo: { def bar: this.type } = ???
//}

object Main extends App {
//  thing.me.name
//  thing2.me.name

  val alice = data(Person("Alice"))
//  println(alice.name)
//  println(alice.withName("Bob").name)

//  println(new MainData(Person("Alice")).asInstanceOf[Ref].name)
//  println(new MainData(Person("Alice")).asInstanceOf[Ref].withName("Bob").name)
  println(Person("Alice").withName("Bob").name)
}
