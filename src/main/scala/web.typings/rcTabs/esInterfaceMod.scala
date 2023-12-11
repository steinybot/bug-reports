package web.typings.rcTabs

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.rcTabs.anon.Direction
import web.typings.rcTabs.anon.Event
import web.typings.rcTabs.anon.Height
import web.typings.rcTabs.esTabNavListMod.TabNavListProps
import web.typings.rcTabs.rcTabsStrings.add
import web.typings.rcTabs.rcTabsStrings.remove
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import web.typings.std.Map
import org.scalajs.dom.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @js.native
  trait AnimatedConfig extends StObject {
    
    var inkBar: js.UndefOr[Boolean] = js.native
    
    var tabPane: js.UndefOr[Boolean] = js.native
    
    var tabPaneMotion: js.UndefOr[CSSMotionProps] = js.native
  }
  object AnimatedConfig {
    
    @scala.inline
    def apply(): AnimatedConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AnimatedConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInkBar(value: Boolean): Self = StObject.set(x, "inkBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInkBarUndefined: Self = StObject.set(x, "inkBar", js.undefined)
      
      @scala.inline
      def setTabPane(value: Boolean): Self = StObject.set(x, "tabPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPaneMotion(value: CSSMotionProps): Self = StObject.set(x, "tabPaneMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPaneMotionUndefined: Self = StObject.set(x, "tabPaneMotion", js.undefined)
      
      @scala.inline
      def setTabPaneUndefined: Self = StObject.set(x, "tabPane", js.undefined)
    }
  }
  
  @js.native
  trait EditableConfig extends StObject {
    
    var addIcon: js.UndefOr[ReactElement] = js.native
    
    def onEdit(`type`: add | remove, info: Event): Unit = js.native
    
    var removeIcon: js.UndefOr[ReactElement] = js.native
    
    var showAdd: js.UndefOr[Boolean] = js.native
  }
  object EditableConfig {
    
    @scala.inline
    def apply(onEdit: (add | remove, Event) => Unit): EditableConfig = {
      val __obj = js.Dynamic.literal(onEdit = js.Any.fromFunction2(onEdit))
      __obj.asInstanceOf[EditableConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: EditableConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddIcon(value: ReactElement): Self = StObject.set(x, "addIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddIconUndefined: Self = StObject.set(x, "addIcon", js.undefined)
      
      @scala.inline
      def setOnEdit(value: (add | remove, Event) => Unit): Self = StObject.set(x, "onEdit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveIcon(value: ReactElement): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setShowAdd(value: Boolean): Self = StObject.set(x, "showAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAddUndefined: Self = StObject.set(x, "showAdd", js.undefined)
    }
  }
  
  type OnTabScroll = js.Function1[/* info */ Direction, Unit]
  
  type RenderTabBar = js.Function2[
    /* props */ RenderTabBarProps, 
    /* DefaultTabBar */ ReactComponentClass[TabNavListProps], 
    ReactElement
  ]
  
  @js.native
  trait RenderTabBarProps extends StObject {
    
    var activeKey: String = js.native
    
    var animated: AnimatedConfig = js.native
    
    var editable: EditableConfig = js.native
    
    var extra: TabBarExtraContent = js.native
    
    var id: String = js.native
    
    var locale: TabsLocale = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: ReactElement = js.native
    
    var moreTransitionName: String = js.native
    
    def onTabClick(key: String, e: SyntheticKeyboardEvent[Element]): Unit = js.native
    def onTabClick(key: String, e: SyntheticMouseEvent[Element]): Unit = js.native
    
    var onTabScroll: OnTabScroll = js.native
    
    /** @deprecated It do not pass real TabPane node. Only for compatible usage.  */
    var panes: ReactElement = js.native
    
    var rtl: Boolean = js.native
    
    var style: CSSProperties = js.native
    
    var tabBarGutter: Double = js.native
    
    var tabPosition: TabPosition = js.native
  }
  
  type SizeInfo = js.Tuple2[/* width */ Double, /* height */ Double]
  
  /* Inlined parent std.Omit<rc-tabs.rc-tabs/es/TabPanelList/TabPane.TabPaneProps, 'tab'> */
  @js.native
  trait Tab extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var destroyInactiveTabPane: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var key: String = js.native
    
    var label: ReactElement = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabKey: js.UndefOr[String] = js.native
  }
  object Tab {
    
    @scala.inline
    def apply(key: String, label: ReactElement): Tab = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDestroyInactiveTabPane(value: Boolean): Self = StObject.set(x, "destroyInactiveTabPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactiveTabPaneUndefined: Self = StObject.set(x, "destroyInactiveTabPane", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabKey(value: String): Self = StObject.set(x, "tabKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabKeyUndefined: Self = StObject.set(x, "tabKey", js.undefined)
    }
  }
  
  type TabBarExtraContent = ReactElement | TabBarExtraMap
  
  /* Inlined std.Partial<std.Record<rc-tabs.rc-tabs/es/interface.TabBarExtraPosition, react.react.ReactNode>> */
  @js.native
  trait TabBarExtraMap extends StObject {
    
    var left: js.UndefOr[ReactElement] = js.native
    
    var right: js.UndefOr[ReactElement] = js.native
  }
  object TabBarExtraMap {
    
    @scala.inline
    def apply(): TabBarExtraMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarExtraMap]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TabBarExtraMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: ReactElement): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcTabs.rcTabsStrings.left
    - `web.typings`.rcTabs.rcTabsStrings.right
  */
  trait TabBarExtraPosition extends StObject
  object TabBarExtraPosition {
    
    @scala.inline
    def left: web.typings.rcTabs.rcTabsStrings.left = "left".asInstanceOf[web.typings.rcTabs.rcTabsStrings.left]
    
    @scala.inline
    def right: web.typings.rcTabs.rcTabsStrings.right = "right".asInstanceOf[web.typings.rcTabs.rcTabsStrings.right]
  }
  
  @js.native
  trait TabOffset extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object TabOffset {
    
    @scala.inline
    def apply(height: Double, left: Double, right: Double, top: Double, width: Double): TabOffset = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabOffset]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TabOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TabOffsetMap = Map[Key, TabOffset]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcTabs.rcTabsStrings.left
    - `web.typings`.rcTabs.rcTabsStrings.right
    - `web.typings`.rcTabs.rcTabsStrings.top
    - `web.typings`.rcTabs.rcTabsStrings.bottom
  */
  trait TabPosition extends StObject
  object TabPosition {
    
    @scala.inline
    def bottom: web.typings.rcTabs.rcTabsStrings.bottom = "bottom".asInstanceOf[web.typings.rcTabs.rcTabsStrings.bottom]
    
    @scala.inline
    def left: web.typings.rcTabs.rcTabsStrings.left = "left".asInstanceOf[web.typings.rcTabs.rcTabsStrings.left]
    
    @scala.inline
    def right: web.typings.rcTabs.rcTabsStrings.right = "right".asInstanceOf[web.typings.rcTabs.rcTabsStrings.right]
    
    @scala.inline
    def top: web.typings.rcTabs.rcTabsStrings.top = "top".asInstanceOf[web.typings.rcTabs.rcTabsStrings.top]
  }
  
  type TabSizeMap = Map[Key, Height]
  
  @js.native
  trait TabsLocale extends StObject {
    
    var addAriaLabel: js.UndefOr[String] = js.native
    
    var dropdownAriaLabel: js.UndefOr[String] = js.native
    
    var removeAriaLabel: js.UndefOr[String] = js.native
  }
  object TabsLocale {
    
    @scala.inline
    def apply(): TabsLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TabsLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddAriaLabel(value: String): Self = StObject.set(x, "addAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddAriaLabelUndefined: Self = StObject.set(x, "addAriaLabel", js.undefined)
      
      @scala.inline
      def setDropdownAriaLabel(value: String): Self = StObject.set(x, "dropdownAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAriaLabelUndefined: Self = StObject.set(x, "dropdownAriaLabel", js.undefined)
      
      @scala.inline
      def setRemoveAriaLabel(value: String): Self = StObject.set(x, "removeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAriaLabelUndefined: Self = StObject.set(x, "removeAriaLabel", js.undefined)
    }
  }
}
