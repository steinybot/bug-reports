package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indicator extends StObject {
  
  var indicator: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object Indicator {
  
  @scala.inline
  def apply(): Indicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indicator]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Indicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
