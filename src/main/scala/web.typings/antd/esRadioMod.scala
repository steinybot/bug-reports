package web.typings.antd

import web.typings.antd.esRadioInterfaceMod.RadioGroupProps
import web.typings.antd.esRadioInterfaceMod.RadioProps
import web.typings.antd.esRadioRadioButtonMod.RadioButtonProps
import web.typings.rcCheckbox.mod.CheckboxRef
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRadioMod extends Shortcut {
  
  @JSImport("antd/es/radio", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/es/radio", "Button")
  @js.native
  val Button: ReactComponentClass[RadioButtonProps with RefAttributes[CheckboxRef]] = js.native
  
  @JSImport("antd/es/radio", "Group")
  @js.native
  val Group: ReactComponentClass[ReactComponentClass[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[RadioProps with RefAttributes[CheckboxRef]] {
    
    var Button: ReactComponentClass[RadioButtonProps with RefAttributes[CheckboxRef]] = js.native
    
    var Group: ReactComponentClass[ReactComponentClass[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esRadioMod.foo` */
  override def _to: CompoundedComponent = default
}
