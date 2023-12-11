package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDeviceInfo
  extends StObject
     with MediaDeviceInfo {
  
  /* standard dom */
  def getCapabilities(): MediaTrackCapabilities = js.native
}
object InputDeviceInfo {
  
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    getCapabilities: () => MediaTrackCapabilities,
    groupId: java.lang.String,
    kind: org.scalajs.dom.MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => Any
  ): InputDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], getCapabilities = js.Any.fromFunction0(getCapabilities), groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[InputDeviceInfo]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: InputDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCapabilities(value: () => MediaTrackCapabilities): Self = StObject.set(x, "getCapabilities", js.Any.fromFunction0(value))
  }
}
