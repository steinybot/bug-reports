package web.typings.react.mod

import web.typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThenableImpl[T] extends StObject {
  
  def `then`(onFulfill: js.Function1[/* value */ T, Any], onReject: js.Function1[/* error */ Any, Any]): Unit | PromiseLike[Any] = js.native
}
object ThenableImpl {
  
  @scala.inline
  def apply[T](
    `then`: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
  ): ThenableImpl[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[ThenableImpl[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ThenableImpl[_], T] (val x: Self with ThenableImpl[T]) extends AnyVal {
    
    @scala.inline
    def setThen(
      value: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
    ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
  }
}
