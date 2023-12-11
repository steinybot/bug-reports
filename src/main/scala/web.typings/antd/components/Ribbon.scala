package web.typings.antd.components

import web.typings.antd.esBadgeRibbonMod.RibbonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ribbon {
  
  @JSImport("antd/es/badge/Ribbon", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = RibbonProps
  
  implicit def make(companion: Ribbon.type): SharedBuilder_RibbonProps1749950343 = new SharedBuilder_RibbonProps1749950343(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RibbonProps): SharedBuilder_RibbonProps1749950343 = new SharedBuilder_RibbonProps1749950343(js.Array(this.component, p.asInstanceOf[js.Any]))
}
