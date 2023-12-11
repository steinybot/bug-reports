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
import web.typings.rcTabs.esTabNavListWrapperMod.TabNavListWrapperProps
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wrapper {
  
  @scala.inline
  def apply(
    activeKey: String,
    animated: AnimatedConfig,
    editable: EditableConfig,
    extra: TabBarExtraContent,
    getPopupContainer: /* node */ HTMLElement => HTMLElement,
    id: String,
    indicatorSize: GetIndicatorSize,
    locale: TabsLocale,
    mobile: Boolean,
    moreIcon: ReactElement,
    moreTransitionName: String,
    onTabClick: (String, SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element]) => Unit,
    onTabScroll: /* info */ Direction => Unit,
    popupClassName: String,
    renderTabBar: (/* props */ RenderTabBarProps, /* DefaultTabBar */ ReactComponentClass[TabNavListProps]) => ReactElement,
    rtl: Boolean,
    style: CSSProperties,
    tabBarGutter: Double,
    tabPosition: TabPosition
  ): Builder = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], getPopupContainer = js.Any.fromFunction1(getPopupContainer), id = id.asInstanceOf[js.Any], indicatorSize = indicatorSize.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], moreIcon = moreIcon.asInstanceOf[js.Any], moreTransitionName = moreTransitionName.asInstanceOf[js.Any], onTabClick = js.Any.fromFunction2(onTabClick), onTabScroll = js.Any.fromFunction1(onTabScroll), popupClassName = popupClassName.asInstanceOf[js.Any], renderTabBar = js.Any.fromFunction2(renderTabBar), rtl = rtl.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabBarGutter = tabBarGutter.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabNavListWrapperProps]))
  }
  
  @JSImport("rc-tabs/es/TabNavList/Wrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: /* node */ ReactElement => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  type Props = TabNavListWrapperProps
  
  def withProps(p: TabNavListWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
