package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esFormContextMod.NoFormStyleProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoFormStyle {
  
  @JSImport("antd/es/form/context", "NoFormStyle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def `override`(value: Boolean): this.type = set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: Boolean): this.type = set("status", value.asInstanceOf[js.Any])
  }
  
  type Props = NoFormStyleProps
  
  implicit def make(companion: NoFormStyle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoFormStyleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
