package web.typings.antd

import web.typings.antd.esColorPickerColorMod.Color
import web.typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerUtilMod {
  
  @JSImport("antd/es/color-picker/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/color-picker/util", "customizePrefixCls")
  @js.native
  val customizePrefixCls: /* "ant-color-picker" */ String = js.native
  
  @scala.inline
  def genAlphaColor(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("genAlphaColor")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  @scala.inline
  def genAlphaColor(color: Color, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("genAlphaColor")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  @scala.inline
  def generateColor(color: ColorGenInput[Color]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("generateColor")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @scala.inline
  def getAlphaColor(color: Color): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlphaColor")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getRoundNumber(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoundNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
