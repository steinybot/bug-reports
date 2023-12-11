package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import web.typings.rcTable.libInterfaceMod.Direction
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import web.typings.rcTable.libUtilsFixUtilMod.FixedInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseFixedInfoMod {
  
  @JSImport("rc-table/lib/hooks/useFixedInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](
    flattenColumns: js.Array[ColumnType[RecordType]],
    stickyOffsets: StickyOffsets,
    direction: Direction,
    columns: ColumnsType[RecordType]
  ): js.Array[FixedInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(flattenColumns.asInstanceOf[js.Any], stickyOffsets.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Array[FixedInfo]]
}
