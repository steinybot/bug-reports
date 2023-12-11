package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownClassName extends StObject {
  
  var dropdownClassName: js.UndefOr[String] = js.native
  
  var popupClassName: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
}
object DropdownClassName {
  
  @scala.inline
  def apply(): DropdownClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownClassName]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DropdownClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
  }
}
