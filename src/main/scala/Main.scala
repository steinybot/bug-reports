import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.{Fragment, ReactElement}

import scala.scalajs.js

object Main extends App {
}

@react
class ErrorBoundarySlinky extends Component {

  case class Props(fallback: js.Error => ReactElement, logIt: Boolean, children: ReactElement*)
  case class State(error: Option[js.Error])

  override def initialState: State = State(None)

  override def render(): ReactElement = {
    state.error match {
      case Some(value) =>
        props.fallback(value)
      case None        =>
        Fragment(props.children: _*)
    }
  }
}
