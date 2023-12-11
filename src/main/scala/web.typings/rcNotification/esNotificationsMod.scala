package web.typings.rcNotification

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.rcNotification.anon.Key
import web.typings.rcNotification.esInterfaceMod.OpenConfig
import web.typings.rcNotification.esInterfaceMod.Placement
import web.typings.rcNotification.esInterfaceMod.StackConfig
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import web.typings.std.ShadowRoot
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationsMod extends Shortcut {
  
  @JSImport("rc-notification/es/Notifications", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NotificationsProps with RefAttributes[NotificationsRef]] = js.native
  
  @js.native
  trait NotificationsProps extends StObject {
    
    var className: js.UndefOr[js.Function1[/* placement */ Placement, String]] = js.native
    
    var container: js.UndefOr[HTMLElement | ShadowRoot] = js.native
    
    var maxCount: js.UndefOr[Double] = js.native
    
    var motion: js.UndefOr[CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])] = js.native
    
    var onAllRemoved: js.UndefOr[VoidFunction] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderNotifications: js.UndefOr[js.Function2[/* node */ ReactElement, /* info */ Key, ReactElement]] = js.native
    
    var stack: js.UndefOr[StackConfig] = js.native
    
    var style: js.UndefOr[js.Function1[/* placement */ Placement, CSSProperties]] = js.native
  }
  object NotificationsProps {
    
    @scala.inline
    def apply(): NotificationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NotificationsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: /* placement */ Placement => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainer(value: HTMLElement | ShadowRoot): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionFunction1(value: /* placement */ Placement => CSSMotionProps): Self = StObject.set(x, "motion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setOnAllRemoved(value: () => Unit): Self = StObject.set(x, "onAllRemoved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAllRemovedUndefined: Self = StObject.set(x, "onAllRemoved", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderNotifications(value: (/* node */ ReactElement, /* info */ Key) => ReactElement): Self = StObject.set(x, "renderNotifications", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderNotificationsUndefined: Self = StObject.set(x, "renderNotifications", js.undefined)
      
      @scala.inline
      def setStack(value: StackConfig): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setStyle(value: /* placement */ Placement => CSSProperties): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait NotificationsRef extends StObject {
    
    def close(key: web.typings.react.mod.Key): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def open(config: OpenConfig): Unit = js.native
  }
  object NotificationsRef {
    
    @scala.inline
    def apply(close: web.typings.react.mod.Key => Unit, destroy: () => Unit, open: OpenConfig => Unit): NotificationsRef = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction1(open))
      __obj.asInstanceOf[NotificationsRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NotificationsRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: web.typings.react.mod.Key => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: OpenConfig => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ReactComponentClass[NotificationsProps with RefAttributes[NotificationsRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esNotificationsMod.foo` */
  override def _to: ReactComponentClass[NotificationsProps with RefAttributes[NotificationsRef]] = default
}
