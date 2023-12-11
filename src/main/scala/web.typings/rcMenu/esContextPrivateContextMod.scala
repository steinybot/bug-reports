package web.typings.rcMenu

import web.typings.rcMenu.anon.Active
import web.typings.rcMenu.anon.Selected
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextPrivateContextMod extends Shortcut {
  
  @JSImport("rc-menu/es/context/PrivateContext", JSImport.Default)
  @js.native
  val default: Context[PrivateContextProps] = js.native
  
  @js.native
  trait PrivateContextProps extends StObject {
    
    var _internalRenderMenuItem: js.UndefOr[
        js.Function3[
          /* originNode */ ReactElement, 
          /* menuItemProps */ Any, 
          /* stateProps */ Selected, 
          ReactElement
        ]
      ] = js.native
    
    var _internalRenderSubMenuItem: js.UndefOr[
        js.Function3[
          /* originNode */ ReactElement, 
          /* subMenuItemProps */ Any, 
          /* stateProps */ Active, 
          ReactElement
        ]
      ] = js.native
  }
  object PrivateContextProps {
    
    @scala.inline
    def apply(): PrivateContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrivateContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PrivateContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_internalRenderMenuItem(
        value: (/* originNode */ ReactElement, /* menuItemProps */ Any, /* stateProps */ Selected) => ReactElement
      ): Self = StObject.set(x, "_internalRenderMenuItem", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_internalRenderMenuItemUndefined: Self = StObject.set(x, "_internalRenderMenuItem", js.undefined)
      
      @scala.inline
      def set_internalRenderSubMenuItem(
        value: (/* originNode */ ReactElement, /* subMenuItemProps */ Any, /* stateProps */ Active) => ReactElement
      ): Self = StObject.set(x, "_internalRenderSubMenuItem", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_internalRenderSubMenuItemUndefined: Self = StObject.set(x, "_internalRenderSubMenuItem", js.undefined)
    }
  }
  
  type _To = Context[PrivateContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextPrivateContextMod.foo` */
  override def _to: Context[PrivateContextProps] = default
}
