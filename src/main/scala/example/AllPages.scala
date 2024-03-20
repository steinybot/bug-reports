package example

import scala.scalajs.js
import scala.scalajs.js.UndefOr

object AllPages {

  case object FnolPage {
    val title: UndefOr[String] = "File a claim"

    def handle: Any = {
      val routeTitle = title
      val handle = new TitleHandle {
        override def title(): UndefOr[String] = routeTitle
      }.asInstanceOf[js.Object]

      def combineObjects[A <: js.Object, B <: js.Object](first: A, second: B): A with B = {
        val result = js.Object.assign(js.Dynamic.literal(), first, second)
        result.asInstanceOf[A with B]
      }

      combineObjects[js.Object, js.Object](handle, js.Object())
    }
  }
}
