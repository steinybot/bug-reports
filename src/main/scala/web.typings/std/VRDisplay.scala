package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents any VR device supported by this API. It includes generic information such as device IDs and descriptions, as well as methods for starting to present a VR scene, retrieving eye parameters and display capabilities, and other important functionality. */
@js.native
trait VRDisplay
  extends StObject
     with EventTarget {
  
  /* standard dom */
  def cancelAnimationFrame(handle: Double): Unit = js.native
  
  /* standard dom */
  val capabilities: VRDisplayCapabilities = js.native
  
  /* standard dom */
  var depthFar: Double = js.native
  
  /* standard dom */
  var depthNear: Double = js.native
  
  /* standard dom */
  val displayId: Double = js.native
  
  /* standard dom */
  val displayName: java.lang.String = js.native
  
  /* standard dom */
  def exitPresent(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def getEyeParameters(whichEye: java.lang.String): VREyeParameters = js.native
  
  /* standard dom */
  def getFrameData(frameData: VRFrameData): scala.Boolean = js.native
  
  /* standard dom */
  def getLayers(): js.Array[VRLayer] = js.native
  
  /** @deprecated */
  /* standard dom */
  def getPose(): VRPose = js.native
  
  /* standard dom */
  val isConnected: scala.Boolean = js.native
  
  /* standard dom */
  val isPresenting: scala.Boolean = js.native
  
  /* standard dom */
  def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  /* standard dom */
  def requestPresent(layers: js.Array[VRLayer]): js.Promise[Unit] = js.native
  /* standard dom.iterable */
  def requestPresent(layers: js.Iterable[VRLayer]): js.Promise[Unit] = js.native
  
  /* standard dom */
  def resetPose(): Unit = js.native
  
  /* standard dom */
  val stageParameters: VRStageParameters | Null = js.native
  
  /* standard dom */
  def submitFrame(): Unit = js.native
  def submitFrame(pose: VRPose): Unit = js.native
}
