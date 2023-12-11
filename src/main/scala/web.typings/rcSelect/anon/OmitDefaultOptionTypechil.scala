package web.typings.rcSelect.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rc-select.rc-select/lib/Select.DefaultOptionType, 'children'> */
@js.native
trait OmitDefaultOptionTypechil extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var label: ReactElement = js.native
  
  var value: js.UndefOr[String | Double | Null] = js.native
}
object OmitDefaultOptionTypechil {
  
  @scala.inline
  def apply(label: ReactElement): OmitDefaultOptionTypechil = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDefaultOptionTypechil]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OmitDefaultOptionTypechil] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
