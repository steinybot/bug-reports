import slinky.core.{FunctionalComponent, KeyAddingStage}

import scala.scalajs.js

object Main {

  sealed trait TaggedProps[Props] extends Any

  type RenderedProps[Props] = KeyAddingStage with TaggedProps[Props]

  object Name {
    case class Props(name: String)

    val component: FunctionalComponent[Props] = FunctionalComponent[Props] { props => props.name }

    def apply(name: String): RenderedProps[Props] = component(Props(name)).asInstanceOf[RenderedProps[Props]]
  }

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val first: RenderedProps[Name.Props] = Name("Jason")
    println(first)
    val firstStage: KeyAddingStage = first
    println(firstStage)
    println(js.Object.is(first, firstStage))
    val props: Seq[RenderedProps[Name.Props]] = Seq(first)
    val propsHead: RenderedProps[Name.Props] = props.head
    assert(js.Object.is(firstStage, propsHead))
  }
}
