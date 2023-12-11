package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostMessageOptions extends StObject {
  
  /* standard dom */
  var transfer: js.UndefOr[js.Array[Any]] = js.native
}
object PostMessageOptions {
  
  @scala.inline
  def apply(): PostMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostMessageOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PostMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransfer(value: js.Array[Any]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    @scala.inline
    def setTransferVarargs(value: Any*): Self = StObject.set(x, "transfer", js.Array(value :_*))
  }
}
