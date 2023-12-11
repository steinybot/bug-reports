package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientQueryOptions extends StObject {
  
  /* standard dom */
  var includeUncontrolled: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var `type`: js.UndefOr[ClientTypes] = js.native
}
object ClientQueryOptions {
  
  @scala.inline
  def apply(): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientQueryOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ClientQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeUncontrolled(value: scala.Boolean): Self = StObject.set(x, "includeUncontrolled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUncontrolledUndefined: Self = StObject.set(x, "includeUncontrolled", js.undefined)
    
    @scala.inline
    def setType(value: ClientTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
