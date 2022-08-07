import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobalScope

trait Bar extends js.Object {

  val bar: String
}

trait Baz extends js.Object

object BarAndBaz extends Bar with Baz {
  override val bar: String = "barbaz"
}

@js.native
@JSGlobalScope
object Foo extends js.Object {

  def foo(barOrBaz: Bar): Unit = js.native
  def foo(barOrBaz: Baz): Unit = js.native
}

object Main extends App {

  // FIXME: Ambiguous references should be ignored for native JS traits since there is no overloading in JavaScript.
  // [error] /Users/jason/src/bug-reports/src/main/scala/Main.scala:24:7: ambiguous reference to overloaded definition,
  // [error] both method foo in object Foo of type (barOrBaz: Baz): Unit
  // [error] and  method foo in object Foo of type (barOrBaz: Bar): Unit
  //Foo.foo(BarAndBaz)

  Foo.foo(BarAndBaz: Bar)
  Foo.foo(BarAndBaz: Baz)
}
