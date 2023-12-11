package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIdentityProviderOptions extends StObject {
  
  /* standard dom */
  var peerIdentity: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var protocol: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var usernameHint: js.UndefOr[java.lang.String] = js.native
}
object RTCIdentityProviderOptions {
  
  @scala.inline
  def apply(): RTCIdentityProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIdentityProviderOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCIdentityProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeerIdentity(value: java.lang.String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    
    @scala.inline
    def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setUsernameHint(value: java.lang.String): Self = StObject.set(x, "usernameHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameHintUndefined: Self = StObject.set(x, "usernameHint", js.undefined)
  }
}
