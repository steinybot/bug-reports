package web.typings.react.mod

import web.typings.react.reactStrings.pending
import web.typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingThenable[T]
  extends StObject
     with web.typings.react.canaryMod.reactAugmentingMod.ThenableImpl[T] {
  
  var status: pending = js.native
}
object PendingThenable {
  
  @scala.inline
  def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): PendingThenable[T] = {
    val __obj = js.Dynamic.literal(status = "pending")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[PendingThenable[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PendingThenable[_], T] (val x: Self with PendingThenable[T]) extends AnyVal {
    
    @scala.inline
    def setStatus(value: pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
