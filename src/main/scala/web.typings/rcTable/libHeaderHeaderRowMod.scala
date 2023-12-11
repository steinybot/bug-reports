package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.CellType
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.CustomizeComponent
import web.typings.rcTable.libInterfaceMod.GetComponentProps
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.TdHTMLAttributes
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeaderHeaderRowMod {
  
  object default {
    
    @scala.inline
    def apply[RecordType](param0: RowProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Header/HeaderRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Header/HeaderRow", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RowProps[RecordType] extends StObject {
    
    var cellComponent: CustomizeComponent = js.native
    
    var cells: js.Array[CellType[RecordType]] = js.native
    
    var flattenColumns: js.Array[ColumnType[RecordType]] = js.native
    
    var index: Double = js.native
    
    var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]] = js.native
    
    var rowComponent: CustomizeComponent = js.native
    
    var stickyOffsets: StickyOffsets = js.native
    
    var tdCellComponent: CustomizeComponent = js.native
  }
  object RowProps {
    
    @scala.inline
    def apply[RecordType](
      cellComponent: CustomizeComponent,
      cells: js.Array[CellType[RecordType]],
      flattenColumns: js.Array[ColumnType[RecordType]],
      index: Double,
      onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any],
      rowComponent: CustomizeComponent,
      stickyOffsets: StickyOffsets,
      tdCellComponent: CustomizeComponent
    ): RowProps[RecordType] = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), rowComponent = rowComponent.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any], tdCellComponent = tdCellComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RowProps[_], RecordType] (val x: Self with RowProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCells(value: js.Array[CellType[RecordType]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellsVarargs(value: CellType[RecordType]*): Self = StObject.set(x, "cells", js.Array(value :_*))
      
      @scala.inline
      def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowComponent(value: CustomizeComponent): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTdCellComponent(value: CustomizeComponent): Self = StObject.set(x, "tdCellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTdCellComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "tdCellComponent", value.asInstanceOf[js.Any])
    }
  }
}
