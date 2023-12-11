package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaKeySessionEventMap extends StObject {
  
  /* standard dom */
  var keystatuseschange: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var message: MediaKeyMessageEvent = js.native
}
object MediaKeySessionEventMap {
  
  @scala.inline
  def apply(keystatuseschange: org.scalajs.dom.Event, message: MediaKeyMessageEvent): MediaKeySessionEventMap = {
    val __obj = js.Dynamic.literal(keystatuseschange = keystatuseschange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySessionEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MediaKeySessionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeystatuseschange(value: org.scalajs.dom.Event): Self = StObject.set(x, "keystatuseschange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: MediaKeyMessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
