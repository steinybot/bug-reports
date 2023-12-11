package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketEventMap extends StObject {
  
  /* standard dom */
  var close: org.scalajs.dom.CloseEvent = js.native
  
  /* standard dom */
  var error: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var message: org.scalajs.dom.MessageEvent = js.native
  
  /* standard dom */
  var open: org.scalajs.dom.Event = js.native
}
object WebSocketEventMap {
  
  @scala.inline
  def apply(
    close: org.scalajs.dom.CloseEvent,
    error: org.scalajs.dom.Event,
    message: org.scalajs.dom.MessageEvent,
    open: org.scalajs.dom.Event
  ): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: WebSocketEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: org.scalajs.dom.CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: org.scalajs.dom.Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
