package web.typings.rcImage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFlipX extends StObject {
  
  def onFlipX(): Unit = js.native
  
  def onFlipY(): Unit = js.native
  
  def onRotateLeft(): Unit = js.native
  
  def onRotateRight(): Unit = js.native
  
  def onZoomIn(): Unit = js.native
  
  def onZoomOut(): Unit = js.native
}
object OnFlipX {
  
  @scala.inline
  def apply(
    onFlipX: () => Unit,
    onFlipY: () => Unit,
    onRotateLeft: () => Unit,
    onRotateRight: () => Unit,
    onZoomIn: () => Unit,
    onZoomOut: () => Unit
  ): OnFlipX = {
    val __obj = js.Dynamic.literal(onFlipX = js.Any.fromFunction0(onFlipX), onFlipY = js.Any.fromFunction0(onFlipY), onRotateLeft = js.Any.fromFunction0(onRotateLeft), onRotateRight = js.Any.fromFunction0(onRotateRight), onZoomIn = js.Any.fromFunction0(onZoomIn), onZoomOut = js.Any.fromFunction0(onZoomOut))
    __obj.asInstanceOf[OnFlipX]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OnFlipX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnFlipX(value: () => Unit): Self = StObject.set(x, "onFlipX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFlipY(value: () => Unit): Self = StObject.set(x, "onFlipY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRotateLeft(value: () => Unit): Self = StObject.set(x, "onRotateLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRotateRight(value: () => Unit): Self = StObject.set(x, "onRotateRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnZoomIn(value: () => Unit): Self = StObject.set(x, "onZoomIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnZoomOut(value: () => Unit): Self = StObject.set(x, "onZoomOut", js.Any.fromFunction0(value))
  }
}
