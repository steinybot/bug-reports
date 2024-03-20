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
    override val title: UndefOr[UIMatch[Any, Any] => UndefOr[String]] = staticTitle("File a claim")
    override val path: UndefOr[String]                                = "claim/new"
//    override val entryPoint: RelayEntryPoint[_]                       = FileAClaimViewEntryPoint

    override def config: EntryPointRouteObject = {
      val c               = super.config.asInstanceOf[EntryPointIndexRouteObject]
      // @Note Configured here: https://web.freshchat.com/a/121288663858798/settings/channels
      val freshchatHandle = FreshchatHandle(js.Array("claims-page"))
      c.setHandle(c.handle.fold(freshchatHandle)(handle => {
        combineObjects[js.Object, FreshchatHandle](handle.asInstanceOf[js.Object], freshchatHandle)
      }))
    }
  }

}
