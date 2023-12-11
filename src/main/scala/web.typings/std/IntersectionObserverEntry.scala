package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
@js.native
trait IntersectionObserverEntry extends StObject {
  
  /* standard dom */
  val boundingClientRect: DOMRectReadOnly = js.native
  
  /* standard dom */
  val intersectionRatio: Double = js.native
  
  /* standard dom */
  val intersectionRect: DOMRectReadOnly = js.native
  
  /* standard dom */
  val isIntersecting: scala.Boolean = js.native
  
  /* standard dom */
  val rootBounds: DOMRectReadOnly | Null = js.native
  
  /* standard dom */
  val target: org.scalajs.dom.Element = js.native
  
  /* standard dom */
  val time: Double = js.native
}
object IntersectionObserverEntry {
  
  @scala.inline
  def apply(
    boundingClientRect: DOMRectReadOnly,
    intersectionRatio: Double,
    intersectionRect: DOMRectReadOnly,
    isIntersecting: scala.Boolean,
    target: org.scalajs.dom.Element,
    time: Double
  ): IntersectionObserverEntry = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], rootBounds = null)
    __obj.asInstanceOf[IntersectionObserverEntry]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: IntersectionObserverEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingClientRect(value: DOMRectReadOnly): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRect(value: DOMRectReadOnly): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIntersecting(value: scala.Boolean): Self = StObject.set(x, "isIntersecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBounds(value: DOMRectReadOnly): Self = StObject.set(x, "rootBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBoundsNull: Self = StObject.set(x, "rootBounds", null)
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
