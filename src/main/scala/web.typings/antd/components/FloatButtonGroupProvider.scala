package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esFloatButtonInterfaceMod.FloatButtonShape
import web.typings.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FloatButtonGroupProvider {
  
  @JSImport("antd/es/float-button/context", "FloatButtonGroupProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def value(value: FloatButtonShape): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  type Props = ProviderProps[js.UndefOr[FloatButtonShape]]
  
  implicit def make(companion: FloatButtonGroupProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps[js.UndefOr[FloatButtonShape]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
