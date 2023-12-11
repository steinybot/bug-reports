package web.typings.rcComponentColorPicker.components

import web.typings.StBuildingComponent
import web.typings.rcComponentColorPicker.anon.offsetTransformOffsetunde
import web.typings.rcComponentColorPicker.esInterfaceMod.TransformOffset
import org.scalajs.dom.HTMLDivElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transform {
  
  @JSImport("@rc-component/color-picker/es/components/Transform", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def offset(value: TransformOffset): this.type = set("offset", value.asInstanceOf[js.Any])
  }
  
  type Props = offsetTransformOffsetunde
  
  implicit def make(companion: Transform.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: offsetTransformOffsetunde): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
