package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualViewportEventMap extends StObject {
  
  /* standard dom */
  var resize: org.scalajs.dom.UIEvent = js.native
  
  /* standard dom */
  var scroll: org.scalajs.dom.Event = js.native
}
object VisualViewportEventMap {
  
  @scala.inline
  def apply(resize: org.scalajs.dom.UIEvent, scroll: org.scalajs.dom.Event): VisualViewportEventMap = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualViewportEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: VisualViewportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResize(value: org.scalajs.dom.UIEvent): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: org.scalajs.dom.Event): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
