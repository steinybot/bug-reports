package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackCueEventMap extends StObject {
  
  /* standard dom */
  var enter: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var exit: org.scalajs.dom.Event = js.native
}
object TextTrackCueEventMap {
  
  @scala.inline
  def apply(enter: org.scalajs.dom.Event, exit: org.scalajs.dom.Event): TextTrackCueEventMap = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TextTrackCueEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: org.scalajs.dom.Event): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: org.scalajs.dom.Event): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
