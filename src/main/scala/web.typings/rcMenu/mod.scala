package web.typings.rcMenu

import web.typings.rcMenu.esDividerMod.DividerProps
import web.typings.rcMenu.esInterfaceMod.MenuRef
import web.typings.rcMenu.esMenuItemGroupMod.MenuItemGroupProps
import web.typings.rcMenu.esMenuItemMod.MenuItemProps
import web.typings.rcMenu.esMenuMod.MenuProps
import web.typings.rcMenu.esSubMenuMod.SubMenuProps
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  val default: MenuType = js.native
  
  @scala.inline
  def Divider(param0: DividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-menu", "Item")
  @js.native
  val Item: ReactComponentClass[MenuItemProps with RefAttributes[HTMLElement]] = js.native
  
  @scala.inline
  def ItemGroup(param0: MenuItemGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ItemGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("rc-menu", "MenuItem")
  @js.native
  val MenuItem: ReactComponentClass[MenuItemProps with RefAttributes[HTMLElement]] = js.native
  
  @scala.inline
  def MenuItemGroup(param0: MenuItemGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItemGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @scala.inline
  def SubMenu(props: SubMenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SubMenu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def useFullPath(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")().asInstanceOf[js.Array[String]]
  @scala.inline
  def useFullPath(eventKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")(eventKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @js.native
  trait MenuType
    extends StObject
       with ForwardRefExoticComponent[MenuProps with RefAttributes[MenuRef]] {
    
    var Divider: js.Function1[/* param0 */ DividerProps, Element] = js.native
    
    var Item: ReactComponentClass[MenuItemProps with RefAttributes[HTMLElement]] = js.native
    
    var ItemGroup: js.Function1[/* param0 */ MenuItemGroupProps, ReactElement] = js.native
    
    var SubMenu: js.Function1[/* props */ SubMenuProps, Element] = js.native
  }
}
