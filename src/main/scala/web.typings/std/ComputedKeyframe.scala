package web.typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedKeyframe
  extends StObject
     with /* standard dom */
/* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  
  /* standard dom */
  var composite: CompositeOperationOrAuto = js.native
  
  /* standard dom */
  var computedOffset: Double = js.native
  
  /* standard dom */
  var easing: java.lang.String = js.native
  
  /* standard dom */
  var offset: Double | Null = js.native
}
object ComputedKeyframe {
  
  @scala.inline
  def apply(composite: CompositeOperationOrAuto, computedOffset: Double, easing: java.lang.String): ComputedKeyframe = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], computedOffset = computedOffset.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], offset = null)
    __obj.asInstanceOf[ComputedKeyframe]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComputedKeyframe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComposite(value: CompositeOperationOrAuto): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedOffset(value: Double): Self = StObject.set(x, "computedOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNull: Self = StObject.set(x, "offset", null)
  }
}
