package web.typings.antd

import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.processing
import web.typings.antd.antdStrings.success
import web.typings.antd.antdStrings.warning
import web.typings.antd.esThemeInterfacePresetColorsMod.PresetColorKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilColorsMod {
  
  @JSImport("antd/es/_util/colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/_util/colors", "PresetStatusColorTypes")
  @js.native
  val PresetStatusColorTypes: js.Tuple5[success, processing, error, default, warning] = js.native
  
  @scala.inline
  def isPresetColor(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresetColor")().asInstanceOf[Boolean]
  @scala.inline
  def isPresetColor(color: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresetColor")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isPresetColor(color: Any, includeInverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPresetColor")(color.asInstanceOf[js.Any], includeInverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isPresetColor(color: Unit, includeInverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPresetColor")(color.asInstanceOf[js.Any], includeInverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isPresetStatusColor(): /* is antd.antd/es/_util/colors.PresetStatusColorType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresetStatusColor")().asInstanceOf[/* is antd.antd/es/_util/colors.PresetStatusColorType */ Boolean]
  @scala.inline
  def isPresetStatusColor(color: Any): /* is antd.antd/es/_util/colors.PresetStatusColorType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresetStatusColor")(color.asInstanceOf[js.Any]).asInstanceOf[/* is antd.antd/es/_util/colors.PresetStatusColorType */ Boolean]
  
  type InverseColor = /* template literal string: ${PresetColorKey}-inverse */ String
  
  type PresetColorType = PresetColorKey | InverseColor
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.success
    - `web.typings`.antd.antdStrings.processing
    - `web.typings`.antd.antdStrings.error
    - `web.typings`.antd.antdStrings.default
    - `web.typings`.antd.antdStrings.warning
  */
  trait PresetStatusColorType extends StObject
}
