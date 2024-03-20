package example

import example.Options.combineObjects

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
      combineObjects[js.Object, FreshchatHandle](handle, freshchatHandle)
    }
  }
}
