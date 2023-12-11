package web.typings.rcCollapse.components

import web.typings.rcCollapse.esInterfaceMod.CollapsePanelProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  @JSImport("rc-collapse", "Panel")
  @js.native
  val component: js.Object = js.native
  
  type Props = CollapsePanelProps with RefAttributes[HTMLDivElement]
  
  implicit def make(companion: Panel.type): SharedBuilder_CollapsePanelPropsRefAttributes1002937290[HTMLDivElement] = new SharedBuilder_CollapsePanelPropsRefAttributes1002937290[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapsePanelProps with RefAttributes[HTMLDivElement]): SharedBuilder_CollapsePanelPropsRefAttributes1002937290[HTMLDivElement] = new SharedBuilder_CollapsePanelPropsRefAttributes1002937290[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
