package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esModalContextMod.ModalContextProps
import web.typings.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalContextProvider {
  
  @scala.inline
  def apply(value: ModalContextProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[ModalContextProps]]))
  }
  
  @JSImport("antd/es/modal/context", "ModalContextProvider")
  @js.native
  val component: js.Object = js.native
  
  type Props = ProviderProps[ModalContextProps]
  
  def withProps(p: ProviderProps[ModalContextProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
