package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionIceEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var candidate: js.UndefOr[org.scalajs.dom.RTCIceCandidate | Null] = js.native
  
  /* standard dom */
  var url: js.UndefOr[java.lang.String | Null] = js.native
}
object RTCPeerConnectionIceEventInit {
  
  @scala.inline
  def apply(): RTCPeerConnectionIceEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCPeerConnectionIceEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCPeerConnectionIceEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidate(value: org.scalajs.dom.RTCIceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateNull: Self = StObject.set(x, "candidate", null)
    
    @scala.inline
    def setCandidateUndefined: Self = StObject.set(x, "candidate", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = StObject.set(x, "url", null)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
