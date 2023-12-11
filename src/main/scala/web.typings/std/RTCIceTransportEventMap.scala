package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceTransportEventMap extends StObject {
  
  /* standard dom */
  var gatheringstatechange: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var selectedcandidatepairchange: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var statechange: org.scalajs.dom.Event = js.native
}
object RTCIceTransportEventMap {
  
  @scala.inline
  def apply(
    gatheringstatechange: org.scalajs.dom.Event,
    selectedcandidatepairchange: org.scalajs.dom.Event,
    statechange: org.scalajs.dom.Event
  ): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], selectedcandidatepairchange = selectedcandidatepairchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCIceTransportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatheringstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "gatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedcandidatepairchange(value: org.scalajs.dom.Event): Self = StObject.set(x, "selectedcandidatepairchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
