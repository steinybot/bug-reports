package web.typings.rcTable

import web.typings.rcComponentContext.esContextMod.SelectorContext
import web.typings.rcComponentContext.esImmutableMod.CompareProps
import web.typings.rcTable.libInterfaceMod.ColumnGroupType
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import web.typings.rcTable.libInterfaceMod.CustomizeComponent
import web.typings.rcTable.libInterfaceMod.Direction
import web.typings.rcTable.libInterfaceMod.ExpandableType
import web.typings.rcTable.libInterfaceMod.ExpandedRowRender
import web.typings.rcTable.libInterfaceMod.GetComponent
import web.typings.rcTable.libInterfaceMod.GetComponentProps
import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.rcTable.libInterfaceMod.RenderExpandIcon
import web.typings.rcTable.libInterfaceMod.RenderExpandIconProps
import web.typings.rcTable.libInterfaceMod.RowClassName
import web.typings.rcTable.libInterfaceMod.TableLayout
import web.typings.rcTable.libInterfaceMod.TriggerEventHandler
import web.typings.rcTable.libUtilsFixUtilMod.FixedInfo
import web.typings.rcTable.rcTableBooleans.`true`
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.Key
import web.typings.react.mod.TdHTMLAttributes
import web.typings.std.Set
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextTableContextMod {
  
  @JSImport("rc-table/lib/context/TableContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-table/lib/context/TableContext", JSImport.Default)
  @js.native
  val default: SelectorContext[TableContextProps[Any]] = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(responseImmutable, useImmutableMark) */ @scala.inline
  def makeImmutable[T /* <: ReactComponentClass[Any] */](Component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeImmutable")(Component.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def makeImmutable[T /* <: ReactComponentClass[Any] */](Component: T, shouldTriggerRender: CompareProps[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeImmutable")(Component.asInstanceOf[js.Any], shouldTriggerRender.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @js.native
  trait TableContextProps[RecordType] extends StObject {
    
    var allColumnsFixedLeft: Boolean = js.native
    
    var childrenColumnName: String = js.native
    
    var columns: ColumnsType[RecordType] = js.native
    
    var componentWidth: Double = js.native
    
    var direction: Direction = js.native
    
    var emptyNode: js.UndefOr[ReactElement] = js.native
    
    var expandIcon: RenderExpandIcon[RecordType] = js.native
    
    var expandIconColumnIndex: Double = js.native
    
    var expandRowByClick: Boolean = js.native
    
    var expandableType: ExpandableType = js.native
    
    var expandedKeys: Set[Key] = js.native
    
    var expandedRowClassName: RowClassName[RecordType] = js.native
    
    var expandedRowRender: ExpandedRowRender[RecordType] = js.native
    
    var fixColumn: Boolean = js.native
    
    var fixHeader: Boolean = js.native
    
    var fixedInfoList: js.Array[FixedInfo] = js.native
    
    var flattenColumns: js.Array[ColumnType[RecordType]] = js.native
    
    var getComponent: GetComponent = js.native
    
    var getRowKey: GetRowKey[RecordType] = js.native
    
    var horizonScroll: Boolean = js.native
    
    var hoverEndRow: Double = js.native
    
    var hoverStartRow: Double = js.native
    
    var indentSize: Double = js.native
    
    var isSticky: Boolean = js.native
    
    def onColumnResize(columnKey: Key, width: Double): Unit = js.native
    
    def onHover(start: Double, end: Double): Unit = js.native
    
    var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.native
    
    var onTriggerExpand: TriggerEventHandler[RecordType] = js.native
    
    var prefixCls: String = js.native
    
    var rowClassName: String | RowClassName[RecordType] = js.native
    
    def rowExpandable(record: RecordType): Boolean = js.native
    
    var scrollX: Double | String | `true` = js.native
    
    var scrollbarSize: Double = js.native
    
    var supportSticky: Boolean = js.native
    
    var tableLayout: TableLayout = js.native
  }
  object TableContextProps {
    
    @scala.inline
    def apply[RecordType](
      allColumnsFixedLeft: Boolean,
      childrenColumnName: String,
      columns: ColumnsType[RecordType],
      componentWidth: Double,
      direction: Direction,
      expandIcon: /* props */ RenderExpandIconProps[RecordType] => ReactElement,
      expandIconColumnIndex: Double,
      expandRowByClick: Boolean,
      expandableType: ExpandableType,
      expandedKeys: Set[Key],
      expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String,
      expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement,
      fixColumn: Boolean,
      fixHeader: Boolean,
      fixedInfoList: js.Array[FixedInfo],
      flattenColumns: js.Array[ColumnType[RecordType]],
      getComponent: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent,
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => web.typings.rcTable.libInterfaceMod.Key,
      horizonScroll: Boolean,
      hoverEndRow: Double,
      hoverStartRow: Double,
      indentSize: Double,
      isSticky: Boolean,
      onColumnResize: (Key, Double) => Unit,
      onHover: (Double, Double) => Unit,
      onTriggerExpand: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit,
      prefixCls: String,
      rowClassName: String | RowClassName[RecordType],
      rowExpandable: RecordType => Boolean,
      scrollX: Double | String | `true`,
      scrollbarSize: Double,
      supportSticky: Boolean,
      tableLayout: TableLayout
    ): TableContextProps[RecordType] = {
      val __obj = js.Dynamic.literal(allColumnsFixedLeft = allColumnsFixedLeft.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], fixedInfoList = fixedInfoList.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], getComponent = js.Any.fromFunction2(getComponent), getRowKey = js.Any.fromFunction2(getRowKey), horizonScroll = horizonScroll.asInstanceOf[js.Any], hoverEndRow = hoverEndRow.asInstanceOf[js.Any], hoverStartRow = hoverStartRow.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize), onHover = js.Any.fromFunction2(onHover), onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), prefixCls = prefixCls.asInstanceOf[js.Any], rowClassName = rowClassName.asInstanceOf[js.Any], rowExpandable = js.Any.fromFunction1(rowExpandable), scrollX = scrollX.asInstanceOf[js.Any], scrollbarSize = scrollbarSize.asInstanceOf[js.Any], supportSticky = supportSticky.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContextProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TableContextProps[_], RecordType] (val x: Self with TableContextProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setAllColumnsFixedLeft(value: Boolean): Self = StObject.set(x, "allColumnsFixedLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setComponentWidth(value: Double): Self = StObject.set(x, "componentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyNode(value: ReactElement): Self = StObject.set(x, "emptyNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyNodeUndefined: Self = StObject.set(x, "emptyNode", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableType(value: ExpandableType): Self = StObject.set(x, "expandableType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExpandedRowRender(
        value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement
      ): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFixColumn(value: Boolean): Self = StObject.set(x, "fixColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedInfoList(value: js.Array[FixedInfo]): Self = StObject.set(x, "fixedInfoList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedInfoListVarargs(value: FixedInfo*): Self = StObject.set(x, "fixedInfoList", js.Array(value :_*))
      
      @scala.inline
      def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
      
      @scala.inline
      def setGetComponent(
        value: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent
      ): Self = StObject.set(x, "getComponent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => web.typings.rcTable.libInterfaceMod.Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHorizonScroll(value: Boolean): Self = StObject.set(x, "horizonScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverEndRow(value: Double): Self = StObject.set(x, "hoverEndRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverStartRow(value: Double): Self = StObject.set(x, "hoverStartRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnColumnResize(value: (Key, Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHover(value: (Double, Double) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRow(
        value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
      
      @scala.inline
      def setOnTriggerExpand(value: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onTriggerExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRowExpandable(value: RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollX(value: Double | String | `true`): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarSize(value: Double): Self = StObject.set(x, "scrollbarSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportSticky(value: Boolean): Self = StObject.set(x, "supportSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
    }
  }
}
