package web.typings.antDesignIcons

import web.typings.antDesignIcons.anon.Nonce
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsContextMod extends Shortcut {
  
  @JSImport("@ant-design/icons/es/components/Context", JSImport.Default)
  @js.native
  val default: Context[IconContextProps] = js.native
  
  @js.native
  trait IconContextProps extends StObject {
    
    var csp: js.UndefOr[Nonce] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
  }
  object IconContextProps {
    
    @scala.inline
    def apply(): IconContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: IconContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsp(value: Nonce): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    }
  }
  
  type _To = Context[IconContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsContextMod.foo` */
  override def _to: Context[IconContextProps] = default
}
