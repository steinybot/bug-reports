package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInit extends StObject {
  
  /* standard dom */
  var bubbles: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var cancelable: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var composed: js.UndefOr[scala.Boolean] = js.native
}
object EventInit {
  
  @scala.inline
  def apply(): EventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: EventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: scala.Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    @scala.inline
    def setCancelable(value: scala.Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    @scala.inline
    def setComposed(value: scala.Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
