package web.typings.antd.components

import web.typings.antd.esCollapseCollapsePanelMod.CollapsePanelProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollapsePanel {
  
  @scala.inline
  def apply(header: ReactElement): SharedBuilder_CollapsePanelPropsRefAttributes696689915[HTMLDivElement] = {
    val __props = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    new SharedBuilder_CollapsePanelPropsRefAttributes696689915[HTMLDivElement](js.Array(this.component, __props.asInstanceOf[CollapsePanelProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("antd/es/collapse/CollapsePanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = CollapsePanelProps with RefAttributes[HTMLDivElement]
  
  def withProps(p: CollapsePanelProps with RefAttributes[HTMLDivElement]): SharedBuilder_CollapsePanelPropsRefAttributes696689915[HTMLDivElement] = new SharedBuilder_CollapsePanelPropsRefAttributes696689915[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
