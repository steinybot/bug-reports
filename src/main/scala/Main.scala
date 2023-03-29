object Main extends App {
  def foo(a: String): String = a
  def foo(a: Int)(implicit ordering: Ordering[Int]): String = a.toString

  def bar(): Unit = foo("abc"): Unit

  bar()

  foo("def"): Unit
}
