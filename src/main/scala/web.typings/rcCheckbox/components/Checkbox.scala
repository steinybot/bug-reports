package web.typings.rcCheckbox.components

import web.typings.rcCheckbox.mod.CheckboxProps
import web.typings.rcCheckbox.mod.CheckboxRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  @JSImport("rc-checkbox", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  type Props = CheckboxProps with RefAttributes[CheckboxRef]
  
  implicit def make(companion: Checkbox.type): SharedBuilder_CheckboxPropsRefAttributes569128606[CheckboxRef] = new SharedBuilder_CheckboxPropsRefAttributes569128606[CheckboxRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckboxProps with RefAttributes[CheckboxRef]): SharedBuilder_CheckboxPropsRefAttributes569128606[CheckboxRef] = new SharedBuilder_CheckboxPropsRefAttributes569128606[CheckboxRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
