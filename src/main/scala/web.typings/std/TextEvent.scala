package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEvent
  extends StObject
     with UIEvent {
  
  /* standard dom */
  val DOM_INPUT_METHOD_DROP: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_HANDWRITING: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_IME: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_KEYBOARD: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_MULTIMODAL: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_OPTION: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_PASTE: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_SCRIPT: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_UNKNOWN: Double = js.native
  
  /* standard dom */
  val DOM_INPUT_METHOD_VOICE: Double = js.native
  
  /* standard dom */
  val data: java.lang.String = js.native
  
  /* standard dom */
  def initTextEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: org.scalajs.dom.Window,
    dataArg: java.lang.String,
    inputMethod: Double,
    locale: java.lang.String
  ): Unit = js.native
}
