package pickle

// Same as Good1 but with the import moved into the object.
// Fails with:
// [error] /src/main/scala/pickle/Bad6.scala:19:25: diverging implicit expansion for type boopickle.DefaultBasic.P[T1]
// [error] starting with lazy value myTypeAPickler in trait Implicits
// [error]           state.unpickle[List[MyTypeB[Any]]]
// [error]                         ^
object Bad6 extends Implicits {

  import boopickle.DefaultBasic._

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
