package web.typings.antd.esTableInterfaceMod

import web.typings.antd.esTableHooksUseSelectionMod.INTERNAL_SELECTION_ITEM
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionItem
  extends StObject
     with INTERNAL_SELECTION_ITEM {
  
  var key: String = js.native
  
  var onSelect: js.UndefOr[SelectionItemSelectFn] = js.native
  
  var text: ReactElement = js.native
}
object SelectionItem {
  
  @scala.inline
  def apply(key: String, text: ReactElement): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionItem]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SelectionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelect(value: /* currentRowKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
