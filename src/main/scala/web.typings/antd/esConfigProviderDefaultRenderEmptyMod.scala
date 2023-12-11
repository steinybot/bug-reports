package web.typings.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderDefaultRenderEmptyMod extends Shortcut {
  
  @JSImport("antd/es/config-provider/defaultRenderEmpty", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmptyProps] = js.native
  
  @js.native
  trait EmptyProps extends StObject {
    
    var componentName: js.UndefOr[String] = js.native
  }
  object EmptyProps {
    
    @scala.inline
    def apply(): EmptyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: EmptyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    }
  }
  
  type RenderEmptyHandler = js.Function1[/* componentName */ js.UndefOr[String], ReactElement]
  
  type _To = ReactComponentClass[EmptyProps]
  
  /* This means you don't have to write `default`, but can instead just say `esConfigProviderDefaultRenderEmptyMod.foo` */
  override def _to: ReactComponentClass[EmptyProps] = default
}
