package web.typings.rcTabs.components

import web.typings.StBuildingComponent
import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.rcTabs.esInterfaceMod.Tab
import web.typings.rcTabs.esTabNavListTabNodeMod.TabNodeProps
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabNode {
  
  @scala.inline
  def apply(
    active: Boolean,
    id: String,
    onFocus: SyntheticFocusEvent[Element] => Unit,
    prefixCls: String,
    tab: Tab
  ): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus), prefixCls = prefixCls.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabNodeProps]))
  }
  
  @JSImport("rc-tabs/es/TabNavList/TabNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResize(value: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Unit): this.type = set("onResize", js.Any.fromFunction4(value))
    
    @scala.inline
    def removeAriaLabel(value: String): this.type = set("removeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIcon(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderWrapper(value: /* node */ ReactElement => ReactElement): this.type = set("renderWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = TabNodeProps
  
  def withProps(p: TabNodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
