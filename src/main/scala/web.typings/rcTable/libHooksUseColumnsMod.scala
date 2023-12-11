package web.typings.rcTable

import web.typings.rcTable.anon.ClientWidth
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseColumnsMod {
  
  @JSImport("rc-table/lib/hooks/useColumns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse `columns` & `children` into `columns`.
    */
  @scala.inline
  def default[RecordType](
    param0: ClientWidth[RecordType],
    transformColumns: js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
  ): js.Tuple3[
    /* columns */ ColumnsType[RecordType], 
    /* flattenColumns */ js.Array[ColumnType[RecordType]], 
    /* realScrollWidth */ js.UndefOr[Double]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], transformColumns.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* columns */ ColumnsType[RecordType], 
    /* flattenColumns */ js.Array[ColumnType[RecordType]], 
    /* realScrollWidth */ js.UndefOr[Double]
  ]]
  
  @scala.inline
  def convertChildrenToColumns[RecordType](children: ReactElement): ColumnsType[RecordType] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToColumns")(children.asInstanceOf[js.Any]).asInstanceOf[ColumnsType[RecordType]]
}
