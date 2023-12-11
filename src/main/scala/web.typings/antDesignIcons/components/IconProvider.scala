package web.typings.antDesignIcons.components

import web.typings.StBuildingComponent.Default
import web.typings.antDesignIcons.esComponentsContextMod.IconContextProps
import web.typings.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconProvider {
  
  @scala.inline
  def apply(value: IconContextProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[IconContextProps]]))
  }
  
  @JSImport("@ant-design/icons/es", "IconProvider")
  @js.native
  val component: js.Object = js.native
  
  type Props = ProviderProps[IconContextProps]
  
  def withProps(p: ProviderProps[IconContextProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
