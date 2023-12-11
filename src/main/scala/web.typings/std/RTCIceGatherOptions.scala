package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceGatherOptions extends StObject {
  
  /* standard dom */
  var gatherPolicy: js.UndefOr[RTCIceGatherPolicy] = js.native
  
  /* standard dom */
  var iceservers: js.UndefOr[js.Array[org.scalajs.dom.RTCIceServer]] = js.native
}
object RTCIceGatherOptions {
  
  @scala.inline
  def apply(): RTCIceGatherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceGatherOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCIceGatherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatherPolicy(value: RTCIceGatherPolicy): Self = StObject.set(x, "gatherPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatherPolicyUndefined: Self = StObject.set(x, "gatherPolicy", js.undefined)
    
    @scala.inline
    def setIceservers(value: js.Array[org.scalajs.dom.RTCIceServer]): Self = StObject.set(x, "iceservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceserversUndefined: Self = StObject.set(x, "iceservers", js.undefined)
    
    @scala.inline
    def setIceserversVarargs(value: org.scalajs.dom.RTCIceServer*): Self = StObject.set(x, "iceservers", js.Array(value :_*))
  }
}
