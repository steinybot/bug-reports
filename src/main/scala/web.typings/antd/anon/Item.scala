package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
  var item: String = js.native
}
object Item {
  
  @scala.inline
  def apply(item: String): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
