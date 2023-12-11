package web.typings.antd.components

import web.typings.antd.esLayoutLayoutMod.BasicProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Content {
  
  @JSImport("antd/es/layout/layout", "Content")
  @js.native
  val component: js.Object = js.native
  
  type Props = BasicProps with RefAttributes[HTMLElement]
  
  implicit def make(companion: Content.type): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BasicProps with RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
