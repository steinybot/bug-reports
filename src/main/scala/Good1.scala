package pickle

import boopickle.DefaultBasic._

// This works.
object Good1 extends Implicits {

  implicit lazy val myTypeBPickler: Pickler[MyTypeB[Any]] = {
    object MyTypeBPickler extends Pickler[MyTypeB[Any]] {
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
