package web.typings.rcMotion.components

import web.typings.StBuildingComponent
import web.typings.rcMotion.anon.MotionContextPropschildre
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("rc-motion", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def motion(value: Boolean): this.type = set("motion", value.asInstanceOf[js.Any])
  }
  
  type Props = MotionContextPropschildre
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MotionContextPropschildre): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
