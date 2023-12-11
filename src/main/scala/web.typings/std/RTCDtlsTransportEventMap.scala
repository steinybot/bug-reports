package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtlsTransportEventMap extends StObject {
  
  /* standard dom */
  var error: RTCErrorEvent = js.native
  
  /* standard dom */
  var statechange: org.scalajs.dom.Event = js.native
}
object RTCDtlsTransportEventMap {
  
  @scala.inline
  def apply(error: RTCErrorEvent, statechange: org.scalajs.dom.Event): RTCDtlsTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransportEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCDtlsTransportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: RTCErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
