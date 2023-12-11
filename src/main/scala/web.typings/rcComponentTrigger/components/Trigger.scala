package web.typings.rcComponentTrigger.components

import web.typings.rcComponentTrigger.mod.TriggerProps
import web.typings.rcComponentTrigger.mod.TriggerRef
import web.typings.react.mod.RefAttributes
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Trigger {
  
  @scala.inline
  def apply(popup: ReactElement | js.Function0[ReactElement]): SharedBuilder_TriggerPropsRefAttributes1011865626[TriggerRef] = {
    val __props = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    new SharedBuilder_TriggerPropsRefAttributes1011865626[TriggerRef](js.Array(this.component, __props.asInstanceOf[TriggerProps with RefAttributes[TriggerRef]]))
  }
  
  @JSImport("@rc-component/trigger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = TriggerProps with RefAttributes[TriggerRef]
  
  def withProps(p: TriggerProps with RefAttributes[TriggerRef]): SharedBuilder_TriggerPropsRefAttributes1011865626[TriggerRef] = new SharedBuilder_TriggerPropsRefAttributes1011865626[TriggerRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
