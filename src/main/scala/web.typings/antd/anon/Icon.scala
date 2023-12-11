package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends StObject {
  
  var icon: String = js.native
}
object Icon {
  
  @scala.inline
  def apply(icon: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
