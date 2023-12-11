package web.typings.std.global

import web.typings.std.PermissionState
import org.scalajs.dom.DeviceOrientationEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DeviceOrientationEvent")
@js.native
class DeviceOrientationEvent protected ()
  extends StObject
     with web.typings.std.DeviceOrientationEvent {
  /* standard dom */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceOrientationEventInit) = this()
}
object DeviceOrientationEvent {
  
  @JSGlobal("DeviceOrientationEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def requestPermission(): js.Promise[PermissionState] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")().asInstanceOf[js.Promise[PermissionState]]
}
