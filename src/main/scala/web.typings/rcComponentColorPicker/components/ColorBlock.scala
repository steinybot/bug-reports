package web.typings.rcComponentColorPicker.components

import web.typings.StBuildingComponent
import web.typings.rcComponentColorPicker.esComponentsColorBlockMod.ColorBlockProps
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorBlock {
  
  @scala.inline
  def apply(color: String): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColorBlockProps]))
  }
  
  @JSImport("@rc-component/color-picker", "ColorBlock")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = ColorBlockProps
  
  def withProps(p: ColorBlockProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
