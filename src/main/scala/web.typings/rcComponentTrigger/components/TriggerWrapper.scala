package web.typings.rcComponentTrigger.components

import web.typings.StBuildingComponent
import web.typings.rcComponentTrigger.esTriggerWrapperMod.TriggerWrapperProps
import web.typings.react.mod.ReactInstance
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TriggerWrapper {
  
  @JSImport("@rc-component/trigger/es/TriggerWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    
    @scala.inline
    def getTriggerDOMNode(value: /* node */ ReactInstance => HTMLElement): this.type = set("getTriggerDOMNode", js.Any.fromFunction1(value))
  }
  
  type Props = TriggerWrapperProps with RefAttributes[HTMLElement]
  
  implicit def make(companion: TriggerWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TriggerWrapperProps with RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
