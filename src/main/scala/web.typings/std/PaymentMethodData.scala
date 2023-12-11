package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodData extends StObject {
  
  /* standard dom */
  var data: js.UndefOr[Any] = js.native
  
  /* standard dom */
  var supportedMethods: java.lang.String | js.Array[java.lang.String] = js.native
}
object PaymentMethodData {
  
  @scala.inline
  def apply(supportedMethods: java.lang.String | js.Array[java.lang.String]): PaymentMethodData = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setSupportedMethods(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "supportedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedMethodsVarargs(value: java.lang.String*): Self = StObject.set(x, "supportedMethods", js.Array(value :_*))
  }
}
