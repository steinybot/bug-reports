package web.typings.rcSlider

import web.typings.rcSlider.libInterfaceMod.Direction
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMod {
  
  @JSImport("rc-slider/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDirectionStyle(direction: Direction, value: Double, min: Double, max: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionStyle")(direction.asInstanceOf[js.Any], value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  @scala.inline
  def getIndex[T](value: T, index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndex")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def getIndex[T](value: js.Array[T], index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndex")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def getOffset(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffset")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
