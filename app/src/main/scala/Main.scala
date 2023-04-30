import reflect.Selectable.reflectiveSelectable
import scala.annotation.experimental

trait Bloop
trait Blah

//@experimental
//@inspect
//object Outer {
//  class NoCtor()
//  class Foo[A <: String](val name: String)(using Int) extends Blah { myself: Bloop =>
//    println("constructed")
//    def yowza(i: Int): Unit = println("Yowza!" * i)
//  }
//}

//@experimental
//@inspect
class Data(source: Person) extends Selectable {
  def selectDynamic(name: String): Any = "name" match {
    case "name" => source.name
  }
  def applyDynamic(name: String)(args: Any*): Any = "name" match {
    case "name" => source.name
  }
}

type Ref = Data {
  def name: String
}

case class Person(name: String) extends Named

object Main extends App {
  val alice = data(Person("Alice"))
  println(alice.name)
  println(alice.withName("Bob").name)

//  println(alice.selectDynamic("name"))

//  new Data$macro$1(Person("Alice")).asInstanceOf[Ref].name
//  println(new Data(Person("Alice")).asInstanceOf[Ref].selectDynamic("name"))
}