package web.typings.react.mod

import web.typings.react.reactStrings.rejected
import web.typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectedThenable[T]
  extends StObject
     with web.typings.react.canaryMod.reactAugmentingMod.ThenableImpl[T] {
  
  var reason: Any = js.native
  
  var status: rejected = js.native
}
object RejectedThenable {
  
  @scala.inline
  def apply[T](
    reason: Any,
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
  ): RejectedThenable[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[RejectedThenable[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RejectedThenable[_], T] (val x: Self with RejectedThenable[T]) extends AnyVal {
    
    @scala.inline
    def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
