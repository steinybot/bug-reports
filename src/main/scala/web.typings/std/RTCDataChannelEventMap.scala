package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannelEventMap extends StObject {
  
  /* standard dom */
  var bufferedamountlow: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var close: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var error: RTCErrorEvent = js.native
  
  /* standard dom */
  var message: org.scalajs.dom.MessageEvent = js.native
  
  /* standard dom */
  var open: org.scalajs.dom.Event = js.native
}
object RTCDataChannelEventMap {
  
  @scala.inline
  def apply(
    bufferedamountlow: org.scalajs.dom.Event,
    close: org.scalajs.dom.Event,
    error: RTCErrorEvent,
    message: org.scalajs.dom.MessageEvent,
    open: org.scalajs.dom.Event
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCDataChannelEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferedamountlow(value: org.scalajs.dom.Event): Self = StObject.set(x, "bufferedamountlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: org.scalajs.dom.Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: RTCErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: org.scalajs.dom.Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
