package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionEventMap extends StObject {
  
  /* standard dom */
  var connectionstatechange: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var datachannel: org.scalajs.dom.RTCDataChannelEvent = js.native
  
  /* standard dom */
  var icecandidate: org.scalajs.dom.RTCPeerConnectionIceEvent = js.native
  
  /* standard dom */
  var icecandidateerror: RTCPeerConnectionIceErrorEvent = js.native
  
  /* standard dom */
  var iceconnectionstatechange: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var icegatheringstatechange: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var negotiationneeded: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var signalingstatechange: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var track: RTCTrackEvent = js.native
}
object RTCPeerConnectionEventMap {
  
  @scala.inline
  def apply(
    connectionstatechange: org.scalajs.dom.Event,
    datachannel: org.scalajs.dom.RTCDataChannelEvent,
    icecandidate: org.scalajs.dom.RTCPeerConnectionIceEvent,
    icecandidateerror: RTCPeerConnectionIceErrorEvent,
    iceconnectionstatechange: org.scalajs.dom.Event,
    icegatheringstatechange: org.scalajs.dom.Event,
    negotiationneeded: org.scalajs.dom.Event,
    signalingstatechange: org.scalajs.dom.Event,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(connectionstatechange = connectionstatechange.asInstanceOf[js.Any], datachannel = datachannel.asInstanceOf[js.Any], icecandidate = icecandidate.asInstanceOf[js.Any], icecandidateerror = icecandidateerror.asInstanceOf[js.Any], iceconnectionstatechange = iceconnectionstatechange.asInstanceOf[js.Any], icegatheringstatechange = icegatheringstatechange.asInstanceOf[js.Any], negotiationneeded = negotiationneeded.asInstanceOf[js.Any], signalingstatechange = signalingstatechange.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCPeerConnectionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "connectionstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatachannel(value: org.scalajs.dom.RTCDataChannelEvent): Self = StObject.set(x, "datachannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcecandidate(value: org.scalajs.dom.RTCPeerConnectionIceEvent): Self = StObject.set(x, "icecandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcecandidateerror(value: RTCPeerConnectionIceErrorEvent): Self = StObject.set(x, "icecandidateerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceconnectionstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "iceconnectionstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcegatheringstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "icegatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegotiationneeded(value: org.scalajs.dom.Event): Self = StObject.set(x, "negotiationneeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalingstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "signalingstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: RTCTrackEvent): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
