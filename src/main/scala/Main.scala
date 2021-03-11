import rx.Rx

object Main extends App {

  Rx {
    val bar: Bar = ???
    val foo: Foo[_] = ???
    bar.copy(foo = foo)
  }
}
