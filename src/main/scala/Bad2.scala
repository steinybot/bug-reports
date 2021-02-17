package pickle

import boopickle.DefaultBasic._

// Same as Good1 but we don't call the MyFixedTuple.apply method (WTF!?).
// Fails with:
//error] /src/main/scala/pickle/Bad2.scala:18:23: diverging implicit expansion for type boopickle.Pickler[List[pickle.MyTypeB[Any]]]
// [error] starting with lazy value myTypeBPickler in object Bad2
// [error]         state.unpickle[List[MyTypeB[Any]]]
// [error]                       ^
object Bad2 extends Implicits {

  implicit lazy val myTypeBPickler: Pickler[MyTypeB[Any]] = {
    object MyTypeBPickler extends Pickler[MyTypeB[Any]] {
      override def pickle(v: MyTypeB[Any])(implicit state: PickleState): Unit = ???
      override def unpickle(implicit state: UnpickleState): MyTypeB[Any] = {
        state.unpickle[List[MyTypeA]]
        state.unpickle[List[MyTypeB[Any]]]
        ???
      }
    }
    MyTypeBPickler
  }
}
