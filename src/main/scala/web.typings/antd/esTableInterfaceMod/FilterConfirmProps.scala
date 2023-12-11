package web.typings.antd.esTableInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterConfirmProps extends StObject {
  
  var closeDropdown: Boolean = js.native
}
object FilterConfirmProps {
  
  @scala.inline
  def apply(closeDropdown: Boolean): FilterConfirmProps = {
    val __obj = js.Dynamic.literal(closeDropdown = closeDropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterConfirmProps]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FilterConfirmProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseDropdown(value: Boolean): Self = StObject.set(x, "closeDropdown", value.asInstanceOf[js.Any])
  }
}
