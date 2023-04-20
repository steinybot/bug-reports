import scala.deriving.Mirror
import reflect.Selectable.reflectiveSelectable

trait WithSelf {
  type Self
}

case class Demo(firstName: String, age: Int)

object Demo {

  type Data = WithSelf {
    val firstName: String
    def withFirstName(value: String): Self
  }

  private case class DemoData(firstName: String, age: Int) extends WithSelf {
    type Self = DemoData
    def withFirstName(value: String): Demo = Demo(value, age)
  }

  def data(demo: Demo): Data = DemoData(demo.firstName, demo.age).asInstanceOf[Data]
}

object Main extends App {
  val demo = Demo("Bob", 69)
  val demoData = Demo.data(demo)
  println(demoData.firstName)
  println(demoData.withFirstName("Jim"))
}