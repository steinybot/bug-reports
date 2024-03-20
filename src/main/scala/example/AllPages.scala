package example

import scala.scalajs.js
import scala.scalajs.js.UndefOr

object AllPages {

  case object FnolPage {
    val title: UndefOr[String] = "File a claim"

    def handle: Any = {
      // Inlining this fixes the problem.
      val routeTitle = title
      val handle = new TitleHandle {
        override def title(): UndefOr[String] = routeTitle
      }
      // This causes the private symbols to be lost. It is a js.Object though so JavaScript semantics should apply.
      js.Object.assign(js.Object(), handle)
    }
  }
}
