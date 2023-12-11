package web.typings.antd

import web.typings.antd.antdStrings.children
import web.typings.antd.esTooltipMod.TooltipProps
import web.typings.std.Omit
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTooltipPurePanelMod extends Shortcut {
  
  /** @private Internal Component. Do not use in your production. */
  @JSImport("antd/es/tooltip/PurePanel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PurePanelProps] = js.native
  
  type PurePanelProps = Omit[TooltipProps, children]
  
  type _To = ReactComponentClass[PurePanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTooltipPurePanelMod.foo` */
  override def _to: ReactComponentClass[PurePanelProps] = default
}
