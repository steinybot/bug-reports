package web.typings.rcCascader.components

import web.typings.rcCascader.esPanelMod.PanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  @JSImport("rc-cascader", "Panel")
  @js.native
  val component: js.Object = js.native
  
  type Props = PanelProps
  
  implicit def make(companion: Panel.type): SharedBuilder_PanelProps_90403965 = new SharedBuilder_PanelProps_90403965(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelProps): SharedBuilder_PanelProps_90403965 = new SharedBuilder_PanelProps_90403965(js.Array(this.component, p.asInstanceOf[js.Any]))
}
