package web.typings.antd.components

import web.typings.antd.esTypographyLinkMod.LinkProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @JSImport("antd/es/typography/Link", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = LinkProps with RefAttributes[HTMLElement]
  
  implicit def make(companion: Link.type): SharedBuilder_LinkPropsRefAttributes_1058152575[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes_1058152575[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LinkProps with RefAttributes[HTMLElement]): SharedBuilder_LinkPropsRefAttributes_1058152575[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes_1058152575[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
