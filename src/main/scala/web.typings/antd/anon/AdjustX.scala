package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustX extends StObject {
  
  var adjustX: js.UndefOr[Double | Boolean] = js.native
  
  var adjustY: js.UndefOr[Double | Boolean] = js.native
  
  var shiftX: js.UndefOr[Double | Boolean] = js.native
  
  var shiftY: js.UndefOr[Double | Boolean] = js.native
}
object AdjustX {
  
  @scala.inline
  def apply(): AdjustX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustX]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustX(value: Double | Boolean): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
    
    @scala.inline
    def setAdjustY(value: Double | Boolean): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
    
    @scala.inline
    def setShiftX(value: Double | Boolean): Self = StObject.set(x, "shiftX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftXUndefined: Self = StObject.set(x, "shiftX", js.undefined)
    
    @scala.inline
    def setShiftY(value: Double | Boolean): Self = StObject.set(x, "shiftY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftYUndefined: Self = StObject.set(x, "shiftY", js.undefined)
  }
}
