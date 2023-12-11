package web.typings.antd

import web.typings.antd.esFloatButtonInterfaceMod.FloatButtonShape
import web.typings.react.mod.Context
import web.typings.react.mod.Provider
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFloatButtonContextMod extends Shortcut {
  
  @JSImport("antd/es/float-button/context", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[FloatButtonShape]] = js.native
  
  @JSImport("antd/es/float-button/context", "FloatButtonGroupProvider")
  @js.native
  val FloatButtonGroupProvider: Provider[js.UndefOr[FloatButtonShape]] = js.native
  
  type _To = Context[js.UndefOr[FloatButtonShape]]
  
  /* This means you don't have to write `default`, but can instead just say `esFloatButtonContextMod.foo` */
  override def _to: Context[js.UndefOr[FloatButtonShape]] = default
}
