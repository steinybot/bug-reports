package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowDistance extends StObject {
  
  var arrowDistance: js.UndefOr[Double] = js.native
  
  var arrowPlacement: js.UndefOr[Bottom] = js.native
}
object ArrowDistance {
  
  @scala.inline
  def apply(): ArrowDistance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowDistance]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ArrowDistance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowDistance(value: Double): Self = StObject.set(x, "arrowDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowDistanceUndefined: Self = StObject.set(x, "arrowDistance", js.undefined)
    
    @scala.inline
    def setArrowPlacement(value: Bottom): Self = StObject.set(x, "arrowPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowPlacementUndefined: Self = StObject.set(x, "arrowPlacement", js.undefined)
  }
}
