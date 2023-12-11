package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingSource[R] extends StObject {
  
  /* standard dom */
  var cancel: js.UndefOr[UnderlyingSourceCancelCallback] = js.native
  
  /* standard dom */
  var pull: js.UndefOr[UnderlyingSourcePullCallback[R]] = js.native
  
  /* standard dom */
  var start: js.UndefOr[UnderlyingSourceStartCallback[R]] = js.native
  
  /* standard dom */
  var `type`: Unit = js.native
}
object UnderlyingSource {
  
  @scala.inline
  def apply[R](`type`: Unit): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: UnderlyingSource[_], R] (val x: Self with UnderlyingSource[R]) extends AnyVal {
    
    @scala.inline
    def setCancel(value: /* reason */ Any => Unit | PromiseLike[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setPull(value: /* controller */ ReadableStreamController[R] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    @scala.inline
    def setStart(value: /* controller */ ReadableStreamController[R] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
