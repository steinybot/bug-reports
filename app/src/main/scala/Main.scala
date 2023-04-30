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
//class Data$macro$1(source$macro$1: Person) extends java.lang.Object with scala.Selectable {
//  def selectDynamic(name: java.lang.String): scala.Any = "name" match {
//    case "name" =>
//      Data$macro$1.this.source$macro$1.name
//  }
//}

case class Person(name: String)

object Main extends App {
  val alice = data(Person("Alice"))
  println(alice.name)
}