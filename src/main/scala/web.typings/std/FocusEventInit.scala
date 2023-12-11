package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusEventInit
  extends StObject
     with UIEventInit {
  
  /* standard dom */
  var relatedTarget: js.UndefOr[org.scalajs.dom.EventTarget | Null] = js.native
}
object FocusEventInit {
  
  @scala.inline
  def apply(): FocusEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FocusEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    @scala.inline
    def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
  }
}
