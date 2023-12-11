package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.ScrollToFirstRowOnChange
import web.typings.antd.anon.`7`
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esSpinMod.SpinProps
import web.typings.antd.esTableInterfaceMod.ColumnGroupType
import web.typings.antd.esTableInterfaceMod.ColumnType
import web.typings.antd.esTableInterfaceMod.ColumnsType
import web.typings.antd.esTableInterfaceMod.FilterValue
import web.typings.antd.esTableInterfaceMod.SortOrder
import web.typings.antd.esTableInterfaceMod.SorterResult
import web.typings.antd.esTableInterfaceMod.TableCurrentDataSource
import web.typings.antd.esTableInterfaceMod.TableLocale
import web.typings.antd.esTableInterfaceMod.TablePaginationConfig
import web.typings.antd.esTableInterfaceMod.TableRowSelection
import web.typings.antd.esTableInternalTableMod.InternalTableProps
import web.typings.antd.esTooltipMod.TooltipProps
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.rcTable.anon.X
import web.typings.rcTable.libInterfaceMod.Direction
import web.typings.rcTable.libInterfaceMod.ExpandableConfig
import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.rcTable.libInterfaceMod.Key
import web.typings.rcTable.libInterfaceMod.Reference
import web.typings.rcTable.libInterfaceMod.RenderExpandIconProps
import web.typings.rcTable.libInterfaceMod.RowClassName
import web.typings.rcTable.libInterfaceMod.TableComponents
import web.typings.rcTable.libInterfaceMod.TableLayout
import web.typings.rcTable.libInterfaceMod.TableSticky
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.PropsWithChildren
import web.typings.react.mod.TdHTMLAttributes
import web.typings.std.Record
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InternalTable {
  
  @scala.inline
  def apply(_renderTimes: Double): Builder = {
    val __props = js.Dynamic.literal(_renderTimes = _renderTimes.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ PropsWithChildren[InternalTableProps[AnyObject]] with `7`]))
  }
  
  @JSImport("antd/es/table/InternalTable", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Reference] {
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def caption(value: ReactElement): this.type = set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenColumnName(value: String): this.type = set("childrenColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columns(value: ColumnsType[AnyObject]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnsVarargs(value: (ColumnGroupType[AnyObject] | ColumnType[AnyObject])*): this.type = set("columns", js.Array(value :_*))
    
    @scala.inline
    def components(value: TableComponents[AnyObject]): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSource(value: js.Array[AnyObject]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSourceVarargs(value: AnyObject*): this.type = set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def defaultExpandAllRows(value: Boolean): this.type = set("defaultExpandAllRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultExpandedRowKeys(value: js.Array[Key]): this.type = set("defaultExpandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultExpandedRowKeysVarargs(value: Key*): this.type = set("defaultExpandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def direction(value: Direction): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownPrefixCls(value: String): this.type = set("dropdownPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandIcon(value: /* props */ RenderExpandIconProps[AnyObject] => ReactElement): this.type = set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def expandIconColumnIndex(value: Double): this.type = set("expandIconColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandRowByClick(value: Boolean): this.type = set("expandRowByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandable(value: ExpandableConfig[AnyObject]): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRowClassName(value: (AnyObject, /* index */ Double, /* indent */ Double) => String): this.type = set("expandedRowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def expandedRowKeys(value: js.Array[Key]): this.type = set("expandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRowKeysVarargs(value: Key*): this.type = set("expandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def expandedRowRender(
      value: (AnyObject, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement
    ): this.type = set("expandedRowRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def footer(value: /* data */ js.Array[AnyObject] => ReactElement): this.type = set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def getContainerWidth(value: (/* ele */ HTMLElement, /* width */ Double) => Double): this.type = set("getContainerWidth", js.Any.fromFunction2(value))
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indentSize(value: Double): this.type = set("indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean | SpinProps): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: TableLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* pagination */ TablePaginationConfig, /* filters */ Record[String, FilterValue | Null], /* sorter */ SorterResult[AnyObject] | js.Array[SorterResult[AnyObject]], /* extra */ TableCurrentDataSource[AnyObject]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def onExpand(value: (/* expanded */ Boolean, AnyObject) => Unit): this.type = set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def onExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): this.type = set("onExpandedRowsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHeaderRow(
      value: (js.Array[web.typings.rcTable.libInterfaceMod.ColumnType[AnyObject]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
    ): this.type = set("onHeaderRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRow(
      value: (AnyObject, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
    ): this.type = set("onRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def pagination(value: `false` | TablePaginationConfig): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowClassName(value: String | RowClassName[AnyObject]): this.type = set("rowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowClassNameFunction3(value: (AnyObject, /* index */ Double, /* indent */ Double) => String): this.type = set("rowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def rowKey(value: String | GetRowKey[AnyObject]): this.type = set("rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowKeyFunction2(value: (AnyObject, /* index */ js.UndefOr[Double]) => Key): this.type = set("rowKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def rowSelection(value: TableRowSelection[AnyObject]): this.type = set("rowSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scroll(value: js.UndefOr[X] with ScrollToFirstRowOnChange): this.type = set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showHeader(value: Boolean): this.type = set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSorterTooltip(value: Boolean | TooltipProps): this.type = set("showSorterTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortDirections(value: js.Array[SortOrder]): this.type = set("sortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortDirectionsVarargs(value: SortOrder*): this.type = set("sortDirections", js.Array(value :_*))
    
    @scala.inline
    def sticky(value: Boolean | TableSticky): this.type = set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def summary(value: /* data */ js.Array[AnyObject] => ReactElement): this.type = set("summary", js.Any.fromFunction1(value))
    
    @scala.inline
    def tableLayout(value: TableLayout): this.type = set("tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tailor(value: Boolean): this.type = set("tailor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: /* data */ js.Array[AnyObject] => ReactElement): this.type = set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  type Props = /* props */ PropsWithChildren[InternalTableProps[AnyObject]] with `7`
  
  def withProps(p: /* props */ PropsWithChildren[InternalTableProps[AnyObject]] with `7`): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
