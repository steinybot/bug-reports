package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioProcessingEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var inputBuffer: org.scalajs.dom.AudioBuffer = js.native
  
  /* standard dom */
  var outputBuffer: org.scalajs.dom.AudioBuffer = js.native
  
  /* standard dom */
  var playbackTime: Double = js.native
}
object AudioProcessingEventInit {
  
  @scala.inline
  def apply(
    inputBuffer: org.scalajs.dom.AudioBuffer,
    outputBuffer: org.scalajs.dom.AudioBuffer,
    playbackTime: Double
  ): AudioProcessingEventInit = {
    val __obj = js.Dynamic.literal(inputBuffer = inputBuffer.asInstanceOf[js.Any], outputBuffer = outputBuffer.asInstanceOf[js.Any], playbackTime = playbackTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioProcessingEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AudioProcessingEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputBuffer(value: org.scalajs.dom.AudioBuffer): Self = StObject.set(x, "inputBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBuffer(value: org.scalajs.dom.AudioBuffer): Self = StObject.set(x, "outputBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackTime(value: Double): Self = StObject.set(x, "playbackTime", value.asInstanceOf[js.Any])
  }
}
