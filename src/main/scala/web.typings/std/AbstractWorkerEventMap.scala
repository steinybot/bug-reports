package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractWorkerEventMap extends StObject {
  
  /* standard dom */
  var error: org.scalajs.dom.ErrorEvent = js.native
}
object AbstractWorkerEventMap {
  
  @scala.inline
  def apply(error: org.scalajs.dom.ErrorEvent): AbstractWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractWorkerEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AbstractWorkerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: org.scalajs.dom.ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
