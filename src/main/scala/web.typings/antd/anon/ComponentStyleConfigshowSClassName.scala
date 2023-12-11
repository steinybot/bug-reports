package web.typings.antd.anon

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/config-provider/context.ComponentStyleConfig & {  showSearch :boolean | undefined} */
@js.native
trait ComponentStyleConfigshowSClassName extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var showSearch: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object ComponentStyleConfigshowSClassName {
  
  @scala.inline
  def apply(): ComponentStyleConfigshowSClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentStyleConfigshowSClassName]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComponentStyleConfigshowSClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
