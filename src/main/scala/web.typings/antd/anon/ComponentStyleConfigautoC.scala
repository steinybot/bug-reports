package web.typings.antd.anon

import web.typings.rcInput.anon.CountInput
import web.typings.rcInput.anon.Input
import web.typings.rcInput.anon.Prefix
import web.typings.rcInput.anon.Suffix
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/config-provider/context.ComponentStyleConfig & {  autoComplete :string | undefined,   classNames :antd.antd/es/input.InputProps['classNames'] | undefined,   styles :antd.antd/es/input.InputProps['styles'] | undefined} */
@js.native
trait ComponentStyleConfigautoC extends StObject {
  
  var autoComplete: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classNames: js.UndefOr[js.UndefOr[Prefix] with Input] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var styles: js.UndefOr[js.UndefOr[Suffix] with CountInput] = js.native
}
object ComponentStyleConfigautoC {
  
  @scala.inline
  def apply(): ComponentStyleConfigautoC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentStyleConfigautoC]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComponentStyleConfigautoC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClassNames(value: js.UndefOr[Prefix] with Input): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: js.UndefOr[Suffix] with CountInput): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
