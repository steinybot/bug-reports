import slinky.core.FunctionalComponent
import slinky.core.annotations.react

trait Bar[A] {
  def bar: A
}

object Bar {
  implicit object StringBar extends Bar[String] {
    override def bar: String = "Hello"
  }
}

@react
object Foo {
  val component: FunctionalComponent[Unit] = FunctionalComponent[Unit] { _ => bar[String] }
  private def bar[A](implicit b: Bar[A]): A = b.bar
}

