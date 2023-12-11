package web.typings.antd

import web.typings.antd.anon.DefaultValue
import web.typings.antd.esColorPickerColorMod.Color
import web.typings.antd.esColorPickerInterfaceMod.ColorValueType
import web.typings.react.mod.Dispatch
import web.typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerHooksUseColorStateMod {
  
  @JSImport("antd/es/color-picker/hooks/useColorState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(defaultStateValue: ColorValueType, option: DefaultValue): js.Tuple2[Color, Dispatch[SetStateAction[Color]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Color, Dispatch[SetStateAction[Color]]]]
}
