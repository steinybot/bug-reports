package web.typings.rcTable

import web.typings.rcTable.anon.FnCall
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import web.typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVirtualTableVirtualCellMod {
  
  @JSImport("rc-table/lib/VirtualTable/VirtualCell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](props: VirtualCellProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getColumnWidth(colIndex: Double, colSpan: Double, columnsOffset: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumnWidth")(colIndex.asInstanceOf[js.Any], colSpan.asInstanceOf[js.Any], columnsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @js.native
  trait VirtualCellProps[RecordType] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var colIndex: Double = js.native
    
    var column: ColumnType[RecordType] = js.native
    
    var getHeight: js.UndefOr[js.Function1[/* rowSpan */ Double, Double]] = js.native
    
    var indent: Double = js.native
    
    var index: Double = js.native
    
    /** Render cell only when it has `rowSpan > 1` */
    var inverse: js.UndefOr[Boolean] = js.native
    
    var record: RecordType = js.native
    
    /** Used for `column.render` */
    var renderIndex: Double = js.native
    
    var rowInfo: ReturnType[FnCall] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object VirtualCellProps {
    
    @scala.inline
    def apply[RecordType](
      colIndex: Double,
      column: ColumnType[RecordType],
      indent: Double,
      index: Double,
      record: RecordType,
      renderIndex: Double,
      rowInfo: ReturnType[FnCall]
    ): VirtualCellProps[RecordType] = {
      val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], renderIndex = renderIndex.asInstanceOf[js.Any], rowInfo = rowInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualCellProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: VirtualCellProps[_], RecordType] (val x: Self with VirtualCellProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetHeight(value: /* rowSpan */ Double => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderIndex(value: Double): Self = StObject.set(x, "renderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowInfo(value: ReturnType[FnCall]): Self = StObject.set(x, "rowInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
