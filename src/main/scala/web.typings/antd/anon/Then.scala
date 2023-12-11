package web.typings.antd.anon

import web.typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Then extends StObject {
  
  def `then`[T](resolve: js.Function1[/* confirmed */ Boolean, T], reject: VoidFunction): js.Promise[T] = js.native
}
object Then {
  
  @scala.inline
  def apply(`then`: (js.Function1[/* confirmed */ Boolean, Any], VoidFunction) => js.Promise[Any]): Then = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[Then]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Then] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThen(value: (js.Function1[/* confirmed */ Boolean, Any], VoidFunction) => js.Promise[Any]): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
  }
}
