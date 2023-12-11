package web.typings.rcImage

import web.typings.rcImage.anon.IsTouching
import web.typings.rcImage.libHooksUseImageTransformMod.DispatchZoomChangeFunc
import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import web.typings.rcImage.libHooksUseImageTransformMod.UpdateTransformFunc
import web.typings.react.mod.MutableRefObject
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseTouchEventMod {
  
  @JSImport("rc-image/lib/hooks/useTouchEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    imgRef: MutableRefObject[HTMLImageElement],
    movable: Boolean,
    visible: Boolean,
    minScale: Double,
    transform: TransformType,
    updateTransform: UpdateTransformFunc,
    dispatchZoomChange: DispatchZoomChangeFunc
  ): IsTouching = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imgRef.asInstanceOf[js.Any], movable.asInstanceOf[js.Any], visible.asInstanceOf[js.Any], minScale.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], updateTransform.asInstanceOf[js.Any], dispatchZoomChange.asInstanceOf[js.Any])).asInstanceOf[IsTouching]
}
