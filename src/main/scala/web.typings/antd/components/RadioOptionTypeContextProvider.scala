package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esRadioInterfaceMod.RadioGroupOptionType
import web.typings.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioOptionTypeContextProvider {
  
  @JSImport("antd/es/radio/context", "RadioOptionTypeContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def value(value: RadioGroupOptionType): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  type Props = ProviderProps[RadioGroupOptionType | Null]
  
  implicit def make(companion: RadioOptionTypeContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps[RadioGroupOptionType | Null]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
