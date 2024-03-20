package example

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait AllPages {

  val title: UndefOr[String] = js.undefined

  def handle: Any = {
    val routeTitle = title
    new TitleHandle {
      override def title(): UndefOr[String] = routeTitle
    }
  }
}

object AllPages {

  case object FnolPage extends AllPages {
    override val title: UndefOr[String] = "File a claim"

    override def handle: Any = {
      val handle               = super.handle.asInstanceOf[js.Object]
      val freshchatHandle = FreshchatHandle(js.Array("claims-page"))

      def combineObjects[A <: js.Object, B <: js.Object](first: A, second: B): A with B = {
        val result = js.Object.assign(js.Dynamic.literal(), first, second)
        result.asInstanceOf[A with B]
      }

      combineObjects[js.Object, FreshchatHandle](handle, freshchatHandle)
    }
  }
}
