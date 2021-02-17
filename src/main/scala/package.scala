package object pickle {

  trait MyTypeA
  trait MyTypeB[A]
  trait MyTypeC

  import boopickle.Pickler

  trait Implicits {
    implicit lazy val myTypeAPickler: Pickler[MyTypeA] = ???
  }

  case class MyFixedTuple(a: List[MyTypeA], b: List[MyTypeB[Any]])
  case class MyFixedTuple2(a: List[MyTypeA], b: List[MyTypeC])
  case class MyGenericTuple[A, B](a: A, b: B)
}
