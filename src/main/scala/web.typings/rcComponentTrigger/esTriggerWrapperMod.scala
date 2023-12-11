package web.typings.rcComponentTrigger

import web.typings.react.mod.ReactInstance
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTriggerWrapperMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/TriggerWrapper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TriggerWrapperProps with RefAttributes[HTMLElement]] = js.native
  
  @js.native
  trait TriggerWrapperProps extends StObject {
    
    var children: ReactElement = js.native
    
    var getTriggerDOMNode: js.UndefOr[js.Function1[/* node */ ReactInstance, HTMLElement]] = js.native
  }
  object TriggerWrapperProps {
    
    @scala.inline
    def apply(children: ReactElement): TriggerWrapperProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerWrapperProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TriggerWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTriggerDOMNode(value: /* node */ ReactInstance => HTMLElement): Self = StObject.set(x, "getTriggerDOMNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTriggerDOMNodeUndefined: Self = StObject.set(x, "getTriggerDOMNode", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TriggerWrapperProps with RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTriggerWrapperMod.foo` */
  override def _to: ReactComponentClass[TriggerWrapperProps with RefAttributes[HTMLElement]] = default
}
