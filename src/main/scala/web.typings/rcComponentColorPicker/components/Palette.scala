package web.typings.rcComponentColorPicker.components

import web.typings.StBuildingComponent
import web.typings.rcComponentColorPicker.anon.PrefixCls
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Palette {
  
  @JSImport("@rc-component/color-picker/es/components/Palette", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = PrefixCls
  
  implicit def make(companion: Palette.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PrefixCls): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
