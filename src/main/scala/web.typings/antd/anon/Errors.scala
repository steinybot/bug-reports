package web.typings.antd.anon

import web.typings.antd.esFormFormItemMod.ValidateStatus
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errors extends StObject {
  
  var errors: js.UndefOr[js.Array[ReactElement]] = js.native
  
  var status: ValidateStatus = js.native
  
  var warnings: js.UndefOr[js.Array[ReactElement]] = js.native
}
object Errors {
  
  @scala.inline
  def apply(status: ValidateStatus): Errors = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[ReactElement]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: ReactElement*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
