package web.typings.rcMentions.components

import web.typings.rcMentions.esOptionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Option {
  
  @JSImport("rc-mentions/es/Option", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = OptionProps
  
  implicit def make(companion: Option.type): SharedBuilder_OptionProps1915032353 = new SharedBuilder_OptionProps1915032353(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OptionProps): SharedBuilder_OptionProps1915032353 = new SharedBuilder_OptionProps1915032353(js.Array(this.component, p.asInstanceOf[js.Any]))
}
