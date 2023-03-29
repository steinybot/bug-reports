import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

object Main extends App {
}

@react
class MyComponent extends Component {

  override type Props = String
  override type State = String

  override def initialState: String = props

  override def render(): ReactElement = state
}
