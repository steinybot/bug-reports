package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentShippingOption extends StObject {
  
  /* standard dom */
  var amount: PaymentCurrencyAmount = js.native
  
  /* standard dom */
  var id: java.lang.String = js.native
  
  /* standard dom */
  var label: java.lang.String = js.native
  
  /* standard dom */
  var selected: js.UndefOr[scala.Boolean] = js.native
}
object PaymentShippingOption {
  
  @scala.inline
  def apply(amount: PaymentCurrencyAmount, id: java.lang.String, label: java.lang.String): PaymentShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentShippingOption]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PaymentShippingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: PaymentCurrencyAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: scala.Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
