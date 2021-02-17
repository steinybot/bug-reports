package object pickle {

  trait MyTypeA

  // This has to have a type parameter.
  trait MyTypeB[A]

  import boopickle.Pickler

  trait Implicits {
    implicit lazy val myTypeAPickler: Pickler[MyTypeA] = ???
  }

  case class MyFixedTuple(a: List[MyTypeA], b: List[MyTypeB[Any]])
  case class MyGenericTuple[A, B](a: A, b: B)
}
