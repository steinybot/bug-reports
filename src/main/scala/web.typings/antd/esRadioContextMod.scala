package web.typings.antd

import web.typings.antd.esRadioInterfaceMod.RadioGroupContextProps
import web.typings.antd.esRadioInterfaceMod.RadioGroupOptionType
import web.typings.react.mod.Context
import web.typings.react.mod.Provider
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRadioContextMod extends Shortcut {
  
  @JSImport("antd/es/radio/context", JSImport.Default)
  @js.native
  val default: Context[RadioGroupContextProps | Null] = js.native
  
  @JSImport("antd/es/radio/context", "RadioGroupContextProvider")
  @js.native
  val RadioGroupContextProvider: Provider[RadioGroupContextProps | Null] = js.native
  
  @JSImport("antd/es/radio/context", "RadioOptionTypeContext")
  @js.native
  val RadioOptionTypeContext: Context[RadioGroupOptionType | Null] = js.native
  
  @JSImport("antd/es/radio/context", "RadioOptionTypeContextProvider")
  @js.native
  val RadioOptionTypeContextProvider: Provider[RadioGroupOptionType | Null] = js.native
  
  type _To = Context[RadioGroupContextProps | Null]
  
  /* This means you don't have to write `default`, but can instead just say `esRadioContextMod.foo` */
  override def _to: Context[RadioGroupContextProps | Null] = default
}
