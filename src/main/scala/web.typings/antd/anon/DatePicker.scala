package web.typings.antd.anon

import web.typings.antd.antdStrings.components
import web.typings.antd.antdStrings.generateConfig
import web.typings.antd.antdStrings.hideHeader
import web.typings.antd.antdStrings.locale
import web.typings.antd.antdStrings.picker
import web.typings.antd.esDatePickerGeneratePickerInterfaceMod.PickerComponentClass
import web.typings.antd.esDatePickerGeneratePickerMod.PickerProps
import web.typings.rcPicker.esPickerMod.PickerTimeProps
import web.typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePicker[DateType] extends StObject {
  
  var DatePicker: PickerComponentClass[PickerProps[DateType] with HashId, Any] = js.native
  
  var MonthPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any] = js.native
  
  var QuarterPicker: PickerComponentClass[
    Omit[
      Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
      picker
    ], 
    Any
  ] = js.native
  
  var TimePicker: PickerComponentClass[
    Omit[
      Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
      picker
    ], 
    Any
  ] = js.native
  
  var WeekPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any] = js.native
  
  var YearPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any] = js.native
}
object DatePicker {
  
  @scala.inline
  def apply[DateType](
    DatePicker: PickerComponentClass[PickerProps[DateType] with HashId, Any],
    MonthPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any],
    QuarterPicker: PickerComponentClass[
      Omit[
        Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
        picker
      ], 
      Any
    ],
    TimePicker: PickerComponentClass[
      Omit[
        Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
        picker
      ], 
      Any
    ],
    WeekPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any],
    YearPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any]
  ): DatePicker[DateType] = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker[DateType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DatePicker[_], DateType] (val x: Self with DatePicker[DateType]) extends AnyVal {
    
    @scala.inline
    def setDatePicker(value: PickerComponentClass[PickerProps[DateType] with HashId, Any]): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthPicker(value: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any]): Self = StObject.set(x, "MonthPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuarterPicker(
      value: PickerComponentClass[
          Omit[
            Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
            picker
          ], 
          Any
        ]
    ): Self = StObject.set(x, "QuarterPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePicker(
      value: PickerComponentClass[
          Omit[
            Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
            picker
          ], 
          Any
        ]
    ): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekPicker(value: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any]): Self = StObject.set(x, "WeekPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearPicker(value: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any]): Self = StObject.set(x, "YearPicker", value.asInstanceOf[js.Any])
  }
}
