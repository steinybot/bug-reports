package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowTime[DateType, DisabledTime] extends StObject {
  
  var showTime: DisabledHours[DateType, DisabledTime] = js.native
}
object ShowTime {
  
  @scala.inline
  def apply[DateType, DisabledTime](showTime: DisabledHours[DateType, DisabledTime]): ShowTime[DateType, DisabledTime] = {
    val __obj = js.Dynamic.literal(showTime = showTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTime[DateType, DisabledTime]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ShowTime[_, _], DateType, DisabledTime] (val x: Self with (ShowTime[DateType, DisabledTime])) extends AnyVal {
    
    @scala.inline
    def setShowTime(value: DisabledHours[DateType, DisabledTime]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
  }
}
