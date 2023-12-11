package web.typings.rcPicker

import web.typings.rcPicker.anon.CellDate
import web.typings.rcPicker.anon.FormatList
import web.typings.rcPicker.anon.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.NullableDateType
import web.typings.rcPicker.esInterfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsDateUtilMod {
  
  @JSImport("rc-picker/es/utils/dateUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "WEEK_DAY_COUNT")
  @js.native
  val WEEK_DAY_COUNT: /* 7 */ Double = js.native
  
  @scala.inline
  def formatValue[DateType](value: DateType, param1: GenerateConfig[DateType]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValue")(value.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getCellDateDisabled[DateType](param0: CellDate[DateType]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellDateDisabled")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def getClosingViewDate[DateType](
    viewDate: DateType,
    picker: PickerMode,
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType]
  ): DateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosingViewDate")(viewDate.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[DateType]
  @scala.inline
  def getClosingViewDate[DateType](
    viewDate: DateType,
    picker: PickerMode,
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    offset: Double
  ): DateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosingViewDate")(viewDate.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[DateType]
  
  @scala.inline
  def getQuarter[DateType](generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType], date: DateType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuarter")(generateConfig.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getWeekStartDate[DateType](
    locale: String,
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    value: DateType
  ): DateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekStartDate")(locale.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DateType]
  
  @scala.inline
  def isEqual[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    value1: NullableDateType[DateType],
    value2: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(generateConfig.asInstanceOf[js.Any], value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isInRange[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    startDate: NullableDateType[DateType],
    endDate: NullableDateType[DateType],
    current: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInRange")(generateConfig.asInstanceOf[js.Any], startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isNullEqual[T](value1: T, value2: T): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  @scala.inline
  def isSameDate[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    date1: NullableDateType[DateType],
    date2: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDate")(generateConfig.asInstanceOf[js.Any], date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameDecade[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    decade1: NullableDateType[DateType],
    decade2: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDecade")(generateConfig.asInstanceOf[js.Any], decade1.asInstanceOf[js.Any], decade2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameMonth[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    month1: NullableDateType[DateType],
    month2: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(generateConfig.asInstanceOf[js.Any], month1.asInstanceOf[js.Any], month2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameQuarter[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    quarter1: NullableDateType[DateType],
    quarter2: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameQuarter")(generateConfig.asInstanceOf[js.Any], quarter1.asInstanceOf[js.Any], quarter2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameTime[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    time1: NullableDateType[DateType],
    time2: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameTime")(generateConfig.asInstanceOf[js.Any], time1.asInstanceOf[js.Any], time2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameWeek[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    locale: String,
    date1: NullableDateType[DateType],
    date2: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWeek")(generateConfig.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSameYear[DateType](
    generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
    year1: NullableDateType[DateType],
    year2: NullableDateType[DateType]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(generateConfig.asInstanceOf[js.Any], year1.asInstanceOf[js.Any], year2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def parseValue[DateType](value: String, param1: FormatList[DateType]): DateType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(value.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[DateType]
}
