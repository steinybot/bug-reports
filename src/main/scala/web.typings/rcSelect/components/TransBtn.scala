package web.typings.rcSelect.components

import web.typings.StBuildingComponent
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.libTransBtnMod.TransBtnProps
import org.scalajs.dom.HTMLSpanElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.span.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransBtn {
  
  @scala.inline
  def apply(className: String, customizeIcon: RenderNode): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], customizeIcon = customizeIcon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TransBtnProps]))
  }
  
  @JSImport("rc-select/lib/TransBtn", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def customizeIconProps(value: Any): this.type = set("customizeIconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
  }
  
  type Props = TransBtnProps
  
  def withProps(p: TransBtnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
