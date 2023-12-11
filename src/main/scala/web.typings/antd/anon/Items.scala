package web.typings.antd.anon

import web.typings.antd.esBreadcrumbBreadcrumbItemMod.MenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends StObject {
  
  var items: js.UndefOr[js.Array[MenuItem]] = js.native
}
object Items {
  
  @scala.inline
  def apply(): Items = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[MenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: MenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
