package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esDrawerDrawerPanelMod.DrawerClassNames
import web.typings.antd.esDrawerDrawerPanelMod.DrawerPanelProps
import web.typings.antd.esDrawerDrawerPanelMod.DrawerStyles
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerPanel {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerPanelProps]))
  }
  
  @JSImport("antd/es/drawer/DrawerPanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNames(value: DrawerClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: Boolean | ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def drawerStyle(value: CSSProperties): this.type = set("drawerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerStyle(value: CSSProperties): this.type = set("footerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(
      value: /* e */ SyntheticMouseEvent[org.scalajs.dom.Element] | SyntheticKeyboardEvent[org.scalajs.dom.Element] => Unit
    ): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: DrawerStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  type Props = DrawerPanelProps
  
  def withProps(p: DrawerPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
