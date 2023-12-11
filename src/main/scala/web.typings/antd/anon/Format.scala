package web.typings.antd.anon

import web.typings.rcPicker.esInterfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format[DisabledTime] extends StObject {
  
  var disabledTime: js.UndefOr[DisabledTime] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var picker: js.UndefOr[PickerMode] = js.native
}
object Format {
  
  @scala.inline
  def apply[DisabledTime](): Format[DisabledTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format[DisabledTime]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Format[_], DisabledTime] (val x: Self with Format[DisabledTime]) extends AnyVal {
    
    @scala.inline
    def setDisabledTime(value: DisabledTime): Self = StObject.set(x, "disabledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
  }
}
