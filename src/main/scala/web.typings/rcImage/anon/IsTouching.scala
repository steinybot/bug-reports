package web.typings.rcImage.anon

import org.scalajs.dom.HTMLImageElement
import slinky.web.SyntheticTouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsTouching extends StObject {
  
  var isTouching: Boolean = js.native
  
  def onTouchEnd(): Unit = js.native
  
  def onTouchMove(event: SyntheticTouchEvent[HTMLImageElement]): Unit = js.native
  
  def onTouchStart(event: SyntheticTouchEvent[HTMLImageElement]): Unit = js.native
}
object IsTouching {
  
  @scala.inline
  def apply(
    isTouching: Boolean,
    onTouchEnd: () => Unit,
    onTouchMove: SyntheticTouchEvent[HTMLImageElement] => Unit,
    onTouchStart: SyntheticTouchEvent[HTMLImageElement] => Unit
  ): IsTouching = {
    val __obj = js.Dynamic.literal(isTouching = isTouching.asInstanceOf[js.Any], onTouchEnd = js.Any.fromFunction0(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[IsTouching]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: IsTouching] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTouching(value: Boolean): Self = StObject.set(x, "isTouching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEnd(value: () => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[HTMLImageElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
  }
}
