package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodChangeEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var methodDetails: js.UndefOr[Any] = js.native
  
  /* standard dom */
  var methodName: js.UndefOr[java.lang.String] = js.native
}
object PaymentMethodChangeEventInit {
  
  @scala.inline
  def apply(): PaymentMethodChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodChangeEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PaymentMethodChangeEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethodDetails(value: Any): Self = StObject.set(x, "methodDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodDetailsUndefined: Self = StObject.set(x, "methodDetails", js.undefined)
    
    @scala.inline
    def setMethodName(value: java.lang.String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
  }
}
