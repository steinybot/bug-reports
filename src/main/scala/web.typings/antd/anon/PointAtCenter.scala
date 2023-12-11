package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointAtCenter extends StObject {
  
  var pointAtCenter: Boolean = js.native
}
object PointAtCenter {
  
  @scala.inline
  def apply(pointAtCenter: Boolean): PointAtCenter = {
    val __obj = js.Dynamic.literal(pointAtCenter = pointAtCenter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointAtCenter]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PointAtCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointAtCenter(value: Boolean): Self = StObject.set(x, "pointAtCenter", value.asInstanceOf[js.Any])
  }
}
