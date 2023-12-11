package web.typings.react.mod

import web.typings.react.reactStrings.fulfilled
import web.typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FulfilledThenable[T]
  extends StObject
     with web.typings.react.canaryMod.reactAugmentingMod.ThenableImpl[T] {
  
  var status: fulfilled = js.native
  
  var value: T = js.native
}
object FulfilledThenable {
  
  @scala.inline
  def apply[T](
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
    value: T
  ): FulfilledThenable[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[FulfilledThenable[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FulfilledThenable[_], T] (val x: Self with FulfilledThenable[T]) extends AnyVal {
    
    @scala.inline
    def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
