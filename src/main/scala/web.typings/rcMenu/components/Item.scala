package web.typings.rcMenu.components

import web.typings.rcMenu.esMenuItemMod.MenuItemProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  @JSImport("rc-menu", "Item")
  @js.native
  val component: js.Object = js.native
  
  type Props = MenuItemProps with RefAttributes[HTMLElement]
  
  implicit def make(companion: Item.type): SharedBuilder_MenuItemPropsRefAttributes1688514772[HTMLElement] = new SharedBuilder_MenuItemPropsRefAttributes1688514772[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuItemProps with RefAttributes[HTMLElement]): SharedBuilder_MenuItemPropsRefAttributes1688514772[HTMLElement] = new SharedBuilder_MenuItemPropsRefAttributes1688514772[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
