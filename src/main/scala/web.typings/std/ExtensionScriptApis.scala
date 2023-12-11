package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionScriptApis extends StObject {
  
  /* standard dom */
  def extensionIdToShortId(extensionId: java.lang.String): Double = js.native
  
  /* standard dom */
  def fireExtensionApiTelemetry(
    functionName: java.lang.String,
    isSucceeded: scala.Boolean,
    isSupported: scala.Boolean,
    errorString: java.lang.String
  ): Unit = js.native
  
  /* standard dom */
  def genericFunction(routerAddress: Any): Unit = js.native
  def genericFunction(routerAddress: Any, parameters: java.lang.String): Unit = js.native
  def genericFunction(routerAddress: Any, parameters: java.lang.String, callbackId: Double): Unit = js.native
  def genericFunction(routerAddress: Any, parameters: Unit, callbackId: Double): Unit = js.native
  
  /* standard dom */
  def genericSynchronousFunction(functionId: Double): java.lang.String = js.native
  def genericSynchronousFunction(functionId: Double, parameters: java.lang.String): java.lang.String = js.native
  
  /* standard dom */
  def genericWebRuntimeCallout(to: Any, from: Any, payload: java.lang.String): Unit = js.native
  
  /* standard dom */
  def getExtensionId(): java.lang.String = js.native
  
  /* standard dom */
  def registerGenericFunctionCallbackHandler(callbackHandler: js.Function): Unit = js.native
  
  /* standard dom */
  def registerGenericPersistentCallbackHandler(callbackHandler: js.Function): Unit = js.native
  
  /* standard dom */
  def registerWebRuntimeCallbackHandler(handler: js.Function): Any = js.native
}
