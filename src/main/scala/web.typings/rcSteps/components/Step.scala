package web.typings.rcSteps.components

import web.typings.rcSteps.libStepMod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Step {
  
  @JSImport("rc-steps", "Step")
  @js.native
  val component: js.Object = js.native
  
  type Props = StepProps
  
  implicit def make(companion: Step.type): SharedBuilder_StepProps_830299305 = new SharedBuilder_StepProps_830299305(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepProps): SharedBuilder_StepProps_830299305 = new SharedBuilder_StepProps_830299305(js.Array(this.component, p.asInstanceOf[js.Any]))
}
