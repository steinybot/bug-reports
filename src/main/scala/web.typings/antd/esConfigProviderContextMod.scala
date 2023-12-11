package web.typings.antd

import web.typings.antd.anon.Algorithm
import web.typings.antd.anon.ClassName
import web.typings.antd.anon.ClassNames
import web.typings.antd.anon.ComponentStyleConfigPickT
import web.typings.antd.anon.ComponentStyleConfigautoC
import web.typings.antd.anon.ComponentStyleConfigrequi
import web.typings.antd.anon.ComponentStyleConfigshowS
import web.typings.antd.anon.ComponentStyleConfigshowSClassName
import web.typings.antd.anon.Ghost
import web.typings.antd.anon.Icon
import web.typings.antd.anon.IconCSSProperties
import web.typings.antd.anon.Indicator
import web.typings.antd.anon.Key
import web.typings.antd.anon.Root
import web.typings.antd.antdStrings.wrapper
import web.typings.antd.esAffixStyleMod.ComponentToken
import web.typings.antd.esConfigProviderDefaultRenderEmptyMod.RenderEmptyHandler
import web.typings.antd.esDrawerDrawerPanelMod.DrawerClassNames
import web.typings.antd.esDrawerDrawerPanelMod.DrawerStyles
import web.typings.antd.esLocaleMod.Locale
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeInterfaceMod.MappingAlgorithm
import web.typings.antd.esUtilWarningMod.WarningContextProps
import web.typings.antd.esUtilWaveInterfaceMod.ShowWaveEffect
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Consumer
import web.typings.react.mod.Context
import web.typings.std.NonNullable
import web.typings.std.Omit
import web.typings.std.Partial
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderContextMod {
  
  @JSImport("antd/es/config-provider/context", "ConfigConsumer")
  @js.native
  val ConfigConsumer: Consumer[ConfigConsumerProps] = js.native
  
  @JSImport("antd/es/config-provider/context", "ConfigContext")
  @js.native
  val ConfigContext: Context[ConfigConsumerProps] = js.native
  
  @JSImport("antd/es/config-provider/context", "defaultIconPrefixCls")
  @js.native
  val defaultIconPrefixCls: /* "anticon" */ String = js.native
  
  @js.native
  trait BadgeConfig
    extends StObject
       with ComponentStyleConfig {
    
    var classNames: js.UndefOr[Indicator] = js.native
    
    var styles: js.UndefOr[Root] = js.native
  }
  object BadgeConfig {
    
    @scala.inline
    def apply(): BadgeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BadgeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: Indicator): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setStyles(value: Root): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait ButtonConfig
    extends StObject
       with ComponentStyleConfig {
    
    var classNames: js.UndefOr[Icon] = js.native
    
    var styles: js.UndefOr[IconCSSProperties] = js.native
  }
  object ButtonConfig {
    
    @scala.inline
    def apply(): ButtonConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ButtonConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: Icon): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setStyles(value: IconCSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait CSPConfig extends StObject {
    
    var nonce: js.UndefOr[String] = js.native
  }
  object CSPConfig {
    
    @scala.inline
    def apply(): CSPConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSPConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CSPConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  @js.native
  trait ComponentStyleConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ComponentStyleConfig {
    
    @scala.inline
    def apply(): ComponentStyleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentStyleConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentStyleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {[ key in keyof antd.antd/es/theme/interface.OverrideToken ]:? antd.antd/es/theme/interface.OverrideToken[key] & {  algorithm :boolean | antd.antd/es/theme/interface.MappingAlgorithm | std.Array<antd.antd/es/theme/interface.MappingAlgorithm> | undefined}} */
  @js.native
  trait ComponentsConfig extends StObject {
    
    var Affix: js.UndefOr[
        (js.UndefOr[Partial[js.UndefOr[ComponentToken]] with Partial[AliasToken]]) with Algorithm
      ] = js.native
    
    var Alert: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esAlertStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Anchor: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esAnchorStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var App: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esAppStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Avatar: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esAvatarStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var BackTop: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esBackTopStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Badge: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esBadgeStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Breadcrumb: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esBreadcrumbStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Button: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esButtonStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Calendar: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCalendarStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Card: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCardStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Carousel: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCarouselStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Cascader: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCascaderStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Checkbox: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCheckboxStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Collapse: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCollapseStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var ColorPicker: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esColorPickerStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var DatePicker: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDatePickerStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Descriptions: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDescriptionsStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Divider: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDividerStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Drawer: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDrawerStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Dropdown: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDropdownStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Empty: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esEmptyStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Flex: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esFlexStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var FloatButton: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esFloatButtonStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Form: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esFormStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Grid: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esGridStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Image: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esImageStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Input: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esInputStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var InputNumber: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esInputNumberStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Layout: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esLayoutStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var List: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esListStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Mentions: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esMentionsStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Menu: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esMenuStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Message: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esMessageStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Modal: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esModalStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Notification: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esNotificationStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Pagination: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esPaginationStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Popconfirm: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esPopconfirmStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Popover: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esPopoverStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Progress: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esProgressStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var QRCode: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esQrCodeStyleMod_.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Radio: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esRadioStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Rate: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esRateStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Result: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esResultStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Segmented: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSegmentedStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Select: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSelectStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Skeleton: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSkeletonStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Slider: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSliderStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Space: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSpaceStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Spin: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSpinStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Statistic: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esStatisticStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Steps: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esStepsStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Switch: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSwitchStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Table: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTableStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Tabs: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTabsStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Tag: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTagStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Timeline: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTimelineStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Tooltip: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTooltipStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Tour: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTourStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Transfer: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTransferStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Tree: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTreeStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var TreeSelect: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTreeSelectStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Typography: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTypographyStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Upload: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esUploadStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
    
    var Wave: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esUtilWaveStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with Algorithm
      ] = js.native
  }
  object ComponentsConfig {
    
    @scala.inline
    def apply(): ComponentsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentsConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffix(value: (js.UndefOr[Partial[js.UndefOr[ComponentToken]] with Partial[AliasToken]]) with Algorithm): Self = StObject.set(x, "Affix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixUndefined: Self = StObject.set(x, "Affix", js.undefined)
      
      @scala.inline
      def setAlert(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esAlertStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "Alert", js.undefined)
      
      @scala.inline
      def setAnchor(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esAnchorStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "Anchor", js.undefined)
      
      @scala.inline
      def setApp(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esAppStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "App", js.undefined)
      
      @scala.inline
      def setAvatar(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esAvatarStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
      
      @scala.inline
      def setBackTop(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esBackTopStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "BackTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackTopUndefined: Self = StObject.set(x, "BackTop", js.undefined)
      
      @scala.inline
      def setBadge(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esBadgeStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
      
      @scala.inline
      def setBreadcrumb(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esBreadcrumbStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbUndefined: Self = StObject.set(x, "Breadcrumb", js.undefined)
      
      @scala.inline
      def setButton(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esButtonStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "Button", js.undefined)
      
      @scala.inline
      def setCalendar(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCalendarStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      @scala.inline
      def setCard(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCardStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "Card", js.undefined)
      
      @scala.inline
      def setCarousel(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCarouselStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Carousel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselUndefined: Self = StObject.set(x, "Carousel", js.undefined)
      
      @scala.inline
      def setCascader(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCascaderStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Cascader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascaderUndefined: Self = StObject.set(x, "Cascader", js.undefined)
      
      @scala.inline
      def setCheckbox(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCheckboxStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxUndefined: Self = StObject.set(x, "Checkbox", js.undefined)
      
      @scala.inline
      def setCollapse(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCollapseStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "Collapse", js.undefined)
      
      @scala.inline
      def setColorPicker(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esColorPickerStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "ColorPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerUndefined: Self = StObject.set(x, "ColorPicker", js.undefined)
      
      @scala.inline
      def setDatePicker(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDatePickerStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
      
      @scala.inline
      def setDescriptions(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDescriptionsStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Descriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionsUndefined: Self = StObject.set(x, "Descriptions", js.undefined)
      
      @scala.inline
      def setDivider(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDividerStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "Divider", js.undefined)
      
      @scala.inline
      def setDrawer(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDrawerStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Drawer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerUndefined: Self = StObject.set(x, "Drawer", js.undefined)
      
      @scala.inline
      def setDropdown(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDropdownStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Dropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownUndefined: Self = StObject.set(x, "Dropdown", js.undefined)
      
      @scala.inline
      def setEmpty(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esEmptyStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "Empty", js.undefined)
      
      @scala.inline
      def setFlex(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esFlexStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "Flex", js.undefined)
      
      @scala.inline
      def setFloatButton(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esFloatButtonStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "FloatButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatButtonUndefined: Self = StObject.set(x, "FloatButton", js.undefined)
      
      @scala.inline
      def setForm(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esFormStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "Form", js.undefined)
      
      @scala.inline
      def setGrid(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esGridStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "Grid", js.undefined)
      
      @scala.inline
      def setImage(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esImageStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      @scala.inline
      def setInput(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esInputStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNumber(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esInputNumberStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "InputNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNumberUndefined: Self = StObject.set(x, "InputNumber", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      @scala.inline
      def setLayout(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esLayoutStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
      
      @scala.inline
      def setList(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esListStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      @scala.inline
      def setMentions(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esMentionsStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Mentions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionsUndefined: Self = StObject.set(x, "Mentions", js.undefined)
      
      @scala.inline
      def setMenu(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esMenuStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "Menu", js.undefined)
      
      @scala.inline
      def setMessage(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esMessageStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setModal(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esModalStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
      
      @scala.inline
      def setNotification(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esNotificationStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
      
      @scala.inline
      def setPagination(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esPaginationStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
      
      @scala.inline
      def setPopconfirm(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esPopconfirmStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Popconfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopconfirmUndefined: Self = StObject.set(x, "Popconfirm", js.undefined)
      
      @scala.inline
      def setPopover(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esPopoverStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Popover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverUndefined: Self = StObject.set(x, "Popover", js.undefined)
      
      @scala.inline
      def setProgress(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esProgressStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
      
      @scala.inline
      def setQRCode(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esQrCodeStyleMod_.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "QRCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQRCodeUndefined: Self = StObject.set(x, "QRCode", js.undefined)
      
      @scala.inline
      def setRadio(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esRadioStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Radio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioUndefined: Self = StObject.set(x, "Radio", js.undefined)
      
      @scala.inline
      def setRate(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esRateStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "Rate", js.undefined)
      
      @scala.inline
      def setResult(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esResultStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
      
      @scala.inline
      def setSegmented(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSegmentedStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Segmented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentedUndefined: Self = StObject.set(x, "Segmented", js.undefined)
      
      @scala.inline
      def setSelect(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSelectStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      @scala.inline
      def setSkeleton(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSkeletonStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Skeleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkeletonUndefined: Self = StObject.set(x, "Skeleton", js.undefined)
      
      @scala.inline
      def setSlider(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSliderStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
      
      @scala.inline
      def setSpace(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSpaceStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "Space", js.undefined)
      
      @scala.inline
      def setSpin(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSpinStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "Spin", js.undefined)
      
      @scala.inline
      def setStatistic(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esStatisticStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
      
      @scala.inline
      def setSteps(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esStepsStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
      
      @scala.inline
      def setSwitch(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSwitchStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchUndefined: Self = StObject.set(x, "Switch", js.undefined)
      
      @scala.inline
      def setTable(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTableStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      @scala.inline
      def setTabs(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTabsStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "Tabs", js.undefined)
      
      @scala.inline
      def setTag(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTagStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setTimeline(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTimelineStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
      
      @scala.inline
      def setTooltip(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTooltipStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
      
      @scala.inline
      def setTour(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTourStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Tour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTourUndefined: Self = StObject.set(x, "Tour", js.undefined)
      
      @scala.inline
      def setTransfer(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTransferStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferUndefined: Self = StObject.set(x, "Transfer", js.undefined)
      
      @scala.inline
      def setTree(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTreeStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeSelect(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTreeSelectStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "TreeSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeSelectUndefined: Self = StObject.set(x, "TreeSelect", js.undefined)
      
      @scala.inline
      def setTreeUndefined: Self = StObject.set(x, "Tree", js.undefined)
      
      @scala.inline
      def setTypography(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTypographyStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "Typography", js.undefined)
      
      @scala.inline
      def setUpload(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esUploadStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
      
      @scala.inline
      def setWave(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esUtilWaveStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with Algorithm
      ): Self = StObject.set(x, "Wave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveUndefined: Self = StObject.set(x, "Wave", js.undefined)
    }
  }
  
  @js.native
  trait ConfigConsumerProps extends StObject {
    
    var alert: js.UndefOr[ComponentStyleConfig] = js.native
    
    var anchor: js.UndefOr[ComponentStyleConfig] = js.native
    
    var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
    
    var avatar: js.UndefOr[ComponentStyleConfig] = js.native
    
    var badge: js.UndefOr[BadgeConfig] = js.native
    
    var breadcrumb: js.UndefOr[ComponentStyleConfig] = js.native
    
    var button: js.UndefOr[ButtonConfig] = js.native
    
    var calendar: js.UndefOr[ComponentStyleConfig] = js.native
    
    var card: js.UndefOr[ComponentStyleConfig] = js.native
    
    var carousel: js.UndefOr[ComponentStyleConfig] = js.native
    
    var cascader: js.UndefOr[ComponentStyleConfig] = js.native
    
    var checkbox: js.UndefOr[ComponentStyleConfig] = js.native
    
    var collapse: js.UndefOr[ComponentStyleConfig] = js.native
    
    var colorPicker: js.UndefOr[ComponentStyleConfig] = js.native
    
    var csp: js.UndefOr[CSPConfig] = js.native
    
    var datePicker: js.UndefOr[ComponentStyleConfig] = js.native
    
    var descriptions: js.UndefOr[ComponentStyleConfig] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var divider: js.UndefOr[ComponentStyleConfig] = js.native
    
    var drawer: js.UndefOr[DrawerConfig] = js.native
    
    var dropdown: js.UndefOr[ComponentStyleConfig] = js.native
    
    var empty: js.UndefOr[ComponentStyleConfig] = js.native
    
    var flex: js.UndefOr[FlexConfig] = js.native
    
    var form: js.UndefOr[ComponentStyleConfigrequi] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ js.UndefOr[HTMLElement], HTMLElement]] = js.native
    
    def getPrefixCls(): String = js.native
    def getPrefixCls(suffixCls: String): String = js.native
    def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
    def getPrefixCls(suffixCls: Unit, customizePrefixCls: String): String = js.native
    
    var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var iconPrefixCls: String = js.native
    
    var image: js.UndefOr[ComponentStyleConfig] = js.native
    
    var input: js.UndefOr[ComponentStyleConfigautoC] = js.native
    
    var layout: js.UndefOr[ComponentStyleConfig] = js.native
    
    var list: js.UndefOr[ComponentStyleConfig] = js.native
    
    var locale: js.UndefOr[Locale] = js.native
    
    var mentions: js.UndefOr[ComponentStyleConfig] = js.native
    
    var menu: js.UndefOr[ComponentStyleConfig] = js.native
    
    var message: js.UndefOr[ComponentStyleConfig] = js.native
    
    var modal: js.UndefOr[ModalConfig] = js.native
    
    var notification: js.UndefOr[ComponentStyleConfig] = js.native
    
    var pageHeader: js.UndefOr[Ghost] = js.native
    
    var pagination: js.UndefOr[ComponentStyleConfigshowS] = js.native
    
    var popupMatchSelectWidth: js.UndefOr[Boolean] = js.native
    
    var popupOverflow: js.UndefOr[PopupOverflow] = js.native
    
    var progress: js.UndefOr[ComponentStyleConfig] = js.native
    
    var radio: js.UndefOr[ComponentStyleConfig] = js.native
    
    var rangePicker: js.UndefOr[ComponentStyleConfig] = js.native
    
    var rate: js.UndefOr[ComponentStyleConfig] = js.native
    
    var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.native
    
    var result: js.UndefOr[ComponentStyleConfig] = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
    
    var segmented: js.UndefOr[ComponentStyleConfig] = js.native
    
    var select: js.UndefOr[ComponentStyleConfigshowSClassName] = js.native
    
    var skeleton: js.UndefOr[ComponentStyleConfig] = js.native
    
    var slider: js.UndefOr[ComponentStyleConfig] = js.native
    
    var space: js.UndefOr[ClassNames] = js.native
    
    var spin: js.UndefOr[ComponentStyleConfig] = js.native
    
    var statistic: js.UndefOr[ComponentStyleConfig] = js.native
    
    var steps: js.UndefOr[ComponentStyleConfig] = js.native
    
    var switch: js.UndefOr[ComponentStyleConfig] = js.native
    
    var table: js.UndefOr[ComponentStyleConfig] = js.native
    
    var tabs: js.UndefOr[ComponentStyleConfigPickT] = js.native
    
    var tag: js.UndefOr[ComponentStyleConfig] = js.native
    
    var theme: js.UndefOr[ThemeConfig] = js.native
    
    var timePicker: js.UndefOr[ComponentStyleConfig] = js.native
    
    var timeline: js.UndefOr[ComponentStyleConfig] = js.native
    
    var transfer: js.UndefOr[ComponentStyleConfig] = js.native
    
    var tree: js.UndefOr[ComponentStyleConfig] = js.native
    
    var typography: js.UndefOr[ComponentStyleConfig] = js.native
    
    var upload: js.UndefOr[ComponentStyleConfig] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
    
    var warning: js.UndefOr[WarningContextProps] = js.native
    
    var wave: js.UndefOr[WaveConfig] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.ltr
    - `web.typings`.antd.antdStrings.rtl
    - scala.Unit
  */
  type DirectionType = js.UndefOr[_DirectionType]
  
  @js.native
  trait DrawerConfig
    extends StObject
       with ComponentStyleConfig {
    
    var classNames: js.UndefOr[DrawerClassNames] = js.native
    
    var styles: js.UndefOr[DrawerStyles] = js.native
  }
  object DrawerConfig {
    
    @scala.inline
    def apply(): DrawerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: DrawerClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setStyles(value: DrawerStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait FlexConfig
    extends StObject
       with ComponentStyleConfig {
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object FlexConfig {
    
    @scala.inline
    def apply(): FlexConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FlexConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait ModalConfig
    extends StObject
       with ComponentStyleConfig {
    
    var classNames: js.UndefOr[
        Omit[
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: rc-dialog.rc-dialog/es/IDialogPropTypes.IDialogPropTypes['classNames'] */ js.Any
          ], 
          wrapper
        ]
      ] = js.native
    
    var styles: js.UndefOr[
        Omit[
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: rc-dialog.rc-dialog/es/IDialogPropTypes.IDialogPropTypes['styles'] */ js.Any
          ], 
          wrapper
        ]
      ] = js.native
  }
  object ModalConfig {
    
    @scala.inline
    def apply(): ModalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(
        value: Omit[
              NonNullable[
                /* import warning: importer.ImportType#apply Failed type conversion: rc-dialog.rc-dialog/es/IDialogPropTypes.IDialogPropTypes['classNames'] */ js.Any
              ], 
              wrapper
            ]
      ): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setStyles(
        value: Omit[
              NonNullable[
                /* import warning: importer.ImportType#apply Failed type conversion: rc-dialog.rc-dialog/es/IDialogPropTypes.IDialogPropTypes['styles'] */ js.Any
              ], 
              wrapper
            ]
      ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.viewport
    - `web.typings`.antd.antdStrings.scroll
  */
  trait PopupOverflow extends StObject
  object PopupOverflow {
    
    @scala.inline
    def scroll: web.typings.antd.antdStrings.scroll = "scroll".asInstanceOf[web.typings.antd.antdStrings.scroll]
    
    @scala.inline
    def viewport: web.typings.antd.antdStrings.viewport = "viewport".asInstanceOf[web.typings.antd.antdStrings.viewport]
  }
  
  @js.native
  trait Theme extends StObject {
    
    var errorColor: js.UndefOr[String] = js.native
    
    var infoColor: js.UndefOr[String] = js.native
    
    var primaryColor: js.UndefOr[String] = js.native
    
    var processingColor: js.UndefOr[String] = js.native
    
    var successColor: js.UndefOr[String] = js.native
    
    var warningColor: js.UndefOr[String] = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(): Theme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      @scala.inline
      def setInfoColor(value: String): Self = StObject.set(x, "infoColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoColorUndefined: Self = StObject.set(x, "infoColor", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setProcessingColor(value: String): Self = StObject.set(x, "processingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessingColorUndefined: Self = StObject.set(x, "processingColor", js.undefined)
      
      @scala.inline
      def setSuccessColor(value: String): Self = StObject.set(x, "successColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessColorUndefined: Self = StObject.set(x, "successColor", js.undefined)
      
      @scala.inline
      def setWarningColor(value: String): Self = StObject.set(x, "warningColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningColorUndefined: Self = StObject.set(x, "warningColor", js.undefined)
    }
  }
  
  @js.native
  trait ThemeConfig extends StObject {
    
    var algorithm: js.UndefOr[MappingAlgorithm | js.Array[MappingAlgorithm]] = js.native
    
    var components: js.UndefOr[ComponentsConfig] = js.native
    
    var cssVar: js.UndefOr[Key | Boolean] = js.native
    
    var hashed: js.UndefOr[Boolean] = js.native
    
    var inherit: js.UndefOr[Boolean] = js.native
    
    var token: js.UndefOr[Partial[AliasToken]] = js.native
  }
  object ThemeConfig {
    
    @scala.inline
    def apply(): ThemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ThemeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: MappingAlgorithm | js.Array[MappingAlgorithm]): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setAlgorithmVarargs(value: MappingAlgorithm*): Self = StObject.set(x, "algorithm", js.Array(value :_*))
      
      @scala.inline
      def setComponents(value: ComponentsConfig): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setCssVar(value: Key | Boolean): Self = StObject.set(x, "cssVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssVarUndefined: Self = StObject.set(x, "cssVar", js.undefined)
      
      @scala.inline
      def setHashed(value: Boolean): Self = StObject.set(x, "hashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashedUndefined: Self = StObject.set(x, "hashed", js.undefined)
      
      @scala.inline
      def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
      
      @scala.inline
      def setToken(value: Partial[AliasToken]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  @js.native
  trait WaveConfig extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var showEffect: js.UndefOr[ShowWaveEffect] = js.native
  }
  object WaveConfig {
    
    @scala.inline
    def apply(): WaveConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaveConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WaveConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setShowEffect(value: (/* element */ HTMLElement, /* info */ ClassName) => Unit): Self = StObject.set(x, "showEffect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowEffectUndefined: Self = StObject.set(x, "showEffect", js.undefined)
    }
  }
  
  trait _DirectionType extends StObject
}
