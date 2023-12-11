package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderEndEndRadius extends StObject {
  
  var borderEndEndRadius: Double = js.native
  
  var borderStartEndRadius: Double = js.native
}
object BorderEndEndRadius {
  
  @scala.inline
  def apply(borderEndEndRadius: Double, borderStartEndRadius: Double): BorderEndEndRadius = {
    val __obj = js.Dynamic.literal(borderEndEndRadius = borderEndEndRadius.asInstanceOf[js.Any], borderStartEndRadius = borderStartEndRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderEndEndRadius]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: BorderEndEndRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderEndEndRadius(value: Double): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStartEndRadius(value: Double): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
  }
}
