package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esColorPickerColorMod.Color
import web.typings.antd.esColorPickerComponentsColorHsbInputMod.ColorHsbInputProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorHsbInput {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColorHsbInputProps]))
  }
  
  @JSImport("antd/es/color-picker/components/ColorHsbInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def onChange(value: /* value */ Color => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: Color): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  type Props = ColorHsbInputProps
  
  def withProps(p: ColorHsbInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
