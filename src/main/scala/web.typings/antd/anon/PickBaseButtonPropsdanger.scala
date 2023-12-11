package web.typings.antd.anon

import web.typings.antd.esButtonButtonHelpersMod.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd.antd/es/button/button.BaseButtonProps, 'danger' | 'type'> */
@js.native
trait PickBaseButtonPropsdanger extends StObject {
  
  var danger: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[ButtonType] = js.native
}
object PickBaseButtonPropsdanger {
  
  @scala.inline
  def apply(): PickBaseButtonPropsdanger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickBaseButtonPropsdanger]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PickBaseButtonPropsdanger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDanger(value: Boolean): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
    
    @scala.inline
    def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
