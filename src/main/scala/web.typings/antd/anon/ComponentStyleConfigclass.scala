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

/* Inlined antd.antd/es/config-provider/context.ComponentStyleConfig & {  classNames :rc-input.anon.Prefix | undefined & rc-input.anon.Input | undefined | undefined,   styles :rc-input.anon.Suffix | undefined & rc-input.anon.CountInput | undefined | undefined,   autoComplete :string | undefined} */
@js.native
trait ComponentStyleConfigclass extends StObject {
  
  var autoComplete: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classNames: js.UndefOr[js.UndefOr[Prefix] with Input] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var styles: js.UndefOr[js.UndefOr[Suffix] with CountInput] = js.native
}
object ComponentStyleConfigclass {
  
  @scala.inline
  def apply(): ComponentStyleConfigclass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentStyleConfigclass]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComponentStyleConfigclass] (val x: Self) extends AnyVal {
    
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
