import reflect.Selectable.reflectiveSelectable

case class Person(name: String)

object Main extends App {
  val alice = data(Person("Alice"))
  println(alice.name)
}