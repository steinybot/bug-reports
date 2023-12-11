package web.typings.antd.anon

import web.typings.antd.esDrawerDrawerPanelMod.DrawerClassNames
import web.typings.antd.esDrawerDrawerPanelMod.DrawerStyles
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd.antd/es/drawer/DrawerPanel.DrawerPanelProps, 'prefixCls'> & antd.antd/es/drawer.PurePanelInterface */
@js.native
trait OmitDrawerPanelPropsprefi extends StObject {
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classNames: js.UndefOr[DrawerClassNames] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var closeIcon: js.UndefOr[Boolean | ReactElement] = js.native
  
  var drawerStyle: js.UndefOr[CSSProperties] = js.native
  
  var extra: js.UndefOr[ReactElement] = js.native
  
  var footer: js.UndefOr[ReactElement] = js.native
  
  var footerStyle: js.UndefOr[CSSProperties] = js.native
  
  var headerStyle: js.UndefOr[CSSProperties] = js.native
  
  var onClose: js.UndefOr[
    js.Function1[/* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], scala.Unit]
  ] = js.native
  
  var placement: js.UndefOr[web.typings.rcDrawer.esDrawerMod.Placement] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var styles: js.UndefOr[DrawerStyles] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
}
object OmitDrawerPanelPropsprefi {
  
  @scala.inline
  def apply(): OmitDrawerPanelPropsprefi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitDrawerPanelPropsprefi]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OmitDrawerPanelPropsprefi] (val x: Self) extends AnyVal {
    
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
    def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => scala.Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setPlacement(value: web.typings.rcDrawer.esDrawerMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
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
  }
}
