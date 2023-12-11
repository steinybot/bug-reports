package web.typings.rcTabs

import web.typings.rcTabs.esHooksUseIndicatorMod.GetIndicatorSize
import web.typings.rcTabs.esInterfaceMod.AnimatedConfig
import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.rcTabs.esInterfaceMod.OnTabScroll
import web.typings.rcTabs.esInterfaceMod.RenderTabBar
import web.typings.rcTabs.esInterfaceMod.Tab
import web.typings.rcTabs.esInterfaceMod.TabBarExtraContent
import web.typings.rcTabs.esInterfaceMod.TabOffset
import web.typings.rcTabs.esInterfaceMod.TabPosition
import web.typings.rcTabs.esInterfaceMod.TabsLocale
import web.typings.rcTabs.rcTabsStrings.bottom
import web.typings.rcTabs.rcTabsStrings.left
import web.typings.rcTabs.rcTabsStrings.right
import web.typings.rcTabs.rcTabsStrings.top
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ActiveTabOffset extends StObject {
    
    var activeTabOffset: TabOffset = js.native
    
    var horizontal: Boolean = js.native
    
    var indicatorSize: GetIndicatorSize = js.native
    
    var rtl: Boolean = js.native
  }
  object ActiveTabOffset {
    
    @scala.inline
    def apply(activeTabOffset: TabOffset, horizontal: Boolean, indicatorSize: GetIndicatorSize, rtl: Boolean): ActiveTabOffset = {
      val __obj = js.Dynamic.literal(activeTabOffset = activeTabOffset.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], indicatorSize = indicatorSize.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveTabOffset]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ActiveTabOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTabOffset(value: TabOffset): Self = StObject.set(x, "activeTabOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSize(value: GetIndicatorSize): Self = StObject.set(x, "indicatorSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSizeFunction1(value: /* origin */ Double => Double): Self = StObject.set(x, "indicatorSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Direction extends StObject {
    
    var direction: left | right | top | bottom = js.native
  }
  object Direction {
    
    @scala.inline
    def apply(direction: left | right | top | bottom): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: left | right | top | bottom): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    var event: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object Event {
    
    @scala.inline
    def apply(event: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSyntheticKeyboardEvent(value: SyntheticKeyboardEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSyntheticMouseEvent(value: SyntheticMouseEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: CSSProperties = js.native
  }
  object Style {
    
    @scala.inline
    def apply(style: CSSProperties): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  tabs :std.Array<rc-tabs.rc-tabs/es/interface.Tab>} & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
  @js.native
  trait tabsArrayTabTabNavListPro extends StObject {
    
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
    
    var tabs: js.Array[Tab] = js.native
  }
}
