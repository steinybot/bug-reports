package web.typings.rcInput

import web.typings.rcInput.esInterfaceMod.BaseInputProps
import web.typings.rcInput.esInterfaceMod.InputProps
import web.typings.rcInput.esInterfaceMod.InputRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-input", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InputProps with RefAttributes[InputRef]] = js.native
  
  @JSImport("rc-input", "BaseInput")
  @js.native
  val BaseInput: ReactComponentClass[BaseInputProps] = js.native
  
  type _To = ReactComponentClass[InputProps with RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[InputProps with RefAttributes[InputRef]] = default
}
