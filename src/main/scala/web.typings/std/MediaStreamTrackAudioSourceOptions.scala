package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamTrackAudioSourceOptions extends StObject {
  
  /* standard dom */
  var mediaStreamTrack: org.scalajs.dom.MediaStreamTrack = js.native
}
object MediaStreamTrackAudioSourceOptions {
  
  @scala.inline
  def apply(mediaStreamTrack: org.scalajs.dom.MediaStreamTrack): MediaStreamTrackAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStreamTrack = mediaStreamTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackAudioSourceOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MediaStreamTrackAudioSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaStreamTrack(value: org.scalajs.dom.MediaStreamTrack): Self = StObject.set(x, "mediaStreamTrack", value.asInstanceOf[js.Any])
  }
}
