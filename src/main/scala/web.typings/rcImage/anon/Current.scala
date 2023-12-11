package web.typings.rcImage.anon

import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends StObject {
  
  var current: js.UndefOr[Double] = js.native
  
  var transform: TransformType = js.native
}
object Current {
  
  @scala.inline
  def apply(transform: TransformType): Current = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setTransform(value: TransformType): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
