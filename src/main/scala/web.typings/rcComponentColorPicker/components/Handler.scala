package web.typings.rcComponentColorPicker.components

import web.typings.StBuildingComponent
import web.typings.rcComponentColorPicker.anon.Color
import web.typings.rcComponentColorPicker.esComponentsHandlerMod.HandlerSize
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handler {
  
  @JSImport("@rc-component/color-picker/es/components/Handler", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: HandlerSize): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  type Props = Color
  
  implicit def make(companion: Handler.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Color): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
