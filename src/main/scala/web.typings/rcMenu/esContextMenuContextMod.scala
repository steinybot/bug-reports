package web.typings.rcMenu

import web.typings.rcMenu.anon.PartialkeyinMenuModeother
import web.typings.rcMenu.esInterfaceMod.BuiltinPlacements
import web.typings.rcMenu.esInterfaceMod.MenuClickEventHandler
import web.typings.rcMenu.esInterfaceMod.MenuInfo
import web.typings.rcMenu.esInterfaceMod.MenuMode
import web.typings.rcMenu.esInterfaceMod.RenderIconInfo
import web.typings.rcMenu.esInterfaceMod.RenderIconType
import web.typings.rcMenu.esInterfaceMod.TriggerSubMenuAction
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.Context
import web.typings.react.mod.JSX.Element
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMenuContextMod {
  
  @JSImport("rc-menu/es/context/MenuContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: InheritableContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-menu/es/context/MenuContext", "MenuContext")
  @js.native
  val MenuContext: Context[MenuContextProps] = js.native
  
  /* Inlined parent std.Partial<rc-menu.rc-menu/es/context/MenuContext.MenuContextProps> */
  @js.native
  trait InheritableContextProps extends StObject {
    
    var activeKey: js.UndefOr[String] = js.native
    
    var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var defaultMotions: js.UndefOr[PartialkeyinMenuModeother] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[RenderIconType] = js.native
    
    var forceSubMenuRender: js.UndefOr[Boolean] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var inlineIndent: js.UndefOr[Double] = js.native
    
    var itemIcon: js.UndefOr[RenderIconType] = js.native
    
    var locked: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[MenuMode] = js.native
    
    var motion: js.UndefOr[CSSMotionProps] = js.native
    
    var onActive: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
    
    var onInactive: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
    
    var onItemClick: js.UndefOr[MenuClickEventHandler] = js.native
    
    var onOpenChange: js.UndefOr[js.Function2[/* key */ String, /* open */ Boolean, Unit]] = js.native
    
    var openKeys: js.UndefOr[js.Array[String]] = js.native
    
    var overflowDisabled: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.native
    
    var subMenuCloseDelay: js.UndefOr[Double] = js.native
    
    var subMenuOpenDelay: js.UndefOr[Double] = js.native
    
    var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.native
  }
  object InheritableContextProps {
    
    @scala.inline
    def apply(): InheritableContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InheritableContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InheritableContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setBuiltinPlacements(value: BuiltinPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultMotions(value: PartialkeyinMenuModeother): Self = StObject.set(x, "defaultMotions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMotionsUndefined: Self = StObject.set(x, "defaultMotions", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconReactElement(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setForceSubMenuRender(value: Boolean): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
      
      @scala.inline
      def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemIconReactElement(value: ReactElement): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      @scala.inline
      def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setOnActive(value: /* key */ String => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      @scala.inline
      def setOnInactive(value: /* key */ String => Unit): Self = StObject.set(x, "onInactive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInactiveUndefined: Self = StObject.set(x, "onInactive", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: (/* key */ String, /* open */ Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOpenKeys(value: js.Array[String]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenKeysUndefined: Self = StObject.set(x, "openKeys", js.undefined)
      
      @scala.inline
      def setOpenKeysVarargs(value: String*): Self = StObject.set(x, "openKeys", js.Array(value :_*))
      
      @scala.inline
      def setOverflowDisabled(value: Boolean): Self = StObject.set(x, "overflowDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowDisabledUndefined: Self = StObject.set(x, "overflowDisabled", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setSubMenuCloseDelay(value: Double): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuCloseDelayUndefined: Self = StObject.set(x, "subMenuCloseDelay", js.undefined)
      
      @scala.inline
      def setSubMenuOpenDelay(value: Double): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuOpenDelayUndefined: Self = StObject.set(x, "subMenuOpenDelay", js.undefined)
      
      @scala.inline
      def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
    }
  }
  
  @js.native
  trait MenuContextProps extends StObject {
    
    var activeKey: String = js.native
    
    var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.native
    
    var defaultMotions: js.UndefOr[PartialkeyinMenuModeother] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[RenderIconType] = js.native
    
    var forceSubMenuRender: js.UndefOr[Boolean] = js.native
    
    def getPopupContainer(node: HTMLElement): HTMLElement = js.native
    
    var inlineIndent: Double = js.native
    
    var itemIcon: js.UndefOr[RenderIconType] = js.native
    
    var mode: MenuMode = js.native
    
    var motion: js.UndefOr[CSSMotionProps] = js.native
    
    def onActive(key: String): Unit = js.native
    
    def onInactive(key: String): Unit = js.native
    
    var onItemClick: MenuClickEventHandler = js.native
    
    def onOpenChange(key: String, open: Boolean): Unit = js.native
    
    var openKeys: js.Array[String] = js.native
    
    var overflowDisabled: js.UndefOr[Boolean] = js.native
    
    var prefixCls: String = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var selectedKeys: js.Array[String] = js.native
    
    var subMenuCloseDelay: Double = js.native
    
    var subMenuOpenDelay: Double = js.native
    
    var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.native
  }
  object MenuContextProps {
    
    @scala.inline
    def apply(
      activeKey: String,
      getPopupContainer: HTMLElement => HTMLElement,
      inlineIndent: Double,
      mode: MenuMode,
      onActive: String => Unit,
      onInactive: String => Unit,
      onItemClick: /* info */ MenuInfo => Unit,
      onOpenChange: (String, Boolean) => Unit,
      openKeys: js.Array[String],
      prefixCls: String,
      selectedKeys: js.Array[String],
      subMenuCloseDelay: Double,
      subMenuOpenDelay: Double
    ): MenuContextProps = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], getPopupContainer = js.Any.fromFunction1(getPopupContainer), inlineIndent = inlineIndent.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onActive = js.Any.fromFunction1(onActive), onInactive = js.Any.fromFunction1(onInactive), onItemClick = js.Any.fromFunction1(onItemClick), onOpenChange = js.Any.fromFunction2(onOpenChange), openKeys = openKeys.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], subMenuCloseDelay = subMenuCloseDelay.asInstanceOf[js.Any], subMenuOpenDelay = subMenuOpenDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacements(value: BuiltinPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setDefaultMotions(value: PartialkeyinMenuModeother): Self = StObject.set(x, "defaultMotions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMotionsUndefined: Self = StObject.set(x, "defaultMotions", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconReactElement(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setForceSubMenuRender(value: Boolean): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemIconReactElement(value: ReactElement): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      @scala.inline
      def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setOnActive(value: String => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInactive(value: String => Unit): Self = StObject.set(x, "onInactive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChange(value: (String, Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOpenKeys(value: js.Array[String]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenKeysVarargs(value: String*): Self = StObject.set(x, "openKeys", js.Array(value :_*))
      
      @scala.inline
      def setOverflowDisabled(value: Boolean): Self = StObject.set(x, "overflowDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowDisabledUndefined: Self = StObject.set(x, "overflowDisabled", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setSubMenuCloseDelay(value: Double): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuOpenDelay(value: Double): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
    }
  }
}
