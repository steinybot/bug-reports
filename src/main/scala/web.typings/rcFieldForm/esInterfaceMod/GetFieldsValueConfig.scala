package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFieldsValueConfig extends StObject {
  
  var filter: js.UndefOr[FilterFunc] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object GetFieldsValueConfig {
  
  @scala.inline
  def apply(): GetFieldsValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldsValueConfig]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: GetFieldsValueConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: /* meta */ Meta => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
