package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseBtnHoverBg extends StObject {
  
  var closeBtnHoverBg: String = js.native
  
  var width: Double = js.native
  
  var zIndexPopup: Double = js.native
}
object CloseBtnHoverBg {
  
  @scala.inline
  def apply(closeBtnHoverBg: String, width: Double, zIndexPopup: Double): CloseBtnHoverBg = {
    val __obj = js.Dynamic.literal(closeBtnHoverBg = closeBtnHoverBg.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseBtnHoverBg]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: CloseBtnHoverBg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseBtnHoverBg(value: String): Self = StObject.set(x, "closeBtnHoverBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
  }
}
