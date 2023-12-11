package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esConfigProviderDefaultRenderEmptyMod.EmptyProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultRenderEmpty {
  
  @JSImport("antd/es/config-provider/defaultRenderEmpty", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def componentName(value: String): this.type = set("componentName", value.asInstanceOf[js.Any])
  }
  
  type Props = EmptyProps
  
  implicit def make(companion: DefaultRenderEmpty.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EmptyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
