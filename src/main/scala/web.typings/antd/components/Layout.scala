package web.typings.antd.components

import web.typings.antd.esLayoutLayoutMod.BasicProps
import web.typings.antd.esLayoutSiderMod.SiderProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layout {
  
  object Content {
    
    @JSImport("antd", "Layout.Content")
    @js.native
    val component: js.Object = js.native
    
    type Props = BasicProps with RefAttributes[HTMLElement]
    
    implicit def make(companion: Content.type): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BasicProps with RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("antd", "Layout.Footer")
    @js.native
    val component: js.Object = js.native
    
    type Props = BasicProps with RefAttributes[HTMLElement]
    
    implicit def make(companion: Footer.type): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BasicProps with RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("antd", "Layout.Header")
    @js.native
    val component: js.Object = js.native
    
    type Props = BasicProps with RefAttributes[HTMLElement]
    
    implicit def make(companion: Header.type): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BasicProps with RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Sider {
    
    @JSImport("antd", "Layout.Sider")
    @js.native
    val component: js.Object = js.native
    
    type Props = SiderProps with RefAttributes[HTMLDivElement]
    
    implicit def make(companion: Sider.type): SharedBuilder_SiderPropsRefAttributes_1762646568[HTMLDivElement] = new SharedBuilder_SiderPropsRefAttributes_1762646568[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SiderProps with RefAttributes[HTMLDivElement]): SharedBuilder_SiderPropsRefAttributes_1762646568[HTMLDivElement] = new SharedBuilder_SiderPropsRefAttributes_1762646568[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Layout")
  @js.native
  val component: js.Object = js.native
  
  type Props = BasicProps with RefAttributes[HTMLElement]
  
  implicit def make(companion: Layout.type): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BasicProps with RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes_2009608237[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
