package web.typings.antd.esTableInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SorterResult[RecordType] extends StObject {
  
  var column: js.UndefOr[ColumnType[RecordType]] = js.native
  
  var columnKey: js.UndefOr[Key] = js.native
  
  var field: js.UndefOr[Key | js.Array[Key]] = js.native
  
  var order: js.UndefOr[SortOrder] = js.native
}
object SorterResult {
  
  @scala.inline
  def apply[RecordType](): SorterResult[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SorterResult[RecordType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SorterResult[_], RecordType] (val x: Self with SorterResult[RecordType]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setField(value: Key | js.Array[Key]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFieldVarargs(value: Key*): Self = StObject.set(x, "field", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
