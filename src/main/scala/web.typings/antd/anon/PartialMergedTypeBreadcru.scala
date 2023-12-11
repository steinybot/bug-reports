package web.typings.antd.anon

import web.typings.antd.antdStrings.items
import web.typings.antd.antdStrings.separator
import web.typings.antd.esBreadcrumbBreadcrumbItemMod.MenuType
import web.typings.antd.esDropdownDropdownMod.DropdownProps
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

/* Inlined std.Partial<antd.antd/es/breadcrumb/useItems.MergedType & antd.antd/es/breadcrumb/Breadcrumb.BreadcrumbSeparatorType> */
@js.native
trait PartialMergedTypeBreadcru extends StObject {
  
  var breadcrumbName: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[js.Array[OmitBreadcrumbItemTypechi]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var dropdownProps: js.UndefOr[DropdownProps] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[web.typings.react.mod.Key] = js.native
  
  var menu: js.UndefOr[(Omit[MenuType, items]) with Items] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.native
  
  var overlay: js.UndefOr[ReactElement] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var separator: js.UndefOr[ReactElement] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var `type`: js.UndefOr[separator] = js.native
}
object PartialMergedTypeBreadcru {
  
  @scala.inline
  def apply(): PartialMergedTypeBreadcru = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMergedTypeBreadcru]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialMergedTypeBreadcru] (val x: Self) extends AnyVal {
    
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
    def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMenu(value: (Omit[MenuType, items]) with Items): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLAnchorElement | HTMLSpanElement] => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
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
