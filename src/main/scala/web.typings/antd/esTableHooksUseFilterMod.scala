package web.typings.antd

import web.typings.antd.esTableInterfaceMod.ColumnFilterItem
import web.typings.antd.esTableInterfaceMod.ColumnGroupType
import web.typings.antd.esTableInterfaceMod.ColumnType
import web.typings.antd.esTableInterfaceMod.ColumnsType
import web.typings.antd.esTableInterfaceMod.FilterKey
import web.typings.antd.esTableInterfaceMod.FilterValue
import web.typings.antd.esTableInterfaceMod.GetPopupContainer
import web.typings.antd.esTableInterfaceMod.Key
import web.typings.antd.esTableInterfaceMod.TableLocale
import web.typings.antd.esTableInterfaceMod.TransformColumns
import web.typings.std.Record
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUseFilterMod {
  
  @JSImport("antd/es/table/hooks/useFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](param0: FilterConfig[RecordType]): js.Tuple3[
    TransformColumns[RecordType], 
    js.Array[FilterState[RecordType]], 
    Record[String, FilterValue | Null]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    TransformColumns[RecordType], 
    js.Array[FilterState[RecordType]], 
    Record[String, FilterValue | Null]
  ]]
  
  @scala.inline
  def flattenKeys(): FilterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenKeys")().asInstanceOf[FilterValue]
  @scala.inline
  def flattenKeys(filters: js.Array[ColumnFilterItem]): FilterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenKeys")(filters.asInstanceOf[js.Any]).asInstanceOf[FilterValue]
  
  @scala.inline
  def getFilterData[RecordType](data: js.Array[RecordType], filterStates: js.Array[FilterState[RecordType]]): js.Array[RecordType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterData")(data.asInstanceOf[js.Any], filterStates.asInstanceOf[js.Any])).asInstanceOf[js.Array[RecordType]]
  
  @js.native
  trait FilterConfig[RecordType] extends StObject {
    
    var dropdownPrefixCls: String = js.native
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
    
    var locale: TableLocale = js.native
    
    var mergedColumns: ColumnsType[RecordType] = js.native
    
    def onFilterChange(filters: Record[String, FilterValue | Null], filterStates: js.Array[FilterState[RecordType]]): Unit = js.native
    
    var prefixCls: String = js.native
  }
  object FilterConfig {
    
    @scala.inline
    def apply[RecordType](
      dropdownPrefixCls: String,
      locale: TableLocale,
      mergedColumns: ColumnsType[RecordType],
      onFilterChange: (Record[String, FilterValue | Null], js.Array[FilterState[RecordType]]) => Unit,
      prefixCls: String
    ): FilterConfig[RecordType] = {
      val __obj = js.Dynamic.literal(dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mergedColumns = mergedColumns.asInstanceOf[js.Any], onFilterChange = js.Any.fromFunction2(onFilterChange), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterConfig[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FilterConfig[_], RecordType] (val x: Self with FilterConfig[RecordType]) extends AnyVal {
      
      @scala.inline
      def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergedColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "mergedColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergedColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "mergedColumns", js.Array(value :_*))
      
      @scala.inline
      def setOnFilterChange(value: (Record[String, FilterValue | Null], js.Array[FilterState[RecordType]]) => Unit): Self = StObject.set(x, "onFilterChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FilterState[RecordType] extends StObject {
    
    var column: ColumnType[RecordType] = js.native
    
    var filteredKeys: js.UndefOr[FilterKey] = js.native
    
    var forceFiltered: js.UndefOr[Boolean] = js.native
    
    var key: Key = js.native
  }
  object FilterState {
    
    @scala.inline
    def apply[RecordType](column: ColumnType[RecordType], key: Key): FilterState[RecordType] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterState[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FilterState[_], RecordType] (val x: Self with FilterState[RecordType]) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredKeys(value: FilterKey): Self = StObject.set(x, "filteredKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredKeysNull: Self = StObject.set(x, "filteredKeys", null)
      
      @scala.inline
      def setFilteredKeysUndefined: Self = StObject.set(x, "filteredKeys", js.undefined)
      
      @scala.inline
      def setFilteredKeysVarargs(value: (String | Double)*): Self = StObject.set(x, "filteredKeys", js.Array(value :_*))
      
      @scala.inline
      def setForceFiltered(value: Boolean): Self = StObject.set(x, "forceFiltered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFilteredUndefined: Self = StObject.set(x, "forceFiltered", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
