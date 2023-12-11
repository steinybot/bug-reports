package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverBg extends StObject {
  
  var popoverBg: String = js.native
  
  var popoverColor: String = js.native
}
object PopoverBg {
  
  @scala.inline
  def apply(popoverBg: String, popoverColor: String): PopoverBg = {
    val __obj = js.Dynamic.literal(popoverBg = popoverBg.asInstanceOf[js.Any], popoverColor = popoverColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverBg]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PopoverBg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopoverBg(value: String): Self = StObject.set(x, "popoverBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverColor(value: String): Self = StObject.set(x, "popoverColor", value.asInstanceOf[js.Any])
  }
}
