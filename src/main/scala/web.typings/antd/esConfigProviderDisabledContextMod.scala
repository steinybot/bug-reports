package web.typings.antd

import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderDisabledContextMod extends Shortcut {
  
  @JSImport("antd/es/config-provider/DisabledContext", JSImport.Default)
  @js.native
  val default: Context[DisabledType] = js.native
  
  @JSImport("antd/es/config-provider/DisabledContext", "DisabledContextProvider")
  @js.native
  val DisabledContextProvider: ReactComponentClass[DisabledContextProps] = js.native
  
  @js.native
  trait DisabledContextProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[DisabledType] = js.native
  }
  object DisabledContextProps {
    
    @scala.inline
    def apply(): DisabledContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisabledContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DisabledContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: DisabledType): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  type DisabledType = js.UndefOr[Boolean]
  
  type _To = Context[DisabledType]
  
  /* This means you don't have to write `default`, but can instead just say `esConfigProviderDisabledContextMod.foo` */
  override def _to: Context[DisabledType] = default
}
