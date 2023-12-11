package web.typings.rcMenu.components

import web.typings.rcMenu.esMenuItemGroupMod.MenuItemGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItemGroup {
  
  @JSImport("rc-menu", "MenuItemGroup")
  @js.native
  val component: js.Object = js.native
  
  type Props = MenuItemGroupProps
  
  implicit def make(companion: MenuItemGroup.type): SharedBuilder_MenuItemGroupProps_137724649 = new SharedBuilder_MenuItemGroupProps_137724649(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuItemGroupProps): SharedBuilder_MenuItemGroupProps_137724649 = new SharedBuilder_MenuItemGroupProps_137724649(js.Array(this.component, p.asInstanceOf[js.Any]))
}
