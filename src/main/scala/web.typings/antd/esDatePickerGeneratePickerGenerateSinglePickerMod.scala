package web.typings.antd

import web.typings.antd.anon.DatePicker
import web.typings.rcPicker.esGenerateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDatePickerGeneratePickerGenerateSinglePickerMod {
  
  @JSImport("antd/es/date-picker/generatePicker/generateSinglePicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](generateConfig: GenerateConfig[DateType]): DatePicker[DateType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generateConfig.asInstanceOf[js.Any]).asInstanceOf[DatePicker[DateType]]
}
