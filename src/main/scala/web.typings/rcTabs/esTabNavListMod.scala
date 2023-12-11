package web.typings.rcTabs

import web.typings.rcTabs.esHooksUseIndicatorMod.GetIndicatorSize
import web.typings.rcTabs.esInterfaceMod.AnimatedConfig
import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.rcTabs.esInterfaceMod.OnTabScroll
import web.typings.rcTabs.esInterfaceMod.RenderTabBar
import web.typings.rcTabs.esInterfaceMod.TabBarExtraContent
import web.typings.rcTabs.esInterfaceMod.TabPosition
import web.typings.rcTabs.esInterfaceMod.TabsLocale
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TabNavListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TabNavListProps extends StObject {
    
    var activeKey: String = js.native
    
    var animated: js.UndefOr[AnimatedConfig] = js.native
    
    var children: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var extra: js.UndefOr[TabBarExtraContent] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: String = js.native
    
    var indicatorSize: js.UndefOr[GetIndicatorSize] = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[ReactElement] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(activeKey: String, e: SyntheticKeyboardEvent[Element]): Unit = js.native
    def onTabClick(activeKey: String, e: SyntheticMouseEvent[Element]): Unit = js.native
    
    var onTabScroll: js.UndefOr[OnTabScroll] = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var renderTabBar: js.UndefOr[RenderTabBar] = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
  }
  
  type _To = ReactComponentClass[TabNavListProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListMod.foo` */
  override def _to: ReactComponentClass[TabNavListProps with RefAttributes[HTMLDivElement]] = default
}
