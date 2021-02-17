package pickle

import boopickle._

// Same as Bad1 but we extend BasicImplicitPicklers instead of importing DefaultBasic._
// Fails with:
// [error] /src/main/scala/pickle/Bad4.scala:19:25: diverging implicit expansion for type pickle.Bad4.P[T]
// [error] starting with method iterablePickler in trait XCompatImplicitPicklers
// [error]           state.unpickle[List[MyTypeB[Any]]]
// [error]                         ^
object Bad4 extends Implicits with PicklerHelper with XCompatImplicitPicklers {

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
