package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esRadioInterfaceMod.RadioGroupContextProps
import web.typings.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroupContextProvider {
  
  @JSImport("antd/es/radio/context", "RadioGroupContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def value(value: RadioGroupContextProps): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  type Props = ProviderProps[RadioGroupContextProps | Null]
  
  implicit def make(companion: RadioGroupContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps[RadioGroupContextProps | Null]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
