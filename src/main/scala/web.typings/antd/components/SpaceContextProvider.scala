package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esSpaceContextMod.SpaceContextType
import web.typings.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SpaceContextProvider {
  
  @scala.inline
  def apply(value: SpaceContextType): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[SpaceContextType]]))
  }
  
  @JSImport("antd/es/space/context", "SpaceContextProvider")
  @js.native
  val component: js.Object = js.native
  
  type Props = ProviderProps[SpaceContextType]
  
  def withProps(p: ProviderProps[SpaceContextType]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
