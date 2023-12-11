package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCConfiguration extends StObject {
  
  /* standard dom */
  var bundlePolicy: js.UndefOr[org.scalajs.dom.RTCBundlePolicy] = js.native
  
  /* standard dom */
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.native
  
  /* standard dom */
  var iceCandidatePoolSize: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var iceServers: js.UndefOr[js.Array[org.scalajs.dom.RTCIceServer]] = js.native
  
  /* standard dom */
  var iceTransportPolicy: js.UndefOr[org.scalajs.dom.RTCIceTransportPolicy] = js.native
  
  /* standard dom */
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.native
}
object RTCConfiguration {
  
  @scala.inline
  def apply(): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCConfiguration]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundlePolicy(value: org.scalajs.dom.RTCBundlePolicy): Self = StObject.set(x, "bundlePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlePolicyUndefined: Self = StObject.set(x, "bundlePolicy", js.undefined)
    
    @scala.inline
    def setCertificates(value: js.Array[RTCCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: RTCCertificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setIceCandidatePoolSize(value: Double): Self = StObject.set(x, "iceCandidatePoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceCandidatePoolSizeUndefined: Self = StObject.set(x, "iceCandidatePoolSize", js.undefined)
    
    @scala.inline
    def setIceServers(value: js.Array[org.scalajs.dom.RTCIceServer]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceServersUndefined: Self = StObject.set(x, "iceServers", js.undefined)
    
    @scala.inline
    def setIceServersVarargs(value: org.scalajs.dom.RTCIceServer*): Self = StObject.set(x, "iceServers", js.Array(value :_*))
    
    @scala.inline
    def setIceTransportPolicy(value: org.scalajs.dom.RTCIceTransportPolicy): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
    
    @scala.inline
    def setRtcpMuxPolicy(value: RTCRtcpMuxPolicy): Self = StObject.set(x, "rtcpMuxPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpMuxPolicyUndefined: Self = StObject.set(x, "rtcpMuxPolicy", js.undefined)
  }
}
