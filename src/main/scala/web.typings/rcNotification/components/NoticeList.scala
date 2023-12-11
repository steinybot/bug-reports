package web.typings.rcNotification.components

import web.typings.StBuildingComponent
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.rcNotification.esInterfaceMod.OpenConfig
import web.typings.rcNotification.esInterfaceMod.Placement
import web.typings.rcNotification.esInterfaceMod.StackConfig
import web.typings.rcNotification.esNoticeListMod.NoticeListProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeList {
  
  @JSImport("rc-notification/es/NoticeList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def configList(value: js.Array[OpenConfig]): this.type = set("configList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def configListVarargs(value: OpenConfig*): this.type = set("configList", js.Array(value :_*))
    
    @scala.inline
    def motion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionFunction1(value: /* placement */ Placement => CSSMotionProps): this.type = set("motion", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAllNoticeRemoved(value: /* placement */ Placement => Unit): this.type = set("onAllNoticeRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNoticeClose(value: /* key */ Key => Unit): this.type = set("onNoticeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stack(value: StackConfig): this.type = set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = NoticeListProps
  
  implicit def make(companion: NoticeList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoticeListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
