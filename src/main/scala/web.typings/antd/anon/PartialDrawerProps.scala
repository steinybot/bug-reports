package web.typings.antd.anon

import web.typings.antd.esDrawerDrawerPanelMod.DrawerClassNames
import web.typings.antd.esDrawerDrawerPanelMod.DrawerStyles
import web.typings.antd.esDrawerMod.sizeType
import web.typings.rcComponentPortal.esPortalMod.ContainerType
import web.typings.rcComponentPortal.esPortalMod.GetContainer
import web.typings.rcDrawer.esDrawerPopupMod.PushConfig
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/es/drawer.DrawerProps> */
@js.native
trait PartialDrawerProps extends StObject {
  
  var afterOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, scala.Unit]] = js.native
  
  var afterVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, scala.Unit]] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classNames: js.UndefOr[DrawerClassNames] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var closeIcon: js.UndefOr[Boolean | ReactElement] = js.native
  
  var contentWrapperStyle: js.UndefOr[CSSProperties] = js.native
  
  var destroyOnClose: js.UndefOr[Boolean] = js.native
  
  var drawerStyle: js.UndefOr[CSSProperties] = js.native
  
  var extra: js.UndefOr[ReactElement] = js.native
  
  var footer: js.UndefOr[ReactElement] = js.native
  
  var footerStyle: js.UndefOr[CSSProperties] = js.native
  
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var getContainer: js.UndefOr[GetContainer] = js.native
  
  var headerStyle: js.UndefOr[CSSProperties] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var maskClassName: js.UndefOr[String] = js.native
  
  var maskClosable: js.UndefOr[Boolean] = js.native
  
  var maskMotion: js.UndefOr[CSSMotionProps] = js.native
  
  var maskStyle: js.UndefOr[CSSProperties] = js.native
  
  var motion: js.UndefOr[
    CSSMotionProps | (js.Function1[/* placement */ web.typings.rcDrawer.esDrawerPopupMod.Placement, CSSMotionProps])
  ] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onClose: js.UndefOr[
    js.Function1[/* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], scala.Unit]
  ] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var panelRef: js.UndefOr[web.typings.react.mod.Ref[HTMLDivElement]] = js.native
  
  var placement: js.UndefOr[web.typings.rcDrawer.esDrawerPopupMod.Placement] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var push: js.UndefOr[Boolean | PushConfig] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var rootStyle: js.UndefOr[CSSProperties] = js.native
  
  var size: js.UndefOr[sizeType] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var styles: js.UndefOr[DrawerStyles] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object PartialDrawerProps {
  
  @scala.inline
  def apply(): PartialDrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDrawerProps]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialDrawerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterOpenChange(value: /* open */ Boolean => scala.Unit): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
    
    @scala.inline
    def setAfterVisibleChange(value: /* open */ Boolean => scala.Unit): Self = StObject.set(x, "afterVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClassNames(value: DrawerClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    @scala.inline
    def setCloseIcon(value: Boolean | ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    @scala.inline
    def setContentWrapperStyle(value: CSSProperties): Self = StObject.set(x, "contentWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWrapperStyleUndefined: Self = StObject.set(x, "contentWrapperStyle", js.undefined)
    
    @scala.inline
    def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
    
    @scala.inline
    def setDrawerStyle(value: CSSProperties): Self = StObject.set(x, "drawerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerStyleUndefined: Self = StObject.set(x, "drawerStyle", js.undefined)
    
    @scala.inline
    def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
    
    @scala.inline
    def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContainerFunction0(value: () => ContainerType): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
    
    @scala.inline
    def setMaskMotion(value: CSSMotionProps): Self = StObject.set(x, "maskMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskMotionUndefined: Self = StObject.set(x, "maskMotion", js.undefined)
    
    @scala.inline
    def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setMotion(
      value: CSSMotionProps | (js.Function1[/* placement */ web.typings.rcDrawer.esDrawerPopupMod.Placement, CSSMotionProps])
    ): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionFunction1(value: /* placement */ web.typings.rcDrawer.esDrawerPopupMod.Placement => CSSMotionProps): Self = StObject.set(x, "motion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => scala.Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPanelRef(value: web.typings.react.mod.Ref[HTMLDivElement]): Self = StObject.set(x, "panelRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelRefFunction1(value: /* instance */ HTMLDivElement | Null => scala.Unit): Self = StObject.set(x, "panelRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPanelRefNull: Self = StObject.set(x, "panelRef", null)
    
    @scala.inline
    def setPanelRefReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "panelRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelRefUndefined: Self = StObject.set(x, "panelRef", js.undefined)
    
    @scala.inline
    def setPlacement(value: web.typings.rcDrawer.esDrawerPopupMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setPush(value: Boolean | PushConfig): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setRootStyle(value: CSSProperties): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
    
    @scala.inline
    def setSize(value: sizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: DrawerStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
