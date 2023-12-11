package web.typings.rcComponentColorPicker

import web.typings.ctrlTinycolor.mod.TinyColor_
import web.typings.rcComponentColorPicker.anon.NumberifyHSBA
import web.typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorMod {
  
  @JSImport("@rc-component/color-picker/es/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rc-component/color-picker/es/color", "Color")
  @js.native
  class Color protected () extends TinyColor_ {
    def this(color: ColorGenInput[Color]) = this()
    
    def toHsb(): NumberifyHSBA = js.native
    
    def toHsbString(): String = js.native
  }
  
  @scala.inline
  def getRoundNumber(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoundNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
