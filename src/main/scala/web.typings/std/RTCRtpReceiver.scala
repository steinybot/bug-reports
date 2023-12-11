package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
@js.native
trait RTCRtpReceiver extends StObject {
  
  /* standard dom */
  def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  
  /* standard dom */
  def getParameters(): RTCRtpReceiveParameters = js.native
  
  /* standard dom */
  def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  
  /* standard dom */
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
  
  /* standard dom */
  val track: org.scalajs.dom.MediaStreamTrack = js.native
  
  /* standard dom */
  val transport: RTCDtlsTransport | Null = js.native
}
object RTCRtpReceiver {
  
  @scala.inline
  def apply(
    getContributingSources: () => js.Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpReceiveParameters,
    getStats: () => js.Promise[org.scalajs.dom.RTCStatsReport],
    getSynchronizationSources: () => js.Array[RTCRtpSynchronizationSource],
    track: org.scalajs.dom.MediaStreamTrack
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters), getStats = js.Any.fromFunction0(getStats), getSynchronizationSources = js.Any.fromFunction0(getSynchronizationSources), track = track.asInstanceOf[js.Any], transport = null)
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCRtpReceiver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContributingSources(value: () => js.Array[RTCRtpContributingSource]): Self = StObject.set(x, "getContributingSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => RTCRtpReceiveParameters): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStats(value: () => js.Promise[org.scalajs.dom.RTCStatsReport]): Self = StObject.set(x, "getStats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSynchronizationSources(value: () => js.Array[RTCRtpSynchronizationSource]): Self = StObject.set(x, "getSynchronizationSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrack(value: org.scalajs.dom.MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: RTCDtlsTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportNull: Self = StObject.set(x, "transport", null)
  }
}
