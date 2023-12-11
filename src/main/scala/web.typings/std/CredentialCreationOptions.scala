package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialCreationOptions extends StObject {
  
  /* standard dom */
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.native
  
  /* standard dom */
  var signal: js.UndefOr[org.scalajs.dom.AbortSignal] = js.native
}
object CredentialCreationOptions {
  
  @scala.inline
  def apply(): CredentialCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialCreationOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: CredentialCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKey(value: PublicKeyCredentialCreationOptions): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    @scala.inline
    def setSignal(value: org.scalajs.dom.AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
