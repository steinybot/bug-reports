package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingSink[W] extends StObject {
  
  /* standard dom */
  var abort: js.UndefOr[UnderlyingSinkAbortCallback] = js.native
  
  /* standard dom */
  var close: js.UndefOr[UnderlyingSinkCloseCallback] = js.native
  
  /* standard dom */
  var start: js.UndefOr[UnderlyingSinkStartCallback] = js.native
  
  /* standard dom */
  var `type`: Unit = js.native
  
  /* standard dom */
  var write: js.UndefOr[UnderlyingSinkWriteCallback[W]] = js.native
}
object UnderlyingSink {
  
  @scala.inline
  def apply[W](`type`: Unit): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: UnderlyingSink[_], W] (val x: Self with UnderlyingSink[W]) extends AnyVal {
    
    @scala.inline
    def setAbort(value: /* reason */ Any => Unit | PromiseLike[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    @scala.inline
    def setClose(value: () => Unit | PromiseLike[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setStart(value: /* controller */ WritableStreamDefaultController => Unit | PromiseLike[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: (W, /* controller */ WritableStreamDefaultController) => Unit | PromiseLike[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
