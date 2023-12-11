package web.typings.rcMenu.components

import web.typings.rcMenu.esInterfaceMod.MenuRef
import web.typings.rcMenu.esMenuMod.MenuProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  @JSImport("rc-menu/es/Menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = MenuProps with RefAttributes[MenuRef]
  
  implicit def make(companion: Menu.type): SharedBuilder_MenuPropsRefAttributes_1227951001[MenuRef] = new SharedBuilder_MenuPropsRefAttributes_1227951001[MenuRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuProps with RefAttributes[MenuRef]): SharedBuilder_MenuPropsRefAttributes_1227951001[MenuRef] = new SharedBuilder_MenuPropsRefAttributes_1227951001[MenuRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
