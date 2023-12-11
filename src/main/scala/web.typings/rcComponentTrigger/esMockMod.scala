package web.typings.rcComponentTrigger

import web.typings.rcComponentTrigger.mod.TriggerProps
import web.typings.rcComponentTrigger.mod.TriggerRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMockMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/mock", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TriggerProps with RefAttributes[TriggerRef]] = js.native
  
  type _To = ReactComponentClass[TriggerProps with RefAttributes[TriggerRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esMockMod.foo` */
  override def _to: ReactComponentClass[TriggerProps with RefAttributes[TriggerRef]] = default
}
