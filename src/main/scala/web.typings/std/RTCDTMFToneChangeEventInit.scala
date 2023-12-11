package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDTMFToneChangeEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var tone: js.UndefOr[java.lang.String] = js.native
}
object RTCDTMFToneChangeEventInit {
  
  @scala.inline
  def apply(): RTCDTMFToneChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDTMFToneChangeEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCDTMFToneChangeEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTone(value: java.lang.String): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToneUndefined: Self = StObject.set(x, "tone", js.undefined)
  }
}
