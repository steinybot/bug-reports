package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamConstraints extends StObject {
  
  /* standard dom */
  var audio: js.UndefOr[scala.Boolean | org.scalajs.dom.MediaTrackConstraints] = js.native
  
  /* standard dom */
  var peerIdentity: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var video: js.UndefOr[scala.Boolean | org.scalajs.dom.MediaTrackConstraints] = js.native
}
object MediaStreamConstraints {
  
  @scala.inline
  def apply(): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamConstraints]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MediaStreamConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: scala.Boolean | org.scalajs.dom.MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setPeerIdentity(value: java.lang.String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    
    @scala.inline
    def setVideo(value: scala.Boolean | org.scalajs.dom.MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
