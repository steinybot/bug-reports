package web.typings.ctrlTinycolor

import web.typings.ctrlTinycolor.distMod.ColorInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToMsFilterMod {
  
  @JSImport("@ctrl/tinycolor/dist/to-ms-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def toMsFilter(firstColor: ColorInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toMsFilter(firstColor: ColorInput, secondColor: ColorInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any], secondColor.asInstanceOf[js.Any])).asInstanceOf[String]
}
