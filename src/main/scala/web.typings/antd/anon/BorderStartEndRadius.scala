package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderStartEndRadius extends StObject {
  
  var borderEndEndRadius: scala.Unit = js.native
  
  var borderStartEndRadius: Double = js.native
}
object BorderStartEndRadius {
  
  @scala.inline
  def apply(borderEndEndRadius: scala.Unit, borderStartEndRadius: Double): BorderStartEndRadius = {
    val __obj = js.Dynamic.literal(borderEndEndRadius = borderEndEndRadius.asInstanceOf[js.Any], borderStartEndRadius = borderStartEndRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStartEndRadius]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: BorderStartEndRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderEndEndRadius(value: scala.Unit): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStartEndRadius(value: Double): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
  }
}
