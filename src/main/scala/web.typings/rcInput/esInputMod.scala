package web.typings.rcInput

import web.typings.rcInput.esInterfaceMod.InputProps
import web.typings.rcInput.esInterfaceMod.InputRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInputMod extends Shortcut {
  
  @JSImport("rc-input/es/Input", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InputProps with RefAttributes[InputRef]] = js.native
  
  type _To = ReactComponentClass[InputProps with RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esInputMod.foo` */
  override def _to: ReactComponentClass[InputProps with RefAttributes[InputRef]] = default
}
