package web.typings.rcSelect.anon

import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowClear extends StObject {
  
  var allowClear: Boolean = js.native
  
  var clearIcon: Element = js.native
}
object AllowClear {
  
  @scala.inline
  def apply(allowClear: Boolean, clearIcon: Element): AllowClear = {
    val __obj = js.Dynamic.literal(allowClear = allowClear.asInstanceOf[js.Any], clearIcon = clearIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowClear]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AllowClear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIcon(value: Element): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
  }
}
