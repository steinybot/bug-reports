package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenOrientationEventMap extends StObject {
  
  /* standard dom */
  var change: org.scalajs.dom.Event = js.native
}
object ScreenOrientationEventMap {
  
  @scala.inline
  def apply(change: org.scalajs.dom.Event): ScreenOrientationEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientationEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ScreenOrientationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: org.scalajs.dom.Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
