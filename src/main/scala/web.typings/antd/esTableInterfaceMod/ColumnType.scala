package web.typings.antd.esTableInterfaceMod

import web.typings.antd.anon.Compare
import web.typings.antd.antdStrings.menu_
import web.typings.antd.antdStrings.tree_
import web.typings.antd.esTooltipMod.TooltipProps
import web.typings.antd.esUtilResponsiveObserverMod.Breakpoint
import web.typings.rcTable.libInterfaceMod.AlignType
import web.typings.rcTable.libInterfaceMod.CellEllipsisType
import web.typings.rcTable.libInterfaceMod.DataIndex
import web.typings.rcTable.libInterfaceMod.FixedType
import web.typings.rcTable.libInterfaceMod.GetComponentProps
import web.typings.rcTable.libInterfaceMod.RenderedCell
import web.typings.rcTable.libInterfaceMod.RowScopeType
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.TdHTMLAttributes
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<rc-table.rc-table/lib/interface.ColumnType<RecordType>, 'title'> */
@js.native
trait ColumnType[RecordType] extends StObject {
  
  var align: js.UndefOr[AlignType] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var colSpan: js.UndefOr[Double] = js.native
  
  var dataIndex: js.UndefOr[DataIndex] = js.native
  
  var defaultFilteredValue: js.UndefOr[FilterValue | Null] = js.native
  
  var defaultSortOrder: js.UndefOr[SortOrder] = js.native
  
  var ellipsis: js.UndefOr[CellEllipsisType] = js.native
  
  var filterDropdown: js.UndefOr[ReactElement | (js.Function1[/* props */ FilterDropdownProps, ReactElement])] = js.native
  
  var filterDropdownOpen: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Please use `filterDropdownOpen` instead */
  var filterDropdownVisible: js.UndefOr[Boolean] = js.native
  
  var filterIcon: js.UndefOr[ReactElement | (js.Function1[/* filtered */ Boolean, ReactElement])] = js.native
  
  var filterMode: js.UndefOr[menu_ | tree_] = js.native
  
  var filterMultiple: js.UndefOr[Boolean] = js.native
  
  var filterResetToDefaultFilteredValue: js.UndefOr[Boolean] = js.native
  
  var filterSearch: js.UndefOr[FilterSearchType[ColumnFilterItem]] = js.native
  
  var filtered: js.UndefOr[Boolean] = js.native
  
  var filteredValue: js.UndefOr[FilterValue | Null] = js.native
  
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
  
  var fixed: js.UndefOr[FixedType] = js.native
  
  var key: js.UndefOr[web.typings.rcTable.libInterfaceMod.Key] = js.native
  
  var onCell: js.UndefOr[GetComponentProps[RecordType]] = js.native
  
  var onCellClick: js.UndefOr[
    js.Function2[/* record */ RecordType, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  
  var onFilter: js.UndefOr[
    js.Function2[/* value */ web.typings.react.mod.Key | Boolean, /* record */ RecordType, Boolean]
  ] = js.native
  
  var onFilterDropdownOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  /** @deprecated Please use `onFilterDropdownOpenChange` instead */
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.native
  
  var render: js.UndefOr[
    js.Function3[
      /* value */ Any, 
      /* record */ RecordType, 
      /* index */ Double, 
      ReactElement | RenderedCell[RecordType]
    ]
  ] = js.native
  
  var responsive: js.UndefOr[js.Array[Breakpoint]] = js.native
  
  var rowScope: js.UndefOr[RowScopeType] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
  
  var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.native
  
  var showSorterTooltip: js.UndefOr[Boolean | TooltipProps] = js.native
  
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
  
  var sortIcon: js.UndefOr[js.Function1[/* props */ web.typings.antd.anon.SortOrder, ReactElement]] = js.native
  
  var sortOrder: js.UndefOr[SortOrder] = js.native
  
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.native
  
  var title: js.UndefOr[ColumnTitle[RecordType]] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ColumnType {
  
  @scala.inline
  def apply[RecordType](): ColumnType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnType[RecordType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ColumnType[_], RecordType] (val x: Self with ColumnType[RecordType]) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    @scala.inline
    def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    @scala.inline
    def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
    
    @scala.inline
    def setDefaultFilteredValue(value: FilterValue): Self = StObject.set(x, "defaultFilteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFilteredValueNull: Self = StObject.set(x, "defaultFilteredValue", null)
    
    @scala.inline
    def setDefaultFilteredValueUndefined: Self = StObject.set(x, "defaultFilteredValue", js.undefined)
    
    @scala.inline
    def setDefaultFilteredValueVarargs(value: (Key | Boolean)*): Self = StObject.set(x, "defaultFilteredValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSortOrder(value: SortOrder): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortOrderNull: Self = StObject.set(x, "defaultSortOrder", null)
    
    @scala.inline
    def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
    
    @scala.inline
    def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setFilterDropdown(value: ReactElement | (js.Function1[/* props */ FilterDropdownProps, ReactElement])): Self = StObject.set(x, "filterDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropdownFunction1(value: /* props */ FilterDropdownProps => ReactElement): Self = StObject.set(x, "filterDropdown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterDropdownOpen(value: Boolean): Self = StObject.set(x, "filterDropdownOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropdownOpenUndefined: Self = StObject.set(x, "filterDropdownOpen", js.undefined)
    
    @scala.inline
    def setFilterDropdownReactElement(value: ReactElement): Self = StObject.set(x, "filterDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropdownUndefined: Self = StObject.set(x, "filterDropdown", js.undefined)
    
    @scala.inline
    def setFilterDropdownVisible(value: Boolean): Self = StObject.set(x, "filterDropdownVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropdownVisibleUndefined: Self = StObject.set(x, "filterDropdownVisible", js.undefined)
    
    @scala.inline
    def setFilterIcon(value: ReactElement | (js.Function1[/* filtered */ Boolean, ReactElement])): Self = StObject.set(x, "filterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIconFunction1(value: /* filtered */ Boolean => ReactElement): Self = StObject.set(x, "filterIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterIconReactElement(value: ReactElement): Self = StObject.set(x, "filterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIconUndefined: Self = StObject.set(x, "filterIcon", js.undefined)
    
    @scala.inline
    def setFilterMode(value: menu_ | tree_): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
    
    @scala.inline
    def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMultipleUndefined: Self = StObject.set(x, "filterMultiple", js.undefined)
    
    @scala.inline
    def setFilterResetToDefaultFilteredValue(value: Boolean): Self = StObject.set(x, "filterResetToDefaultFilteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterResetToDefaultFilteredValueUndefined: Self = StObject.set(x, "filterResetToDefaultFilteredValue", js.undefined)
    
    @scala.inline
    def setFilterSearch(value: FilterSearchType[ColumnFilterItem]): Self = StObject.set(x, "filterSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSearchFunction2(value: (/* input */ String, ColumnFilterItem) => Boolean): Self = StObject.set(x, "filterSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterSearchUndefined: Self = StObject.set(x, "filterSearch", js.undefined)
    
    @scala.inline
    def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    @scala.inline
    def setFilteredValue(value: FilterValue): Self = StObject.set(x, "filteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredValueNull: Self = StObject.set(x, "filteredValue", null)
    
    @scala.inline
    def setFilteredValueUndefined: Self = StObject.set(x, "filteredValue", js.undefined)
    
    @scala.inline
    def setFilteredValueVarargs(value: (Key | Boolean)*): Self = StObject.set(x, "filteredValue", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setKey(value: web.typings.rcTable.libInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOnCell(
      value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
    ): Self = StObject.set(x, "onCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCellClick(value: (/* record */ RecordType, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    @scala.inline
    def setOnCellUndefined: Self = StObject.set(x, "onCell", js.undefined)
    
    @scala.inline
    def setOnFilter(value: (/* value */ web.typings.react.mod.Key | Boolean, /* record */ RecordType) => Boolean): Self = StObject.set(x, "onFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFilterDropdownOpenChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onFilterDropdownOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFilterDropdownOpenChangeUndefined: Self = StObject.set(x, "onFilterDropdownOpenChange", js.undefined)
    
    @scala.inline
    def setOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onFilterDropdownVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFilterDropdownVisibleChangeUndefined: Self = StObject.set(x, "onFilterDropdownVisibleChange", js.undefined)
    
    @scala.inline
    def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
    
    @scala.inline
    def setOnHeaderCell(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
    ): Self = StObject.set(x, "onHeaderCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnHeaderCellUndefined: Self = StObject.set(x, "onHeaderCell", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* value */ Any, /* record */ RecordType, /* index */ Double) => ReactElement | RenderedCell[RecordType]
    ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setResponsive(value: js.Array[Breakpoint]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setResponsiveVarargs(value: Breakpoint*): Self = StObject.set(x, "responsive", js.Array(value :_*))
    
    @scala.inline
    def setRowScope(value: RowScopeType): Self = StObject.set(x, "rowScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowScopeUndefined: Self = StObject.set(x, "rowScope", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    @scala.inline
    def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
    
    @scala.inline
    def setShowSorterTooltip(value: Boolean | TooltipProps): Self = StObject.set(x, "showSorterTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSorterTooltipUndefined: Self = StObject.set(x, "showSorterTooltip", js.undefined)
    
    @scala.inline
    def setSortDirections(value: js.Array[SortOrder]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
    
    @scala.inline
    def setSortDirectionsVarargs(value: SortOrder*): Self = StObject.set(x, "sortDirections", js.Array(value :_*))
    
    @scala.inline
    def setSortIcon(value: /* props */ web.typings.antd.anon.SortOrder => ReactElement): Self = StObject.set(x, "sortIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortIconUndefined: Self = StObject.set(x, "sortIcon", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setSorter(value: Boolean | CompareFn[RecordType] | Compare[RecordType]): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = StObject.set(x, "sorter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    @scala.inline
    def setTitle(value: ColumnTitle[RecordType]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction1(value: /* props */ ColumnTitleProps[RecordType] => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
