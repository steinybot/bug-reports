package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Min extends StObject {
  
  def max(args: (String | Double)*): String = js.native
  
  def min(args: (String | Double)*): String = js.native
}
object Min {
  
  @scala.inline
  def apply(max: /* repeated */ String | Double => String, min: /* repeated */ String | Double => String): Min = {
    val __obj = js.Dynamic.literal(max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min))
    __obj.asInstanceOf[Min]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Min] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: /* repeated */ String | Double => String): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMin(value: /* repeated */ String | Double => String): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
  }
}
