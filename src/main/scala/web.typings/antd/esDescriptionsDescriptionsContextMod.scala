package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDescriptionsDescriptionsContextMod extends Shortcut {
  
  @JSImport("antd/es/descriptions/DescriptionsContext", JSImport.Default)
  @js.native
  val default: Context[DescriptionsContextProps] = js.native
  
  @js.native
  trait DescriptionsContextProps extends StObject {
    
    var contentStyle: js.UndefOr[CSSProperties] = js.native
    
    var labelStyle: js.UndefOr[CSSProperties] = js.native
  }
  object DescriptionsContextProps {
    
    @scala.inline
    def apply(): DescriptionsContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionsContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DescriptionsContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    }
  }
  
  type _To = Context[DescriptionsContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esDescriptionsDescriptionsContextMod.foo` */
  override def _to: Context[DescriptionsContextProps] = default
}
