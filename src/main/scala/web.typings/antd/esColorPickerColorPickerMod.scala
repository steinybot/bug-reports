package web.typings.antd

import web.typings.antd.anon.Components
import web.typings.antd.anon.KeepParent
import web.typings.antd.anon.PointAtCenter
import web.typings.antd.anon.Popup
import web.typings.antd.esColorPickerInterfaceMod.ColorFormat
import web.typings.antd.esColorPickerInterfaceMod.ColorValueType
import web.typings.antd.esColorPickerInterfaceMod.PresetsItem
import web.typings.antd.esColorPickerInterfaceMod.TriggerPlacement
import web.typings.antd.esColorPickerInterfaceMod.TriggerType
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esUtilPlacementsMod.AdjustOverflow
import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FunctionComponent
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerColorPickerMod extends Shortcut {
  
  @JSImport("antd/es/color-picker/ColorPicker", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  /* Inlined std.Omit<@rc-component/color-picker.@rc-component/color-picker.ColorPickerProps, 'onChange' | 'value' | 'defaultValue' | 'panelRender' | 'disabledAlpha' | 'onChangeComplete'> & {  value :antd.antd/es/color-picker/interface.ColorValueType | undefined,   defaultValue :antd.antd/es/color-picker/interface.ColorValueType | undefined,   children :react.react.ReactNode | undefined,   open :boolean | undefined,   disabled :boolean | undefined,   placement :antd.antd/es/color-picker/interface.TriggerPlacement | undefined,   trigger :antd.antd/es/color-picker/interface.TriggerType | undefined,   format :keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any | undefined,   defaultFormat :keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any | undefined,   allowClear :boolean | undefined,   presets :std.Array<antd.antd/es/color-picker/interface.PresetsItem> | undefined,   arrow :boolean | {  pointAtCenter :boolean} | undefined,   panelRender :(panel : react.react.ReactNode, extra : {  components :{  Picker :react.react.FC<{}>,   Presets :react.react.FC<{}>}}): react.react.ReactNode | undefined,   showText :boolean | (color : antd.antd/es/color-picker/color.Color): react.react.ReactNode | undefined,   size :antd.antd/es/config-provider/SizeContext.SizeType | undefined,   styles :{  popup :react.react.CSSProperties | undefined,   popupOverlayInner :react.react.CSSProperties | undefined} | undefined,   rootClassName :string | undefined,   disabledAlpha :boolean | undefined, [key: / * template literal string: data-${string} * / string] : string,   onOpenChange :(open : boolean): void | undefined,   onFormatChange :(format : antd.antd/es/color-picker/interface.ColorFormat): void | undefined,   onChange :(value : antd.antd/es/color-picker/color.Color, hex : string): void | undefined,   onClear :(): void | undefined,   onChangeComplete :(value : antd.antd/es/color-picker/color.Color): void | undefined} & std.Pick<antd.antd/es/popover.PopoverProps, 'getPopupContainer' | 'autoAdjustOverflow' | 'destroyTooltipOnHide'> */
  @js.native
  trait ColorPickerProps
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var arrow: js.UndefOr[Boolean | PointAtCenter] = js.native
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[Color] = js.native
    
    var defaultFormat: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ] = js.native
    
    var defaultValue: js.UndefOr[ColorValueType] = js.native
    
    var destroyTooltipOnHide: js.UndefOr[Boolean | KeepParent] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledAlpha: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* value */ web.typings.antd.esColorPickerColorMod.Color, /* hex */ String, Unit]
      ] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function1[/* value */ web.typings.antd.esColorPickerColorMod.Color, Unit]] = js.native
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFormatChange: js.UndefOr[js.Function1[/* format */ ColorFormat, Unit]] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var panelRender: js.UndefOr[js.Function2[/* panel */ ReactElement, /* extra */ Components, ReactElement]] = js.native
    
    var placement: js.UndefOr[TriggerPlacement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var presets: js.UndefOr[js.Array[PresetsItem]] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var showText: js.UndefOr[
        Boolean | (js.Function1[/* color */ web.typings.antd.esColorPickerColorMod.Color, ReactElement])
      ] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[Popup] = js.native
    
    var trigger: js.UndefOr[TriggerType] = js.native
    
    var value: js.UndefOr[ColorValueType] = js.native
  }
  object ColorPickerProps {
    
    @scala.inline
    def apply(): ColorPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setArrow(value: Boolean | PointAtCenter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDefaultFormat(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFormatUndefined: Self = StObject.set(x, "defaultFormat", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ColorValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDestroyTooltipOnHide(value: Boolean | KeepParent): Self = StObject.set(x, "destroyTooltipOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyTooltipOnHideUndefined: Self = StObject.set(x, "destroyTooltipOnHide", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledAlpha(value: Boolean): Self = StObject.set(x, "disabledAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledAlphaUndefined: Self = StObject.set(x, "disabledAlpha", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFormat(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ web.typings.antd.esColorPickerColorMod.Color, /* hex */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeComplete(value: /* value */ web.typings.antd.esColorPickerColorMod.Color => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnFormatChange(value: /* format */ ColorFormat => Unit): Self = StObject.set(x, "onFormatChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFormatChangeUndefined: Self = StObject.set(x, "onFormatChange", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPanelRender(value: (/* panel */ ReactElement, /* extra */ Components) => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setPlacement(value: TriggerPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPresets(value: js.Array[PresetsItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: PresetsItem*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setShowText(
        value: Boolean | (js.Function1[/* color */ web.typings.antd.esColorPickerColorMod.Color, ReactElement])
      ): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTextFunction1(value: /* color */ web.typings.antd.esColorPickerColorMod.Color => ReactElement): Self = StObject.set(x, "showText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: Popup): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTrigger(value: TriggerType): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setValue(value: ColorValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[ColorPickerProps] {
    
    var _InternalPanelDoNotUseOrYouWillBeFired: js.Function1[/* props */ Any, Element] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerColorPickerMod.foo` */
  override def _to: CompoundedComponent = default
}
