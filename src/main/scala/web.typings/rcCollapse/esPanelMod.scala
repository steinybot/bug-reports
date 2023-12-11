package web.typings.rcCollapse

import web.typings.rcCollapse.esInterfaceMod.CollapsePanelProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelMod extends Shortcut {
  
  @JSImport("rc-collapse/es/Panel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esPanelMod.foo` */
  override def _to: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]] = default
}
