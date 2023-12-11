package web.typings.react.mod

import web.typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntrackedThenable[T]
  extends StObject
     with web.typings.react.canaryMod.reactAugmentingMod.ThenableImpl[T] {
  
  var status: js.UndefOr[Unit] = js.native
}
object UntrackedThenable {
  
  @scala.inline
  def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): UntrackedThenable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[UntrackedThenable[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: UntrackedThenable[_], T] (val x: Self with UntrackedThenable[T]) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Unit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
