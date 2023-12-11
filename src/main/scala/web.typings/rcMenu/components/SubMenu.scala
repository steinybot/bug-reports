package web.typings.rcMenu.components

import web.typings.rcMenu.esSubMenuMod.SubMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SubMenu {
  
  @JSImport("rc-menu", "SubMenu")
  @js.native
  val component: js.Object = js.native
  
  type Props = /* props */ SubMenuProps
  
  implicit def make(companion: SubMenu.type): SharedBuilder_SubMenuProps_750594073 = new SharedBuilder_SubMenuProps_750594073(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ SubMenuProps): SharedBuilder_SubMenuProps_750594073 = new SharedBuilder_SubMenuProps_750594073(js.Array(this.component, p.asInstanceOf[js.Any]))
}
