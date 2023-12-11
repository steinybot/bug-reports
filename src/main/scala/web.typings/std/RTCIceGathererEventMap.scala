package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceGathererEventMap extends StObject {
  
  /* standard dom */
  var error: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var localcandidate: RTCIceGathererEvent = js.native
}
object RTCIceGathererEventMap {
  
  @scala.inline
  def apply(error: org.scalajs.dom.Event, localcandidate: RTCIceGathererEvent): RTCIceGathererEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], localcandidate = localcandidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceGathererEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCIceGathererEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalcandidate(value: RTCIceGathererEvent): Self = StObject.set(x, "localcandidate", value.asInstanceOf[js.Any])
  }
}
