package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalValidateOptions
  extends StObject
     with ValidateOptions {
  
  var triggerName: js.UndefOr[String] = js.native
  
  var validateMessages: js.UndefOr[ValidateMessages] = js.native
}
object InternalValidateOptions {
  
  @scala.inline
  def apply(): InternalValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalValidateOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: InternalValidateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerNameUndefined: Self = StObject.set(x, "triggerName", js.undefined)
    
    @scala.inline
    def setValidateMessages(value: ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
  }
}
