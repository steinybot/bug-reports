package web.typings.antd.anon

import web.typings.antd.antdStrings.components
import web.typings.antd.antdStrings.generateConfig
import web.typings.antd.antdStrings.hideHeader
import web.typings.antd.antdStrings.locale
import web.typings.antd.antdStrings.picker
import web.typings.antd.esDatePickerGeneratePickerInterfaceMod.PickerComponentClass
import web.typings.antd.esDatePickerGeneratePickerMod.PickerProps
import web.typings.antd.esDatePickerGeneratePickerMod.RangePickerProps
import web.typings.rcPicker.esPickerMod.PickerTimeProps
import web.typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthPicker[DateType] extends StObject {
  
  var MonthPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any] = js.native
  
  var QuarterPicker: PickerComponentClass[
    Omit[
      Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
      picker
    ], 
    Any
  ] = js.native
  
  var RangePicker: PickerComponentClass[RangePickerProps[DateType] with DropdownClassName, Any] = js.native
  
  var TimePicker: PickerComponentClass[
    Omit[
      Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
      picker
    ], 
    Any
  ] = js.native
  
  var WeekPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any] = js.native
  
  var YearPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
object MonthPicker {
  
  @scala.inline
  def apply[DateType](
    MonthPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any],
    QuarterPicker: PickerComponentClass[
      Omit[
        Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
        picker
      ], 
      Any
    ],
    RangePicker: PickerComponentClass[RangePickerProps[DateType] with DropdownClassName, Any],
    TimePicker: PickerComponentClass[
      Omit[
        Bordered with (Omit[PickerTimeProps[DateType], components | locale | generateConfig | hideHeader]), 
        picker
      ], 
      Any
    ],
    WeekPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any],
    YearPicker: PickerComponentClass[Omit[PickerProps[DateType] with HashId, picker], Any]
  ): MonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthPicker[DateType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MonthPicker[_], DateType] (val x: Self with MonthPicker[DateType]) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
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
    def setRangePicker(value: PickerComponentClass[RangePickerProps[DateType] with DropdownClassName, Any]): Self = StObject.set(x, "RangePicker", value.asInstanceOf[js.Any])
    
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
