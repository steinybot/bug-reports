package web.typings.react.components

import web.typings.StBuildingComponent
import web.typings.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder
import web.typings.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode
import web.typings.react.reactStrings.backwards
import web.typings.react.reactStrings.forwards
import web.typings.std.Exclude
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuspenseList {
  
  object DirectionalSuspenseListProps {
    
    @scala.inline
    def apply(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[web.typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]))
    }
    
    @JSImport("react", "SuspenseList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def tail(value: SuspenseListTailMode): this.type = set("tail", value.asInstanceOf[js.Any])
    }
    
    type Props = web.typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
    
    def withProps(p: web.typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object NonDirectionalSuspenseListProps {
    
    @scala.inline
    def apply(children: ReactElement | js.Iterable[ReactElement]): Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[web.typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]))
    }
    
    @JSImport("react", "SuspenseList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def revealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): this.type = set("revealOrder", value.asInstanceOf[js.Any])
    }
    
    type Props = web.typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
    
    def withProps(p: web.typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
