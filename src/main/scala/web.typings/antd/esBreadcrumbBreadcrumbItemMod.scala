package web.typings.antd

import web.typings.antd.anon.Items
import web.typings.antd.antdStrings.items
import web.typings.antd.esDropdownDropdownMod.DropdownProps
import web.typings.antd.esDropdownDropdownMod.OverlayFunc
import web.typings.antd.esMenuMenuMod.MenuProps
import web.typings.react.mod.Key
import web.typings.react.mod.MouseEventHandler
import web.typings.std.NonNullable
import web.typings.std.Omit
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBreadcrumbBreadcrumbItemMod extends Shortcut {
  
  @JSImport("antd/es/breadcrumb/BreadcrumbItem", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/es/breadcrumb/BreadcrumbItem", "InternalBreadcrumbItem")
  @js.native
  val InternalBreadcrumbItem: ReactComponentClass[BreadcrumbItemProps] = js.native
  
  @js.native
  trait BreadcrumbItemProps
    extends StObject
       with SeparatorType {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dropdownProps: js.UndefOr[DropdownProps] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var menu: js.UndefOr[(Omit[MenuType, items]) with Items] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.native
    
    /** @deprecated Please use `menu` instead */
    var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object BreadcrumbItemProps {
    
    @scala.inline
    def apply(): BreadcrumbItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BreadcrumbItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      def setMenu(value: (Omit[MenuType, items]) with Items): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLAnchorElement | HTMLSpanElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type CompoundedComponent = ReactComponentClass[BreadcrumbItemProps]
  
  @js.native
  trait MenuItem extends StObject {
    
    var href: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object MenuItem {
    
    @scala.inline
    def apply(): MenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItem]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
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
  
  type MenuType = NonNullable[js.UndefOr[MenuProps]]
  
  @js.native
  trait SeparatorType extends StObject {
    
    var key: js.UndefOr[Key] = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
  }
  object SeparatorType {
    
    @scala.inline
    def apply(): SeparatorType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeparatorType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SeparatorType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esBreadcrumbBreadcrumbItemMod.foo` */
  override def _to: CompoundedComponent = default
}
