package web.typings.rcMenu

import web.typings.rcMenu.anon.DomEvent
import web.typings.rcMenu.rcMenuStrings.divider
import web.typings.rcMenu.rcMenuStrings.group
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import web.typings.react.mod.ReactInstance
import web.typings.std.FocusOptions
import web.typings.std.Record
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLUListElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  type BuiltinPlacements = Record[String, Any]
  
  @js.native
  trait ItemSharedProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ItemSharedProps {
    
    @scala.inline
    def apply(): ItemSharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemSharedProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ItemSharedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcMenu.esInterfaceMod.SubMenuType
    - `web.typings`.rcMenu.esInterfaceMod.MenuItemType
    - `web.typings`.rcMenu.esInterfaceMod.MenuItemGroupType
    - `web.typings`.rcMenu.esInterfaceMod.MenuDividerType
    - scala.Null
  */
  type ItemType = _ItemType | Null
  
  type MenuClickEventHandler = js.Function1[/* info */ MenuInfo, Unit]
  
  @js.native
  trait MenuDividerType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var `type`: divider = js.native
  }
  object MenuDividerType {
    
    @scala.inline
    def apply(): MenuDividerType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("divider")
      __obj.asInstanceOf[MenuDividerType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuDividerType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: divider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MenuHoverEventHandler = js.Function1[/* info */ DomEvent, Unit]
  
  @js.native
  trait MenuInfo extends StObject {
    
    var domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement] = js.native
    
    /** @deprecated This will not support in future. You should avoid to use this */
    var item: ReactInstance = js.native
    
    var key: String = js.native
    
    var keyPath: js.Array[String] = js.native
  }
  object MenuInfo {
    
    @scala.inline
    def apply(
      domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement],
      item: ReactInstance,
      key: String,
      keyPath: js.Array[String]
    ): MenuInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomEvent(value: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomEventSyntheticKeyboardEvent(value: SyntheticKeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomEventSyntheticMouseEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPath(value: js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MenuItemGroupType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var children: js.UndefOr[js.Array[ItemType]] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var `type`: group = js.native
  }
  object MenuItemGroupType {
    
    @scala.inline
    def apply(): MenuItemGroupType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[MenuItemGroupType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuItemGroupType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ItemType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ItemType*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MenuItemType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var itemIcon: js.UndefOr[RenderIconType] = js.native
    
    var key: Key = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.native
    
    var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.native
    
    var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.native
  }
  object MenuItemType {
    
    @scala.inline
    def apply(key: Key): MenuItemType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuItemType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemIconReactElement(value: ReactElement): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
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
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcMenu.rcMenuStrings.horizontal
    - `web.typings`.rcMenu.rcMenuStrings.vertical
    - `web.typings`.rcMenu.rcMenuStrings.`inline`
  */
  trait MenuMode extends StObject
  object MenuMode {
    
    @scala.inline
    def horizontal: web.typings.rcMenu.rcMenuStrings.horizontal = "horizontal".asInstanceOf[web.typings.rcMenu.rcMenuStrings.horizontal]
    
    @scala.inline
    def `inline`: web.typings.rcMenu.rcMenuStrings.`inline` = "inline".asInstanceOf[web.typings.rcMenu.rcMenuStrings.`inline`]
    
    @scala.inline
    def vertical: web.typings.rcMenu.rcMenuStrings.vertical = "vertical".asInstanceOf[web.typings.rcMenu.rcMenuStrings.vertical]
  }
  
  @js.native
  trait MenuRef extends StObject {
    
    /**
      * Focus active child if any, or the first child which is not disabled will be focused.
      * @param options
      */
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
    var list: HTMLUListElement = js.native
  }
  
  @js.native
  trait MenuTitleInfo extends StObject {
    
    var domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement] = js.native
    
    var key: String = js.native
  }
  object MenuTitleInfo {
    
    @scala.inline
    def apply(domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], key: String): MenuTitleInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuTitleInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuTitleInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomEvent(value: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomEventSyntheticKeyboardEvent(value: SyntheticKeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomEventSyntheticMouseEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderIconInfo extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var isSelected: js.UndefOr[Boolean] = js.native
    
    var isSubMenu: js.UndefOr[Boolean] = js.native
  }
  object RenderIconInfo {
    
    @scala.inline
    def apply(): RenderIconInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderIconInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RenderIconInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setIsSubMenu(value: Boolean): Self = StObject.set(x, "isSubMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSubMenuUndefined: Self = StObject.set(x, "isSubMenu", js.undefined)
    }
  }
  
  type RenderIconType = ReactElement | (js.Function1[/* props */ RenderIconInfo, ReactElement])
  
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  
  @js.native
  trait SelectInfo
    extends StObject
       with MenuInfo {
    
    var selectedKeys: js.Array[String] = js.native
  }
  object SelectInfo {
    
    @scala.inline
    def apply(
      domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement],
      item: ReactInstance,
      key: String,
      keyPath: js.Array[String],
      selectedKeys: js.Array[String]
    ): SelectInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SelectInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SubMenuType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var children: js.Array[ItemType] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[RenderIconType] = js.native
    
    var itemIcon: js.UndefOr[RenderIconType] = js.native
    
    var key: String = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
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
  }
  object SubMenuType {
    
    @scala.inline
    def apply(children: js.Array[ItemType], key: String): SubMenuType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SubMenuType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ItemType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ItemType*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconReactElement(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemIconReactElement(value: ReactElement): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
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
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcMenu.rcMenuStrings.click
    - `web.typings`.rcMenu.rcMenuStrings.hover
  */
  trait TriggerSubMenuAction extends StObject
  object TriggerSubMenuAction {
    
    @scala.inline
    def click: web.typings.rcMenu.rcMenuStrings.click = "click".asInstanceOf[web.typings.rcMenu.rcMenuStrings.click]
    
    @scala.inline
    def hover: web.typings.rcMenu.rcMenuStrings.hover = "hover".asInstanceOf[web.typings.rcMenu.rcMenuStrings.hover]
  }
  
  trait _ItemType extends StObject
  object _ItemType {
    
    @scala.inline
    def MenuDividerType(): web.typings.rcMenu.esInterfaceMod.MenuDividerType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("divider")
      __obj.asInstanceOf[web.typings.rcMenu.esInterfaceMod.MenuDividerType]
    }
    
    @scala.inline
    def MenuItemGroupType(): web.typings.rcMenu.esInterfaceMod.MenuItemGroupType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[web.typings.rcMenu.esInterfaceMod.MenuItemGroupType]
    }
    
    @scala.inline
    def MenuItemType(key: Key): web.typings.rcMenu.esInterfaceMod.MenuItemType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcMenu.esInterfaceMod.MenuItemType]
    }
    
    @scala.inline
    def SubMenuType(children: js.Array[ItemType], key: String): web.typings.rcMenu.esInterfaceMod.SubMenuType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcMenu.esInterfaceMod.SubMenuType]
    }
  }
}
