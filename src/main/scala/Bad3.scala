package pickle

import boopickle.DefaultBasic._

// Same as Good1 but we call the apply method of a tuple with type parameters (WTF!?).
// Fails with:
// [error] /src/main/scala/pickle/Bad3.scala:19:25: diverging implicit expansion for type boopickle.Pickler[List[pickle.MyTypeB[Any]]]
// [error] starting with lazy value myTypeBPickler in object Bad3
// [error]           state.unpickle[List[MyTypeB[Any]]]
// [error]                         ^
object Bad3 extends Implicits {

  implicit lazy val myTypeBPickler: Pickler[MyTypeB[Any]] = {
    object MyTypeBPickler extends Pickler[MyTypeB[Any]] {
      override def pickle(v: MyTypeB[Any])(implicit state: PickleState): Unit = ???
      override def unpickle(implicit state: UnpickleState): MyTypeB[Any] = {
        MyGenericTuple(
          state.unpickle[List[MyTypeA]],
          state.unpickle[List[MyTypeB[Any]]]
        )
        ???
      }
    }
    MyTypeBPickler
  }
}
