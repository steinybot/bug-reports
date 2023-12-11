package web.typings.rcTable

import web.typings.rcTable.anon.Scrollbar
import web.typings.rcTable.libFooterSummaryMod.SummaryProps
import web.typings.rcTable.libInterfaceMod.ColumnGroupType
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterMod {
  
  @JSImport("rc-table/lib/Footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof Footer` */
  @scala.inline
  def default[RecordType](props: FooterProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object FooterComponents {
    
    /**
      * Syntactic sugar. Do not support HOC.
      */
    @scala.inline
    def apply(param0: SummaryProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-table/lib/Footer", "FooterComponents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Cell")
    @js.native
    def Cell: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any = js.native
    @scala.inline
    def Cell_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Row")
    @js.native
    def Row: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any = js.native
    @scala.inline
    def Row_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
  
  type FlattenColumns[RecordType] = js.Array[ColumnType[RecordType] with Scrollbar]
  
  @js.native
  trait FooterProps[RecordType] extends StObject {
    
    var children: ReactElement = js.native
    
    var columns: ColumnsType[RecordType] = js.native
    
    var flattenColumns: FlattenColumns[RecordType] = js.native
    
    var stickyOffsets: StickyOffsets = js.native
  }
  object FooterProps {
    
    @scala.inline
    def apply[RecordType](
      children: ReactElement,
      columns: ColumnsType[RecordType],
      flattenColumns: FlattenColumns[RecordType],
      stickyOffsets: StickyOffsets
    ): FooterProps[RecordType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[FooterProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FooterProps[_], RecordType] (val x: Self with FooterProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setFlattenColumns(value: FlattenColumns[RecordType]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenColumnsVarargs(value: (ColumnType[RecordType] with Scrollbar)*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
      
      @scala.inline
      def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    }
  }
}
