package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities. */
@js.native
trait Navigator
  extends StObject
     with MSFileSaver
     with MSNavigatorDoNotTrack
     with NavigatorAutomationInformation
     with NavigatorBeacon
     with NavigatorConcurrentHardware
     with NavigatorContentUtils
     with NavigatorCookies
     with NavigatorID
     with NavigatorLanguage
     with NavigatorOnLine
     with NavigatorPlugins
     with NavigatorStorage {
  
  /* standard dom */
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  
  /* standard dom */
  val clipboard: Clipboard = js.native
  
  /* standard dom */
  val credentials: CredentialsContainer = js.native
  
  /* standard dom */
  val doNotTrack: java.lang.String | Null = js.native
  
  /* standard dom */
  val geolocation: org.scalajs.dom.Geolocation = js.native
  
  /* standard dom */
  def getGamepads(): js.Array[org.scalajs.dom.Gamepad | Null] = js.native
  
  /* standard dom */
  def getUserMedia(
    constraints: org.scalajs.dom.MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
  
  /* standard dom */
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
  
  /* standard dom */
  val maxTouchPoints: Double = js.native
  
  /* standard dom */
  val mediaDevices: org.scalajs.dom.MediaDevices = js.native
  
  /* standard dom */
  def msLaunchUri(uri: java.lang.String): Unit = js.native
  def msLaunchUri(uri: java.lang.String, successCallback: MSLaunchUriCallback): Unit = js.native
  def msLaunchUri(
    uri: java.lang.String,
    successCallback: MSLaunchUriCallback,
    noHandlerCallback: MSLaunchUriCallback
  ): Unit = js.native
  def msLaunchUri(uri: java.lang.String, successCallback: Unit, noHandlerCallback: MSLaunchUriCallback): Unit = js.native
  
  /* standard dom */
  val msManipulationViewsEnabled: scala.Boolean = js.native
  
  /* standard dom */
  val msMaxTouchPoints: Double = js.native
  
  /* standard dom */
  val msPointerEnabled: scala.Boolean = js.native
  
  /* standard dom */
  val permissions: Permissions = js.native
  
  /* standard dom */
  val pointerEnabled: scala.Boolean = js.native
  
  /* standard dom */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Array[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  /* standard dom.iterable */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Iterable[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  
  def sendBeacon(url: java.lang.String, data: BodyInit): scala.Boolean = js.native
  
  /* standard dom */
  val serviceWorker: org.scalajs.dom.ServiceWorkerContainer = js.native
  
  /* standard dom */
  def share(): js.Promise[Unit] = js.native
  def share(data: ShareData): js.Promise[Unit] = js.native
  
  def vibrate(pattern: js.Array[Double]): scala.Boolean = js.native
  /* standard dom */
  def vibrate(pattern: Double): scala.Boolean = js.native
}
