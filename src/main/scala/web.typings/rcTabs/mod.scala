package web.typings.rcTabs

import web.typings.rcTabs.esTabsMod.TabsProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-tabs", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TabsProps with RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ReactComponentClass[TabsProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[TabsProps with RefAttributes[HTMLDivElement]] = default
}
