package web.typings.react.components

import web.typings.react.mod.DetailedHTMLProps
import web.typings.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLTableSectionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thead {
  
  type Props = DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
  
  val component: String = "thead"
  
  implicit def make(companion: thead.type): SharedBuilder_DetailedHTMLProps_1876849174[HTMLTableSectionElement] = new SharedBuilder_DetailedHTMLProps_1876849174[HTMLTableSectionElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]): SharedBuilder_DetailedHTMLProps_1876849174[HTMLTableSectionElement] = new SharedBuilder_DetailedHTMLProps_1876849174[HTMLTableSectionElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
