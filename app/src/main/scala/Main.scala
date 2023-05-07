import reflect.Selectable.reflectiveSelectable
import scala.annotation.{experimental, nowarn}
import scala.deriving.Mirror
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

//type Ref = MainData {
//  // Can we leave this abstract and refine it with "itself" later?
//  // For example:
//  //   type Ref = { type Self }
//  //   type DataRef = Data & Ref { type Self = Data & Ref }
////  type Self = this.type
//  def name: String
//  // Have to use this.type because of:
//  // - https://github.com/lampepfl/dotty/issues/17380
//  // - https://github.com/lampepfl/dotty/issues/17381
//  def withName(newName: String): this.type @nowarn
//}

def manualData(person: Person) = new MainData(person).asInstanceOf[MainData {
  def name: String
  def withName(newName: String): this.type@nowarn
}]

case class Person(name: String)

trait DataCompanion[A <: Product]:
  val dataTypeProvider: TypeProvider
  type Data = dataTypeProvider.Type
//  given Conversion[A, Data] = new Conversion[A, Data]:
//    override def apply(x: A): Data = data(x.asInstanceOf[A])

object Person:
//  given mirrorA: Mirror.ProductOf[Person] = summon
  private[this] val dataTypeProvider = dataType[Person]
  type Data = dataTypeProvider.Type
//  // FIXME: Enabling this causes some weird cyclic reference error.
//  // TODO: Convert the other way.
//  given Conversion[Person, Data] = new Conversion[Person, Data]:
//    override def apply(x: Person): Data = data(x)

object Person2:
  //  given mirrorA: Mirror.ProductOf[Person] = summon
  val dataTypeProvider = data(Person("Sally"))
  type Data = dataTypeProvider.type
//  // FIXME: Enabling this causes some weird cyclic reference error.
//  // TODO: Convert the other way.
  given Conversion[Person, Data] = new Conversion[Person, Data]:
    override def apply(x: Person): Data = ???

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
  println(alice.name)
  println(alice.withName("Bob").name)

//  println(new MainData(Person("Alice")).asInstanceOf[Ref].name)
//  println(new MainData(Person("Alice")).asInstanceOf[Ref].withName("Bob").name)

  given Conversion[Person, Person.Data] = data[Person](_)
  println(Person("Alice").withName("Bob").name)
}
