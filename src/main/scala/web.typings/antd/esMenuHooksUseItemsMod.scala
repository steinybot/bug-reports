package web.typings.antd

import web.typings.antd.antdStrings.dark
import web.typings.antd.antdStrings.group
import web.typings.antd.antdStrings.light
import web.typings.rcMenu.anon.DomEvent
import web.typings.rcMenu.esInterfaceMod.MenuClickEventHandler
import web.typings.rcMenu.esInterfaceMod.MenuHoverEventHandler
import web.typings.rcMenu.esInterfaceMod.MenuInfo
import web.typings.rcMenu.esInterfaceMod.MenuTitleInfo
import web.typings.rcMenu.esInterfaceMod.RenderIconInfo
import web.typings.rcMenu.esInterfaceMod.RenderIconType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.Key
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMenuHooksUseItemsMod {
  
  @JSImport("antd/es/menu/hooks/useItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.UndefOr[js.Array[Element | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[js.Array[Element | Null]]]
  @scala.inline
  def default(items: js.Array[ItemType[MenuItemType]]): js.UndefOr[js.Array[Element | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Element | Null]]]
  
  /* Rewritten from type alias, can be one of: 
    - T
    - `web.typings`.antd.esMenuHooksUseItemsMod.SubMenuType[T]
    - `web.typings`.antd.esMenuHooksUseItemsMod.MenuItemGroupType[T]
    - `web.typings`.antd.esMenuHooksUseItemsMod.MenuDividerType
    - scala.Null
  */
  type ItemType[T /* <: MenuItemType */] = _ItemType[T] | T | Null
  
  @js.native
  trait MenuDividerType
    extends StObject
       with web.typings.rcMenu.esInterfaceMod.MenuDividerType
       with _ItemType[Any] {
    
    var dashed: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
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
      def setDashed(value: Boolean): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashedUndefined: Self = StObject.set(x, "dashed", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-menu.rc-menu/es/interface.MenuItemGroupType, 'children'> */
  @js.native
  trait MenuItemGroupType[T /* <: MenuItemType */]
    extends StObject
       with _ItemType[T] {
    
    var children: js.UndefOr[js.Array[ItemType[T]]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: group = js.native
  }
  object MenuItemGroupType {
    
    @scala.inline
    def apply[T /* <: MenuItemType */](): MenuItemGroupType[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[MenuItemGroupType[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuItemGroupType[_], T /* <: MenuItemType */] (val x: Self with MenuItemGroupType[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ItemType[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ItemType[T]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MenuItemType
    extends StObject
       with web.typings.rcMenu.esInterfaceMod.MenuItemType {
    
    var danger: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[String] = js.native
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
      def setDanger(value: Boolean): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-menu.rc-menu/es/interface.SubMenuType, 'children'> */
  @js.native
  trait SubMenuType[T /* <: MenuItemType */]
    extends StObject
       with _ItemType[T] {
    
    var children: js.Array[ItemType[T]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[RenderIconType] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
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
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var theme: js.UndefOr[dark | light] = js.native
  }
  object SubMenuType {
    
    @scala.inline
    def apply[T /* <: MenuItemType */](children: js.Array[ItemType[T]], key: String): SubMenuType[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuType[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SubMenuType[_], T /* <: MenuItemType */] (val x: Self with SubMenuType[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ItemType[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ItemType[T]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
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
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
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
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait _ItemType[T /* <: MenuItemType */] extends StObject
  object _ItemType {
    
    @scala.inline
    def MenuDividerType(): web.typings.antd.esMenuHooksUseItemsMod.MenuDividerType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("divider")
      __obj.asInstanceOf[web.typings.antd.esMenuHooksUseItemsMod.MenuDividerType]
    }
    
    @scala.inline
    def MenuItemGroupType[T /* <: MenuItemType */](): web.typings.antd.esMenuHooksUseItemsMod.MenuItemGroupType[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[web.typings.antd.esMenuHooksUseItemsMod.MenuItemGroupType[T]]
    }
    
    @scala.inline
    def SubMenuType[T /* <: MenuItemType */](children: js.Array[ItemType[T]], key: String): web.typings.antd.esMenuHooksUseItemsMod.SubMenuType[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.antd.esMenuHooksUseItemsMod.SubMenuType[T]]
    }
  }
}
