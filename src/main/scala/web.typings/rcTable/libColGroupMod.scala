package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColGroupMod {
  
  @JSImport("rc-table/lib/ColGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](param0: ColGroupProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait ColGroupProps[RecordType] extends StObject {
    
    var colWidths: js.Array[Double | String] = js.native
    
    var columCount: js.UndefOr[Double] = js.native
    
    var columns: js.UndefOr[js.Array[ColumnType[RecordType]]] = js.native
  }
  object ColGroupProps {
    
    @scala.inline
    def apply[RecordType](colWidths: js.Array[Double | String]): ColGroupProps[RecordType] = {
      val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColGroupProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColGroupProps[_], RecordType] (val x: Self with ColGroupProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setColWidths(value: js.Array[Double | String]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidthsVarargs(value: (Double | String)*): Self = StObject.set(x, "colWidths", js.Array(value :_*))
      
      @scala.inline
      def setColumCount(value: Double): Self = StObject.set(x, "columCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumCountUndefined: Self = StObject.set(x, "columCount", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "columns", js.Array(value :_*))
    }
  }
}
