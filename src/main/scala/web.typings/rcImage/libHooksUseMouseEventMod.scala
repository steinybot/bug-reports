package web.typings.rcImage

import web.typings.rcImage.anon.IsMoving
import web.typings.rcImage.libHooksUseImageTransformMod.DispatchZoomChangeFunc
import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import web.typings.rcImage.libHooksUseImageTransformMod.UpdateTransformFunc
import web.typings.react.mod.MutableRefObject
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseMouseEventMod {
  
  @JSImport("rc-image/lib/hooks/useMouseEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    imgRef: MutableRefObject[HTMLImageElement],
    movable: Boolean,
    visible: Boolean,
    scaleStep: Double,
    transform: TransformType,
    updateTransform: UpdateTransformFunc,
    dispatchZoomChange: DispatchZoomChangeFunc
  ): IsMoving = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imgRef.asInstanceOf[js.Any], movable.asInstanceOf[js.Any], visible.asInstanceOf[js.Any], scaleStep.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], updateTransform.asInstanceOf[js.Any], dispatchZoomChange.asInstanceOf[js.Any])).asInstanceOf[IsMoving]
}
