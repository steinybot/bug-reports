package web.typings.rcCollapse.components

import web.typings.rcCollapse.esInterfaceMod.CollapsePanelProps
import web.typings.rcCollapse.esInterfaceMod.CollapseProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  object Panel {
    
    @JSImport("rc-collapse/es/Collapse", "default.Panel")
    @js.native
    val component: js.Object = js.native
    
    type Props = CollapsePanelProps with RefAttributes[HTMLDivElement]
    
    implicit def make(companion: Panel.type): SharedBuilder_CollapsePanelPropsRefAttributes1002937290[HTMLDivElement] = new SharedBuilder_CollapsePanelPropsRefAttributes1002937290[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CollapsePanelProps with RefAttributes[HTMLDivElement]): SharedBuilder_CollapsePanelPropsRefAttributes1002937290[HTMLDivElement] = new SharedBuilder_CollapsePanelPropsRefAttributes1002937290[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-collapse/es/Collapse", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = CollapseProps with RefAttributes[HTMLDivElement]
  
  implicit def make(companion: Collapse.type): SharedBuilder_CollapsePropsRefAttributes_894168561[HTMLDivElement] = new SharedBuilder_CollapsePropsRefAttributes_894168561[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps with RefAttributes[HTMLDivElement]): SharedBuilder_CollapsePropsRefAttributes_894168561[HTMLDivElement] = new SharedBuilder_CollapsePropsRefAttributes_894168561[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
