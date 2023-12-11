package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSessionDescriptionInit extends StObject {
  
  /* standard dom */
  var sdp: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var `type`: org.scalajs.dom.RTCSdpType = js.native
}
object RTCSessionDescriptionInit {
  
  @scala.inline
  def apply(`type`: org.scalajs.dom.RTCSdpType): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCSessionDescriptionInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
    
    @scala.inline
    def setType(value: org.scalajs.dom.RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
