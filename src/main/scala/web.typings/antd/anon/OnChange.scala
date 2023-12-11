package web.typings.antd.anon

import web.typings.antd.esCalendarGenerateCalendarMod.CalendarMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChange[DateType] extends StObject {
  
  def onChange(date: DateType): scala.Unit = js.native
  
  def onTypeChange(`type`: CalendarMode): scala.Unit = js.native
  
  var `type`: CalendarMode = js.native
  
  var value: DateType = js.native
}
object OnChange {
  
  @scala.inline
  def apply[DateType](
    onChange: DateType => scala.Unit,
    onTypeChange: CalendarMode => scala.Unit,
    `type`: CalendarMode,
    value: DateType
  ): OnChange[DateType] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), onTypeChange = js.Any.fromFunction1(onTypeChange), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange[DateType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OnChange[_], DateType] (val x: Self with OnChange[DateType]) extends AnyVal {
    
    @scala.inline
    def setOnChange(value: DateType => scala.Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTypeChange(value: CalendarMode => scala.Unit): Self = StObject.set(x, "onTypeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: CalendarMode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
