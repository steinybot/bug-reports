package web.typings.rcTable

import web.typings.rcComponentContext.esImmutableMod.CompareProps
import web.typings.rcTable.anon.FnCallTablePropsRef
import web.typings.rcTable.libFooterSummaryMod.SummaryProps
import web.typings.rcTable.libSugarColumnGroupMod.ColumnGroupProps
import web.typings.rcTable.libSugarColumnMod.ColumnProps
import web.typings.rcTable.libTableMod.ForwardGenericTable
import web.typings.rcTable.libTableMod.ImmutableTableType
import web.typings.rcTable.libVirtualTableMod.ForwardGenericVirtualTable
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-table", JSImport.Default)
  @js.native
  val default: ImmutableTableType = js.native
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  @scala.inline
  def Column[RecordType](_underscore: ColumnProps[RecordType]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  @scala.inline
  def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ColumnGroup")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("rc-table", "INTERNAL_COL_DEFINE")
  @js.native
  val INTERNAL_COL_DEFINE: /* "RC_TABLE_INTERNAL_COL_DEFINE" */ String = js.native
  
  @JSImport("rc-table", "INTERNAL_HOOKS")
  @js.native
  val INTERNAL_HOOKS: /* "rc-table-internal-hook" */ String = js.native
  
  object Summary {
    
    /**
      * Syntactic sugar. Do not support HOC.
      */
    @scala.inline
    def apply(param0: SummaryProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-table", "Summary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table", "Summary.Cell")
    @js.native
    def Cell: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any = js.native
    @scala.inline
    def Cell_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-table", "Summary.Row")
    @js.native
    def Row: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any = js.native
    @scala.inline
    def Row_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-table", "VirtualTable")
  @js.native
  val VirtualTable: ForwardGenericVirtualTable = js.native
  
  @scala.inline
  def genTable(): ForwardGenericTable = ^.asInstanceOf[js.Dynamic].applyDynamic("genTable")().asInstanceOf[ForwardGenericTable]
  @scala.inline
  def genTable(shouldTriggerRender: CompareProps[FnCallTablePropsRef]): ForwardGenericTable = ^.asInstanceOf[js.Dynamic].applyDynamic("genTable")(shouldTriggerRender.asInstanceOf[js.Any]).asInstanceOf[ForwardGenericTable]
  
  @scala.inline
  def genVirtualTable(): ForwardGenericVirtualTable = ^.asInstanceOf[js.Dynamic].applyDynamic("genVirtualTable")().asInstanceOf[ForwardGenericVirtualTable]
  @scala.inline
  def genVirtualTable(shouldTriggerRender: CompareProps[ImmutableTableType]): ForwardGenericVirtualTable = ^.asInstanceOf[js.Dynamic].applyDynamic("genVirtualTable")(shouldTriggerRender.asInstanceOf[js.Any]).asInstanceOf[ForwardGenericVirtualTable]
}
