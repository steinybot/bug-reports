package web.typings.rcVirtualList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsScrollbarUtilMod {
  
  @JSImport("rc-virtual-list/es/utils/scrollbarUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSpinSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpinSize")().asInstanceOf[Double]
  @scala.inline
  def getSpinSize(containerSize: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpinSize")(containerSize.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getSpinSize(containerSize: Double, scrollRange: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpinSize")(containerSize.asInstanceOf[js.Any], scrollRange.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSpinSize(containerSize: Unit, scrollRange: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpinSize")(containerSize.asInstanceOf[js.Any], scrollRange.asInstanceOf[js.Any])).asInstanceOf[Double]
}
