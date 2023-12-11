package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioScheduledSourceNodeEventMap extends StObject {
  
  /* standard dom */
  var ended: org.scalajs.dom.Event = js.native
}
object AudioScheduledSourceNodeEventMap {
  
  @scala.inline
  def apply(ended: org.scalajs.dom.Event): AudioScheduledSourceNodeEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioScheduledSourceNodeEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AudioScheduledSourceNodeEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnded(value: org.scalajs.dom.Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
  }
}
