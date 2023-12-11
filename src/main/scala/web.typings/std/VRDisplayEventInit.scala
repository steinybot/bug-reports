package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRDisplayEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var display: VRDisplay = js.native
  
  /* standard dom */
  var reason: js.UndefOr[VRDisplayEventReason] = js.native
}
object VRDisplayEventInit {
  
  @scala.inline
  def apply(display: VRDisplay): VRDisplayEventInit = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRDisplayEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: VRDisplayEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: VRDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: VRDisplayEventReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
