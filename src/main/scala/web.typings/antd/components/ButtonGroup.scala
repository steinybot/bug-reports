package web.typings.antd.components

import web.typings.antd.esButtonButtonGroupMod.ButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  
  @JSImport("antd/es/button/button-group", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = ButtonGroupProps
  
  implicit def make(companion: ButtonGroup.type): SharedBuilder_ButtonGroupProps_7728502 = new SharedBuilder_ButtonGroupProps_7728502(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ButtonGroupProps): SharedBuilder_ButtonGroupProps_7728502 = new SharedBuilder_ButtonGroupProps_7728502(js.Array(this.component, p.asInstanceOf[js.Any]))
}
