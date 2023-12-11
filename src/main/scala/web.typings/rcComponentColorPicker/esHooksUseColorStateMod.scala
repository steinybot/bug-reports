package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.anon.DefaultValue
import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import web.typings.react.mod.Dispatch
import web.typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseColorStateMod {
  
  @JSImport("@rc-component/color-picker/es/hooks/useColorState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(defaultStateValue: ColorValue, option: DefaultValue): js.Tuple2[Color, Dispatch[SetStateAction[Color]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Color, Dispatch[SetStateAction[Color]]]]
  
  type ColorValue = js.UndefOr[ColorGenInput[Color]]
}
