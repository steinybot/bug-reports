package web.typings.rcImage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlipX extends StObject {
  
  var flipX: Boolean = js.native
  
  var flipY: Boolean = js.native
  
  var rotate: Double = js.native
  
  var scale: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object FlipX {
  
  @scala.inline
  def apply(flipX: Boolean, flipY: Boolean, rotate: Double, scale: Double, x: Double, y: Double): FlipX = {
    val __obj = js.Dynamic.literal(flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipX]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FlipX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
