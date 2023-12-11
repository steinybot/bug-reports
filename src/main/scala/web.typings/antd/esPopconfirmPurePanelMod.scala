package web.typings.antd

import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esTooltipMod.TooltipPlacement
import web.typings.antd.esUtilGetRenderPropValueMod.RenderFunction
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopconfirmPurePanelMod extends Shortcut {
  
  @JSImport("antd/es/popconfirm/PurePanel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PurePanelProps] = js.native
  
  @JSImport("antd/es/popconfirm/PurePanel", "Overlay")
  @js.native
  val Overlay: ReactComponentClass[OverlayProps] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/popconfirm.PopconfirmProps, 'icon' | 'okButtonProps' | 'cancelButtonProps' | 'cancelText' | 'okText' | 'okType' | 'showCancel' | 'title' | 'description' | 'onPopupClick'> */
  @js.native
  trait OverlayProps extends StObject {
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var cancelText: js.UndefOr[ReactElement] = js.native
    
    var close: js.UndefOr[js.Function] = js.native
    
    var description: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var okText: js.UndefOr[ReactElement] = js.native
    
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]] = js.native
    
    var onConfirm: js.UndefOr[MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]] = js.native
    
    var onPopupClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var showCancel: js.UndefOr[Boolean] = js.native
    
    var title: ReactElement | RenderFunction = js.native
  }
  object OverlayProps {
    
    @scala.inline
    def apply(prefixCls: String, title: ReactElement | RenderFunction): OverlayProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement | RenderFunction): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction0(value: () => ReactElement): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnPopupClick(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPopupClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupClickUndefined: Self = StObject.set(x, "onPopupClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopconfirmLocale extends StObject {
    
    var cancelText: String = js.native
    
    var okText: String = js.native
  }
  object PopconfirmLocale {
    
    @scala.inline
    def apply(cancelText: String, okText: String): PopconfirmLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopconfirmLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PopconfirmLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<antd.antd/es/popconfirm/PurePanel.OverlayProps, 'prefixCls'> */
  /* Inlined parent std.Pick<antd.antd/es/popconfirm.PopconfirmProps, 'placement'> */
  @js.native
  trait PurePanelProps extends StObject {
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var cancelText: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var close: js.UndefOr[js.Function] = js.native
    
    var description: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var okText: js.UndefOr[ReactElement] = js.native
    
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]] = js.native
    
    var onConfirm: js.UndefOr[MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]] = js.native
    
    var onPopupClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
    
    var placement: js.UndefOr[TooltipPlacement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showCancel: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: ReactElement | RenderFunction = js.native
  }
  object PurePanelProps {
    
    @scala.inline
    def apply(title: ReactElement | RenderFunction): PurePanelProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurePanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PurePanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement | RenderFunction): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction0(value: () => ReactElement): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnPopupClick(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPopupClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupClickUndefined: Self = StObject.set(x, "onPopupClick", js.undefined)
      
      @scala.inline
      def setPlacement(value: TooltipPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[PurePanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `esPopconfirmPurePanelMod.foo` */
  override def _to: ReactComponentClass[PurePanelProps] = default
}
