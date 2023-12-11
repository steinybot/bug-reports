package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowPointAtCenter extends StObject {
  
  /** @deprecated Please use `pointAtCenter` instead. */
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
  
  var pointAtCenter: js.UndefOr[Boolean] = js.native
}
object ArrowPointAtCenter {
  
  @scala.inline
  def apply(): ArrowPointAtCenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowPointAtCenter]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ArrowPointAtCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowPointAtCenter(value: Boolean): Self = StObject.set(x, "arrowPointAtCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowPointAtCenterUndefined: Self = StObject.set(x, "arrowPointAtCenter", js.undefined)
    
    @scala.inline
    def setPointAtCenter(value: Boolean): Self = StObject.set(x, "pointAtCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointAtCenterUndefined: Self = StObject.set(x, "pointAtCenter", js.undefined)
  }
}
