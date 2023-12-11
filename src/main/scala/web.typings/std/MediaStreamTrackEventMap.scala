package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamTrackEventMap extends StObject {
  
  /* standard dom */
  var ended: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var mute: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var unmute: org.scalajs.dom.Event = js.native
}
object MediaStreamTrackEventMap {
  
  @scala.inline
  def apply(ended: org.scalajs.dom.Event, mute: org.scalajs.dom.Event, unmute: org.scalajs.dom.Event): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MediaStreamTrackEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnded(value: org.scalajs.dom.Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMute(value: org.scalajs.dom.Event): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmute(value: org.scalajs.dom.Event): Self = StObject.set(x, "unmute", value.asInstanceOf[js.Any])
  }
}
