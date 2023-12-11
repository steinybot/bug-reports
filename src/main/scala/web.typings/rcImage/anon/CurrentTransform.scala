package web.typings.rcImage.anon

import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentTransform extends StObject {
  
  var current: Double = js.native
  
  var transform: TransformType = js.native
}
object CurrentTransform {
  
  @scala.inline
  def apply(current: Double, transform: TransformType): CurrentTransform = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTransform]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: CurrentTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: TransformType): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
