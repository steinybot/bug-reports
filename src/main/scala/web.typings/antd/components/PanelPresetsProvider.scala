package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esColorPickerComponentsPanelPresetsMod.PanelPresetsProps
import web.typings.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelPresetsProvider {
  
  @scala.inline
  def apply(value: PanelPresetsProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[PanelPresetsProps]]))
  }
  
  @JSImport("antd/es/color-picker/context", "PanelPresetsProvider")
  @js.native
  val component: js.Object = js.native
  
  type Props = ProviderProps[PanelPresetsProps]
  
  def withProps(p: ProviderProps[PanelPresetsProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
