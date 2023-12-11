package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamAudioSourceOptions extends StObject {
  
  /* standard dom */
  var mediaStream: org.scalajs.dom.MediaStream = js.native
}
object MediaStreamAudioSourceOptions {
  
  @scala.inline
  def apply(mediaStream: org.scalajs.dom.MediaStream): MediaStreamAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStream = mediaStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MediaStreamAudioSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaStream(value: org.scalajs.dom.MediaStream): Self = StObject.set(x, "mediaStream", value.asInstanceOf[js.Any])
  }
}
