package web.typings.rcTable

import web.typings.rcTable.anon.AdditionalCellProps
import web.typings.rcTable.anon.Children
import web.typings.rcTable.anon.FnCall
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.CustomizeComponent
import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.Key
import web.typings.std.ReturnType
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyBodyRowMod {
  
  @JSImport("rc-table/lib/Body/BodyRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof BodyRow` */
  object default {
    
    @scala.inline
    def apply[RecordType /* <: Children[RecordType] */](props: BodyRowProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Body/BodyRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Body/BodyRow", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getCellProps[RecordType](
    rowInfo: ReturnType[FnCall],
    column: ColumnType[RecordType],
    colIndex: Double,
    indent: Double,
    index: Double
  ): AdditionalCellProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellProps")(rowInfo.asInstanceOf[js.Any], column.asInstanceOf[js.Any], colIndex.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[AdditionalCellProps]
  
  @js.native
  trait BodyRowProps[RecordType] extends StObject {
    
    var cellComponent: CustomizeComponent = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var getRowKey: GetRowKey[RecordType] = js.native
    
    var indent: js.UndefOr[Double] = js.native
    
    var index: Double = js.native
    
    var record: RecordType = js.native
    
    var renderIndex: Double = js.native
    
    var rowComponent: CustomizeComponent = js.native
    
    var rowKey: Key = js.native
    
    var scopeCellComponent: CustomizeComponent = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object BodyRowProps {
    
    @scala.inline
    def apply[RecordType](
      cellComponent: CustomizeComponent,
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => web.typings.rcTable.libInterfaceMod.Key,
      index: Double,
      record: RecordType,
      renderIndex: Double,
      rowComponent: CustomizeComponent,
      rowKey: Key,
      scopeCellComponent: CustomizeComponent
    ): BodyRowProps[RecordType] = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], renderIndex = renderIndex.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any], scopeCellComponent = scopeCellComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyRowProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BodyRowProps[_], RecordType] (val x: Self with BodyRowProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => web.typings.rcTable.libInterfaceMod.Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderIndex(value: Double): Self = StObject.set(x, "renderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowComponent(value: CustomizeComponent): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowKey(value: Key): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeCellComponent(value: CustomizeComponent): Self = StObject.set(x, "scopeCellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeCellComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "scopeCellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
