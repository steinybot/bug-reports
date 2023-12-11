package web.typings.std.global

import web.typings.std.RTCSrtpSdesParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCSrtpSdesTransport")
@js.native
class RTCSrtpSdesTransport protected ()
  extends StObject
     with web.typings.std.RTCSrtpSdesTransport {
  /* standard dom */
  def this(
    transport: web.typings.std.RTCIceTransport,
    encryptParameters: RTCSrtpSdesParameters,
    decryptParameters: RTCSrtpSdesParameters
  ) = this()
}
object RTCSrtpSdesTransport {
  
  @JSGlobal("RTCSrtpSdesTransport")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def getLocalParameters(): js.Array[RTCSrtpSdesParameters] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalParameters")().asInstanceOf[js.Array[RTCSrtpSdesParameters]]
}
