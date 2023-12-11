package web.typings.antd

import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esTableInterfaceMod.ColumnTitleProps
import web.typings.antd.esTableInterfaceMod.ColumnType
import web.typings.antd.esTableInterfaceMod.ColumnsType
import web.typings.antd.esTableInterfaceMod.Key
import web.typings.antd.esTableInterfaceMod.SortOrder
import web.typings.antd.esTableInterfaceMod.SorterResult
import web.typings.antd.esTableInterfaceMod.TableLocale
import web.typings.antd.esTableInterfaceMod.TransformColumns
import web.typings.antd.esTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUseSorterMod {
  
  @JSImport("antd/es/table/hooks/useSorter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](param0: SorterConfig[RecordType]): js.Tuple4[
    TransformColumns[RecordType], 
    js.Array[SortState[RecordType]], 
    ColumnTitleProps[RecordType], 
    js.Function0[SorterResult[RecordType] | js.Array[SorterResult[RecordType]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[
    TransformColumns[RecordType], 
    js.Array[SortState[RecordType]], 
    ColumnTitleProps[RecordType], 
    js.Function0[SorterResult[RecordType] | js.Array[SorterResult[RecordType]]]
  ]]
  
  @scala.inline
  def getSortData[RecordType](
    data: js.Array[RecordType],
    sortStates: js.Array[SortState[RecordType]],
    childrenColumnName: String
  ): js.Array[RecordType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortData")(data.asInstanceOf[js.Any], sortStates.asInstanceOf[js.Any], childrenColumnName.asInstanceOf[js.Any])).asInstanceOf[js.Array[RecordType]]
  
  @js.native
  trait SortState[RecordType] extends StObject {
    
    var column: ColumnType[RecordType] = js.native
    
    var key: Key = js.native
    
    var multiplePriority: Double | `false` = js.native
    
    var sortOrder: SortOrder | Null = js.native
  }
  object SortState {
    
    @scala.inline
    def apply[RecordType](column: ColumnType[RecordType], key: Key, multiplePriority: Double | `false`): SortState[RecordType] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], multiplePriority = multiplePriority.asInstanceOf[js.Any], sortOrder = null)
      __obj.asInstanceOf[SortState[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SortState[_], RecordType] (val x: Self with SortState[RecordType]) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplePriority(value: Double | `false`): Self = StObject.set(x, "multiplePriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    }
  }
  
  @js.native
  trait SorterConfig[RecordType] extends StObject {
    
    var mergedColumns: ColumnsType[RecordType] = js.native
    
    def onSorterChange(sorterResult: SorterResult[RecordType], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
    def onSorterChange(sorterResult: js.Array[SorterResult[RecordType]], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var showSorterTooltip: js.UndefOr[Boolean | TooltipProps] = js.native
    
    var sortDirections: js.Array[SortOrder] = js.native
    
    var tableLocale: js.UndefOr[TableLocale] = js.native
  }
}
