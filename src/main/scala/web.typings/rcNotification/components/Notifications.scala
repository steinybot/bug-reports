package web.typings.rcNotification.components

import web.typings.StBuildingComponent
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.rcNotification.anon.Key
import web.typings.rcNotification.esInterfaceMod.Placement
import web.typings.rcNotification.esInterfaceMod.StackConfig
import web.typings.rcNotification.esNotificationsMod.NotificationsProps
import web.typings.rcNotification.esNotificationsMod.NotificationsRef
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import web.typings.std.ShadowRoot
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notifications {
  
  @JSImport("rc-notification/es/Notifications", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, NotificationsRef] {
    
    @scala.inline
    def className(value: /* placement */ Placement => String): this.type = set("className", js.Any.fromFunction1(value))
    
    @scala.inline
    def container(value: HTMLElement | ShadowRoot): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxCount(value: Double): this.type = set("maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionFunction1(value: /* placement */ Placement => CSSMotionProps): this.type = set("motion", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAllRemoved(value: () => Unit): this.type = set("onAllRemoved", js.Any.fromFunction0(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderNotifications(value: (/* node */ ReactElement, /* info */ Key) => ReactElement): this.type = set("renderNotifications", js.Any.fromFunction2(value))
    
    @scala.inline
    def stack(value: StackConfig): this.type = set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: /* placement */ Placement => CSSProperties): this.type = set("style", js.Any.fromFunction1(value))
  }
  
  type Props = NotificationsProps with RefAttributes[NotificationsRef]
  
  implicit def make(companion: Notifications.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NotificationsProps with RefAttributes[NotificationsRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
