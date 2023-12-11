package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Preview extends StObject {
  
  var preview: String = js.native
}
object Preview {
  
  @scala.inline
  def apply(preview: String): Preview = {
    val __obj = js.Dynamic.literal(preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preview]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Preview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
  }
}
