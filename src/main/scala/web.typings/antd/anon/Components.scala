package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components extends StObject {
  
  var components: Picker = js.native
}
object Components {
  
  @scala.inline
  def apply(components: Picker): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: Picker): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
  }
}
