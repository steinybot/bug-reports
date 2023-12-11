package web.typings.antd.anon

import web.typings.rcFieldForm.esInterfaceMod.ValidateMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultValidateMessages extends StObject {
  
  var defaultValidateMessages: ValidateMessages = js.native
  
  var optional: js.UndefOr[String] = js.native
}
object DefaultValidateMessages {
  
  @scala.inline
  def apply(defaultValidateMessages: ValidateMessages): DefaultValidateMessages = {
    val __obj = js.Dynamic.literal(defaultValidateMessages = defaultValidateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValidateMessages]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DefaultValidateMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValidateMessages(value: ValidateMessages): Self = StObject.set(x, "defaultValidateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: String): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
