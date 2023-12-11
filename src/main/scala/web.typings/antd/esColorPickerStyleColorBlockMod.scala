package web.typings.antd

import web.typings.antd.esColorPickerStyleMod.ColorPickerToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerStyleColorBlockMod {
  
  @JSImport("antd/es/color-picker/style/color-block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(token: ColorPickerToken, size: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(token.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def getTransBg(size: String, colorFill: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransBg")(size.asInstanceOf[js.Any], colorFill.asInstanceOf[js.Any])).asInstanceOf[Any]
}
