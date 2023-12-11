package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esSwitchMod.SwitchProps
import web.typings.antd.esSwitchMod.SwitchSize
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  @JSImport("antd", "Switch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkedChildren(value: ReactElement): this.type = set("checkedChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: Boolean): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* checked */ Boolean, /* event */ SyntheticMouseEvent[HTMLButtonElement]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClick(value: (/* checked */ Boolean, /* event */ SyntheticMouseEvent[HTMLButtonElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SwitchSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unCheckedChildren(value: ReactElement): this.type = set("unCheckedChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Boolean): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  type Props = SwitchProps with RefAttributes[HTMLElement]
  
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchProps with RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
