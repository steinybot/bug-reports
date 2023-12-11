package web.typings.antd.anon

import web.typings.rcTabs.esHooksUseIndicatorMod.GetIndicatorSize
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/config-provider/context.ComponentStyleConfig & std.Pick<antd.antd/es/tabs.TabsProps, 'indicatorSize'> */
@js.native
trait ComponentStyleConfigPickT extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var indicatorSize: js.UndefOr[GetIndicatorSize] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object ComponentStyleConfigPickT {
  
  @scala.inline
  def apply(): ComponentStyleConfigPickT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentStyleConfigPickT]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComponentStyleConfigPickT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIndicatorSize(value: GetIndicatorSize): Self = StObject.set(x, "indicatorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSizeFunction1(value: /* origin */ Double => Double): Self = StObject.set(x, "indicatorSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndicatorSizeUndefined: Self = StObject.set(x, "indicatorSize", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
