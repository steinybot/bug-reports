package web.typings.antd

import web.typings.antd.anon.Delay
import web.typings.antd.anon.Source
import web.typings.antd.antdStrings.click
import web.typings.antd.antdStrings.contextMenu
import web.typings.antd.antdStrings.hover
import web.typings.antd.antdStrings.text_
import web.typings.antd.esButtonButtonGroupMod.ButtonGroupProps
import web.typings.antd.esButtonButtonHelpersMod.ButtonHTMLType
import web.typings.antd.esDropdownDropdownMod.DropdownArrowOptions
import web.typings.antd.esDropdownDropdownMod.OverlayFunc
import web.typings.antd.esDropdownDropdownMod.Placement
import web.typings.antd.esMenuMenuMod.MenuProps
import web.typings.antd.esUtilPlacementsMod.AdjustOverflow
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDropdownDropdownButtonMod extends Shortcut {
  
  @JSImport("antd/es/dropdown/dropdown-button", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  type CompoundedComponent = ReactComponentClass[DropdownButtonProps]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.antd.esDropdownDropdownMod.DropdownProps because var conflicts: children, className, prefixCls. Inlined menu, autoFocus, arrow, trigger, dropdownRender, onOpenChange, open, disabled, destroyPopupOnHide, align, getPopupContainer, rootClassName, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName, autoAdjustOverflow, overlay, visible, onVisibleChange */ @js.native
  trait DropdownButtonProps
    extends StObject
       with ButtonGroupProps {
    
    var align: js.UndefOr[AlignType] = js.native
    
    var arrow: js.UndefOr[Boolean | DropdownArrowOptions] = js.native
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var buttonsRender: js.UndefOr[js.Function1[/* buttons */ js.Array[ReactElement], js.Array[ReactElement]]] = js.native
    
    var danger: js.UndefOr[Boolean] = js.native
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dropdownRender: js.UndefOr[js.Function1[/* originNode */ ReactElement, ReactElement]] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var htmlType: js.UndefOr[ButtonHTMLType] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var loading: js.UndefOr[Boolean | Delay] = js.native
    
    var menu: js.UndefOr[MenuProps] = js.native
    
    var mouseEnterDelay: js.UndefOr[Double] = js.native
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var onOpenChange: js.UndefOr[js.Function2[/* open */ Boolean, /* info */ Source, Unit]] = js.native
    
    /** @deprecated Please use `onOpenChange` instead */
    var onVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var openClassName: js.UndefOr[String] = js.native
    
    /** @deprecated Please use `menu` instead */
    var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.native
    
    var overlayClassName: js.UndefOr[String] = js.native
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.native
    
    var `type`: js.UndefOr[DropdownButtonType] = js.native
    
    /** @deprecated Please use `open` instead */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object DropdownButtonProps {
    
    @scala.inline
    def apply(): DropdownButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownButtonProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DropdownButtonProps] (val x: Self) extends AnyVal {
      
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
      def setButtonsRender(value: /* buttons */ js.Array[ReactElement] => js.Array[ReactElement]): Self = StObject.set(x, "buttonsRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setButtonsRenderUndefined: Self = StObject.set(x, "buttonsRender", js.undefined)
      
      @scala.inline
      def setDanger(value: Boolean): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
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
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlType(value: ButtonHTMLType): Self = StObject.set(x, "htmlType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTypeUndefined: Self = StObject.set(x, "htmlType", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean | Delay): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
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
      def setOnClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: (/* open */ Boolean, /* info */ Source) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
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
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
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
      def setType(value: DropdownButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.default
    - `web.typings`.antd.antdStrings.primary
    - `web.typings`.antd.antdStrings.dashed
    - `web.typings`.antd.antdStrings.link
    - `web.typings`.antd.antdStrings.text_
  */
  trait DropdownButtonType extends StObject
  object DropdownButtonType {
    
    @scala.inline
    def default: web.typings.antd.antdStrings.default = "default".asInstanceOf[web.typings.antd.antdStrings.default]
    
    @scala.inline
    def dashed: web.typings.antd.antdStrings.dashed = "dashed".asInstanceOf[web.typings.antd.antdStrings.dashed]
    
    @scala.inline
    def link: web.typings.antd.antdStrings.link = "link".asInstanceOf[web.typings.antd.antdStrings.link]
    
    @scala.inline
    def primary: web.typings.antd.antdStrings.primary = "primary".asInstanceOf[web.typings.antd.antdStrings.primary]
    
    @scala.inline
    def text: text_ = "text".asInstanceOf[text_]
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esDropdownDropdownButtonMod.foo` */
  override def _to: CompoundedComponent = default
}
