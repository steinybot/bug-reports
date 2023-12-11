package web.typings.antd

import web.typings.antd.anon.Key
import web.typings.antd.anon.Override
import web.typings.antd.anon.`8`
import web.typings.antd.anon.overridePartialAliasToken
import web.typings.antd.esAffixStyleMod.ComponentToken
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeInterfaceSeedsMod.SeedToken
import web.typings.react.mod.Context
import web.typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeContextMod {
  
  @JSImport("antd/es/theme/context", "DesignTokenContext")
  @js.native
  val DesignTokenContext: Context[DesignTokenProviderProps] = js.native
  
  object defaultConfig {
    
    @JSImport("antd/es/theme/context", "defaultConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/theme/context", "defaultConfig.hashed")
    @js.native
    def hashed: Boolean = js.native
    @scala.inline
    def hashed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashed")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/theme/context", "defaultConfig.override")
    @js.native
    val `override`: Override = js.native
    
    @JSImport("antd/es/theme/context", "defaultConfig.token")
    @js.native
    def token: SeedToken = js.native
    @scala.inline
    def token_=(x: SeedToken): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("token")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/es/theme/context", "defaultTheme")
  @js.native
  val defaultTheme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<any, any> */ Any = js.native
  
  /* Inlined {[ key in keyof antd.antd/es/theme/interface.OverrideToken ]:? antd.antd/es/theme/interface.OverrideToken[key] & {  theme :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<SeedToken, MapToken> * / any | undefined}} */
  @js.native
  trait ComponentsToken extends StObject {
    
    var Affix: js.UndefOr[
        (js.UndefOr[Partial[js.UndefOr[ComponentToken]] with Partial[AliasToken]]) with `8`
      ] = js.native
    
    var Alert: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esAlertStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Anchor: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esAnchorStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var App: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esAppStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Avatar: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esAvatarStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var BackTop: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esBackTopStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Badge: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esBadgeStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Breadcrumb: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esBreadcrumbStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Button: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esButtonStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Calendar: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCalendarStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Card: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCardStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Carousel: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCarouselStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Cascader: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCascaderStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Checkbox: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCheckboxStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Collapse: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esCollapseStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var ColorPicker: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esColorPickerStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var DatePicker: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDatePickerStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Descriptions: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDescriptionsStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Divider: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDividerStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Drawer: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDrawerStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Dropdown: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esDropdownStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Empty: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esEmptyStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Flex: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esFlexStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var FloatButton: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esFloatButtonStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Form: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esFormStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Grid: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esGridStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Image: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esImageStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Input: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esInputStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var InputNumber: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esInputNumberStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Layout: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esLayoutStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var List: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esListStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Mentions: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esMentionsStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Menu: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esMenuStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Message: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esMessageStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Modal: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esModalStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Notification: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esNotificationStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Pagination: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esPaginationStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Popconfirm: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esPopconfirmStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Popover: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esPopoverStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Progress: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esProgressStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var QRCode: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esQrCodeStyleMod_.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Radio: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esRadioStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Rate: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esRateStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Result: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esResultStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Segmented: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSegmentedStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Select: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSelectStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Skeleton: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSkeletonStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Slider: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSliderStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Space: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSpaceStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Spin: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSpinStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Statistic: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esStatisticStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Steps: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esStepsStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Switch: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esSwitchStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Table: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTableStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Tabs: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTabsStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Tag: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTagStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Timeline: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTimelineStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Tooltip: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTooltipStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Tour: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTourStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Transfer: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTransferStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Tree: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTreeStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var TreeSelect: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTreeSelectStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Typography: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esTypographyStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Upload: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esUploadStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
    
    var Wave: js.UndefOr[
        (js.UndefOr[
          Partial[js.UndefOr[web.typings.antd.esUtilWaveStyleMod.ComponentToken]] with Partial[AliasToken]
        ]) with `8`
      ] = js.native
  }
  object ComponentsToken {
    
    @scala.inline
    def apply(): ComponentsToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentsToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentsToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffix(value: (js.UndefOr[Partial[js.UndefOr[ComponentToken]] with Partial[AliasToken]]) with `8`): Self = StObject.set(x, "Affix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixUndefined: Self = StObject.set(x, "Affix", js.undefined)
      
      @scala.inline
      def setAlert(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esAlertStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "Alert", js.undefined)
      
      @scala.inline
      def setAnchor(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esAnchorStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "Anchor", js.undefined)
      
      @scala.inline
      def setApp(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esAppStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "App", js.undefined)
      
      @scala.inline
      def setAvatar(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esAvatarStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
      
      @scala.inline
      def setBackTop(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esBackTopStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "BackTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackTopUndefined: Self = StObject.set(x, "BackTop", js.undefined)
      
      @scala.inline
      def setBadge(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esBadgeStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
      
      @scala.inline
      def setBreadcrumb(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esBreadcrumbStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbUndefined: Self = StObject.set(x, "Breadcrumb", js.undefined)
      
      @scala.inline
      def setButton(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esButtonStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "Button", js.undefined)
      
      @scala.inline
      def setCalendar(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCalendarStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      @scala.inline
      def setCard(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCardStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "Card", js.undefined)
      
      @scala.inline
      def setCarousel(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCarouselStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Carousel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselUndefined: Self = StObject.set(x, "Carousel", js.undefined)
      
      @scala.inline
      def setCascader(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCascaderStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Cascader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascaderUndefined: Self = StObject.set(x, "Cascader", js.undefined)
      
      @scala.inline
      def setCheckbox(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCheckboxStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxUndefined: Self = StObject.set(x, "Checkbox", js.undefined)
      
      @scala.inline
      def setCollapse(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esCollapseStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "Collapse", js.undefined)
      
      @scala.inline
      def setColorPicker(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esColorPickerStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "ColorPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerUndefined: Self = StObject.set(x, "ColorPicker", js.undefined)
      
      @scala.inline
      def setDatePicker(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDatePickerStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
      
      @scala.inline
      def setDescriptions(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDescriptionsStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Descriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionsUndefined: Self = StObject.set(x, "Descriptions", js.undefined)
      
      @scala.inline
      def setDivider(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDividerStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "Divider", js.undefined)
      
      @scala.inline
      def setDrawer(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDrawerStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Drawer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerUndefined: Self = StObject.set(x, "Drawer", js.undefined)
      
      @scala.inline
      def setDropdown(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esDropdownStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Dropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownUndefined: Self = StObject.set(x, "Dropdown", js.undefined)
      
      @scala.inline
      def setEmpty(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esEmptyStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "Empty", js.undefined)
      
      @scala.inline
      def setFlex(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esFlexStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "Flex", js.undefined)
      
      @scala.inline
      def setFloatButton(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esFloatButtonStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "FloatButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatButtonUndefined: Self = StObject.set(x, "FloatButton", js.undefined)
      
      @scala.inline
      def setForm(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esFormStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "Form", js.undefined)
      
      @scala.inline
      def setGrid(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esGridStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "Grid", js.undefined)
      
      @scala.inline
      def setImage(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esImageStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      @scala.inline
      def setInput(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esInputStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNumber(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esInputNumberStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "InputNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNumberUndefined: Self = StObject.set(x, "InputNumber", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      @scala.inline
      def setLayout(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esLayoutStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
      
      @scala.inline
      def setList(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esListStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      @scala.inline
      def setMentions(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esMentionsStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Mentions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionsUndefined: Self = StObject.set(x, "Mentions", js.undefined)
      
      @scala.inline
      def setMenu(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esMenuStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "Menu", js.undefined)
      
      @scala.inline
      def setMessage(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esMessageStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setModal(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esModalStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
      
      @scala.inline
      def setNotification(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esNotificationStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
      
      @scala.inline
      def setPagination(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esPaginationStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
      
      @scala.inline
      def setPopconfirm(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esPopconfirmStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Popconfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopconfirmUndefined: Self = StObject.set(x, "Popconfirm", js.undefined)
      
      @scala.inline
      def setPopover(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esPopoverStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Popover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverUndefined: Self = StObject.set(x, "Popover", js.undefined)
      
      @scala.inline
      def setProgress(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esProgressStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
      
      @scala.inline
      def setQRCode(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esQrCodeStyleMod_.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "QRCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQRCodeUndefined: Self = StObject.set(x, "QRCode", js.undefined)
      
      @scala.inline
      def setRadio(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esRadioStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Radio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioUndefined: Self = StObject.set(x, "Radio", js.undefined)
      
      @scala.inline
      def setRate(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esRateStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "Rate", js.undefined)
      
      @scala.inline
      def setResult(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esResultStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
      
      @scala.inline
      def setSegmented(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSegmentedStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Segmented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentedUndefined: Self = StObject.set(x, "Segmented", js.undefined)
      
      @scala.inline
      def setSelect(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSelectStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      @scala.inline
      def setSkeleton(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSkeletonStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Skeleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkeletonUndefined: Self = StObject.set(x, "Skeleton", js.undefined)
      
      @scala.inline
      def setSlider(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSliderStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
      
      @scala.inline
      def setSpace(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSpaceStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "Space", js.undefined)
      
      @scala.inline
      def setSpin(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSpinStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "Spin", js.undefined)
      
      @scala.inline
      def setStatistic(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esStatisticStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
      
      @scala.inline
      def setSteps(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esStepsStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
      
      @scala.inline
      def setSwitch(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esSwitchStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchUndefined: Self = StObject.set(x, "Switch", js.undefined)
      
      @scala.inline
      def setTable(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTableStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      @scala.inline
      def setTabs(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTabsStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "Tabs", js.undefined)
      
      @scala.inline
      def setTag(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTagStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setTimeline(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTimelineStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
      
      @scala.inline
      def setTooltip(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTooltipStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
      
      @scala.inline
      def setTour(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTourStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Tour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTourUndefined: Self = StObject.set(x, "Tour", js.undefined)
      
      @scala.inline
      def setTransfer(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTransferStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferUndefined: Self = StObject.set(x, "Transfer", js.undefined)
      
      @scala.inline
      def setTree(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTreeStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeSelect(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTreeSelectStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "TreeSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeSelectUndefined: Self = StObject.set(x, "TreeSelect", js.undefined)
      
      @scala.inline
      def setTreeUndefined: Self = StObject.set(x, "Tree", js.undefined)
      
      @scala.inline
      def setTypography(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esTypographyStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "Typography", js.undefined)
      
      @scala.inline
      def setUpload(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esUploadStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
      
      @scala.inline
      def setWave(
        value: (js.UndefOr[
              Partial[js.UndefOr[web.typings.antd.esUtilWaveStyleMod.ComponentToken]] with Partial[AliasToken]
            ]) with `8`
      ): Self = StObject.set(x, "Wave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveUndefined: Self = StObject.set(x, "Wave", js.undefined)
    }
  }
  
  @js.native
  trait DesignTokenProviderProps extends StObject {
    
    var components: js.UndefOr[ComponentsToken] = js.native
    
    var cssVar: js.UndefOr[Key] = js.native
    
    var hashed: js.UndefOr[String | Boolean] = js.native
    
    /** Just merge `token` & `override` at top to save perf */
    var `override`: overridePartialAliasToken = js.native
    
    var theme: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<SeedToken, MapToken> */ Any
      ] = js.native
    
    var token: Partial[AliasToken] = js.native
  }
  object DesignTokenProviderProps {
    
    @scala.inline
    def apply(`override`: overridePartialAliasToken, token: Partial[AliasToken]): DesignTokenProviderProps = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DesignTokenProviderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DesignTokenProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: ComponentsToken): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setCssVar(value: Key): Self = StObject.set(x, "cssVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssVarUndefined: Self = StObject.set(x, "cssVar", js.undefined)
      
      @scala.inline
      def setHashed(value: String | Boolean): Self = StObject.set(x, "hashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashedUndefined: Self = StObject.set(x, "hashed", js.undefined)
      
      @scala.inline
      def setOverride(value: overridePartialAliasToken): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<SeedToken, MapToken> */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setToken(value: Partial[AliasToken]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
