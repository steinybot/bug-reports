import scala.scalajs.js

object Main {

  sealed trait TaggedProps[Props] extends Any

  final class KeyAddingStage(private val args: js.Array[js.Any]) extends AnyVal

  type RenderedProps[Props] = KeyAddingStage with TaggedProps[Props]

  object Name {
    case class Props(name: String)

    def component(props: Props): KeyAddingStage = new KeyAddingStage(
      js.Array(
        props.asInstanceOf[js.Any]
      )
    )

    def apply(name: String): RenderedProps[Props] = component(Props(name)).asInstanceOf[RenderedProps[Props]]
  }

  def main(args: Array[String]): Unit = {
    val first: RenderedProps[Name.Props] = Name("Jason")
    val firstStage: KeyAddingStage = first
    println(js.Object.is(first, firstStage))
    val props: Seq[RenderedProps[Name.Props]] = Seq(first)
    val propsHead: RenderedProps[Name.Props] = props.head
    println(js.Object.is(firstStage, propsHead))
  }
}
