package web.typings.rcMenu

import web.typings.rcMenu.anon.DomEvent
import web.typings.rcMenu.esInterfaceMod.MenuClickEventHandler
import web.typings.rcMenu.esInterfaceMod.MenuHoverEventHandler
import web.typings.rcMenu.esInterfaceMod.MenuInfo
import web.typings.rcMenu.esInterfaceMod.MenuTitleInfo
import web.typings.rcMenu.esInterfaceMod.RenderIconInfo
import web.typings.rcMenu.esInterfaceMod.RenderIconType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuMod {
  
  @JSImport("rc-menu/es/SubMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: SubMenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined parent std.Omit<rc-menu.rc-menu/es/interface.SubMenuType, 'key' | 'children' | 'label'> */
  @js.native
  trait SubMenuProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** @private Internal filled key. Do not set it directly */
    var eventKey: js.UndefOr[String] = js.native
    
    var expandIcon: js.UndefOr[RenderIconType] = js.native
    
    /** @private Used for rest popup. Do not use in your prod */
    var internalPopupClose: js.UndefOr[Boolean] = js.native
    
    var itemIcon: js.UndefOr[RenderIconType] = js.native
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.native
    
    var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.native
    
    var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.native
    
    var onTitleClick: js.UndefOr[js.Function1[/* info */ MenuTitleInfo, Unit]] = js.native
    
    var onTitleMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.native
    
    var onTitleMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var popupOffset: js.UndefOr[js.Array[Double]] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    /** @private Do not use. Private warning empty usage */
    var warnKey: js.UndefOr[Boolean] = js.native
  }
  object SubMenuProps {
    
    @scala.inline
    def apply(): SubMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubMenuProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SubMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconReactElement(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setInternalPopupClose(value: Boolean): Self = StObject.set(x, "internalPopupClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalPopupCloseUndefined: Self = StObject.set(x, "internalPopupClose", js.undefined)
      
      @scala.inline
      def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemIconReactElement(value: ReactElement): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnTitleClick(value: /* info */ MenuTitleInfo => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      @scala.inline
      def setOnTitleMouseEnter(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onTitleMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTitleMouseEnterUndefined: Self = StObject.set(x, "onTitleMouseEnter", js.undefined)
      
      @scala.inline
      def setOnTitleMouseLeave(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onTitleMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTitleMouseLeaveUndefined: Self = StObject.set(x, "onTitleMouseLeave", js.undefined)
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupOffset(value: js.Array[Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      @scala.inline
      def setPopupOffsetVarargs(value: Double*): Self = StObject.set(x, "popupOffset", js.Array(value :_*))
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWarnKey(value: Boolean): Self = StObject.set(x, "warnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnKeyUndefined: Self = StObject.set(x, "warnKey", js.undefined)
    }
  }
}
