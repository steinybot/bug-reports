package web.typings.rcTable

import web.typings.react.mod.JSX.Element
import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyMeasureCellMod {
  
  @JSImport("rc-table/lib/Body/MeasureCell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: MeasureCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait MeasureCellProps extends StObject {
    
    var columnKey: Key = js.native
    
    def onColumnResize(key: Key, width: Double): Unit = js.native
  }
  object MeasureCellProps {
    
    @scala.inline
    def apply(columnKey: Key, onColumnResize: (Key, Double) => Unit): MeasureCellProps = {
      val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize))
      __obj.asInstanceOf[MeasureCellProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MeasureCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnColumnResize(value: (Key, Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
    }
  }
}
