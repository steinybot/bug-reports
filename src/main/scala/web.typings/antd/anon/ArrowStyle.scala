package web.typings.antd.anon

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowStyle extends StObject {
  
  var arrowStyle: CSSProperties = js.native
  
  var className: String = js.native
  
  var overlayStyle: CSSProperties = js.native
}
object ArrowStyle {
  
  @scala.inline
  def apply(arrowStyle: CSSProperties, className: String, overlayStyle: CSSProperties): ArrowStyle = {
    val __obj = js.Dynamic.literal(arrowStyle = arrowStyle.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], overlayStyle = overlayStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowStyle]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ArrowStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowStyle(value: CSSProperties): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
  }
}
