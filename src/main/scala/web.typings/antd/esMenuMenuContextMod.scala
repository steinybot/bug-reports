package web.typings.antd

import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMenuMenuContextMod extends Shortcut {
  
  @JSImport("antd/es/menu/MenuContext", JSImport.Default)
  @js.native
  val default: Context[MenuContextProps] = js.native
  
  @js.native
  trait MenuContextProps extends StObject {
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var firstLevel: Boolean = js.native
    
    var inlineCollapsed: Boolean = js.native
    
    var prefixCls: String = js.native
    
    var theme: js.UndefOr[MenuTheme] = js.native
  }
  object MenuContextProps {
    
    @scala.inline
    def apply(firstLevel: Boolean, inlineCollapsed: Boolean, prefixCls: String): MenuContextProps = {
      val __obj = js.Dynamic.literal(firstLevel = firstLevel.asInstanceOf[js.Any], inlineCollapsed = inlineCollapsed.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFirstLevel(value: Boolean): Self = StObject.set(x, "firstLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineCollapsed(value: Boolean): Self = StObject.set(x, "inlineCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: MenuTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.light
    - `web.typings`.antd.antdStrings.dark
  */
  trait MenuTheme extends StObject
  object MenuTheme {
    
    @scala.inline
    def dark: web.typings.antd.antdStrings.dark = "dark".asInstanceOf[web.typings.antd.antdStrings.dark]
    
    @scala.inline
    def light: web.typings.antd.antdStrings.light = "light".asInstanceOf[web.typings.antd.antdStrings.light]
  }
  
  type _To = Context[MenuContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esMenuMenuContextMod.foo` */
  override def _to: Context[MenuContextProps] = default
}
