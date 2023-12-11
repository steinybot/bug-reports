package web.typings.react.components

import web.typings.StBuildingComponent
import web.typings.react.mod.SuspenseProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Suspense {
  
  @JSImport("react", "Suspense")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def fallback(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unstable_expectedLoadTime(value: Double): this.type = set("unstable_expectedLoadTime", value.asInstanceOf[js.Any])
  }
  
  type Props = SuspenseProps
  
  implicit def make(companion: Suspense.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SuspenseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
