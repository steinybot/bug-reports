package web.typings.antd

import web.typings.antd.antdStrings.menu_
import web.typings.antd.antdStrings.tree_
import web.typings.antd.esTableHooksUseFilterMod.FilterState
import web.typings.antd.esTableInterfaceMod.ColumnFilterItem
import web.typings.antd.esTableInterfaceMod.ColumnType
import web.typings.antd.esTableInterfaceMod.FilterSearchType
import web.typings.antd.esTableInterfaceMod.FilterValue
import web.typings.antd.esTableInterfaceMod.GetPopupContainer
import web.typings.antd.esTableInterfaceMod.Key
import web.typings.antd.esTableInterfaceMod.TableLocale
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.IconType
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUseFilterFilterDropdownMod {
  
  @JSImport("antd/es/table/hooks/useFilter/FilterDropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](props: FilterDropdownProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def flattenKeys(): FilterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenKeys")().asInstanceOf[FilterValue]
  @scala.inline
  def flattenKeys(filters: js.Array[ColumnFilterItem]): FilterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenKeys")(filters.asInstanceOf[js.Any]).asInstanceOf[FilterValue]
  
  @js.native
  trait FilterDropdownProps[RecordType] extends StObject {
    
    var children: ReactElement = js.native
    
    var column: ColumnType[RecordType] = js.native
    
    var columnKey: Key = js.native
    
    var dropdownPrefixCls: String = js.native
    
    var filterMode: js.UndefOr[menu_ | tree_] = js.native
    
    var filterMultiple: Boolean = js.native
    
    var filterResetToDefaultFilteredValue: js.UndefOr[Boolean] = js.native
    
    var filterSearch: js.UndefOr[FilterSearchType[ColumnFilterItem | TreeColumnFilterItem]] = js.native
    
    var filterState: js.UndefOr[FilterState[RecordType]] = js.native
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
    
    var locale: TableLocale = js.native
    
    var prefixCls: String = js.native
    
    var tablePrefixCls: String = js.native
    
    def triggerFilter(filterState: FilterState[RecordType]): Unit = js.native
  }
  object FilterDropdownProps {
    
    @scala.inline
    def apply[RecordType](
      children: ReactElement,
      column: ColumnType[RecordType],
      columnKey: Key,
      dropdownPrefixCls: String,
      filterMultiple: Boolean,
      locale: TableLocale,
      prefixCls: String,
      tablePrefixCls: String,
      triggerFilter: FilterState[RecordType] => Unit
    ): FilterDropdownProps[RecordType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tablePrefixCls = tablePrefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
      __obj.asInstanceOf[FilterDropdownProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FilterDropdownProps[_], RecordType] (val x: Self with FilterDropdownProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMode(value: menu_ | tree_): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      @scala.inline
      def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterResetToDefaultFilteredValue(value: Boolean): Self = StObject.set(x, "filterResetToDefaultFilteredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterResetToDefaultFilteredValueUndefined: Self = StObject.set(x, "filterResetToDefaultFilteredValue", js.undefined)
      
      @scala.inline
      def setFilterSearch(value: FilterSearchType[ColumnFilterItem | TreeColumnFilterItem]): Self = StObject.set(x, "filterSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSearchFunction2(value: (/* input */ String, ColumnFilterItem | TreeColumnFilterItem) => Boolean): Self = StObject.set(x, "filterSearch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterSearchUndefined: Self = StObject.set(x, "filterSearch", js.undefined)
      
      @scala.inline
      def setFilterState(value: FilterState[RecordType]): Self = StObject.set(x, "filterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterStateUndefined: Self = StObject.set(x, "filterState", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePrefixCls(value: String): Self = StObject.set(x, "tablePrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerFilter(value: FilterState[RecordType] => Unit): Self = StObject.set(x, "triggerFilter", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined rc-tree.rc-tree.FieldDataNode<{  title :react.react.ReactNode,   key :string}, 'children'> */
  @js.native
  trait FilterTreeDataNode extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[js.Array[Any]] = js.native
    
    /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
    var className: js.UndefOr[String] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var key: String = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var title: ReactElement = js.native
  }
  object FilterTreeDataNode {
    
    @scala.inline
    def apply(key: String, title: ReactElement): FilterTreeDataNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterTreeDataNode]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FilterTreeDataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined antd.antd/es/table/interface.ColumnFilterItem & antd.antd/es/table/hooks/useFilter/FilterDropdown.FilterTreeDataNode */
  @js.native
  trait TreeColumnFilterItem extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
    
    /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
    var className: js.UndefOr[String] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var key: String = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var text: ReactElement = js.native
    
    var title: ReactElement = js.native
    
    var value: web.typings.react.mod.Key | Boolean = js.native
  }
  object TreeColumnFilterItem {
    
    @scala.inline
    def apply(key: String, text: ReactElement, title: ReactElement, value: web.typings.react.mod.Key | Boolean): TreeColumnFilterItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeColumnFilterItem]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeColumnFilterItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: web.typings.react.mod.Key | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
