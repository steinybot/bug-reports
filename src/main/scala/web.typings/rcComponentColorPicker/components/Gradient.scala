package web.typings.rcComponentColorPicker.components

import web.typings.StBuildingComponent
import web.typings.rcComponentColorPicker.anon.Children
import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gradient {
  
  @scala.inline
  def apply(colors: js.Array[Color | String]): Builder = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("@rc-component/color-picker/es/components/Gradient", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: HsbaColorType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  type Props = Children
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
