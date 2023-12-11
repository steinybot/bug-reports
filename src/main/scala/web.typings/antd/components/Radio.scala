package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esRadioInterfaceMod.RadioChangeEvent
import web.typings.antd.esRadioInterfaceMod.RadioGroupProps
import web.typings.antd.esRadioInterfaceMod.RadioProps
import web.typings.antd.esRadioRadioButtonMod.RadioButtonProps
import web.typings.rcCheckbox.mod.CheckboxRef
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  object Button {
    
    @JSImport("antd", "Radio.Button")
    @js.native
    val component: js.Object = js.native
    
    type Props = RadioButtonProps with RefAttributes[CheckboxRef]
    
    implicit def make(companion: Button.type): SharedBuilder_RadioButtonPropsRefAttributes1845227975[CheckboxRef] = new SharedBuilder_RadioButtonPropsRefAttributes1845227975[CheckboxRef](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RadioButtonProps with RefAttributes[CheckboxRef]): SharedBuilder_RadioButtonPropsRefAttributes1845227975[CheckboxRef] = new SharedBuilder_RadioButtonPropsRefAttributes1845227975[CheckboxRef](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    @JSImport("antd", "Radio.Group")
    @js.native
    val component: js.Object = js.native
    
    type Props = RadioGroupProps with RefAttributes[HTMLDivElement]
    
    implicit def make(companion: Group.type): SharedBuilder_RadioGroupPropsRefAttributes_343343742[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes_343343742[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RadioGroupProps with RefAttributes[HTMLDivElement]): SharedBuilder_RadioGroupPropsRefAttributes_343343742[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes_343343742[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Radio")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, CheckboxRef] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: RadioChangeEvent => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skipGroup(value: Boolean): this.type = set("skipGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  type Props = RadioProps with RefAttributes[CheckboxRef]
  
  implicit def make(companion: Radio.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioProps with RefAttributes[CheckboxRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
