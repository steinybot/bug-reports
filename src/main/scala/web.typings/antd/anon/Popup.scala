package web.typings.antd.anon

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popup extends StObject {
  
  var popup: js.UndefOr[CSSProperties] = js.native
  
  var popupOverlayInner: js.UndefOr[CSSProperties] = js.native
}
object Popup {
  
  @scala.inline
  def apply(): Popup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Popup]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Popup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopup(value: CSSProperties): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOverlayInner(value: CSSProperties): Self = StObject.set(x, "popupOverlayInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOverlayInnerUndefined: Self = StObject.set(x, "popupOverlayInner", js.undefined)
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
  }
}
