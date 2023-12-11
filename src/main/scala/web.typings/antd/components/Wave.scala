package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esUtilWaveMod.WaveProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wave {
  
  @JSImport("antd/es/_util/wave", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  }
  
  type Props = WaveProps
  
  implicit def make(companion: Wave.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WaveProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
