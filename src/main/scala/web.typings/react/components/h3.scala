package web.typings.react.components

import web.typings.react.mod.DetailedHTMLProps
import web.typings.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object h3 {
  
  type Props = DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
  
  val component: String = "h3"
  
  implicit def make(companion: h3.type): SharedBuilder_DetailedHTMLProps_1549102952[HTMLHeadingElement] = new SharedBuilder_DetailedHTMLProps_1549102952[HTMLHeadingElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): SharedBuilder_DetailedHTMLProps_1549102952[HTMLHeadingElement] = new SharedBuilder_DetailedHTMLProps_1549102952[HTMLHeadingElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
