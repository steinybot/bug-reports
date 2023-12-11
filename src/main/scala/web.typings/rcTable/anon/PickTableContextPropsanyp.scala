package web.typings.rcTable.anon

import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ExpandableType
import web.typings.rcTable.libInterfaceMod.ExpandedRowRender
import web.typings.rcTable.libInterfaceMod.GetComponentProps
import web.typings.rcTable.libInterfaceMod.RenderExpandIcon
import web.typings.rcTable.libInterfaceMod.RenderExpandIconProps
import web.typings.rcTable.libInterfaceMod.RowClassName
import web.typings.rcTable.libInterfaceMod.TriggerEventHandler
import web.typings.rcTable.libUtilsFixUtilMod.FixedInfo
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.Key
import web.typings.react.mod.TdHTMLAttributes
import web.typings.std.Set
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<rc-table.rc-table/lib/context/TableContext.TableContextProps<any>, 'prefixCls' | 'fixedInfoList' | 'flattenColumns' | 'expandableType' | 'expandRowByClick' | 'onTriggerExpand' | 'rowClassName' | 'expandedRowClassName' | 'indentSize' | 'expandIcon' | 'expandedRowRender' | 'expandIconColumnIndex' | 'expandedKeys' | 'childrenColumnName' | 'onRow'> */
@js.native
trait PickTableContextPropsanyp extends StObject {
  
  var childrenColumnName: String = js.native
  
  var expandIcon: RenderExpandIcon[Any] = js.native
  
  var expandIconColumnIndex: Double = js.native
  
  var expandRowByClick: Boolean = js.native
  
  var expandableType: ExpandableType = js.native
  
  var expandedKeys: Set[Key] = js.native
  
  var expandedRowClassName: RowClassName[Any] = js.native
  
  var expandedRowRender: ExpandedRowRender[Any] = js.native
  
  var fixedInfoList: js.Array[FixedInfo] = js.native
  
  var flattenColumns: js.Array[ColumnType[Any]] = js.native
  
  var indentSize: Double = js.native
  
  var onRow: js.UndefOr[GetComponentProps[Any]] = js.native
  
  var onTriggerExpand: TriggerEventHandler[Any] = js.native
  
  var prefixCls: String = js.native
  
  var rowClassName: String | RowClassName[Any] = js.native
}
object PickTableContextPropsanyp {
  
  @scala.inline
  def apply(
    childrenColumnName: String,
    expandIcon: /* props */ RenderExpandIconProps[Any] => ReactElement,
    expandIconColumnIndex: Double,
    expandRowByClick: Boolean,
    expandableType: ExpandableType,
    expandedKeys: Set[Key],
    expandedRowClassName: (Any, /* index */ Double, /* indent */ Double) => String,
    expandedRowRender: (Any, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement,
    fixedInfoList: js.Array[FixedInfo],
    flattenColumns: js.Array[ColumnType[Any]],
    indentSize: Double,
    onTriggerExpand: (Any, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit,
    prefixCls: String,
    rowClassName: String | RowClassName[Any]
  ): PickTableContextPropsanyp = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), fixedInfoList = fixedInfoList.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), prefixCls = prefixCls.asInstanceOf[js.Any], rowClassName = rowClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTableContextPropsanyp]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PickTableContextPropsanyp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIcon(value: /* props */ RenderExpandIconProps[Any] => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableType(value: ExpandableType): Self = StObject.set(x, "expandableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedRowClassName(value: (Any, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExpandedRowRender(value: (Any, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFixedInfoList(value: js.Array[FixedInfo]): Self = StObject.set(x, "fixedInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedInfoListVarargs(value: FixedInfo*): Self = StObject.set(x, "fixedInfoList", js.Array(value :_*))
    
    @scala.inline
    def setFlattenColumns(value: js.Array[ColumnType[Any]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenColumnsVarargs(value: ColumnType[Any]*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
    
    @scala.inline
    def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRow(value: (Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
    
    @scala.inline
    def setOnTriggerExpand(value: (Any, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onTriggerExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowClassName(value: String | RowClassName[Any]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowClassNameFunction3(value: (Any, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
  }
}
