package web.typings.rcTabs

import web.typings.rcTabs.anon.ActiveTabOffset
import web.typings.rcTabs.anon.Style
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseIndicatorMod extends Shortcut {
  
  @JSImport("rc-tabs/es/hooks/useIndicator", JSImport.Default)
  @js.native
  val default: UseIndicator = js.native
  
  type GetIndicatorSize = Double | (js.Function1[/* origin */ Double, Double])
  
  type UseIndicator = js.Function1[/* options */ ActiveTabOffset, Style]
  
  type _To = UseIndicator
  
  /* This means you don't have to write `default`, but can instead just say `esHooksUseIndicatorMod.foo` */
  override def _to: UseIndicator = default
}
