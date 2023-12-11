package web.typings.antd.anon

import web.typings.antd.antdStrings.click
import web.typings.antd.antdStrings.contextMenu
import web.typings.antd.antdStrings.hover
import web.typings.antd.esDropdownDropdownMod.DropdownArrowOptions
import web.typings.antd.esDropdownDropdownMod.OverlayFunc
import web.typings.antd.esMenuMenuMod.MenuProps
import web.typings.antd.esUtilPlacementsMod.AdjustOverflow
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/es/dropdown/dropdown.DropdownProps> */
@js.native
trait PartialDropdownProps extends StObject {
  
  var align: js.UndefOr[AlignType] = js.native
  
  var arrow: js.UndefOr[Boolean | DropdownArrowOptions] = js.native
  
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dropdownRender: js.UndefOr[js.Function1[/* originNode */ ReactElement, ReactElement]] = js.native
  
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  
  var menu: js.UndefOr[MenuProps] = js.native
  
  var mouseEnterDelay: js.UndefOr[Double] = js.native
  
  var mouseLeaveDelay: js.UndefOr[Double] = js.native
  
  var onOpenChange: js.UndefOr[js.Function2[/* open */ Boolean, /* info */ Source, scala.Unit]] = js.native
  
  var onVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, scala.Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var openClassName: js.UndefOr[String] = js.native
  
  var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.native
  
  var overlayClassName: js.UndefOr[String] = js.native
  
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  
  var placement: js.UndefOr[web.typings.antd.esDropdownDropdownMod.Placement] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object PartialDropdownProps {
  
  @scala.inline
  def apply(): PartialDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDropdownProps]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialDropdownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setArrow(value: Boolean | DropdownArrowOptions): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDropdownRender(value: /* originNode */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
    
    @scala.inline
    def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
    
    @scala.inline
    def setMenu(value: MenuProps): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
    
    @scala.inline
    def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
    
    @scala.inline
    def setOnOpenChange(value: (/* open */ Boolean, /* info */ Source) => scala.Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
    
    @scala.inline
    def setOnVisibleChange(value: /* open */ Boolean => scala.Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
    
    @scala.inline
    def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPlacement(value: web.typings.antd.esDropdownDropdownMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    
    @scala.inline
    def setTrigger(value: js.Array[click | hover | contextMenu]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: (click | hover | contextMenu)*): Self = StObject.set(x, "trigger", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
