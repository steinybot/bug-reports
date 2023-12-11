package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Open extends StObject {
  
  var open: Boolean = js.native
  
  var showSearch: Boolean = js.native
}
object Open {
  
  @scala.inline
  def apply(open: Boolean, showSearch: Boolean): Open = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
  }
}
