package web.typings.rcComponentColorPicker.components

import web.typings.StBuildingComponent
import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.rcComponentColorPicker.esInterfaceMod.BaseColorPickerProps
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picker {
  
  @JSImport("@rc-component/color-picker/es/components/Picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* color */ Color, /* type */ js.UndefOr[HsbaColorType]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onChangeComplete(value: (/* value */ Color, /* type */ js.UndefOr[HsbaColorType]) => Unit): this.type = set("onChangeComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  }
  
  type Props = BaseColorPickerProps
  
  implicit def make(companion: Picker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BaseColorPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
