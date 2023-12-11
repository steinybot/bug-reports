package web.typings.rcSlider.components

import web.typings.rcSlider.libSliderMod.SliderProps
import web.typings.rcSlider.libSliderMod.SliderRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = (SliderProps[Double | js.Array[Double]]) with RefAttributes[SliderRef]
  
  implicit def make(companion: Slider.type): SharedBuilder_SliderPropsRefAttributes_1844665825[SliderRef] = new SharedBuilder_SliderPropsRefAttributes_1844665825[SliderRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: (SliderProps[Double | js.Array[Double]]) with RefAttributes[SliderRef]): SharedBuilder_SliderPropsRefAttributes_1844665825[SliderRef] = new SharedBuilder_SliderPropsRefAttributes_1844665825[SliderRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
