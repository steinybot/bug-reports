package web.typings.rcImage.anon

import web.typings.rcImage.libHooksUseImageTransformMod.DispatchZoomChangeFunc
import web.typings.rcImage.libHooksUseImageTransformMod.TransformAction
import web.typings.rcImage.libHooksUseImageTransformMod.UpdateTransformFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatchZoomChange extends StObject {
  
  var dispatchZoomChange: DispatchZoomChangeFunc = js.native
  
  def resetTransform(action: TransformAction): Unit = js.native
  
  var transform: FlipX = js.native
  
  var updateTransform: UpdateTransformFunc = js.native
}
object DispatchZoomChange {
  
  @scala.inline
  def apply(
    dispatchZoomChange: (/* ratio */ Double, /* action */ TransformAction, /* centerX */ js.UndefOr[Double], /* centerY */ js.UndefOr[Double], /* isTouch */ js.UndefOr[Boolean]) => Unit,
    resetTransform: TransformAction => Unit,
    transform: FlipX,
    updateTransform: (/* newTransform */ PartialTransformType, /* action */ TransformAction) => Unit
  ): DispatchZoomChange = {
    val __obj = js.Dynamic.literal(dispatchZoomChange = js.Any.fromFunction5(dispatchZoomChange), resetTransform = js.Any.fromFunction1(resetTransform), transform = transform.asInstanceOf[js.Any], updateTransform = js.Any.fromFunction2(updateTransform))
    __obj.asInstanceOf[DispatchZoomChange]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DispatchZoomChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatchZoomChange(
      value: (/* ratio */ Double, /* action */ TransformAction, /* centerX */ js.UndefOr[Double], /* centerY */ js.UndefOr[Double], /* isTouch */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "dispatchZoomChange", js.Any.fromFunction5(value))
    
    @scala.inline
    def setResetTransform(value: TransformAction => Unit): Self = StObject.set(x, "resetTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransform(value: FlipX): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTransform(value: (/* newTransform */ PartialTransformType, /* action */ TransformAction) => Unit): Self = StObject.set(x, "updateTransform", js.Any.fromFunction2(value))
  }
}
