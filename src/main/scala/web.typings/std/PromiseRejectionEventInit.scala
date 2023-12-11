package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseRejectionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var promise: js.Promise[Any] = js.native
  
  /* standard dom */
  var reason: js.UndefOr[Any] = js.native
}
object PromiseRejectionEventInit {
  
  @scala.inline
  def apply(promise: js.Promise[Any]): PromiseRejectionEventInit = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejectionEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PromiseRejectionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
