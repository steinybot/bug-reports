package web.typings.rcImage

import web.typings.rcImage.anon.Action
import web.typings.rcImage.anon.DispatchZoomChange
import web.typings.rcImage.anon.PartialTransformType
import web.typings.react.mod.MutableRefObject
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseImageTransformMod {
  
  @JSImport("rc-image/lib/hooks/useImageTransform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    imgRef: MutableRefObject[HTMLImageElement],
    minScale: Double,
    maxScale: Double,
    onTransform: js.Function1[/* info */ Action, Unit]
  ): DispatchZoomChange = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imgRef.asInstanceOf[js.Any], minScale.asInstanceOf[js.Any], maxScale.asInstanceOf[js.Any], onTransform.asInstanceOf[js.Any])).asInstanceOf[DispatchZoomChange]
  
  type DispatchZoomChangeFunc = js.Function5[
    /* ratio */ Double, 
    /* action */ TransformAction, 
    /* centerX */ js.UndefOr[Double], 
    /* centerY */ js.UndefOr[Double], 
    /* isTouch */ js.UndefOr[Boolean], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcImage.rcImageStrings.flipY
    - `web.typings`.rcImage.rcImageStrings.flipX
    - `web.typings`.rcImage.rcImageStrings.rotateLeft
    - `web.typings`.rcImage.rcImageStrings.rotateRight
    - `web.typings`.rcImage.rcImageStrings.zoomIn
    - `web.typings`.rcImage.rcImageStrings.zoomOut
    - `web.typings`.rcImage.rcImageStrings.close
    - `web.typings`.rcImage.rcImageStrings.prev
    - `web.typings`.rcImage.rcImageStrings.next
    - `web.typings`.rcImage.rcImageStrings.wheel
    - `web.typings`.rcImage.rcImageStrings.doubleClick
    - `web.typings`.rcImage.rcImageStrings.move
    - `web.typings`.rcImage.rcImageStrings.dragRebound
    - `web.typings`.rcImage.rcImageStrings.touchZoom
  */
  trait TransformAction extends StObject
  object TransformAction {
    
    @scala.inline
    def close: web.typings.rcImage.rcImageStrings.close = "close".asInstanceOf[web.typings.rcImage.rcImageStrings.close]
    
    @scala.inline
    def doubleClick: web.typings.rcImage.rcImageStrings.doubleClick = "doubleClick".asInstanceOf[web.typings.rcImage.rcImageStrings.doubleClick]
    
    @scala.inline
    def dragRebound: web.typings.rcImage.rcImageStrings.dragRebound = "dragRebound".asInstanceOf[web.typings.rcImage.rcImageStrings.dragRebound]
    
    @scala.inline
    def flipX: web.typings.rcImage.rcImageStrings.flipX = "flipX".asInstanceOf[web.typings.rcImage.rcImageStrings.flipX]
    
    @scala.inline
    def flipY: web.typings.rcImage.rcImageStrings.flipY = "flipY".asInstanceOf[web.typings.rcImage.rcImageStrings.flipY]
    
    @scala.inline
    def move: web.typings.rcImage.rcImageStrings.move = "move".asInstanceOf[web.typings.rcImage.rcImageStrings.move]
    
    @scala.inline
    def next: web.typings.rcImage.rcImageStrings.next = "next".asInstanceOf[web.typings.rcImage.rcImageStrings.next]
    
    @scala.inline
    def prev: web.typings.rcImage.rcImageStrings.prev = "prev".asInstanceOf[web.typings.rcImage.rcImageStrings.prev]
    
    @scala.inline
    def rotateLeft: web.typings.rcImage.rcImageStrings.rotateLeft = "rotateLeft".asInstanceOf[web.typings.rcImage.rcImageStrings.rotateLeft]
    
    @scala.inline
    def rotateRight: web.typings.rcImage.rcImageStrings.rotateRight = "rotateRight".asInstanceOf[web.typings.rcImage.rcImageStrings.rotateRight]
    
    @scala.inline
    def touchZoom: web.typings.rcImage.rcImageStrings.touchZoom = "touchZoom".asInstanceOf[web.typings.rcImage.rcImageStrings.touchZoom]
    
    @scala.inline
    def wheel: web.typings.rcImage.rcImageStrings.wheel = "wheel".asInstanceOf[web.typings.rcImage.rcImageStrings.wheel]
    
    @scala.inline
    def zoomIn: web.typings.rcImage.rcImageStrings.zoomIn = "zoomIn".asInstanceOf[web.typings.rcImage.rcImageStrings.zoomIn]
    
    @scala.inline
    def zoomOut: web.typings.rcImage.rcImageStrings.zoomOut = "zoomOut".asInstanceOf[web.typings.rcImage.rcImageStrings.zoomOut]
  }
  
  @js.native
  trait TransformType extends StObject {
    
    var flipX: Boolean = js.native
    
    var flipY: Boolean = js.native
    
    var rotate: Double = js.native
    
    var scale: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object TransformType {
    
    @scala.inline
    def apply(flipX: Boolean, flipY: Boolean, rotate: Double, scale: Double, x: Double, y: Double): TransformType = {
      val __obj = js.Dynamic.literal(flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransformType] (val x: Self) extends AnyVal {
      
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
  
  type UpdateTransformFunc = js.Function2[/* newTransform */ PartialTransformType, /* action */ TransformAction, Unit]
}
