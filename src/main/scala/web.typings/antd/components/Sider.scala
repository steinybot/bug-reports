package web.typings.antd.components

import web.typings.antd.esLayoutSiderMod.SiderProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sider {
  
  @JSImport("antd/es/layout/Sider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = SiderProps with RefAttributes[HTMLDivElement]
  
  implicit def make(companion: Sider.type): SharedBuilder_SiderPropsRefAttributes_1762646568[HTMLDivElement] = new SharedBuilder_SiderPropsRefAttributes_1762646568[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SiderProps with RefAttributes[HTMLDivElement]): SharedBuilder_SiderPropsRefAttributes_1762646568[HTMLDivElement] = new SharedBuilder_SiderPropsRefAttributes_1762646568[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
