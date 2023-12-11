package web.typings.rcTable

import web.typings.react.mod.JSX.Element
import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyMeasureRowMod {
  
  @JSImport("rc-table/lib/Body/MeasureRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: MeasureCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait MeasureCellProps extends StObject {
    
    var columnsKey: js.Array[Key] = js.native
    
    def onColumnResize(key: Key, width: Double): Unit = js.native
    
    var prefixCls: String = js.native
  }
  object MeasureCellProps {
    
    @scala.inline
    def apply(columnsKey: js.Array[Key], onColumnResize: (Key, Double) => Unit, prefixCls: String): MeasureCellProps = {
      val __obj = js.Dynamic.literal(columnsKey = columnsKey.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureCellProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MeasureCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnsKey(value: js.Array[Key]): Self = StObject.set(x, "columnsKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsKeyVarargs(value: Key*): Self = StObject.set(x, "columnsKey", js.Array(value :_*))
      
      @scala.inline
      def setOnColumnResize(value: (Key, Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
