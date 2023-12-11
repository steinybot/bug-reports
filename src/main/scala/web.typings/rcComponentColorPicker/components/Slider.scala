package web.typings.rcComponentColorPicker.components

import web.typings.StBuildingComponent
import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.rcComponentColorPicker.esComponentsSliderMod.SliderProps
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @scala.inline
  def apply(gradientColors: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(gradientColors = gradientColors.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SliderProps]))
  }
  
  @JSImport("@rc-component/color-picker/es/components/Slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* color */ Color, /* type */ js.UndefOr[HsbaColorType]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onChangeComplete(value: (/* value */ Color, /* type */ js.UndefOr[HsbaColorType]) => Unit): this.type = set("onChangeComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: HsbaColorType): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  type Props = SliderProps
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
