package pickle

import boopickle.DefaultBasic.{mapPickler => _, _}

// Same as Bad1 but we hide the mapPickler.
object Good3 extends Implicits {

//  implicit def listPickler[A: Pickler]: Pickler[List[A]] = boopickle.DefaultBasic.iterablePickler[A, List]

  lazy val myTypeBPickler: Pickler[MyTypeB[Any]] = {
    implicit object MyTypeBPickler extends Pickler[MyTypeB[Any]] {
      override def pickle(v: MyTypeB[Any])(implicit state: PickleState): Unit = ???
      override def unpickle(implicit state: UnpickleState): MyTypeB[Any] = {
        MyFixedTuple(
          state.unpickle[List[MyTypeA]],
          state.unpickle[List[MyTypeB[Any]]]
        )
        ???
      }
    }
    MyTypeBPickler
  }
}
