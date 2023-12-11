package web.typings.rcSelect.anon

import web.typings.rcSelect.libInterfaceMod.DisplayInfoType
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var `type`: DisplayInfoType = js.native
  
  var values: js.Array[DisplayValueType] = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: DisplayInfoType, values: js.Array[DisplayValueType]): Type = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DisplayInfoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[DisplayValueType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: DisplayValueType*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
