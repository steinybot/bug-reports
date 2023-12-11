package web.typings.rcDrawer

import web.typings.react.mod.Context
import web.typings.react.mod.Ref
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("rc-drawer/es/context", JSImport.Default)
  @js.native
  val default: Context[DrawerContextProps] = js.native
  
  @JSImport("rc-drawer/es/context", "RefContext")
  @js.native
  val RefContext: Context[RefContextProps] = js.native
  
  @js.native
  trait DrawerContextProps extends StObject {
    
    var pull: VoidFunction = js.native
    
    var push: VoidFunction = js.native
    
    var pushDistance: js.UndefOr[Double | String] = js.native
  }
  object DrawerContextProps {
    
    @scala.inline
    def apply(pull: () => Unit, push: () => Unit): DrawerContextProps = {
      val __obj = js.Dynamic.literal(pull = js.Any.fromFunction0(pull), push = js.Any.fromFunction0(push))
      __obj.asInstanceOf[DrawerContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPull(value: () => Unit): Self = StObject.set(x, "pull", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: () => Unit): Self = StObject.set(x, "push", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPushDistance(value: Double | String): Self = StObject.set(x, "pushDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushDistanceUndefined: Self = StObject.set(x, "pushDistance", js.undefined)
    }
  }
  
  @js.native
  trait RefContextProps extends StObject {
    
    var panel: js.UndefOr[Ref[HTMLDivElement]] = js.native
  }
  object RefContextProps {
    
    @scala.inline
    def apply(): RefContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RefContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPanel(value: Ref[HTMLDivElement]): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "panel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelNull: Self = StObject.set(x, "panel", null)
      
      @scala.inline
      def setPanelReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    }
  }
  
  type _To = Context[DrawerContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[DrawerContextProps] = default
}
