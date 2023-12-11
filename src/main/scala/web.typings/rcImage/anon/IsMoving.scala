package web.typings.rcImage.anon

import web.typings.react.mod.MouseEventHandler
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLImageElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticWheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsMoving extends StObject {
  
  var isMoving: Boolean = js.native
  
  var onMouseDown: MouseEventHandler[HTMLDivElement] = js.native
  
  var onMouseMove: MouseEventHandler[HTMLBodyElement] = js.native
  
  var onMouseUp: MouseEventHandler[HTMLBodyElement] = js.native
  
  def onWheel(event: SyntheticWheelEvent[HTMLImageElement]): Unit = js.native
}
object IsMoving {
  
  @scala.inline
  def apply(
    isMoving: Boolean,
    onMouseDown: SyntheticMouseEvent[HTMLDivElement] => Unit,
    onMouseMove: SyntheticMouseEvent[HTMLBodyElement] => Unit,
    onMouseUp: SyntheticMouseEvent[HTMLBodyElement] => Unit,
    onWheel: SyntheticWheelEvent[HTMLImageElement] => Unit
  ): IsMoving = {
    val __obj = js.Dynamic.literal(isMoving = isMoving.asInstanceOf[js.Any], onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction1(onMouseUp), onWheel = js.Any.fromFunction1(onWheel))
    __obj.asInstanceOf[IsMoving]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: IsMoving] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMoving(value: Boolean): Self = StObject.set(x, "isMoving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMove(value: SyntheticMouseEvent[HTMLBodyElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[HTMLBodyElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheel(value: SyntheticWheelEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
  }
}
