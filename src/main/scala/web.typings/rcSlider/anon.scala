package web.typings.rcSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Value extends StObject {
    
    var value: Double = js.native
    
    var values: js.Array[Double] = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: Double, values: js.Array[Double]): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
