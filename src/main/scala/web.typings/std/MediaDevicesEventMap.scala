package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaDevicesEventMap extends StObject {
  
  /* standard dom */
  var devicechange: org.scalajs.dom.Event = js.native
}
object MediaDevicesEventMap {
  
  @scala.inline
  def apply(devicechange: org.scalajs.dom.Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MediaDevicesEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "devicechange", value.asInstanceOf[js.Any])
  }
}
