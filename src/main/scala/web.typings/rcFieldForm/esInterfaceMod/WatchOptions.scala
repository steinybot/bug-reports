package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchOptions[Form /* <: FormInstance[Any] */] extends StObject {
  
  var form: js.UndefOr[Form] = js.native
  
  var preserve: js.UndefOr[Boolean] = js.native
}
object WatchOptions {
  
  @scala.inline
  def apply[Form /* <: FormInstance[Any] */](): WatchOptions[Form] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions[Form]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: WatchOptions[_], Form /* <: FormInstance[Any] */] (val x: Self with WatchOptions[Form]) extends AnyVal {
    
    @scala.inline
    def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
  }
}
