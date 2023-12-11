package web.typings.rcMenu.components

import web.typings.rcMenu.esDividerMod.DividerProps
import web.typings.rcMenu.esInterfaceMod.MenuRef
import web.typings.rcMenu.esMenuItemGroupMod.MenuItemGroupProps
import web.typings.rcMenu.esMenuItemMod.MenuItemProps
import web.typings.rcMenu.esMenuMod.MenuProps
import web.typings.rcMenu.esSubMenuMod.SubMenuProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcMenu {
  
  object Divider {
    
    @JSImport("rc-menu", "default.Divider")
    @js.native
    val component: js.Object = js.native
    
    type Props = DividerProps
    
    implicit def make(companion: Divider.type): SharedBuilder_DividerProps137490442 = new SharedBuilder_DividerProps137490442(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DividerProps): SharedBuilder_DividerProps137490442 = new SharedBuilder_DividerProps137490442(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    @JSImport("rc-menu", "default.Item")
    @js.native
    val component: js.Object = js.native
    
    type Props = MenuItemProps with RefAttributes[HTMLElement]
    
    implicit def make(companion: Item.type): SharedBuilder_MenuItemPropsRefAttributes1688514772[HTMLElement] = new SharedBuilder_MenuItemPropsRefAttributes1688514772[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuItemProps with RefAttributes[HTMLElement]): SharedBuilder_MenuItemPropsRefAttributes1688514772[HTMLElement] = new SharedBuilder_MenuItemPropsRefAttributes1688514772[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ItemGroup {
    
    @JSImport("rc-menu", "default.ItemGroup")
    @js.native
    val component: js.Object = js.native
    
    type Props = MenuItemGroupProps
    
    implicit def make(companion: ItemGroup.type): SharedBuilder_MenuItemGroupProps_137724649 = new SharedBuilder_MenuItemGroupProps_137724649(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuItemGroupProps): SharedBuilder_MenuItemGroupProps_137724649 = new SharedBuilder_MenuItemGroupProps_137724649(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SubMenu {
    
    @JSImport("rc-menu", "default.SubMenu")
    @js.native
    val component: js.Object = js.native
    
    type Props = /* props */ SubMenuProps
    
    implicit def make(companion: SubMenu.type): SharedBuilder_SubMenuProps_750594073 = new SharedBuilder_SubMenuProps_750594073(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: /* props */ SubMenuProps): SharedBuilder_SubMenuProps_750594073 = new SharedBuilder_SubMenuProps_750594073(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = MenuProps with RefAttributes[MenuRef]
  
  implicit def make(companion: RcMenu.type): SharedBuilder_MenuPropsRefAttributes_1227951001[MenuRef] = new SharedBuilder_MenuPropsRefAttributes_1227951001[MenuRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuProps with RefAttributes[MenuRef]): SharedBuilder_MenuPropsRefAttributes_1227951001[MenuRef] = new SharedBuilder_MenuPropsRefAttributes_1227951001[MenuRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
