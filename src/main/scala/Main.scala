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

  Foo.foo(BarAndBaz)

  Foo.foo(BarAndBaz: Bar)
  Foo.foo(BarAndBaz: Baz)
}
