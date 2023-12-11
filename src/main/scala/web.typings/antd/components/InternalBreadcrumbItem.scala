package web.typings.antd.components

import web.typings.antd.esBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InternalBreadcrumbItem {
  
  @JSImport("antd/es/breadcrumb/BreadcrumbItem", "InternalBreadcrumbItem")
  @js.native
  val component: js.Object = js.native
  
  type Props = BreadcrumbItemProps
  
  implicit def make(companion: InternalBreadcrumbItem.type): SharedBuilder_BreadcrumbItemProps21342310 = new SharedBuilder_BreadcrumbItemProps21342310(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbItemProps): SharedBuilder_BreadcrumbItemProps21342310 = new SharedBuilder_BreadcrumbItemProps21342310(js.Array(this.component, p.asInstanceOf[js.Any]))
}
