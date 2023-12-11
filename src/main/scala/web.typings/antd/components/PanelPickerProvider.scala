package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esColorPickerComponentsPanelPickerMod.PanelPickerProps
import web.typings.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelPickerProvider {
  
  @scala.inline
  def apply(value: PanelPickerProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[PanelPickerProps]]))
  }
  
  @JSImport("antd/es/color-picker/context", "PanelPickerProvider")
  @js.native
  val component: js.Object = js.native
  
  type Props = ProviderProps[PanelPickerProps]
  
  def withProps(p: ProviderProps[PanelPickerProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
