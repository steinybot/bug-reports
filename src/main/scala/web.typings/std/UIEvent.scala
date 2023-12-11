package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Simple user interface events. */
@js.native
trait UIEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val detail: Double = js.native
  
  /* standard dom */
  val view: org.scalajs.dom.Window | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  val which: Double = js.native
}
