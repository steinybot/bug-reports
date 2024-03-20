package example

import example.Options.combineObjects

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait AllPages extends BaseRoute

object AllPages {

//  case object FnolPage extends AllPages with StaticRoute with RelayRoute {
  case object FnolPage extends AllPages {
    override val title: UndefOr[String] = "File a claim"

    override def handle: Any = {
      val handle               = super.handle.asInstanceOf[js.Object]
      val freshchatHandle = FreshchatHandle(js.Array("claims-page"))
      combineObjects[js.Object, FreshchatHandle](handle, freshchatHandle)
    }
  }
}
