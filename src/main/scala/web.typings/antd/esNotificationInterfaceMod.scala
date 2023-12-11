package web.typings.antd

import web.typings.antd.anon.Threshold
import web.typings.antd.antdStrings.alert_
import web.typings.antd.antdStrings.bottom
import web.typings.antd.antdStrings.bottomLeft
import web.typings.antd.antdStrings.bottomRight
import web.typings.antd.antdStrings.status
import web.typings.antd.antdStrings.top
import web.typings.antd.antdStrings.topLeft
import web.typings.antd.antdStrings.topRight
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLProps
import web.typings.react.mod.Key
import web.typings.std.ShadowRoot
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationInterfaceMod {
  
  @JSImport("antd/es/notification/interface", "NotificationPlacements")
  @js.native
  val NotificationPlacements: js.Tuple6[top, topLeft, topRight, bottom, bottomLeft, bottomRight] = js.native
  
  @js.native
  trait ArgsProps extends StObject {
    
    var btn: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeIcon: js.UndefOr[Boolean | ReactElement] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var message: ReactElement = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var placement: js.UndefOr[NotificationPlacement] = js.native
    
    var props: js.UndefOr[DivProps] = js.native
    
    var role: js.UndefOr[alert_ | status] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    val `type`: js.UndefOr[IconType] = js.native
  }
  object ArgsProps {
    
    @scala.inline
    def apply(message: ReactElement): ArgsProps = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ArgsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtn(value: ReactElement): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnUndefined: Self = StObject.set(x, "btn", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: Boolean | ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setRole(value: alert_ | status): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DivProps
    extends StObject
       with HTMLProps[HTMLDivElement] {
    
    var `data-testid`: js.UndefOr[String] = js.native
  }
  object DivProps {
    
    @scala.inline
    def apply(): DivProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DivProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DivProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
    }
  }
  
  @js.native
  trait GlobalConfigProps extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement | ShadowRoot]] = js.native
    
    var maxCount: js.UndefOr[Double] = js.native
    
    var placement: js.UndefOr[NotificationPlacement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var props: js.UndefOr[DivProps] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object GlobalConfigProps {
    
    @scala.inline
    def apply(): GlobalConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalConfigProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GlobalConfigProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
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
      def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.success
    - `web.typings`.antd.antdStrings.info
    - `web.typings`.antd.antdStrings.error
    - `web.typings`.antd.antdStrings.warning
  */
  trait IconType extends StObject
  object IconType {
    
    @scala.inline
    def error: web.typings.antd.antdStrings.error = "error".asInstanceOf[web.typings.antd.antdStrings.error]
    
    @scala.inline
    def info: web.typings.antd.antdStrings.info = "info".asInstanceOf[web.typings.antd.antdStrings.info]
    
    @scala.inline
    def success: web.typings.antd.antdStrings.success = "success".asInstanceOf[web.typings.antd.antdStrings.success]
    
    @scala.inline
    def warning: web.typings.antd.antdStrings.warning = "warning".asInstanceOf[web.typings.antd.antdStrings.warning]
  }
  
  @js.native
  trait NotificationConfig extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement | ShadowRoot]] = js.native
    
    var maxCount: js.UndefOr[Double] = js.native
    
    var placement: js.UndefOr[NotificationPlacement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var stack: js.UndefOr[Boolean | Threshold] = js.native
    
    var top: js.UndefOr[Double] = js.native
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
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement | ShadowRoot): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setStack(value: Boolean | Threshold): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait NotificationInstance extends StObject {
    
    def destroy(): Unit = js.native
    def destroy(key: Key): Unit = js.native
    
    var error: StaticFn = js.native
    
    var info: StaticFn = js.native
    
    var open: StaticFn = js.native
    
    var success: StaticFn = js.native
    
    var warning: StaticFn = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.top
    - `web.typings`.antd.antdStrings.topLeft
    - `web.typings`.antd.antdStrings.topRight
    - `web.typings`.antd.antdStrings.bottom
    - `web.typings`.antd.antdStrings.bottomLeft
    - `web.typings`.antd.antdStrings.bottomRight
  */
  trait NotificationPlacement extends StObject
  
  type StaticFn = js.Function1[/* args */ ArgsProps, Unit]
}
