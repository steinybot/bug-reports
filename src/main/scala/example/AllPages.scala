package example

import example.BaseRoute.staticTitle
import example.Options.combineObjects

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait AllPages extends BaseRoute

object AllPages {

//  case object FnolPage extends AllPages with StaticRoute with RelayRoute {
  case object FnolPage extends AllPages {
//    override val parent: UndefOr[BaseRoute]                           = DashboardLayout().Center
    override val parent: UndefOr[BaseRoute]                           = js.undefined
    override val title: UndefOr[String] = "File a claim"
    override val path: UndefOr[String]                                = "claim/new"
//    override val entryPoint: RelayEntryPoint[_]                       = FileAClaimViewEntryPoint

    override def handle: Any = {
      val handle               = super.handle.asInstanceOf[js.Object]
      // @Note Configured here: https://web.freshchat.com/a/121288663858798/settings/channels
      val freshchatHandle = FreshchatHandle(js.Array("claims-page"))
      combineObjects[js.Object, FreshchatHandle](handle, freshchatHandle)
    }
  }

}
