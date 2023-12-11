package web.typings.antd

import web.typings.antd.esRadioInterfaceMod.RadioProps
import web.typings.rcCheckbox.mod.CheckboxRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRadioRadioMod extends Shortcut {
  
  @JSImport("antd/es/radio/radio", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RadioProps with RefAttributes[CheckboxRef]] = js.native
  
  type _To = ReactComponentClass[RadioProps with RefAttributes[CheckboxRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esRadioRadioMod.foo` */
  override def _to: ReactComponentClass[RadioProps with RefAttributes[CheckboxRef]] = default
}
