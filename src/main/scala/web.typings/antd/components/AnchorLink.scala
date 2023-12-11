package web.typings.antd.components

import web.typings.antd.esAnchorAnchorLinkMod.AnchorLinkProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnchorLink {
  
  @scala.inline
  def apply(href: String, title: ReactElement): SharedBuilder_AnchorLinkProps1926377400 = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new SharedBuilder_AnchorLinkProps1926377400(js.Array(this.component, __props.asInstanceOf[AnchorLinkProps]))
  }
  
  @JSImport("antd/es/anchor/AnchorLink", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = AnchorLinkProps
  
  def withProps(p: AnchorLinkProps): SharedBuilder_AnchorLinkProps1926377400 = new SharedBuilder_AnchorLinkProps1926377400(js.Array(this.component, p.asInstanceOf[js.Any]))
}
