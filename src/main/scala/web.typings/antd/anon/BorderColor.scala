package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderColor extends StObject {
  
  var borderColor: String = js.native
  
  var borderInlineEndWidth: Double = js.native
  
  var boxShadow: String = js.native
  
  var outline: Double = js.native
}
object BorderColor {
  
  @scala.inline
  def apply(borderColor: String, borderInlineEndWidth: Double, boxShadow: String, outline: Double): BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderInlineEndWidth = borderInlineEndWidth.asInstanceOf[js.Any], boxShadow = boxShadow.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColor]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: BorderColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineEndWidth(value: Double): Self = StObject.set(x, "borderInlineEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: Double): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
