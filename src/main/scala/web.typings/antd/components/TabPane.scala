package web.typings.antd.components

import web.typings.rcTabs.esTabPanelListTabPaneMod.TabPaneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPane {
  
  @JSImport("antd/es/tabs/TabPane", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = TabPaneProps
  
  implicit def make(companion: TabPane.type): SharedBuilder_TabPaneProps_625784816 = new SharedBuilder_TabPaneProps_625784816(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps_625784816 = new SharedBuilder_TabPaneProps_625784816(js.Array(this.component, p.asInstanceOf[js.Any]))
}
