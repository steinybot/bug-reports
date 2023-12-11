package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends StObject {
  
  var errors: js.Array[String] = js.native
  
  var name: InternalNamePath = js.native
  
  var touched: Boolean = js.native
  
  var validated: Boolean = js.native
  
  var validating: Boolean = js.native
  
  var warnings: js.Array[String] = js.native
}
object Meta {
  
  @scala.inline
  def apply(
    errors: js.Array[String],
    name: InternalNamePath,
    touched: Boolean,
    validated: Boolean,
    validating: Boolean,
    warnings: js.Array[String]
  ): Meta = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
