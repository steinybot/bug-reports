package web.typings.std

import web.typings.std.stdStrings.camera
import web.typings.std.stdStrings.microphone
import web.typings.std.stdStrings.speaker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicePermissionDescriptor
  extends StObject
     with PermissionDescriptor {
  
  /* standard dom */
  var deviceId: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  @JSName("name")
  var name_DevicePermissionDescriptor: camera | microphone | speaker = js.native
}
object DevicePermissionDescriptor {
  
  @scala.inline
  def apply(name: camera | microphone | speaker): DevicePermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePermissionDescriptor]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DevicePermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setName(value: camera | microphone | speaker): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
