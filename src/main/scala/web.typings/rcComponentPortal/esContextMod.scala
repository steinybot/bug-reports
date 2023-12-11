package web.typings.rcComponentPortal

import web.typings.react.mod.Context
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("@rc-component/portal/es/Context", JSImport.Default)
  @js.native
  val default: Context[QueueCreate] = js.native
  
  type QueueCreate = js.Function1[/* appendFunc */ VoidFunction, Unit]
  
  type _To = Context[QueueCreate]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[QueueCreate] = default
}
