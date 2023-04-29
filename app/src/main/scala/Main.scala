import reflect.Selectable.reflectiveSelectable
import scala.annotation.experimental

trait Bloop
trait Blah

//@experimental
//@inspect
object Outer {
  class NoCtor()
  class Foo[A <: String](val name: String)(using Int) extends Blah { myself: Bloop =>
    println("constructed")
    def yowza(i: Int): Unit = println("Yowza!" * i)
  }
}

case class Person(name: String)

object Main extends App {
  val alice = data(Person("Alice"))
  println(alice.name)
}