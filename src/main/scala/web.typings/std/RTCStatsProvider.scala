package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCStatsProvider
  extends StObject
     with EventTarget {
  
  /* standard dom */
  def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
  
  /* standard dom */
  def msGetStats(): js.Promise[org.scalajs.dom.RTCStatsReport] = js.native
}
