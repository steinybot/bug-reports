package web.typings.rcInput

import web.typings.rcInput.esInterfaceMod.BaseInputProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBaseInputMod extends Shortcut {
  
  @JSImport("rc-input/es/BaseInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BaseInputProps] = js.native
  
  type _To = ReactComponentClass[BaseInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `esBaseInputMod.foo` */
  override def _to: ReactComponentClass[BaseInputProps] = default
}
