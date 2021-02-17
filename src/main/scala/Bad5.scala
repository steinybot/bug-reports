package pickle

import boopickle._

import scala.collection.generic.CanBuildFrom
import scala.language.higherKinds

// Same as Good2 but with the additional mapPickler.
// Fails with:
// [error] /src/main/scala/pickle/Bad5.scala:29:25: diverging implicit expansion for type boopickle.Pickler[T]
// [error] starting with method iterablePickler in object Bad5
// [error]           state.unpickle[List[MyTypeB[Any]]]
// [error]                         ^
object Bad5 extends Implicits {

  implicit def mapPickler[T: Pickler, S: Pickler, V[_, _] <: scala.collection.Map[_, _]](
      implicit cbf: CanBuildFrom[Nothing, (T, S), V[T, S]]): Pickler[V[T, S]] =
    BasicPicklers.MapPickler[T, S, V]

  implicit def iterablePickler[T: Pickler, V[_] <: Iterable[_]](implicit cbf: CanBuildFrom[Nothing, T, V[T]]): Pickler[V[T]] =
    BasicPicklers.IterablePickler[T, V]

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
