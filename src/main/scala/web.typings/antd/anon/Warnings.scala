package web.typings.antd.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Warnings extends StObject {
  
  var errors: js.Array[ReactElement] = js.native
  
  var warnings: js.Array[ReactElement] = js.native
}
object Warnings {
  
  @scala.inline
  def apply(errors: js.Array[ReactElement], warnings: js.Array[ReactElement]): Warnings = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warnings]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Warnings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[ReactElement]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: ReactElement*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
