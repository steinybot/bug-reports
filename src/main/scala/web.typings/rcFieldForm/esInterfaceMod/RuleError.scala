package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleError extends StObject {
  
  var errors: js.Array[String] = js.native
  
  var rule: RuleObject = js.native
}
object RuleError {
  
  @scala.inline
  def apply(errors: js.Array[String], rule: RuleObject): RuleError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleError]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RuleError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: RuleObject): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
