package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.esInterfaceMod.BaseColorPickerProps
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSliderMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/components/Slider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SliderProps] = js.native
  
  @js.native
  trait SliderProps
    extends StObject
       with BaseColorPickerProps {
    
    var direction: js.UndefOr[String] = js.native
    
    var gradientColors: js.Array[String] = js.native
    
    var `type`: js.UndefOr[HsbaColorType] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object SliderProps {
    
    @scala.inline
    def apply(gradientColors: js.Array[String]): SliderProps = {
      val __obj = js.Dynamic.literal(gradientColors = gradientColors.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setGradientColors(value: js.Array[String]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientColorsVarargs(value: String*): Self = StObject.set(x, "gradientColors", js.Array(value :_*))
      
      @scala.inline
      def setType(value: HsbaColorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SliderProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsSliderMod.foo` */
  override def _to: ReactComponentClass[SliderProps] = default
}
