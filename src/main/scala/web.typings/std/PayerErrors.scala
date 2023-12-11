package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayerErrors extends StObject {
  
  /* standard dom */
  var email: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var name: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var phone: js.UndefOr[java.lang.String] = js.native
}
object PayerErrors {
  
  @scala.inline
  def apply(): PayerErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayerErrors]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PayerErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: java.lang.String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhone(value: java.lang.String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
