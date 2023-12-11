package web.typings.antd

import web.typings.antd.anon.FCBreadcrumbItemPropsANTB
import web.typings.antd.anon.FCchildrenReactNodeundefi
import web.typings.antd.anon.Items
import web.typings.antd.anon.OmitBreadcrumbItemTypechi
import web.typings.antd.antdStrings.items
import web.typings.antd.antdStrings.separator
import web.typings.antd.esBreadcrumbBreadcrumbItemMod.MenuType
import web.typings.antd.esDropdownDropdownMod.DropdownProps
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import web.typings.react.mod.MouseEventHandler
import web.typings.std.Omit
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBreadcrumbBreadcrumbMod {
  
  object default {
    
    @scala.inline
    def apply[T /* <: AnyObject */](props: BreadcrumbProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/breadcrumb/Breadcrumb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/breadcrumb/Breadcrumb", "default.Item")
    @js.native
    def Item: FCBreadcrumbItemPropsANTB = js.native
    @scala.inline
    def Item_=(x: FCBreadcrumbItemPropsANTB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/breadcrumb/Breadcrumb", "default.Separator")
    @js.native
    def Separator: FCchildrenReactNodeundefi = js.native
    @scala.inline
    def Separator_=(x: FCchildrenReactNodeundefi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Separator")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/breadcrumb/Breadcrumb", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BreadcrumbItemType extends StObject {
    
    var breadcrumbName: js.UndefOr[String] = js.native
    
    /** @deprecated Please use `menu` instead */
    var children: js.UndefOr[js.Array[OmitBreadcrumbItemTypechi]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dropdownProps: js.UndefOr[DropdownProps] = js.native
    
    /**
      * Different with `path`. Directly set the link of this item.
      */
    var href: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var menu: js.UndefOr[(Omit[MenuType, items]) with Items] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.native
    
    /** @deprecated Please use `menu` instead */
    var overlay: js.UndefOr[ReactElement] = js.native
    
    /**
      * Different with `href`. It will concat all prev `path` to the current one.
      */
    var path: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object BreadcrumbItemType {
    
    @scala.inline
    def apply(): BreadcrumbItemType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BreadcrumbItemType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbName(value: String): Self = StObject.set(x, "breadcrumbName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbNameUndefined: Self = StObject.set(x, "breadcrumbName", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[OmitBreadcrumbItemTypechi]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: OmitBreadcrumbItemTypechi*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDropdownProps(value: DropdownProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMenu(value: (Omit[MenuType, items]) with Items): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLAnchorElement | HTMLSpanElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait BreadcrumbProps[T /* <: AnyObject */] extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var itemRender: js.UndefOr[
        js.Function4[
          /* route */ ItemType, 
          /* params */ T, 
          /* routes */ js.Array[ItemType], 
          /* paths */ js.Array[String], 
          ReactElement
        ]
      ] = js.native
    
    var items: js.UndefOr[js.Array[ItemType]] = js.native
    
    var params: js.UndefOr[T] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    /** @deprecated Please use `items` instead */
    var routes: js.UndefOr[js.Array[ItemType]] = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object BreadcrumbProps {
    
    @scala.inline
    def apply[T /* <: AnyObject */](): BreadcrumbProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BreadcrumbProps[_], T /* <: AnyObject */] (val x: Self with BreadcrumbProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* route */ ItemType, /* params */ T, /* routes */ js.Array[ItemType], /* paths */ js.Array[String]) => ReactElement
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[ItemType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: ItemType*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[ItemType]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: ItemType*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait BreadcrumbSeparatorType extends StObject {
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var `type`: separator = js.native
  }
  object BreadcrumbSeparatorType {
    
    @scala.inline
    def apply(): BreadcrumbSeparatorType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("separator")
      __obj.asInstanceOf[BreadcrumbSeparatorType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BreadcrumbSeparatorType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<antd.antd/es/breadcrumb/Breadcrumb.BreadcrumbItemType & antd.antd/es/breadcrumb/Breadcrumb.BreadcrumbSeparatorType> */
  @js.native
  trait InternalRouteType extends StObject {
    
    var breadcrumbName: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[js.Array[OmitBreadcrumbItemTypechi]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dropdownProps: js.UndefOr[DropdownProps] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var menu: js.UndefOr[(Omit[MenuType, items]) with Items] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.native
    
    var overlay: js.UndefOr[ReactElement] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var `type`: js.UndefOr[separator] = js.native
  }
  object InternalRouteType {
    
    @scala.inline
    def apply(): InternalRouteType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalRouteType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalRouteType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbName(value: String): Self = StObject.set(x, "breadcrumbName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbNameUndefined: Self = StObject.set(x, "breadcrumbName", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[OmitBreadcrumbItemTypechi]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: OmitBreadcrumbItemTypechi*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDropdownProps(value: DropdownProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMenu(value: (Omit[MenuType, items]) with Items): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLAnchorElement | HTMLSpanElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<antd.antd/es/breadcrumb/Breadcrumb.BreadcrumbItemType & antd.antd/es/breadcrumb/Breadcrumb.BreadcrumbSeparatorType> */
  @js.native
  trait ItemType extends StObject {
    
    var breadcrumbName: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[js.Array[OmitBreadcrumbItemTypechi]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dropdownProps: js.UndefOr[DropdownProps] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var menu: js.UndefOr[(Omit[MenuType, items]) with Items] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.native
    
    var overlay: js.UndefOr[ReactElement] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var `type`: js.UndefOr[separator] = js.native
  }
  object ItemType {
    
    @scala.inline
    def apply(): ItemType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ItemType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbName(value: String): Self = StObject.set(x, "breadcrumbName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbNameUndefined: Self = StObject.set(x, "breadcrumbName", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[OmitBreadcrumbItemTypechi]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: OmitBreadcrumbItemTypechi*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDropdownProps(value: DropdownProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMenu(value: (Omit[MenuType, items]) with Items): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLAnchorElement | HTMLSpanElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
