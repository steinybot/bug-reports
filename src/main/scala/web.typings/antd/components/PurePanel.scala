package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esTooltipPurePanelMod.PurePanelProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object PurePanel {
  
  def apply(p: PurePanelProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("antd/es/tooltip/PurePanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PurePanel.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
