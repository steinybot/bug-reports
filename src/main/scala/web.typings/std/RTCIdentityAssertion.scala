package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIdentityAssertion extends StObject {
  
  /* standard dom */
  var idp: java.lang.String = js.native
  
  /* standard dom */
  var name: java.lang.String = js.native
}
object RTCIdentityAssertion {
  
  @scala.inline
  def apply(idp: java.lang.String, name: java.lang.String): RTCIdentityAssertion = {
    val __obj = js.Dynamic.literal(idp = idp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIdentityAssertion]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCIdentityAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdp(value: java.lang.String): Self = StObject.set(x, "idp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
