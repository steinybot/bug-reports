package web.typings.rcDrawer.components

import web.typings.rcDrawer.esDrawerMod.DrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  @JSImport("rc-drawer/es/Drawer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = DrawerProps
  
  implicit def make(companion: Drawer.type): SharedBuilder_DrawerProps2040562614 = new SharedBuilder_DrawerProps2040562614(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DrawerProps): SharedBuilder_DrawerProps2040562614 = new SharedBuilder_DrawerProps2040562614(js.Array(this.component, p.asInstanceOf[js.Any]))
}
