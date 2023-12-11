package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioContextInfo extends StObject {
  
  /* standard dom */
  var currentTime: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var sampleRate: js.UndefOr[Double] = js.native
}
object AudioContextInfo {
  
  @scala.inline
  def apply(): AudioContextInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContextInfo]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AudioContextInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
