package web.typings.antd.components

import web.typings.antd.esRadioRadioButtonMod.RadioButtonProps
import web.typings.rcCheckbox.mod.CheckboxRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  @JSImport("antd/es/radio/radioButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = RadioButtonProps with RefAttributes[CheckboxRef]
  
  implicit def make(companion: RadioButton.type): SharedBuilder_RadioButtonPropsRefAttributes1845227975[CheckboxRef] = new SharedBuilder_RadioButtonPropsRefAttributes1845227975[CheckboxRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioButtonProps with RefAttributes[CheckboxRef]): SharedBuilder_RadioButtonPropsRefAttributes1845227975[CheckboxRef] = new SharedBuilder_RadioButtonPropsRefAttributes1845227975[CheckboxRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
