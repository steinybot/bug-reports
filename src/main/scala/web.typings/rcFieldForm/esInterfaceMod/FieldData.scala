package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<rc-field-form.rc-field-form/es/interface.InternalFieldData, 'name'>> */
@js.native
trait FieldData extends StObject {
  
  var errors: js.UndefOr[js.Array[String]] = js.native
  
  var name: NamePath[Any] = js.native
  
  var touched: js.UndefOr[Boolean] = js.native
  
  var validated: js.UndefOr[Boolean] = js.native
  
  var validating: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[StoreValue] = js.native
  
  var warnings: js.UndefOr[js.Array[String]] = js.native
}
object FieldData {
  
  @scala.inline
  def apply(name: NamePath[Any]): FieldData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldData]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FieldData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NamePath[Any]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
    
    @scala.inline
    def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatedUndefined: Self = StObject.set(x, "validated", js.undefined)
    
    @scala.inline
    def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
    
    @scala.inline
    def setValue(value: StoreValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
