package web.typings.rcTable.anon

import web.typings.rcTable.libFooterSummaryContextMod.FlattenColumns
import web.typings.rcTable.libInterfaceMod.ColumnGroupType
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends StObject {
  
  var columns: js.UndefOr[ColumnsType[Any]] = js.native
  
  var flattenColumns: js.UndefOr[FlattenColumns[Any]] = js.native
  
  var scrollColumnIndex: js.UndefOr[Double] = js.native
  
  var stickyOffsets: js.UndefOr[StickyOffsets] = js.native
}
object Columns {
  
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: ColumnsType[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (ColumnGroupType[Any] | ColumnType[Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setFlattenColumns(value: FlattenColumns[Any]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenColumnsUndefined: Self = StObject.set(x, "flattenColumns", js.undefined)
    
    @scala.inline
    def setFlattenColumnsVarargs(value: (ColumnType[Any] with Scrollbar)*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
    
    @scala.inline
    def setScrollColumnIndex(value: Double): Self = StObject.set(x, "scrollColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollColumnIndexUndefined: Self = StObject.set(x, "scrollColumnIndex", js.undefined)
    
    @scala.inline
    def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyOffsetsUndefined: Self = StObject.set(x, "stickyOffsets", js.undefined)
  }
}
