package web.typings.rcSlider

import web.typings.rcSlider.anon.Value
import web.typings.rcSlider.libMarksMod.InternalMarkObj
import web.typings.rcSlider.rcSliderBooleans.`false`
import web.typings.rcSlider.rcSliderStrings.max
import web.typings.rcSlider.rcSliderStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseOffsetMod {
  
  @JSImport("rc-slider/lib/hooks/useOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    min: Double,
    max: Double,
    step: Double,
    markList: js.Array[InternalMarkObj],
    allowCross: Boolean,
    pushable: Double
  ): js.Tuple2[FormatValue, OffsetValues] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any], markList.asInstanceOf[js.Any], allowCross.asInstanceOf[js.Any], pushable.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[FormatValue, OffsetValues]]
  
  @scala.inline
  def default_false(
    min: Double,
    max: Double,
    step: Double,
    markList: js.Array[InternalMarkObj],
    allowCross: Boolean,
    pushable: `false`
  ): js.Tuple2[FormatValue, OffsetValues] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any], markList.asInstanceOf[js.Any], allowCross.asInstanceOf[js.Any], pushable.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[FormatValue, OffsetValues]]
  
  /** Format value align with step & marks */
  type FormatValue = js.Function1[/* value */ Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcSlider.rcSliderStrings.unit
    - `web.typings`.rcSlider.rcSliderStrings.dist
  */
  trait OffsetMode extends StObject
  object OffsetMode {
    
    @scala.inline
    def dist: web.typings.rcSlider.rcSliderStrings.dist = "dist".asInstanceOf[web.typings.rcSlider.rcSliderStrings.dist]
    
    @scala.inline
    def unit: web.typings.rcSlider.rcSliderStrings.unit = "unit".asInstanceOf[web.typings.rcSlider.rcSliderStrings.unit]
  }
  
  type OffsetValues = js.Function4[
    /* values */ js.Array[Double], 
    /* offset */ Double | min | max, 
    /* valueIndex */ Double, 
    /* mode */ js.UndefOr[OffsetMode], 
    Value
  ]
}
