package web.typings.antd

import web.typings.antd.esCheckboxCheckboxMod.AbstractCheckboxProps
import web.typings.antd.esRadioInterfaceMod.RadioChangeEvent
import web.typings.rcCheckbox.mod.CheckboxRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRadioRadioButtonMod extends Shortcut {
  
  @JSImport("antd/es/radio/radioButton", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RadioButtonProps with RefAttributes[CheckboxRef]] = js.native
  
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
  
  type _To = ReactComponentClass[RadioButtonProps with RefAttributes[CheckboxRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esRadioRadioButtonMod.foo` */
  override def _to: ReactComponentClass[RadioButtonProps with RefAttributes[CheckboxRef]] = default
}
