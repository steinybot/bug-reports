package web.typings.rcNotification

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.rcNotification.anon.keyinNoticeSemanticPropsC
import web.typings.rcNotification.anon.keyinNoticeSemanticPropss
import web.typings.rcNotification.esInterfaceMod.Placement
import web.typings.rcNotification.esInterfaceMod.StackConfig
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.Key
import web.typings.react.mod.MouseEventHandler
import web.typings.std.Record
import web.typings.std.ShadowRoot
import web.typings.std.VoidFunction
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseNotificationMod {
  
  @JSImport("rc-notification/es/hooks/useNotification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Tuple2[NotificationAPI, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[NotificationAPI, ReactElement]]
  @scala.inline
  def default(rootConfig: NotificationConfig): js.Tuple2[NotificationAPI, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rootConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NotificationAPI, ReactElement]]
  
  @js.native
  trait NotificationAPI extends StObject {
    
    def close(key: Key): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def open(config: OptionalConfig): Unit = js.native
  }
  object NotificationAPI {
    
    @scala.inline
    def apply(close: Key => Unit, destroy: () => Unit, open: OptionalConfig => Unit): NotificationAPI = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction1(open))
      __obj.asInstanceOf[NotificationAPI]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NotificationAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: Key => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: OptionalConfig => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NotificationConfig extends StObject {
    
    /** @private. Config for notification holder style. Safe to remove if refactor */
    var className: js.UndefOr[js.Function1[/* placement */ Placement, String]] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    /** Customize container. It will repeat call which means you should return same container element. */
    var getContainer: js.UndefOr[js.Function0[HTMLElement | ShadowRoot]] = js.native
    
    var maxCount: js.UndefOr[Double] = js.native
    
    var motion: js.UndefOr[CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])] = js.native
    
    /** @private Trigger when all the notification closed. */
    var onAllRemoved: js.UndefOr[VoidFunction] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    /** @private Slot for style in Notifications */
    var renderNotifications: js.UndefOr[
        js.Function2[
          /* node */ ReactElement, 
          /* info */ web.typings.rcNotification.anon.Key, 
          ReactElement
        ]
      ] = js.native
    
    var stack: js.UndefOr[StackConfig] = js.native
    
    /** @private. Config for notification holder style. Safe to remove if refactor */
    var style: js.UndefOr[js.Function1[/* placement */ Placement, CSSProperties]] = js.native
  }
  object NotificationConfig {
    
    @scala.inline
    def apply(): NotificationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NotificationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: /* placement */ Placement => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement | ShadowRoot): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
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
      def setRenderNotifications(value: (/* node */ ReactElement, /* info */ web.typings.rcNotification.anon.Key) => ReactElement): Self = StObject.set(x, "renderNotifications", js.Any.fromFunction2(value))
      
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
  
  /* Inlined std.Partial<rc-notification.rc-notification/es/interface.OpenConfig> */
  @js.native
  trait OptionalConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[keyinNoticeSemanticPropss] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onClose: js.UndefOr[VoidFunction] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var props: js.UndefOr[HTMLAttributes[HTMLDivElement] with (Record[String, Any])] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[keyinNoticeSemanticPropsC] = js.native
  }
  object OptionalConfig {
    
    @scala.inline
    def apply(): OptionalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OptionalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: keyinNoticeSemanticPropss): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setProps(value: HTMLAttributes[HTMLDivElement] with (Record[String, Any])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: keyinNoticeSemanticPropsC): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
