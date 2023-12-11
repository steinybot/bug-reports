package web.typings.antd

import web.typings.antd.esCheckboxCheckboxMod.CheckboxProps
import web.typings.antd.esCheckboxGroupMod.CheckboxGroupProps
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

object esCheckboxMod extends Shortcut {
  
  @JSImport("antd/es/checkbox", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[CheckboxProps with RefAttributes[CheckboxRef]] {
    
    var Group: ReactComponentClass[ReactComponentClass[CheckboxGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esCheckboxMod.foo` */
  override def _to: CompoundedComponent = default
}
