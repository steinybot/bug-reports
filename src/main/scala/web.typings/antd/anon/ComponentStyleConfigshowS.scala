package web.typings.antd.anon

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/config-provider/context.ComponentStyleConfig & {  showSizeChanger :boolean | undefined} */
@js.native
trait ComponentStyleConfigshowS extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var showSizeChanger: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object ComponentStyleConfigshowS {
  
  @scala.inline
  def apply(): ComponentStyleConfigshowS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentStyleConfigshowS]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComponentStyleConfigshowS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
