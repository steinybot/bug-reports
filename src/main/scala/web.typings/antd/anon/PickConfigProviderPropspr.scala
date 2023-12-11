package web.typings.antd.anon

import web.typings.antd.esConfigProviderContextMod.ThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd.antd/es/config-provider.ConfigProviderProps, 'prefixCls' | 'iconPrefixCls'> & {  theme :antd.antd/es/config-provider/context.ThemeConfig | antd.antd/es/config-provider/context.Theme | undefined} */
@js.native
trait PickConfigProviderPropspr extends StObject {
  
  var iconPrefixCls: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[ThemeConfig | web.typings.antd.esConfigProviderContextMod.Theme] = js.native
}
object PickConfigProviderPropspr {
  
  @scala.inline
  def apply(): PickConfigProviderPropspr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickConfigProviderPropspr]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PickConfigProviderPropspr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconPrefixCls(value: String): Self = StObject.set(x, "iconPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPrefixClsUndefined: Self = StObject.set(x, "iconPrefixCls", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeConfig | web.typings.antd.esConfigProviderContextMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
