package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSMediaKeySession
  extends StObject
     with EventTarget {
  
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  val error: MSMediaKeyError | Null = js.native
  
  /* standard dom */
  val keySystem: java.lang.String = js.native
  
  /* standard dom */
  val sessionId: java.lang.String = js.native
  
  /* standard dom */
  def update(key: js.typedarray.Uint8Array): Unit = js.native
}
