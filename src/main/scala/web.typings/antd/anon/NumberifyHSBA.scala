package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ctrl/tinycolor.@ctrl/tinycolor.Numberify<@rc-component/color-picker.@rc-component/color-picker.HSBA> */
@js.native
trait NumberifyHSBA extends StObject {
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  var h: Double = js.native
  
  var s: Double = js.native
}
object NumberifyHSBA {
  
  @scala.inline
  def apply(a: Double, b: Double, h: Double, s: Double): NumberifyHSBA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberifyHSBA]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: NumberifyHSBA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
