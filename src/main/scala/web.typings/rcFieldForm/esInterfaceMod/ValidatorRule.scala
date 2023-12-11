package web.typings.rcFieldForm.esInterfaceMod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorRule extends StObject {
  
  var message: js.UndefOr[String | ReactElement] = js.native
  
  var validator: Validator = js.native
  
  var warningOnly: js.UndefOr[Boolean] = js.native
}
object ValidatorRule {
  
  @scala.inline
  def apply(
    validator: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => (js.Promise[Unit | Any]) | Unit
  ): ValidatorRule = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction3(validator))
    __obj.asInstanceOf[ValidatorRule]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ValidatorRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageReactElement(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setValidator(
      value: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => (js.Promise[Unit | Any]) | Unit
    ): Self = StObject.set(x, "validator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWarningOnly(value: Boolean): Self = StObject.set(x, "warningOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningOnlyUndefined: Self = StObject.set(x, "warningOnly", js.undefined)
  }
}
