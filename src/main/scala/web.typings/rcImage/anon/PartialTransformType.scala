package web.typings.rcImage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-image.rc-image/lib/hooks/useImageTransform.TransformType> */
@js.native
trait PartialTransformType extends StObject {
  
  var flipX: js.UndefOr[Boolean] = js.native
  
  var flipY: js.UndefOr[Boolean] = js.native
  
  var rotate: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object PartialTransformType {
  
  @scala.inline
  def apply(): PartialTransformType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTransformType]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialTransformType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
    
    @scala.inline
    def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
