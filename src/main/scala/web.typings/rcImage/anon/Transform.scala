package web.typings.rcImage.anon

import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends StObject {
  
  var transform: TransformType = js.native
}
object Transform {
  
  @scala.inline
  def apply(transform: TransformType): Transform = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransform(value: TransformType): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
