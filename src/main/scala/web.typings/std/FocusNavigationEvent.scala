package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusNavigationEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val navigationReason: NavigationReason = js.native
  
  /* standard dom */
  val originHeight: Double = js.native
  
  /* standard dom */
  val originLeft: Double = js.native
  
  /* standard dom */
  val originTop: Double = js.native
  
  /* standard dom */
  val originWidth: Double = js.native
  
  /* standard dom */
  def requestFocus(): Unit = js.native
}
