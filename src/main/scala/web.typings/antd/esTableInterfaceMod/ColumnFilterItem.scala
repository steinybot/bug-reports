package web.typings.antd.esTableInterfaceMod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFilterItem extends StObject {
  
  var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
  
  var text: ReactElement = js.native
  
  var value: web.typings.react.mod.Key | Boolean = js.native
}
object ColumnFilterItem {
  
  @scala.inline
  def apply(text: ReactElement, value: web.typings.react.mod.Key | Boolean): ColumnFilterItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterItem]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ColumnFilterItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: web.typings.react.mod.Key | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
