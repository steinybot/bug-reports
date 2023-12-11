package web.typings.rcSlider

import web.typings.rcSlider.libSliderMod.SliderProps
import web.typings.rcSlider.libSliderMod.SliderRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-slider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[(SliderProps[Double | js.Array[Double]]) with RefAttributes[SliderRef]] = js.native
  
  type _To = ReactComponentClass[(SliderProps[Double | js.Array[Double]]) with RefAttributes[SliderRef]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[(SliderProps[Double | js.Array[Double]]) with RefAttributes[SliderRef]] = default
}
