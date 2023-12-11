package web.typings.rcSelect.components

import web.typings.rcSelect.libOptionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Option {
  
  @JSImport("rc-select", "Option")
  @js.native
  val component: js.Object = js.native
  
  type Props = OptionProps
  
  implicit def make(companion: Option.type): SharedBuilder_OptionProps230298971 = new SharedBuilder_OptionProps230298971(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OptionProps): SharedBuilder_OptionProps230298971 = new SharedBuilder_OptionProps230298971(js.Array(this.component, p.asInstanceOf[js.Any]))
}
