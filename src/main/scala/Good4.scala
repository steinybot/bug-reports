package pickle

import boopickle._

import scala.collection.generic.CanBuildFrom
import scala.language.higherKinds

// Same as Bad5 but without the higher-kinded type for the mapPickler.
object Good4 extends Implicits {

  implicit def mapPickler[T: Pickler, S: Pickler](
      implicit cbf: CanBuildFrom[Nothing, (T, S), Map[T, S]]): Pickler[Map[T, S]] =
    BasicPicklers.MapPickler[T, S, Map]

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
