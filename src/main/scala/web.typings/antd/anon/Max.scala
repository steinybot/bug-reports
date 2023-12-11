package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Max extends StObject {
  
  def max(values: Double*): Double = js.native
  
  def min(values: Double*): Double = js.native
}
object Max {
  
  @scala.inline
  def apply(max: /* repeated */ Double => Double, min: /* repeated */ Double => Double): Max = {
    val __obj = js.Dynamic.literal(max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min))
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: /* repeated */ Double => Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMin(value: /* repeated */ Double => Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
  }
}
