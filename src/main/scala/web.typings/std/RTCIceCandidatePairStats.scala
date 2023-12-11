package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidatePairStats
  extends StObject
     with RTCStats {
  
  /* standard dom */
  var availableIncomingBitrate: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var availableOutgoingBitrate: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var bytesDiscardedOnSend: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var bytesReceived: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var bytesSent: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var circuitBreakerTriggerCount: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var consentExpiredTimestamp: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var consentRequestsSent: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var currentRoundTripTime: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var currentRtt: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var firstRequestTimestamp: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var lastPacketReceivedTimestamp: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var lastPacketSentTimestamp: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var lastRequestTimestamp: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var lastResponseTimestamp: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var localCandidateId: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var nominated: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var packetsDiscardedOnSend: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var packetsReceived: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var packetsSent: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var priority: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var remoteCandidateId: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var requestsReceived: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var requestsSent: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var responsesReceived: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var responsesSent: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var retransmissionsReceived: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var retransmissionsSent: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var state: js.UndefOr[RTCStatsIceCandidatePairState] = js.native
  
  /* standard dom */
  var totalRoundTripTime: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var totalRtt: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var transportId: js.UndefOr[java.lang.String] = js.native
}
object RTCIceCandidatePairStats {
  
  @scala.inline
  def apply(): RTCIceCandidatePairStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidatePairStats]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCIceCandidatePairStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableIncomingBitrate(value: Double): Self = StObject.set(x, "availableIncomingBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableIncomingBitrateUndefined: Self = StObject.set(x, "availableIncomingBitrate", js.undefined)
    
    @scala.inline
    def setAvailableOutgoingBitrate(value: Double): Self = StObject.set(x, "availableOutgoingBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableOutgoingBitrateUndefined: Self = StObject.set(x, "availableOutgoingBitrate", js.undefined)
    
    @scala.inline
    def setBytesDiscardedOnSend(value: Double): Self = StObject.set(x, "bytesDiscardedOnSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesDiscardedOnSendUndefined: Self = StObject.set(x, "bytesDiscardedOnSend", js.undefined)
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    @scala.inline
    def setCircuitBreakerTriggerCount(value: Double): Self = StObject.set(x, "circuitBreakerTriggerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircuitBreakerTriggerCountUndefined: Self = StObject.set(x, "circuitBreakerTriggerCount", js.undefined)
    
    @scala.inline
    def setConsentExpiredTimestamp(value: Double): Self = StObject.set(x, "consentExpiredTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsentExpiredTimestampUndefined: Self = StObject.set(x, "consentExpiredTimestamp", js.undefined)
    
    @scala.inline
    def setConsentRequestsSent(value: Double): Self = StObject.set(x, "consentRequestsSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsentRequestsSentUndefined: Self = StObject.set(x, "consentRequestsSent", js.undefined)
    
    @scala.inline
    def setCurrentRoundTripTime(value: Double): Self = StObject.set(x, "currentRoundTripTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRoundTripTimeUndefined: Self = StObject.set(x, "currentRoundTripTime", js.undefined)
    
    @scala.inline
    def setCurrentRtt(value: Double): Self = StObject.set(x, "currentRtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRttUndefined: Self = StObject.set(x, "currentRtt", js.undefined)
    
    @scala.inline
    def setFirstRequestTimestamp(value: Double): Self = StObject.set(x, "firstRequestTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRequestTimestampUndefined: Self = StObject.set(x, "firstRequestTimestamp", js.undefined)
    
    @scala.inline
    def setLastPacketReceivedTimestamp(value: Double): Self = StObject.set(x, "lastPacketReceivedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPacketReceivedTimestampUndefined: Self = StObject.set(x, "lastPacketReceivedTimestamp", js.undefined)
    
    @scala.inline
    def setLastPacketSentTimestamp(value: Double): Self = StObject.set(x, "lastPacketSentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPacketSentTimestampUndefined: Self = StObject.set(x, "lastPacketSentTimestamp", js.undefined)
    
    @scala.inline
    def setLastRequestTimestamp(value: Double): Self = StObject.set(x, "lastRequestTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRequestTimestampUndefined: Self = StObject.set(x, "lastRequestTimestamp", js.undefined)
    
    @scala.inline
    def setLastResponseTimestamp(value: Double): Self = StObject.set(x, "lastResponseTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastResponseTimestampUndefined: Self = StObject.set(x, "lastResponseTimestamp", js.undefined)
    
    @scala.inline
    def setLocalCandidateId(value: java.lang.String): Self = StObject.set(x, "localCandidateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCandidateIdUndefined: Self = StObject.set(x, "localCandidateId", js.undefined)
    
    @scala.inline
    def setNominated(value: scala.Boolean): Self = StObject.set(x, "nominated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNominatedUndefined: Self = StObject.set(x, "nominated", js.undefined)
    
    @scala.inline
    def setPacketsDiscardedOnSend(value: Double): Self = StObject.set(x, "packetsDiscardedOnSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsDiscardedOnSendUndefined: Self = StObject.set(x, "packetsDiscardedOnSend", js.undefined)
    
    @scala.inline
    def setPacketsReceived(value: Double): Self = StObject.set(x, "packetsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsReceivedUndefined: Self = StObject.set(x, "packetsReceived", js.undefined)
    
    @scala.inline
    def setPacketsSent(value: Double): Self = StObject.set(x, "packetsSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsSentUndefined: Self = StObject.set(x, "packetsSent", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setRemoteCandidateId(value: java.lang.String): Self = StObject.set(x, "remoteCandidateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCandidateIdUndefined: Self = StObject.set(x, "remoteCandidateId", js.undefined)
    
    @scala.inline
    def setRequestsReceived(value: Double): Self = StObject.set(x, "requestsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsReceivedUndefined: Self = StObject.set(x, "requestsReceived", js.undefined)
    
    @scala.inline
    def setRequestsSent(value: Double): Self = StObject.set(x, "requestsSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsSentUndefined: Self = StObject.set(x, "requestsSent", js.undefined)
    
    @scala.inline
    def setResponsesReceived(value: Double): Self = StObject.set(x, "responsesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesReceivedUndefined: Self = StObject.set(x, "responsesReceived", js.undefined)
    
    @scala.inline
    def setResponsesSent(value: Double): Self = StObject.set(x, "responsesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesSentUndefined: Self = StObject.set(x, "responsesSent", js.undefined)
    
    @scala.inline
    def setRetransmissionsReceived(value: Double): Self = StObject.set(x, "retransmissionsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetransmissionsReceivedUndefined: Self = StObject.set(x, "retransmissionsReceived", js.undefined)
    
    @scala.inline
    def setRetransmissionsSent(value: Double): Self = StObject.set(x, "retransmissionsSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetransmissionsSentUndefined: Self = StObject.set(x, "retransmissionsSent", js.undefined)
    
    @scala.inline
    def setState(value: RTCStatsIceCandidatePairState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTotalRoundTripTime(value: Double): Self = StObject.set(x, "totalRoundTripTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRoundTripTimeUndefined: Self = StObject.set(x, "totalRoundTripTime", js.undefined)
    
    @scala.inline
    def setTotalRtt(value: Double): Self = StObject.set(x, "totalRtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRttUndefined: Self = StObject.set(x, "totalRtt", js.undefined)
    
    @scala.inline
    def setTransportId(value: java.lang.String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportIdUndefined: Self = StObject.set(x, "transportId", js.undefined)
  }
}
