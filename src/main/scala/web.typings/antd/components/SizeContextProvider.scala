package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esConfigProviderSizeContextMod.SizeContextProps
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SizeContextProvider {
  
  @JSImport("antd/es/config-provider/SizeContext", "SizeContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  type Props = SizeContextProps
  
  implicit def make(companion: SizeContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
