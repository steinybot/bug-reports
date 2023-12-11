package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esMenuMenuContextMod.MenuTheme
import web.typings.antd.esMenuSubMenuMod.SubMenuProps
import web.typings.antd.esMenuSubMenuMod.TitleEventEntity
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SubMenu {
  
  @JSImport("antd/es/menu/SubMenu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def level(value: Double): this.type = set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTitleClick(value: /* e */ TitleEventEntity => Unit): this.type = set("onTitleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTitleMouseEnter(value: /* e */ TitleEventEntity => Unit): this.type = set("onTitleMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTitleMouseLeave(value: /* e */ TitleEventEntity => Unit): this.type = set("onTitleMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupOffset(value: js.Tuple2[Double, Double]): this.type = set("popupOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: MenuTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  type Props = SubMenuProps
  
  implicit def make(companion: SubMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SubMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
