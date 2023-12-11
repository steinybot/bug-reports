package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esCheckboxGroupMod.CheckboxOptionType
import web.typings.antd.esConfigProviderDisabledContextMod.DisabledType
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esRadioInterfaceMod.RadioChangeEvent
import web.typings.antd.esRadioInterfaceMod.RadioGroupButtonStyle
import web.typings.antd.esRadioInterfaceMod.RadioGroupOptionType
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLDivElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_RadioGroupPropsRefAttributes_343343742[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def buttonStyle(value: RadioGroupButtonStyle): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: DisabledType): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChange(value: /* e */ RadioChangeEvent => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def optionType(value: RadioGroupOptionType): this.type = set("optionType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def options(value: js.Array[CheckboxOptionType | String | Double]): this.type = set("options", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optionsVarargs(value: (CheckboxOptionType | String | Double)*): this.type = set("options", js.Array(value :_*))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
}
