package web.typings.rcTable.anon

import web.typings.rcTable.libInterfaceMod.ColumnGroupType
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import web.typings.rcTable.libInterfaceMod.Direction
import web.typings.rcTable.libInterfaceMod.FixedType
import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.rcTable.libInterfaceMod.Key
import web.typings.rcTable.libInterfaceMod.RenderExpandIcon
import web.typings.rcTable.libInterfaceMod.RenderExpandIconProps
import web.typings.rcTable.libInterfaceMod.TriggerEventHandler
import web.typings.std.Set
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientWidth[RecordType] extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var clientWidth: Double = js.native
  
  var columnTitle: js.UndefOr[ReactElement] = js.native
  
  var columnWidth: js.UndefOr[Double | String] = js.native
  
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
  
  var direction: js.UndefOr[Direction] = js.native
  
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
  
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  
  var expandRowByClick: js.UndefOr[Boolean] = js.native
  
  var expandable: Boolean = js.native
  
  var expandedKeys: Set[Key] = js.native
  
  var fixed: js.UndefOr[FixedType] = js.native
  
  var getRowKey: GetRowKey[RecordType] = js.native
  
  var onTriggerExpand: TriggerEventHandler[RecordType] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.native
  
  var scrollWidth: js.UndefOr[Double] = js.native
}
object ClientWidth {
  
  @scala.inline
  def apply[RecordType](
    clientWidth: Double,
    expandable: Boolean,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    onTriggerExpand: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit
  ): ClientWidth[RecordType] = {
    val __obj = js.Dynamic.literal(clientWidth = clientWidth.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), onTriggerExpand = js.Any.fromFunction2(onTriggerExpand))
    __obj.asInstanceOf[ClientWidth[RecordType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ClientWidth[_], RecordType] (val x: Self with ClientWidth[RecordType]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnTitle(value: ReactElement): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
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
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnTriggerExpand(value: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onTriggerExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRowExpandable(value: /* record */ RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowExpandableUndefined: Self = StObject.set(x, "rowExpandable", js.undefined)
    
    @scala.inline
    def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
  }
}
