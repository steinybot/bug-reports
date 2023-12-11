package web.typings.rcFieldForm.esInterfaceMod

import web.typings.rcFieldForm.rcFieldFormStrings.setField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFieldInfo
  extends StObject
     with NotifyInfo {
  
  var data: FieldData = js.native
  
  var `type`: setField = js.native
}
object SetFieldInfo {
  
  @scala.inline
  def apply(data: FieldData): SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setField")
    __obj.asInstanceOf[SetFieldInfo]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SetFieldInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: FieldData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: setField): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
