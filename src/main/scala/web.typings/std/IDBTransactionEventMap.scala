package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBTransactionEventMap extends StObject {
  
  /* standard dom */
  var abort: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var complete: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var error: org.scalajs.dom.Event = js.native
}
object IDBTransactionEventMap {
  
  @scala.inline
  def apply(abort: org.scalajs.dom.Event, complete: org.scalajs.dom.Event, error: org.scalajs.dom.Event): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: IDBTransactionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: org.scalajs.dom.Event): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
