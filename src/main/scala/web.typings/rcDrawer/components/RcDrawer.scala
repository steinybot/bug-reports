package web.typings.rcDrawer.components

import web.typings.rcDrawer.esDrawerMod.DrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcDrawer {
  
  @JSImport("rc-drawer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = DrawerProps
  
  implicit def make(companion: RcDrawer.type): SharedBuilder_DrawerProps2040562614 = new SharedBuilder_DrawerProps2040562614(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DrawerProps): SharedBuilder_DrawerProps2040562614 = new SharedBuilder_DrawerProps2040562614(js.Array(this.component, p.asInstanceOf[js.Any]))
}
