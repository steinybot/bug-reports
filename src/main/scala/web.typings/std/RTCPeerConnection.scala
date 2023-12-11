package web.typings.std

import web.typings.std.stdStrings.connectionstatechange
import web.typings.std.stdStrings.datachannel
import web.typings.std.stdStrings.icecandidate
import web.typings.std.stdStrings.icecandidateerror
import web.typings.std.stdStrings.iceconnectionstatechange
import web.typings.std.stdStrings.icegatheringstatechange
import web.typings.std.stdStrings.negotiationneeded
import web.typings.std.stdStrings.signalingstatechange
import web.typings.std.stdStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A WebRTC connection between the local computer and a remote peer. It provides methods to connect to a remote peer, maintain and monitor the connection, and close the connection once it's no longer needed. */
@js.native
trait RTCPeerConnection
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  def addIceCandidate(candidate: org.scalajs.dom.RTCIceCandidate): js.Promise[Unit] = js.native
  /* standard dom */
  def addIceCandidate(candidate: org.scalajs.dom.RTCIceCandidateInit): js.Promise[Unit] = js.native
  
  /* standard dom */
  def addTrack(track: org.scalajs.dom.MediaStreamTrack, streams: org.scalajs.dom.MediaStream*): RTCRtpSender = js.native
  
  def addTransceiver(trackOrKind: java.lang.String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: java.lang.String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  /* standard dom */
  def addTransceiver(trackOrKind: org.scalajs.dom.MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: org.scalajs.dom.MediaStreamTrack, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  
  /* standard dom */
  val canTrickleIceCandidates: scala.Boolean | Null = js.native
  
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  val connectionState: RTCPeerConnectionState = js.native
  
  /* standard dom */
  def createAnswer(): js.Promise[org.scalajs.dom.RTCSessionDescriptionInit] = js.native
  def createAnswer(options: org.scalajs.dom.RTCOfferOptions): js.Promise[org.scalajs.dom.RTCSessionDescriptionInit] = js.native
  
  /* standard dom */
  def createDataChannel(label: java.lang.String): org.scalajs.dom.RTCDataChannel = js.native
  def createDataChannel(label: java.lang.String, dataChannelDict: org.scalajs.dom.RTCDataChannelInit): org.scalajs.dom.RTCDataChannel = js.native
  
  /* standard dom */
  def createOffer(): js.Promise[org.scalajs.dom.RTCSessionDescriptionInit] = js.native
  def createOffer(options: org.scalajs.dom.RTCOfferOptions): js.Promise[org.scalajs.dom.RTCSessionDescriptionInit] = js.native
  
  /* standard dom */
  val currentLocalDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /* standard dom */
  val currentRemoteDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /* standard dom */
  def getConfiguration(): org.scalajs.dom.RTCConfiguration = js.native
  
  /* standard dom */
  def getIdentityAssertion(): js.Promise[java.lang.String] = js.native
  
  /* standard dom */
  def getReceivers(): js.Array[RTCRtpReceiver] = js.native
  
  /* standard dom */
  def getSenders(): js.Array[RTCRtpSender] = js.native
  
  /* standard dom */
  def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  def getStats(selector: org.scalajs.dom.MediaStreamTrack): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  
  /* standard dom */
  def getTransceivers(): js.Array[RTCRtpTransceiver] = js.native
  
  /* standard dom */
  val iceConnectionState: org.scalajs.dom.RTCIceConnectionState = js.native
  
  /* standard dom */
  val iceGatheringState: org.scalajs.dom.RTCIceGatheringState = js.native
  
  /* standard dom */
  val idpErrorInfo: java.lang.String | Null = js.native
  
  /* standard dom */
  val idpLoginUrl: java.lang.String | Null = js.native
  
  /* standard dom */
  val localDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /* standard dom */
  var onconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var ondatachannel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onicecandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onicecandidateerror: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any]) | Null = js.native
  
  /* standard dom */
  var oniceconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onicegatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onnegotiationneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onsignalingstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var ontrack: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]) | Null = js.native
  
  /* standard dom */
  val peerIdentity: js.Promise[org.scalajs.dom.RTCIdentityAssertion] = js.native
  
  /* standard dom */
  val pendingLocalDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /* standard dom */
  val pendingRemoteDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /* standard dom */
  val remoteDescription: org.scalajs.dom.RTCSessionDescription | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCDataChannelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.RTCPeerConnectionIceEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  def removeTrack(sender: RTCRtpSender): Unit = js.native
  
  /* standard dom */
  def restartIce(): Unit = js.native
  
  /* standard dom */
  val sctp: RTCSctpTransport | Null = js.native
  
  /* standard dom */
  def setConfiguration(): Unit = js.native
  def setConfiguration(configuration: org.scalajs.dom.RTCConfiguration): Unit = js.native
  
  /* standard dom */
  def setIdentityProvider(provider: java.lang.String): Unit = js.native
  def setIdentityProvider(provider: java.lang.String, options: RTCIdentityProviderOptions): Unit = js.native
  
  /* standard dom */
  def setLocalDescription(): js.Promise[Unit] = js.native
  def setLocalDescription(description: org.scalajs.dom.RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  
  /* standard dom */
  def setRemoteDescription(description: org.scalajs.dom.RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  
  /* standard dom */
  val signalingState: org.scalajs.dom.RTCSignalingState = js.native
}
