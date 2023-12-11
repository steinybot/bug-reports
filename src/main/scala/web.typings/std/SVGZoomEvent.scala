package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGZoomEvent
  extends StObject
     with UIEvent {
  
  /* standard dom */
  val newScale: Double = js.native
  
  /* standard dom */
  val newTranslate: org.scalajs.dom.SVGPoint = js.native
  
  /* standard dom */
  val previousScale: Double = js.native
  
  /* standard dom */
  val previousTranslate: org.scalajs.dom.SVGPoint = js.native
  
  /* standard dom */
  val zoomRectScreen: org.scalajs.dom.SVGRect = js.native
}
