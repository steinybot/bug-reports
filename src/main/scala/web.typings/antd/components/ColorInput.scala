package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esColorPickerColorMod.Color
import web.typings.antd.esColorPickerComponentsColorInputMod.ColorInputProps
import web.typings.antd.esColorPickerInterfaceMod.ColorFormat
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorInput {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColorInputProps]))
  }
  
  @JSImport("antd/es/color-picker/components/ColorInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def disabledAlpha(value: Boolean): this.type = set("disabledAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
    ): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ Color => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFormatChange(value: /* format */ ColorFormat => Unit): this.type = set("onFormatChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: Color): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  type Props = ColorInputProps
  
  def withProps(p: ColorInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
