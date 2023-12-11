package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldError extends StObject {
  
  var errors: js.Array[String] = js.native
  
  var name: InternalNamePath = js.native
  
  var warnings: js.Array[String] = js.native
}
object FieldError {
  
  @scala.inline
  def apply(errors: js.Array[String], name: InternalNamePath, warnings: js.Array[String]): FieldError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldError]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FieldError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
