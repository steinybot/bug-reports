package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColor extends StObject {
  
  var backgroundColor: String = js.native
  
  var borderColor: String = js.native
  
  var boxShadow: String = js.native
  
  var outline: Double = js.native
}
object BackgroundColor {
  
  @scala.inline
  def apply(backgroundColor: String, borderColor: String, boxShadow: String, outline: Double): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], boxShadow = boxShadow.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: Double): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
