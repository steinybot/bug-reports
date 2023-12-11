package web.typings.rcSteps

import web.typings.rcSteps.libStepMod.StepProps
import web.typings.rcSteps.libStepsMod.StepsProps
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @scala.inline
    def apply(props: StepsProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Step.default` */
    @scala.inline
    def Step(props: StepProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Step")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  @scala.inline
  def Step(props: StepProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Step")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
