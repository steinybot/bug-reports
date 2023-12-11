package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserverEntryInit extends StObject {
  
  /* standard dom */
  var boundingClientRect: DOMRectInit = js.native
  
  /* standard dom */
  var intersectionRatio: Double = js.native
  
  /* standard dom */
  var intersectionRect: DOMRectInit = js.native
  
  /* standard dom */
  var isIntersecting: scala.Boolean = js.native
  
  /* standard dom */
  var rootBounds: DOMRectInit | Null = js.native
  
  /* standard dom */
  var target: org.scalajs.dom.Element = js.native
  
  /* standard dom */
  var time: Double = js.native
}
object IntersectionObserverEntryInit {
  
  @scala.inline
  def apply(
    boundingClientRect: DOMRectInit,
    intersectionRatio: Double,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    target: org.scalajs.dom.Element,
    time: Double
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], rootBounds = null)
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: IntersectionObserverEntryInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingClientRect(value: DOMRectInit): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRect(value: DOMRectInit): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIntersecting(value: scala.Boolean): Self = StObject.set(x, "isIntersecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBounds(value: DOMRectInit): Self = StObject.set(x, "rootBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBoundsNull: Self = StObject.set(x, "rootBounds", null)
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
