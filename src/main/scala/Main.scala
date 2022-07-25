import io.estatico.newtype.macros.newsubtype

import scala.scalajs.js.|

object Main extends App {

  @newsubtype final case class Foo[A](unwrap: A)

  @newsubtype final case class Bar[A](unwrap: A)

  def which[A, B](fooOrBar: Foo[A] | Bar[B]) = fooOrBar match {
    case _: Foo[_] => "foo"
    case _: Bar[_] => "bar"
  }
}
