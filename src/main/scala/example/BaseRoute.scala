package example

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait BaseRoute {

  val title: UndefOr[String] = js.undefined

  def handle: Any = {
    val routeTitle = title
    new TitleHandle {
      override def title(m: UIMatch[Any, Any]): UndefOr[String] = routeTitle
    }
  }
}
