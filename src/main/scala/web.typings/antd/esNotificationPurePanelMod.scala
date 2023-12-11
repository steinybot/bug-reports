package web.typings.antd

import web.typings.antd.antdStrings.alert_
import web.typings.antd.antdStrings.status
import web.typings.antd.esNotificationInterfaceMod.IconType
import web.typings.rcNotification.anon.keyinNoticeSemanticPropsC
import web.typings.rcNotification.anon.keyinNoticeSemanticPropss
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.Key
import web.typings.react.mod.MouseEventHandler
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationPurePanelMod {
  
  @JSImport("antd/es/notification/PurePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @private Internal Component. Do not use in your production. */
  @JSImport("antd/es/notification/PurePanel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PurePanelProps] = js.native
  
  @JSImport("antd/es/notification/PurePanel", "PureContent")
  @js.native
  val PureContent: ReactComponentClass[PureContentProps] = js.native
  
  object TypeIcon {
    
    @JSImport("antd/es/notification/PurePanel", "TypeIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/notification/PurePanel", "TypeIcon.error")
    @js.native
    def error: Element = js.native
    @scala.inline
    def error_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/notification/PurePanel", "TypeIcon.info")
    @js.native
    def info: Element = js.native
    @scala.inline
    def info_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/notification/PurePanel", "TypeIcon.loading")
    @js.native
    def loading: Element = js.native
    @scala.inline
    def loading_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/notification/PurePanel", "TypeIcon.success")
    @js.native
    def success: Element = js.native
    @scala.inline
    def success_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/notification/PurePanel", "TypeIcon.warning")
    @js.native
    def warning: Element = js.native
    @scala.inline
    def warning_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getCloseIcon(prefixCls: String): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getCloseIcon")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  @scala.inline
  def getCloseIcon(prefixCls: String, closeIcon: ReactElement): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloseIcon")(prefixCls.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  @js.native
  trait PureContentProps extends StObject {
    
    var btn: js.UndefOr[ReactElement] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var message: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: String = js.native
    
    var role: js.UndefOr[alert_ | status] = js.native
    
    var `type`: js.UndefOr[IconType] = js.native
  }
  object PureContentProps {
    
    @scala.inline
    def apply(prefixCls: String): PureContentProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[PureContentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PureContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtn(value: ReactElement): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnUndefined: Self = StObject.set(x, "btn", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: alert_ | status): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-notification.rc-notification/es/Notice.NoticeProps, 'prefixCls' | 'eventKey'> */
  /* Inlined parent std.Omit<antd.antd/es/notification/PurePanel.PureContentProps, 'prefixCls' | 'children'> */
  @js.native
  trait PurePanelProps extends StObject {
    
    var btn: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[keyinNoticeSemanticPropss] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var hovering: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var message: js.UndefOr[ReactElement] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onNoticeClose: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var props: js.UndefOr[HTMLAttributes[HTMLDivElement] with (Record[String, Any])] = js.native
    
    var role: js.UndefOr[alert_ | status] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[keyinNoticeSemanticPropsC] = js.native
    
    var `type`: js.UndefOr[IconType] = js.native
  }
  object PurePanelProps {
    
    @scala.inline
    def apply(): PurePanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PurePanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PurePanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtn(value: ReactElement): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnUndefined: Self = StObject.set(x, "btn", js.undefined)
      
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
      def setHovering(value: Boolean): Self = StObject.set(x, "hovering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoveringUndefined: Self = StObject.set(x, "hovering", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnNoticeClose(value: /* key */ Key => Unit): Self = StObject.set(x, "onNoticeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNoticeCloseUndefined: Self = StObject.set(x, "onNoticeClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setProps(value: HTMLAttributes[HTMLDivElement] with (Record[String, Any])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
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
      def setStyles(value: keyinNoticeSemanticPropsC): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
