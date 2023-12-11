package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.ColumnGroupType
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import web.typings.rcTable.libInterfaceMod.GetComponentProps
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.TdHTMLAttributes
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeaderHeaderMod {
  
  @JSImport("rc-table/lib/Header/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof Header` */
  @scala.inline
  def default[RecordType](props: HeaderProps[RecordType]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @js.native
  trait HeaderProps[RecordType] extends StObject {
    
    var columns: ColumnsType[RecordType] = js.native
    
    var flattenColumns: js.Array[ColumnType[RecordType]] = js.native
    
    var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]] = js.native
    
    var stickyOffsets: StickyOffsets = js.native
  }
  object HeaderProps {
    
    @scala.inline
    def apply[RecordType](
      columns: ColumnsType[RecordType],
      flattenColumns: js.Array[ColumnType[RecordType]],
      onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any],
      stickyOffsets: StickyOffsets
    ): HeaderProps[RecordType] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HeaderProps[_], RecordType] (val x: Self with HeaderProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
      
      @scala.inline
      def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    }
  }
}
