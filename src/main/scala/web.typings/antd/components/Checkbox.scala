package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esCheckboxCheckboxMod.CheckboxChangeEvent
import web.typings.antd.esCheckboxCheckboxMod.CheckboxProps
import web.typings.antd.esCheckboxGroupMod.CheckboxGroupProps
import web.typings.antd.esCheckboxGroupMod.CheckboxOptionType
import web.typings.antd.esCheckboxGroupMod.CheckboxValueType
import web.typings.rcCheckbox.mod.CheckboxRef
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  object Group {
    
    @JSImport("antd", "Checkbox.Group")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, HTMLDivElement] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: js.Array[CheckboxValueType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: CheckboxValueType*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: /* checkedValue */ js.Array[CheckboxValueType] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def options(value: js.Array[CheckboxOptionType | String | Double]): this.type = set("options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def optionsVarargs(value: (CheckboxOptionType | String | Double)*): this.type = set("options", js.Array(value :_*))
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: js.Array[CheckboxValueType]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueVarargs(value: CheckboxValueType*): this.type = set("value", js.Array(value :_*))
    }
    
    type Props = CheckboxGroupProps with RefAttributes[HTMLDivElement]
    
    implicit def make(companion: Group.type): web.typings.antd.components.Checkbox.Group.Builder = new web.typings.antd.components.Checkbox.Group.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CheckboxGroupProps with RefAttributes[HTMLDivElement]): web.typings.antd.components.Checkbox.Group.Builder = new web.typings.antd.components.Checkbox.Group.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, CheckboxRef] {
    
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
    def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: CheckboxChangeEvent => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
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
  
  type Props = CheckboxProps with RefAttributes[CheckboxRef]
  
  implicit def make(companion: Checkbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckboxProps with RefAttributes[CheckboxRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
