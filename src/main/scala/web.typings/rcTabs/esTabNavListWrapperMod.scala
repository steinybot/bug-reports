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
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListWrapperMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/Wrapper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TabNavListWrapperProps] = js.native
  
  /* Inlined std.Required<std.Omit<rc-tabs.rc-tabs/es/TabNavList.TabNavListProps, 'children' | 'className'>> & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
  @js.native
  trait TabNavListWrapperProps extends StObject {
    
    var activeKey: String = js.native
    
    var animated: AnimatedConfig = js.native
    
    var children: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: EditableConfig = js.native
    
    var extra: TabBarExtraContent = js.native
    
    var getPopupContainer: js.Function1[/* node */ HTMLElement, HTMLElement] = js.native
    
    var id: String = js.native
    
    var indicatorSize: GetIndicatorSize = js.native
    
    var locale: TabsLocale = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: ReactElement = js.native
    
    var moreTransitionName: String = js.native
    
    var onTabClick: js.Function2[
        /* activeKey */ String, 
        /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], 
        Unit
      ] = js.native
    def onTabClick(activeKey: String, e: SyntheticKeyboardEvent[Element]): Unit = js.native
    def onTabClick(activeKey: String, e: SyntheticMouseEvent[Element]): Unit = js.native
    
    var onTabScroll: OnTabScroll = js.native
    
    var popupClassName: String = js.native
    
    var renderTabBar: RenderTabBar = js.native
    
    var rtl: Boolean = js.native
    
    var style: CSSProperties = js.native
    
    var tabBarGutter: Double = js.native
    
    var tabPosition: TabPosition = js.native
  }
  
  type _To = ReactComponentClass[TabNavListWrapperProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListWrapperMod.foo` */
  override def _to: ReactComponentClass[TabNavListWrapperProps] = default
}
