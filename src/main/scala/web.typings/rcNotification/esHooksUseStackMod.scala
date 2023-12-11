package web.typings.rcNotification

import web.typings.rcNotification.esInterfaceMod.StackConfig
import web.typings.std.Exclude
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseStackMod extends Shortcut {
  
  @JSImport("rc-notification/es/hooks/useStack", JSImport.Default)
  @js.native
  val default: UseStack = js.native
  
  type StackParams = Exclude[StackConfig, Boolean]
  
  type UseStack = js.Function1[/* config */ js.UndefOr[StackConfig], js.Tuple2[Boolean, StackParams]]
  
  type _To = UseStack
  
  /* This means you don't have to write `default`, but can instead just say `esHooksUseStackMod.foo` */
  override def _to: UseStack = default
}
