package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BhxBrowser extends StObject {
  
  /* standard dom */
  def checkMatchesGlobExpression(pattern: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  
  /* standard dom */
  def checkMatchesUriExpression(pattern: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  
  /* standard dom */
  def clearLastError(): Unit = js.native
  
  /* standard dom */
  def currentWindowId(): Double = js.native
  
  /* standard dom */
  def fireExtensionApiTelemetry(
    functionName: java.lang.String,
    isSucceeded: scala.Boolean,
    isSupported: scala.Boolean,
    errorString: java.lang.String
  ): Unit = js.native
  
  /* standard dom */
  def genericFunction(functionId: Double, destination: Any): Unit = js.native
  def genericFunction(functionId: Double, destination: Any, parameters: java.lang.String): Unit = js.native
  def genericFunction(functionId: Double, destination: Any, parameters: java.lang.String, callbackId: Double): Unit = js.native
  def genericFunction(functionId: Double, destination: Any, parameters: Unit, callbackId: Double): Unit = js.native
  
  /* standard dom */
  def genericSynchronousFunction(functionId: Double): java.lang.String = js.native
  def genericSynchronousFunction(functionId: Double, parameters: java.lang.String): java.lang.String = js.native
  
  /* standard dom */
  def getExtensionId(): java.lang.String = js.native
  
  /* standard dom */
  def getThisAddress(): Any = js.native
  
  /* standard dom */
  val lastError: org.scalajs.dom.DOMException = js.native
  
  /* standard dom */
  def registerGenericFunctionCallbackHandler(callbackHandler: js.Function): Unit = js.native
  
  /* standard dom */
  def registerGenericListenerHandler(eventHandler: js.Function): Unit = js.native
  
  /* standard dom */
  def setLastError(parameters: java.lang.String): Unit = js.native
  
  /* standard dom */
  def webPlatformGenericFunction(destination: Any): Unit = js.native
  def webPlatformGenericFunction(destination: Any, parameters: java.lang.String): Unit = js.native
  def webPlatformGenericFunction(destination: Any, parameters: java.lang.String, callbackId: Double): Unit = js.native
  def webPlatformGenericFunction(destination: Any, parameters: Unit, callbackId: Double): Unit = js.native
}
