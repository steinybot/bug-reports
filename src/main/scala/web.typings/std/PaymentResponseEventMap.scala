package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentResponseEventMap extends StObject {
  
  /* standard dom */
  var payerdetailchange: org.scalajs.dom.Event = js.native
}
object PaymentResponseEventMap {
  
  @scala.inline
  def apply(payerdetailchange: org.scalajs.dom.Event): PaymentResponseEventMap = {
    val __obj = js.Dynamic.literal(payerdetailchange = payerdetailchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResponseEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PaymentResponseEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayerdetailchange(value: org.scalajs.dom.Event): Self = StObject.set(x, "payerdetailchange", value.asInstanceOf[js.Any])
  }
}
