package pickle

import boopickle.DefaultBasic._

// Same as Good1 but the implicit is on the object instead of the val.
// Fails with:
// [error] /src/main/scala/pickle/Bad1.scala:19:25: diverging implicit expansion for type boopickle.DefaultBasic.P[T1]
// [error] starting with lazy value myTypeAPickler in trait Implicits
// [error]           state.unpickle[List[MyTypeB[Any]]]
// [error]                         ^
object Bad1 extends Implicits {

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
