package pickle

import boopickle.DefaultBasic._

// Same as Bad1 but no nested higher-kinded types.
object Good5 extends Implicits {

  lazy val myTypeCPickler: Pickler[MyTypeC] = {
    implicit object MyTypeCPickler extends Pickler[MyTypeC] {
      override def pickle(v: MyTypeC)(implicit state: PickleState): Unit = ???
      override def unpickle(implicit state: UnpickleState): MyTypeC = {
        MyFixedTuple2(
          state.unpickle[List[MyTypeA]],
          state.unpickle[List[MyTypeC]]
        )
        ???
      }
    }
    MyTypeCPickler
  }
}
