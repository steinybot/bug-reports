import magnolia1.{CaseClass, Derivation, SealedTrait}

trait Thing[A]

object Thing extends Derivation[Thing]:
  override def split[T](sealedTrait: SealedTrait[Thing, T]): Thing[T] = ???
  override def join[T](caseClass: CaseClass[Thing, T]): Thing[T] = ???

case class Foo(bar: String)

object Main extends App:
  Thing.derived[Foo]
