package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMotionEventAcceleration extends StObject {
  
  /* standard dom */
  val x: Double | Null = js.native
  
  /* standard dom */
  val y: Double | Null = js.native
  
  /* standard dom */
  val z: Double | Null = js.native
}
object DeviceMotionEventAcceleration {
  
  @scala.inline
  def apply(): DeviceMotionEventAcceleration = {
    val __obj = js.Dynamic.literal(x = null, y = null, z = null)
    __obj.asInstanceOf[DeviceMotionEventAcceleration]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DeviceMotionEventAcceleration] (val x: Self) extends AnyVal {
    
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
