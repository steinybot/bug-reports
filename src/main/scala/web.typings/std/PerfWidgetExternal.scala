package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfWidgetExternal extends StObject {
  
  /* standard dom */
  val activeNetworkRequestCount: Double = js.native
  
  /* standard dom */
  def addEventListener(eventType: java.lang.String, callback: js.Function): Unit = js.native
  
  /* standard dom */
  val averageFrameTime: Double = js.native
  
  /* standard dom */
  val averagePaintTime: Double = js.native
  
  /* standard dom */
  val extraInformationEnabled: scala.Boolean = js.native
  
  /* standard dom */
  def getMemoryUsage(): Double = js.native
  
  /* standard dom */
  def getProcessCpuUsage(): Double = js.native
  
  /* standard dom */
  def getRecentCpuUsage(): Any = js.native
  def getRecentCpuUsage(last: Double): Any = js.native
  
  /* standard dom */
  def getRecentFrames(): Any = js.native
  def getRecentFrames(last: Double): Any = js.native
  
  /* standard dom */
  def getRecentMemoryUsage(): Any = js.native
  def getRecentMemoryUsage(last: Double): Any = js.native
  
  /* standard dom */
  def getRecentPaintRequests(): Any = js.native
  def getRecentPaintRequests(last: Double): Any = js.native
  
  /* standard dom */
  val independentRenderingEnabled: scala.Boolean = js.native
  
  /* standard dom */
  val irDisablingContentString: java.lang.String = js.native
  
  /* standard dom */
  val irStatusAvailable: scala.Boolean = js.native
  
  /* standard dom */
  val maxCpuSpeed: Double = js.native
  
  /* standard dom */
  val paintRequestsPerSecond: Double = js.native
  
  /* standard dom */
  val performanceCounter: Double = js.native
  
  /* standard dom */
  val performanceCounterFrequency: Double = js.native
  
  /* standard dom */
  def removeEventListener(eventType: java.lang.String, callback: js.Function): Unit = js.native
  
  /* standard dom */
  def repositionWindow(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def resizeWindow(width: Double, height: Double): Unit = js.native
}
