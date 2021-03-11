import rx.Rx

object Main extends App {

  Rx {
    val pl: PreparedLayout = ???
    val b: Layout[_, _, _] = ???
    pl.copy(layout = b)
  }
}
