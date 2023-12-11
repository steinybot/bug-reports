package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventInit[T]
  extends StObject
     with EventInit {
  
  /* standard dom */
  var detail: js.UndefOr[T] = js.native
}
object CustomEventInit {
  
  @scala.inline
  def apply[T](): CustomEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventInit[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: CustomEventInit[_], T] (val x: Self with CustomEventInit[T]) extends AnyVal {
    
    @scala.inline
    def setDetail(value: T): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
