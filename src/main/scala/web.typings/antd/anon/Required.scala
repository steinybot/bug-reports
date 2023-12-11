package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Required extends StObject {
  
  var required: Boolean = js.native
}
object Required {
  
  @scala.inline
  def apply(required: Boolean): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
