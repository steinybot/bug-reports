package web.typings.antd.esTableInterfaceMod

import web.typings.antd.anon.Order
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnTitleProps[RecordType] extends StObject {
  
  var filters: js.UndefOr[Record[String, FilterValue]] = js.native
  
  /** @deprecated Please use `sorterColumns` instead. */
  var sortColumn: js.UndefOr[ColumnType[RecordType]] = js.native
  
  var sortColumns: js.UndefOr[js.Array[Order[RecordType]]] = js.native
  
  /** @deprecated Please use `sorterColumns` instead. */
  var sortOrder: js.UndefOr[SortOrder] = js.native
}
object ColumnTitleProps {
  
  @scala.inline
  def apply[RecordType](): ColumnTitleProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTitleProps[RecordType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ColumnTitleProps[_], RecordType] (val x: Self with ColumnTitleProps[RecordType]) extends AnyVal {
    
    @scala.inline
    def setFilters(value: Record[String, FilterValue]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setSortColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
    
    @scala.inline
    def setSortColumns(value: js.Array[Order[RecordType]]): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColumnsUndefined: Self = StObject.set(x, "sortColumns", js.undefined)
    
    @scala.inline
    def setSortColumnsVarargs(value: Order[RecordType]*): Self = StObject.set(x, "sortColumns", js.Array(value :_*))
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
