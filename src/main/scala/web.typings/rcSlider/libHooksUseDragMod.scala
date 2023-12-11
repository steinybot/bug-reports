package web.typings.rcSlider

import web.typings.rcSlider.libHooksUseOffsetMod.OffsetValues
import web.typings.rcSlider.libInterfaceMod.Direction
import web.typings.rcSlider.libInterfaceMod.OnStartMove
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseDragMod {
  
  @JSImport("rc-slider/lib/hooks/useDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    containerRef: ReactRef[HTMLDivElement],
    direction: Direction,
    rawValues: js.Array[Double],
    min: Double,
    max: Double,
    formatValue: js.Function1[/* value */ Double, Double],
    triggerChange: js.Function1[/* values */ js.Array[Double], Unit],
    finishChange: js.Function0[Unit],
    offsetValues: OffsetValues
  ): js.Tuple4[Double, Double, js.Array[Double], OnStartMove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(containerRef.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], rawValues.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], formatValue.asInstanceOf[js.Any], triggerChange.asInstanceOf[js.Any], finishChange.asInstanceOf[js.Any], offsetValues.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[Double, Double, js.Array[Double], OnStartMove]]
}
