package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverEntry extends StObject {
  
  /* standard dom */
  val borderBoxSize: js.Array[ResizeObserverSize] = js.native
  
  /* standard dom */
  val contentBoxSize: js.Array[ResizeObserverSize] = js.native
  
  /* standard dom */
  val contentRect: DOMRectReadOnly = js.native
  
  /* standard dom */
  val target: org.scalajs.dom.Element = js.native
}
object ResizeObserverEntry {
  
  @scala.inline
  def apply(
    borderBoxSize: js.Array[ResizeObserverSize],
    contentBoxSize: js.Array[ResizeObserverSize],
    contentRect: DOMRectReadOnly,
    target: org.scalajs.dom.Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "borderBoxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "borderBoxSize", js.Array(value :_*))
    
    @scala.inline
    def setContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "contentBoxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "contentBoxSize", js.Array(value :_*))
    
    @scala.inline
    def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
