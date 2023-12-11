package web.typings.rcPicker

import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.NullableDateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsTimeUtilMod {
  
  @JSImport("rc-picker/es/utils/timeUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLastDay[DateType](generateConfig: GenerateConfig[DateType], date: DateType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastDay")(generateConfig.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getLowerBoundTime(
    hour: Double,
    minute: Double,
    second: Double,
    hourStep: Double,
    minuteStep: Double,
    secondStep: Double
  ): js.Tuple3[Double, Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLowerBoundTime")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], hourStep.asInstanceOf[js.Any], minuteStep.asInstanceOf[js.Any], secondStep.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, Double]]
  
  @scala.inline
  def setDateTime[DateType](generateConfig: GenerateConfig[DateType], date: DateType, defaultDate: NullableDateType[DateType]): DateType = (^.asInstanceOf[js.Dynamic].applyDynamic("setDateTime")(generateConfig.asInstanceOf[js.Any], date.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[DateType]
  
  @scala.inline
  def setTime[DateType](
    generateConfig: GenerateConfig[DateType],
    date: DateType,
    hour: Double,
    minute: Double,
    second: Double
  ): DateType = (^.asInstanceOf[js.Dynamic].applyDynamic("setTime")(generateConfig.asInstanceOf[js.Any], date.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[DateType]
}
