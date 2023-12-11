package web.typings.antd.anon

import web.typings.rcPicker.esInterfaceMod.IntRange
import web.typings.rcPicker.esInterfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisabledHours[DateType, DisabledTime] extends StObject {
  
  var defaultValue: js.UndefOr[DateType] = js.native
  
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
  
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
  
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
  
  var disabledTime: js.UndefOr[DisabledTime] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var hideDisabledOptions: js.UndefOr[Boolean] = js.native
  
  var hourStep: js.UndefOr[IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`23`]] = js.native
  
  var minuteStep: js.UndefOr[IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`59`]] = js.native
  
  var picker: js.UndefOr[PickerMode] = js.native
  
  var secondStep: js.UndefOr[IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`59`]] = js.native
  
  var showHour: js.UndefOr[Boolean] = js.native
  
  var showMinute: js.UndefOr[Boolean] = js.native
  
  var showNow: js.UndefOr[Boolean] = js.native
  
  var showSecond: js.UndefOr[Boolean] = js.native
  
  var use12Hours: js.UndefOr[Boolean] = js.native
}
object DisabledHours {
  
  @scala.inline
  def apply[DateType, DisabledTime](): DisabledHours[DateType, DisabledTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledHours[DateType, DisabledTime]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DisabledHours[_, _], DateType, DisabledTime] (val x: Self with (DisabledHours[DateType, DisabledTime])) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
    
    @scala.inline
    def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
    
    @scala.inline
    def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
    
    @scala.inline
    def setDisabledTime(value: DisabledTime): Self = StObject.set(x, "disabledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
    
    @scala.inline
    def setHourStep(value: IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`23`]): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`59`]): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    @scala.inline
    def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    
    @scala.inline
    def setSecondStep(value: IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`59`]): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
    
    @scala.inline
    def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
    
    @scala.inline
    def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
    
    @scala.inline
    def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
    
    @scala.inline
    def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
    
    @scala.inline
    def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
  }
}
