package web.typings.rcTabs.components

import web.typings.rcTabs.esTabsMod.TabsProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("rc-tabs/es/Tabs", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = TabsProps with RefAttributes[HTMLDivElement]
  
  implicit def make(companion: Tabs.type): SharedBuilder_TabsPropsRefAttributes1533512785[HTMLDivElement] = new SharedBuilder_TabsPropsRefAttributes1533512785[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabsProps with RefAttributes[HTMLDivElement]): SharedBuilder_TabsPropsRefAttributes1533512785[HTMLDivElement] = new SharedBuilder_TabsPropsRefAttributes1533512785[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
