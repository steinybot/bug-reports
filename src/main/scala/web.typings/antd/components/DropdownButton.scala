package web.typings.antd.components

import web.typings.antd.esDropdownDropdownButtonMod.DropdownButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownButton {
  
  @JSImport("antd/es/dropdown/dropdown-button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = DropdownButtonProps
  
  implicit def make(companion: DropdownButton.type): SharedBuilder_DropdownButtonProps_1585901623 = new SharedBuilder_DropdownButtonProps_1585901623(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownButtonProps): SharedBuilder_DropdownButtonProps_1585901623 = new SharedBuilder_DropdownButtonProps_1585901623(js.Array(this.component, p.asInstanceOf[js.Any]))
}
