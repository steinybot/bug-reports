package web.typings.antd

import web.typings.antd.anon.ClassNames
import web.typings.antd.anon.ComponentDisabled
import web.typings.antd.anon.ComponentStyleConfigPickT
import web.typings.antd.anon.ComponentStyleConfigclass
import web.typings.antd.anon.ComponentStyleConfigshowS
import web.typings.antd.anon.ComponentStyleConfigshowSClassName
import web.typings.antd.anon.ComponentStyleConfigvalid
import web.typings.antd.anon.GetIconPrefixCls
import web.typings.antd.anon.Ghost
import web.typings.antd.anon.PartialConfigProviderProp
import web.typings.antd.anon.PickConfigProviderPropspr
import web.typings.antd.anon.WeakValidationMapConfigPr
import web.typings.antd.esConfigProviderContextMod.BadgeConfig
import web.typings.antd.esConfigProviderContextMod.ButtonConfig
import web.typings.antd.esConfigProviderContextMod.CSPConfig
import web.typings.antd.esConfigProviderContextMod.ComponentStyleConfig
import web.typings.antd.esConfigProviderContextMod.ConfigConsumerProps
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.antd.esConfigProviderContextMod.DrawerConfig
import web.typings.antd.esConfigProviderContextMod.FlexConfig
import web.typings.antd.esConfigProviderContextMod.ModalConfig
import web.typings.antd.esConfigProviderContextMod.PopupOverflow
import web.typings.antd.esConfigProviderContextMod.ThemeConfig
import web.typings.antd.esConfigProviderContextMod.WaveConfig
import web.typings.antd.esConfigProviderDefaultRenderEmptyMod.RenderEmptyHandler
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esLocaleMod.Locale
import web.typings.antd.esUtilWarningMod.WarningContextProps
import web.typings.react.mod.Consumer
import web.typings.react.mod.Context
import web.typings.react.mod.ValidationMap
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderMod {
  
  @JSImport("antd/es/config-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined react.react.FC<antd.antd/es/config-provider.ConfigProviderProps> & {  ConfigContext :react.react.Context<antd.antd/es/config-provider/context.ConfigConsumerProps>,   SizeContext :react.react.Context<antd.antd/es/config-provider/SizeContext.SizeType>,   config :(param0 : std.Pick<antd.antd/es/config-provider.ConfigProviderProps, 'prefixCls' | 'iconPrefixCls'> & {  theme :antd.antd/es/config-provider/context.ThemeConfig | antd.antd/es/config-provider/context.Theme | undefined}): void,   useConfig :(): {  componentDisabled :antd.antd/es/config-provider/DisabledContext.DisabledType,   componentSize :antd.antd/es/config-provider/SizeContext.SizeType}} */
  object default {
    
    @scala.inline
    def apply(props: ConfigProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    @scala.inline
    def apply(props: ConfigProviderProps, context: Any): ReactElement = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/config-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /** @private internal Usage. do not use in your production */
    @JSImport("antd/es/config-provider", "default.ConfigContext")
    @js.native
    def ConfigContext: Context[ConfigConsumerProps] = js.native
    @scala.inline
    def ConfigContext_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigContext")(x.asInstanceOf[js.Any])
    
    /** @deprecated Please use `ConfigProvider.useConfig().componentSize` instead */
    @JSImport("antd/es/config-provider", "default.SizeContext")
    @js.native
    def SizeContext: Context[SizeType] = js.native
    @scala.inline
    def SizeContext_=(x: Context[SizeType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SizeContext")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/config-provider", "default.config")
    @js.native
    def config: js.Function1[/* param0 */ PickConfigProviderPropspr, Unit] = js.native
    @scala.inline
    def config_=(x: js.Function1[/* param0 */ PickConfigProviderPropspr, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/config-provider", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/config-provider", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialConfigProviderProp] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialConfigProviderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/config-provider", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/config-provider", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapConfigPr] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapConfigPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/config-provider", "default.useConfig")
    @js.native
    def useConfig: js.Function0[ComponentDisabled] = js.native
    @scala.inline
    def useConfig_=(x: js.Function0[ComponentDisabled]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useConfig")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/es/config-provider", "ConfigConsumer")
  @js.native
  val ConfigConsumer: Consumer[ConfigConsumerProps] = js.native
  
  @JSImport("antd/es/config-provider", "ConfigContext")
  @js.native
  val ConfigContext: Context[ConfigConsumerProps] = js.native
  
  @JSImport("antd/es/config-provider", "configConsumerProps")
  @js.native
  val configConsumerProps: js.Array[String] = js.native
  
  @JSImport("antd/es/config-provider", "defaultIconPrefixCls")
  @js.native
  val defaultIconPrefixCls: /* "anticon" */ String = js.native
  
  @JSImport("antd/es/config-provider", "defaultPrefixCls")
  @js.native
  val defaultPrefixCls: /* "ant" */ String = js.native
  
  @scala.inline
  def globalConfig(): GetIconPrefixCls = ^.asInstanceOf[js.Dynamic].applyDynamic("globalConfig")().asInstanceOf[GetIconPrefixCls]
  
  @scala.inline
  def warnContext(componentName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnContext")(componentName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait ConfigProviderProps extends StObject {
    
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
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var collapse: js.UndefOr[ComponentStyleConfig] = js.native
    
    var colorPicker: js.UndefOr[ComponentStyleConfig] = js.native
    
    var componentDisabled: js.UndefOr[Boolean] = js.native
    
    var componentSize: js.UndefOr[SizeType] = js.native
    
    var csp: js.UndefOr[CSPConfig] = js.native
    
    var datePicker: js.UndefOr[ComponentStyleConfig] = js.native
    
    var descriptions: js.UndefOr[ComponentStyleConfig] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var divider: js.UndefOr[ComponentStyleConfig] = js.native
    
    var drawer: js.UndefOr[DrawerConfig] = js.native
    
    var dropdown: js.UndefOr[ComponentStyleConfig] = js.native
    
    /** @deprecated Please use `popupMatchSelectWidth` instead */
    var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.native
    
    var empty: js.UndefOr[ComponentStyleConfig] = js.native
    
    var flex: js.UndefOr[FlexConfig] = js.native
    
    var form: js.UndefOr[ComponentStyleConfigvalid] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ js.UndefOr[HTMLElement], HTMLElement]] = js.native
    
    var getTargetContainer: js.UndefOr[js.Function0[HTMLElement | Window]] = js.native
    
    var iconPrefixCls: js.UndefOr[String] = js.native
    
    var image: js.UndefOr[ComponentStyleConfig] = js.native
    
    var input: js.UndefOr[ComponentStyleConfigclass] = js.native
    
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
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var progress: js.UndefOr[ComponentStyleConfig] = js.native
    
    var radio: js.UndefOr[ComponentStyleConfig] = js.native
    
    var rangePicker: js.UndefOr[ComponentStyleConfig] = js.native
    
    var rate: js.UndefOr[ComponentStyleConfig] = js.native
    
    var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.native
    
    var result: js.UndefOr[ComponentStyleConfig] = js.native
    
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
    
    /**
      * Wave is special component which only patch on the effect of component interaction.
      */
    var wave: js.UndefOr[WaveConfig] = js.native
  }
  object ConfigProviderProps {
    
    @scala.inline
    def apply(): ConfigProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigProviderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ConfigProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: ComponentStyleConfig): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setAnchor(value: ComponentStyleConfig): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAutoInsertSpaceInButton(value: Boolean): Self = StObject.set(x, "autoInsertSpaceInButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoInsertSpaceInButtonUndefined: Self = StObject.set(x, "autoInsertSpaceInButton", js.undefined)
      
      @scala.inline
      def setAvatar(value: ComponentStyleConfig): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setBadge(value: BadgeConfig): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setBreadcrumb(value: ComponentStyleConfig): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      @scala.inline
      def setButton(value: ButtonConfig): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setCalendar(value: ComponentStyleConfig): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
      
      @scala.inline
      def setCard(value: ComponentStyleConfig): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      @scala.inline
      def setCarousel(value: ComponentStyleConfig): Self = StObject.set(x, "carousel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselUndefined: Self = StObject.set(x, "carousel", js.undefined)
      
      @scala.inline
      def setCascader(value: ComponentStyleConfig): Self = StObject.set(x, "cascader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascaderUndefined: Self = StObject.set(x, "cascader", js.undefined)
      
      @scala.inline
      def setCheckbox(value: ComponentStyleConfig): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCollapse(value: ComponentStyleConfig): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setColorPicker(value: ComponentStyleConfig): Self = StObject.set(x, "colorPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerUndefined: Self = StObject.set(x, "colorPicker", js.undefined)
      
      @scala.inline
      def setComponentDisabled(value: Boolean): Self = StObject.set(x, "componentDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentDisabledUndefined: Self = StObject.set(x, "componentDisabled", js.undefined)
      
      @scala.inline
      def setComponentSize(value: SizeType): Self = StObject.set(x, "componentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentSizeUndefined: Self = StObject.set(x, "componentSize", js.undefined)
      
      @scala.inline
      def setCsp(value: CSPConfig): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      @scala.inline
      def setDatePicker(value: ComponentStyleConfig): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerUndefined: Self = StObject.set(x, "datePicker", js.undefined)
      
      @scala.inline
      def setDescriptions(value: ComponentStyleConfig): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDivider(value: ComponentStyleConfig): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setDrawer(value: DrawerConfig): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerUndefined: Self = StObject.set(x, "drawer", js.undefined)
      
      @scala.inline
      def setDropdown(value: ComponentStyleConfig): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidth(value: Boolean): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      @scala.inline
      def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      @scala.inline
      def setEmpty(value: ComponentStyleConfig): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setFlex(value: FlexConfig): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setForm(value: ComponentStyleConfigvalid): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ js.UndefOr[HTMLElement] => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetTargetContainer(value: () => HTMLElement | Window): Self = StObject.set(x, "getTargetContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTargetContainerUndefined: Self = StObject.set(x, "getTargetContainer", js.undefined)
      
      @scala.inline
      def setIconPrefixCls(value: String): Self = StObject.set(x, "iconPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefixClsUndefined: Self = StObject.set(x, "iconPrefixCls", js.undefined)
      
      @scala.inline
      def setImage(value: ComponentStyleConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setInput(value: ComponentStyleConfigclass): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLayout(value: ComponentStyleConfig): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setList(value: ComponentStyleConfig): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMentions(value: ComponentStyleConfig): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
      
      @scala.inline
      def setMenu(value: ComponentStyleConfig): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setMessage(value: ComponentStyleConfig): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setModal(value: ModalConfig): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setNotification(value: ComponentStyleConfig): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      @scala.inline
      def setPageHeader(value: Ghost): Self = StObject.set(x, "pageHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeaderUndefined: Self = StObject.set(x, "pageHeader", js.undefined)
      
      @scala.inline
      def setPagination(value: ComponentStyleConfigshowS): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPopupMatchSelectWidth(value: Boolean): Self = StObject.set(x, "popupMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupMatchSelectWidthUndefined: Self = StObject.set(x, "popupMatchSelectWidth", js.undefined)
      
      @scala.inline
      def setPopupOverflow(value: PopupOverflow): Self = StObject.set(x, "popupOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupOverflowUndefined: Self = StObject.set(x, "popupOverflow", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setProgress(value: ComponentStyleConfig): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRadio(value: ComponentStyleConfig): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      @scala.inline
      def setRangePicker(value: ComponentStyleConfig): Self = StObject.set(x, "rangePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangePickerUndefined: Self = StObject.set(x, "rangePicker", js.undefined)
      
      @scala.inline
      def setRate(value: ComponentStyleConfig): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      @scala.inline
      def setRenderEmpty(value: /* componentName */ js.UndefOr[String] => ReactElement): Self = StObject.set(x, "renderEmpty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderEmptyUndefined: Self = StObject.set(x, "renderEmpty", js.undefined)
      
      @scala.inline
      def setResult(value: ComponentStyleConfig): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setSegmented(value: ComponentStyleConfig): Self = StObject.set(x, "segmented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentedUndefined: Self = StObject.set(x, "segmented", js.undefined)
      
      @scala.inline
      def setSelect(value: ComponentStyleConfigshowSClassName): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSkeleton(value: ComponentStyleConfig): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkeletonUndefined: Self = StObject.set(x, "skeleton", js.undefined)
      
      @scala.inline
      def setSlider(value: ComponentStyleConfig): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      @scala.inline
      def setSpace(value: ClassNames): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setSpin(value: ComponentStyleConfig): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      @scala.inline
      def setStatistic(value: ComponentStyleConfig): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
      
      @scala.inline
      def setSteps(value: ComponentStyleConfig): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setSwitch(value: ComponentStyleConfig): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchUndefined: Self = StObject.set(x, "switch", js.undefined)
      
      @scala.inline
      def setTable(value: ComponentStyleConfig): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setTabs(value: ComponentStyleConfigPickT): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTag(value: ComponentStyleConfig): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeConfig): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTimePicker(value: ComponentStyleConfig): Self = StObject.set(x, "timePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerUndefined: Self = StObject.set(x, "timePicker", js.undefined)
      
      @scala.inline
      def setTimeline(value: ComponentStyleConfig): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
      
      @scala.inline
      def setTransfer(value: ComponentStyleConfig): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
      
      @scala.inline
      def setTree(value: ComponentStyleConfig): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
      
      @scala.inline
      def setTypography(value: ComponentStyleConfig): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      @scala.inline
      def setUpload(value: ComponentStyleConfig): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
      
      @scala.inline
      def setWarning(value: WarningContextProps): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      
      @scala.inline
      def setWave(value: WaveConfig): Self = StObject.set(x, "wave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveUndefined: Self = StObject.set(x, "wave", js.undefined)
    }
  }
}
