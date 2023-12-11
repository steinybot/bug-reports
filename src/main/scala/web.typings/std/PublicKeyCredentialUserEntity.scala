package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialUserEntity
  extends StObject
     with PublicKeyCredentialEntity {
  
  /* standard dom */
  var displayName: java.lang.String = js.native
  
  /* standard dom */
  var id: BufferSource = js.native
}
object PublicKeyCredentialUserEntity {
  
  @scala.inline
  def apply(displayName: java.lang.String, id: BufferSource, name: java.lang.String): PublicKeyCredentialUserEntity = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PublicKeyCredentialUserEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: java.lang.String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BufferSource): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
