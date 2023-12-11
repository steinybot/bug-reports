package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMotionEventAccelerationInit extends StObject {
  
  /* standard dom */
  var x: js.UndefOr[Double | Null] = js.native
  
  /* standard dom */
  var y: js.UndefOr[Double | Null] = js.native
  
  /* standard dom */
  var z: js.UndefOr[Double | Null] = js.native
}
object DeviceMotionEventAccelerationInit {
  
  @scala.inline
  def apply(): DeviceMotionEventAccelerationInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventAccelerationInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DeviceMotionEventAccelerationInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXNull: Self = StObject.set(x, "x", null)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZNull: Self = StObject.set(x, "z", null)
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
