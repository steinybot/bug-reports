package web.typings.react.components

import web.typings.react.mod.SVGProps
import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animate {
  
  type Props = SVGProps[SVGElement]
  
  val component: String = "animate"
  
  implicit def make(companion: animate.type): SharedBuilder_SVGProps1369103499[SVGElement] = new SharedBuilder_SVGProps1369103499[SVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SVGProps[SVGElement]): SharedBuilder_SVGProps1369103499[SVGElement] = new SharedBuilder_SVGProps1369103499[SVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
