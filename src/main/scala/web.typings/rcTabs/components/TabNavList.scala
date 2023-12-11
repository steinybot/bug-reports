package web.typings.rcTabs.components

import web.typings.StBuildingComponent
import web.typings.rcTabs.anon.Direction
import web.typings.rcTabs.esHooksUseIndicatorMod.GetIndicatorSize
import web.typings.rcTabs.esInterfaceMod.AnimatedConfig
import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.rcTabs.esInterfaceMod.RenderTabBarProps
import web.typings.rcTabs.esInterfaceMod.TabBarExtraContent
import web.typings.rcTabs.esInterfaceMod.TabPosition
import web.typings.rcTabs.esInterfaceMod.TabsLocale
import web.typings.rcTabs.esTabNavListMod.TabNavListProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabNavList {
  
  @scala.inline
  def apply(
    activeKey: String,
    id: String,
    mobile: Boolean,
    onTabClick: (String, SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element]) => Unit,
    rtl: Boolean,
    tabPosition: TabPosition
  ): Builder = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], onTabClick = js.Any.fromFunction2(onTabClick), rtl = rtl.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabNavListProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-tabs/es/TabNavList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def animated(value: AnimatedConfig): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: /* node */ ReactElement => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: TabBarExtraContent): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def indicatorSize(value: GetIndicatorSize): this.type = set("indicatorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorSizeFunction1(value: /* origin */ Double => Double): this.type = set("indicatorSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def locale(value: TabsLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreIcon(value: ReactElement): this.type = set("moreIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreTransitionName(value: String): this.type = set("moreTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTabScroll(value: /* info */ Direction => Unit): this.type = set("onTabScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderTabBar(
      value: (/* props */ RenderTabBarProps, /* DefaultTabBar */ ReactComponentClass[TabNavListProps]) => ReactElement
    ): this.type = set("renderTabBar", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarGutter(value: Double): this.type = set("tabBarGutter", value.asInstanceOf[js.Any])
  }
  
  type Props = TabNavListProps with RefAttributes[HTMLDivElement]
  
  def withProps(p: TabNavListProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
