package web.typings.react.components

import web.typings.react.mod.DetailedHTMLProps
import web.typings.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object big {
  
  type Props = DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
  
  val component: String = "big"
  
  implicit def make(companion: big.type): SharedBuilder_DetailedHTMLProps_1224590439[HTMLElement] = new SharedBuilder_DetailedHTMLProps_1224590439[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): SharedBuilder_DetailedHTMLProps_1224590439[HTMLElement] = new SharedBuilder_DetailedHTMLProps_1224590439[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
