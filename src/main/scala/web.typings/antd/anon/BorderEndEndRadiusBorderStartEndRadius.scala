package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderEndEndRadiusBorderStartEndRadius extends StObject {
  
  var borderEndEndRadius: Double = js.native
  
  var borderStartEndRadius: scala.Unit = js.native
}
object BorderEndEndRadiusBorderStartEndRadius {
  
  @scala.inline
  def apply(borderEndEndRadius: Double, borderStartEndRadius: scala.Unit): BorderEndEndRadiusBorderStartEndRadius = {
    val __obj = js.Dynamic.literal(borderEndEndRadius = borderEndEndRadius.asInstanceOf[js.Any], borderStartEndRadius = borderStartEndRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderEndEndRadiusBorderStartEndRadius]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: BorderEndEndRadiusBorderStartEndRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderEndEndRadius(value: Double): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStartEndRadius(value: scala.Unit): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
  }
}
