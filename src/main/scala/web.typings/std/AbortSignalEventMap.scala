package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortSignalEventMap extends StObject {
  
  /* standard dom */
  var abort: org.scalajs.dom.Event = js.native
}
object AbortSignalEventMap {
  
  @scala.inline
  def apply(abort: org.scalajs.dom.Event): AbortSignalEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortSignalEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AbortSignalEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
  }
}
