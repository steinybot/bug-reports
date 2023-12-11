package web.typings.antd

import web.typings.rcTabs.esTabPanelListTabPaneMod.TabPaneProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabsTabPaneMod extends Shortcut {
  
  @JSImport("antd/es/tabs/TabPane", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TabPaneProps] = js.native
  
  type _To = ReactComponentClass[TabPaneProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTabsTabPaneMod.foo` */
  override def _to: ReactComponentClass[TabPaneProps] = default
}
