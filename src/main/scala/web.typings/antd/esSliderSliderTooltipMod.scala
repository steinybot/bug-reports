package web.typings.antd

import web.typings.antd.esTooltipMod.TooltipProps
import web.typings.rcSlider.libSliderMod.SliderRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSliderSliderTooltipMod extends Shortcut {
  
  @JSImport("antd/es/slider/SliderTooltip", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TooltipProps with RefAttributes[SliderRef]] = js.native
  
  type _To = ReactComponentClass[TooltipProps with RefAttributes[SliderRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esSliderSliderTooltipMod.foo` */
  override def _to: ReactComponentClass[TooltipProps with RefAttributes[SliderRef]] = default
}
