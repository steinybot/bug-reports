package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSMediaKeys extends StObject {
  
  /* standard dom */
  def createSession(`type`: java.lang.String, initData: js.typedarray.Uint8Array): MSMediaKeySession = js.native
  def createSession(`type`: java.lang.String, initData: js.typedarray.Uint8Array, cdmData: js.typedarray.Uint8Array): MSMediaKeySession = js.native
  
  /* standard dom */
  val keySystem: java.lang.String = js.native
}
