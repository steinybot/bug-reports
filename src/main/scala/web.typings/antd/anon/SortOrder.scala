package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortOrder extends StObject {
  
  var sortOrder: web.typings.antd.esTableInterfaceMod.SortOrder = js.native
}
object SortOrder {
  
  @scala.inline
  def apply(): SortOrder = {
    val __obj = js.Dynamic.literal(sortOrder = null)
    __obj.asInstanceOf[SortOrder]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SortOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSortOrder(value: web.typings.antd.esTableInterfaceMod.SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
  }
}
