package web.typings.antd.anon

import web.typings.antd.esFormFormItemMod.ValidateStatus
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends StObject {
  
  var errors: js.Array[ReactElement] = js.native
  
  var status: js.UndefOr[ValidateStatus] = js.native
  
  var warnings: js.Array[ReactElement] = js.native
}
object Status {
  
  @scala.inline
  def apply(errors: js.Array[ReactElement], warnings: js.Array[ReactElement]): Status = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[ReactElement]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: ReactElement*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
