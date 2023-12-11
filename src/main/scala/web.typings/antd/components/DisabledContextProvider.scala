package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esConfigProviderDisabledContextMod.DisabledContextProps
import web.typings.antd.esConfigProviderDisabledContextMod.DisabledType
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DisabledContextProvider {
  
  @JSImport("antd/es/config-provider/DisabledContext", "DisabledContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def disabled(value: DisabledType): this.type = set("disabled", value.asInstanceOf[js.Any])
  }
  
  type Props = DisabledContextProps
  
  implicit def make(companion: DisabledContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DisabledContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
