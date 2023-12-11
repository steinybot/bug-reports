package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.AlignType
import web.typings.rcTable.libInterfaceMod.CellEllipsisType
import web.typings.rcTable.libInterfaceMod.DataIndex
import web.typings.rcTable.libInterfaceMod.FixedType
import web.typings.rcTable.libInterfaceMod.GetComponentProps
import web.typings.rcTable.libInterfaceMod.Key
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

object libSugarColumnGroupMod {
  
  @JSImport("rc-table/lib/sugar/ColumnGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  @scala.inline
  def default[RecordType](_underscore: ColumnGroupProps[RecordType]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* Inlined parent std.Omit<rc-table.rc-table/lib/interface.ColumnType<RecordType>, 'children'> */
  @js.native
  trait ColumnGroupProps[RecordType] extends StObject {
    
    var align: js.UndefOr[AlignType] = js.native
    
    var children: ReactElement | js.Array[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var dataIndex: js.UndefOr[DataIndex] = js.native
    
    var ellipsis: js.UndefOr[CellEllipsisType] = js.native
    
    var fixed: js.UndefOr[FixedType] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var onCell: js.UndefOr[GetComponentProps[RecordType]] = js.native
    
    var onCellClick: js.UndefOr[
        js.Function2[/* record */ RecordType, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
      ] = js.native
    
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
    
    var rowScope: js.UndefOr[RowScopeType] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  object ColumnGroupProps {
    
    @scala.inline
    def apply[RecordType](children: ReactElement | js.Array[ReactElement]): ColumnGroupProps[RecordType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColumnGroupProps[_], RecordType] (val x: Self with ColumnGroupProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
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
      def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
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
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
