import io.estatico.newtype.macros.newsubtype

object Main extends App {

  @newsubtype final case class Stable[A] private (unwrap: A)

  def foo(a: Any) = a match {
    case s: Stable[_] => true
    case _ => false
  }
}
