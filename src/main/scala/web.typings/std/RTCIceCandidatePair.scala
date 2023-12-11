package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidatePair extends StObject {
  
  /* standard dom */
  var local: js.UndefOr[org.scalajs.dom.RTCIceCandidate] = js.native
  
  /* standard dom */
  var remote: js.UndefOr[org.scalajs.dom.RTCIceCandidate] = js.native
}
object RTCIceCandidatePair {
  
  @scala.inline
  def apply(): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCIceCandidatePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: org.scalajs.dom.RTCIceCandidate): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setRemote(value: org.scalajs.dom.RTCIceCandidate): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
