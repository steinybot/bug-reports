package web.typings.std.global

import web.typings.std.PermissionState
import org.scalajs.dom.DeviceMotionEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DeviceMotionEvent")
@js.native
class DeviceMotionEvent protected ()
  extends StObject
     with web.typings.std.DeviceMotionEvent {
  /* standard dom */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceMotionEventInit) = this()
}
object DeviceMotionEvent {
  
  @JSGlobal("DeviceMotionEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def requestPermission(): js.Promise[PermissionState] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")().asInstanceOf[js.Promise[PermissionState]]
}
