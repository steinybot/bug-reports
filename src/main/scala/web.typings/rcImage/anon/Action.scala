package web.typings.rcImage.anon

import web.typings.rcImage.libHooksUseImageTransformMod.TransformAction
import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
  var action: TransformAction = js.native
  
  var transform: TransformType = js.native
}
object Action {
  
  @scala.inline
  def apply(action: TransformAction, transform: TransformType): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: TransformAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: TransformType): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
