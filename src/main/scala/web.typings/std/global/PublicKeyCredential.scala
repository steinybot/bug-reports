package web.typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PublicKeyCredential")
@js.native
/* standard dom */
class PublicKeyCredential ()
  extends StObject
     with web.typings.std.PublicKeyCredential
object PublicKeyCredential {
  
  @JSGlobal("PublicKeyCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserVerifyingPlatformAuthenticatorAvailable")().asInstanceOf[js.Promise[scala.Boolean]]
}
