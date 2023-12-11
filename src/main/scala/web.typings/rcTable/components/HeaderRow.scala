package web.typings.rcTable.components

import web.typings.StBuildingComponent
import web.typings.rcTable.libHeaderHeaderRowMod.RowProps
import web.typings.rcTable.libInterfaceMod.CellType
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.CustomizeComponent
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.TdHTMLAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderRow {
  
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent,
    cells: js.Array[CellType[RecordType]],
    flattenColumns: js.Array[ColumnType[RecordType]],
    index: Double,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any],
    rowComponent: CustomizeComponent,
    stickyOffsets: StickyOffsets,
    tdCellComponent: CustomizeComponent
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), rowComponent = rowComponent.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any], tdCellComponent = tdCellComponent.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[RowProps[RecordType]]))
  }
  
  @JSImport("rc-table/lib/Header/HeaderRow", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RecordType] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  type Props[RecordType] = RowProps[RecordType]
  
  def withProps[RecordType](p: RowProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
