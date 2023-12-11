package web.typings.rcMenu.components

import web.typings.rcMenu.esDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Divider {
  
  @JSImport("rc-menu", "Divider")
  @js.native
  val component: js.Object = js.native
  
  type Props = DividerProps
  
  implicit def make(companion: Divider.type): SharedBuilder_DividerProps137490442 = new SharedBuilder_DividerProps137490442(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DividerProps): SharedBuilder_DividerProps137490442 = new SharedBuilder_DividerProps137490442(js.Array(this.component, p.asInstanceOf[js.Any]))
}
