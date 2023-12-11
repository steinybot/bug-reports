package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var track: js.UndefOr[org.scalajs.dom.TextTrack | Null] = js.native
}
object TrackEventInit {
  
  @scala.inline
  def apply(): TrackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TrackEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack(value: org.scalajs.dom.TextTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackNull: Self = StObject.set(x, "track", null)
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
