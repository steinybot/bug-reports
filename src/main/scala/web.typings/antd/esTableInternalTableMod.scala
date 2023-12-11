package web.typings.antd

import web.typings.antd.anon.ScrollToFirstRowOnChange
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esSpinMod.SpinProps
import web.typings.antd.esTableInterfaceMod.ColumnGroupType
import web.typings.antd.esTableInterfaceMod.ColumnsType
import web.typings.antd.esTableInterfaceMod.FilterValue
import web.typings.antd.esTableInterfaceMod.GetPopupContainer
import web.typings.antd.esTableInterfaceMod.RefInternalTable
import web.typings.antd.esTableInterfaceMod.SortOrder
import web.typings.antd.esTableInterfaceMod.SorterResult
import web.typings.antd.esTableInterfaceMod.TableCurrentDataSource
import web.typings.antd.esTableInterfaceMod.TableLocale
import web.typings.antd.esTableInterfaceMod.TablePaginationConfig
import web.typings.antd.esTableInterfaceMod.TableRowSelection
import web.typings.antd.esTooltipMod.TooltipProps
import web.typings.rcTable.anon.X
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.Direction
import web.typings.rcTable.libInterfaceMod.ExpandableConfig
import web.typings.rcTable.libInterfaceMod.ExpandedRowRender
import web.typings.rcTable.libInterfaceMod.GetComponentProps
import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.rcTable.libInterfaceMod.Key
import web.typings.rcTable.libInterfaceMod.PanelRender
import web.typings.rcTable.libInterfaceMod.RenderExpandIcon
import web.typings.rcTable.libInterfaceMod.RenderExpandIconProps
import web.typings.rcTable.libInterfaceMod.RowClassName
import web.typings.rcTable.libInterfaceMod.TableComponents
import web.typings.rcTable.libInterfaceMod.TableLayout
import web.typings.rcTable.libInterfaceMod.TableSticky
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.TdHTMLAttributes
import web.typings.std.Record
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableInternalTableMod extends Shortcut {
  
  @JSImport("antd/es/table/InternalTable", JSImport.Default)
  @js.native
  val default: RefInternalTable = js.native
  
  @js.native
  trait InternalTableProps[RecordType]
    extends StObject
       with TableProps[RecordType] {
    
    var _renderTimes: Double = js.native
  }
  object InternalTableProps {
    
    @scala.inline
    def apply[RecordType](_renderTimes: Double): InternalTableProps[RecordType] = {
      val __obj = js.Dynamic.literal(_renderTimes = _renderTimes.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalTableProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalTableProps[_], RecordType] (val x: Self with InternalTableProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def set_renderTimes(value: Double): Self = StObject.set(x, "_renderTimes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<rc-table.rc-table.TableProps<RecordType>, 'transformColumns' | 'internalHooks' | 'internalRefs' | 'data' | 'columns' | 'scroll' | 'emptyText'> */
  @js.native
  trait TableProps[RecordType] extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var caption: js.UndefOr[ReactElement] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var childrenColumnName: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
    
    var components: js.UndefOr[TableComponents[RecordType]] = js.native
    
    var dataSource: js.UndefOr[js.Array[RecordType]] = js.native
    
    var defaultExpandAllRows: js.UndefOr[Boolean] = js.native
    
    var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var dropdownPrefixCls: js.UndefOr[String] = js.native
    
    var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
    
    var expandIconColumnIndex: js.UndefOr[Double] = js.native
    
    var expandRowByClick: js.UndefOr[Boolean] = js.native
    
    var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.native
    
    var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.native
    
    var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.native
    
    var footer: js.UndefOr[PanelRender[RecordType]] = js.native
    
    var getContainerWidth: js.UndefOr[js.Function2[/* ele */ HTMLElement, /* width */ Double, Double]] = js.native
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var indentSize: js.UndefOr[Double] = js.native
    
    var loading: js.UndefOr[Boolean | SpinProps] = js.native
    
    var locale: js.UndefOr[TableLocale] = js.native
    
    var onChange: js.UndefOr[
        js.Function4[
          /* pagination */ TablePaginationConfig, 
          /* filters */ Record[String, FilterValue | Null], 
          /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], 
          /* extra */ TableCurrentDataSource[RecordType], 
          Unit
        ]
      ] = js.native
    
    var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.native
    
    var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.native
    
    var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[RecordType]]]] = js.native
    
    var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.native
    
    var pagination: js.UndefOr[`false` | TablePaginationConfig] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rowClassName: js.UndefOr[String | RowClassName[RecordType]] = js.native
    
    var rowKey: js.UndefOr[String | GetRowKey[RecordType]] = js.native
    
    var rowSelection: js.UndefOr[TableRowSelection[RecordType]] = js.native
    
    var scroll: js.UndefOr[js.UndefOr[X] with ScrollToFirstRowOnChange] = js.native
    
    var showHeader: js.UndefOr[Boolean] = js.native
    
    var showSorterTooltip: js.UndefOr[Boolean | TooltipProps] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
    
    var sticky: js.UndefOr[Boolean | TableSticky] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], ReactElement]] = js.native
    
    var tableLayout: js.UndefOr[TableLayout] = js.native
    
    var tailor: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[PanelRender[RecordType]] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object TableProps {
    
    @scala.inline
    def apply[RecordType](): TableProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TableProps[_], RecordType] (val x: Self with TableProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setCaption(value: ReactElement): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(
        value: (ColumnGroupType[RecordType] | web.typings.antd.esTableInterfaceMod.ColumnType[RecordType])*
      ): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setComponents(value: TableComponents[RecordType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setDefaultExpandAllRows(value: Boolean): Self = StObject.set(x, "defaultExpandAllRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandAllRowsUndefined: Self = StObject.set(x, "defaultExpandAllRows", js.undefined)
      
      @scala.inline
      def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedRowKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandedRowKeysUndefined: Self = StObject.set(x, "defaultExpandedRowKeys", js.undefined)
      
      @scala.inline
      def setDefaultExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedRowKeys", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPrefixClsUndefined: Self = StObject.set(x, "dropdownPrefixCls", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandRowByClickUndefined: Self = StObject.set(x, "expandRowByClick", js.undefined)
      
      @scala.inline
      def setExpandable(value: ExpandableConfig[RecordType]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExpandedRowClassNameUndefined: Self = StObject.set(x, "expandedRowClassName", js.undefined)
      
      @scala.inline
      def setExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
      
      @scala.inline
      def setExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "expandedRowKeys", js.Array(value :_*))
      
      @scala.inline
      def setExpandedRowRender(
        value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement
      ): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      @scala.inline
      def setExpandedRowRenderUndefined: Self = StObject.set(x, "expandedRowRender", js.undefined)
      
      @scala.inline
      def setFooter(value: /* data */ js.Array[RecordType] => ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setGetContainerWidth(value: (/* ele */ HTMLElement, /* width */ Double) => Double): Self = StObject.set(x, "getContainerWidth", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetContainerWidthUndefined: Self = StObject.set(x, "getContainerWidth", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean | SpinProps): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* pagination */ TablePaginationConfig, /* filters */ Record[String, FilterValue | Null], /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], /* extra */ TableCurrentDataSource[RecordType]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onExpandedRowsChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandedRowsChangeUndefined: Self = StObject.set(x, "onExpandedRowsChange", js.undefined)
      
      @scala.inline
      def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHeaderRowUndefined: Self = StObject.set(x, "onHeaderRow", js.undefined)
      
      @scala.inline
      def setOnRow(
        value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
      
      @scala.inline
      def setPagination(value: `false` | TablePaginationConfig): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      @scala.inline
      def setRowKey(value: String | GetRowKey[RecordType]): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "rowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      @scala.inline
      def setRowSelection(value: TableRowSelection[RecordType]): Self = StObject.set(x, "rowSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSelectionUndefined: Self = StObject.set(x, "rowSelection", js.undefined)
      
      @scala.inline
      def setScroll(value: js.UndefOr[X] with ScrollToFirstRowOnChange): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      @scala.inline
      def setShowSorterTooltip(value: Boolean | TooltipProps): Self = StObject.set(x, "showSorterTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSorterTooltipUndefined: Self = StObject.set(x, "showSorterTooltip", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSortDirections(value: js.Array[SortOrder]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
      
      @scala.inline
      def setSortDirectionsVarargs(value: SortOrder*): Self = StObject.set(x, "sortDirections", js.Array(value :_*))
      
      @scala.inline
      def setSticky(value: Boolean | TableSticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: /* data */ js.Array[RecordType] => ReactElement): Self = StObject.set(x, "summary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      @scala.inline
      def setTailor(value: Boolean): Self = StObject.set(x, "tailor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailorUndefined: Self = StObject.set(x, "tailor", js.undefined)
      
      @scala.inline
      def setTitle(value: /* data */ js.Array[RecordType] => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = RefInternalTable
  
  /* This means you don't have to write `default`, but can instead just say `esTableInternalTableMod.foo` */
  override def _to: RefInternalTable = default
}
