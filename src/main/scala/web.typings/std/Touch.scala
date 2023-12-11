package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad. */
@js.native
trait Touch extends StObject {
  
  /* standard dom */
  val altitudeAngle: Double = js.native
  
  /* standard dom */
  val azimuthAngle: Double = js.native
  
  /* standard dom */
  val clientX: Double = js.native
  
  /* standard dom */
  val clientY: Double = js.native
  
  /* standard dom */
  val force: Double = js.native
  
  /* standard dom */
  val identifier: Double = js.native
  
  /* standard dom */
  val pageX: Double = js.native
  
  /* standard dom */
  val pageY: Double = js.native
  
  /* standard dom */
  val radiusX: Double = js.native
  
  /* standard dom */
  val radiusY: Double = js.native
  
  /* standard dom */
  val rotationAngle: Double = js.native
  
  /* standard dom */
  val screenX: Double = js.native
  
  /* standard dom */
  val screenY: Double = js.native
  
  /* standard dom */
  val target: org.scalajs.dom.EventTarget = js.native
  
  /* standard dom */
  val touchType: TouchType = js.native
}
object Touch {
  
  @scala.inline
  def apply(
    altitudeAngle: Double,
    azimuthAngle: Double,
    clientX: Double,
    clientY: Double,
    force: Double,
    identifier: Double,
    pageX: Double,
    pageY: Double,
    radiusX: Double,
    radiusY: Double,
    rotationAngle: Double,
    screenX: Double,
    screenY: Double,
    target: org.scalajs.dom.EventTarget,
    touchType: TouchType
  ): Touch = {
    val __obj = js.Dynamic.literal(altitudeAngle = altitudeAngle.asInstanceOf[js.Any], azimuthAngle = azimuthAngle.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], touchType = touchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Touch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeAngle(value: Double): Self = StObject.set(x, "altitudeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzimuthAngle(value: Double): Self = StObject.set(x, "azimuthAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchType(value: TouchType): Self = StObject.set(x, "touchType", value.asInstanceOf[js.Any])
  }
}
