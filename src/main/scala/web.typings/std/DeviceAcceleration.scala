package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the amount of acceleration the device is experiencing along all three axes. */
@js.native
trait DeviceAcceleration extends StObject {
  
  /* standard dom */
  val x: Double | Null = js.native
  
  /* standard dom */
  val y: Double | Null = js.native
  
  /* standard dom */
  val z: Double | Null = js.native
}
object DeviceAcceleration {
  
  @scala.inline
  def apply(): DeviceAcceleration = {
    val __obj = js.Dynamic.literal(x = null, y = null, z = null)
    __obj.asInstanceOf[DeviceAcceleration]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DeviceAcceleration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXNull: Self = StObject.set(x, "x", null)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZNull: Self = StObject.set(x, "z", null)
  }
}
