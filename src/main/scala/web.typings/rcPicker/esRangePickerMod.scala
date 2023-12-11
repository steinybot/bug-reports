package web.typings.rcPicker

import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcPicker.anon.ClearIcon
import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.CellRender
import web.typings.rcPicker.esInterfaceMod.CellRenderInfo
import web.typings.rcPicker.esInterfaceMod.Components
import web.typings.rcPicker.esInterfaceMod.CustomFormat
import web.typings.rcPicker.esInterfaceMod.DisabledTimes
import web.typings.rcPicker.esInterfaceMod.EventValue
import web.typings.rcPicker.esInterfaceMod.IntRange
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.esInterfaceMod.PickerMode
import web.typings.rcPicker.esInterfaceMod.PresetDate
import web.typings.rcPicker.esInterfaceMod.RangeValue
import web.typings.rcPicker.esPanelsMonthPanelMonthBodyMod.MonthCellRender
import web.typings.rcPicker.esPickerMod.PickerRefConfig
import web.typings.rcPicker.rcPickerInts.`0`
import web.typings.rcPicker.rcPickerInts.`1`
import web.typings.rcPicker.rcPickerInts.`23`
import web.typings.rcPicker.rcPickerInts.`59`
import web.typings.rcPicker.rcPickerStrings.`additions removals`
import web.typings.rcPicker.rcPickerStrings.`additions text`
import web.typings.rcPicker.rcPickerStrings.`inline`
import web.typings.rcPicker.rcPickerStrings.`removals additions`
import web.typings.rcPicker.rcPickerStrings.`removals text`
import web.typings.rcPicker.rcPickerStrings.`text additions`
import web.typings.rcPicker.rcPickerStrings.`text removals`
import web.typings.rcPicker.rcPickerStrings.additions
import web.typings.rcPicker.rcPickerStrings.all
import web.typings.rcPicker.rcPickerStrings.ascending
import web.typings.rcPicker.rcPickerStrings.assertive
import web.typings.rcPicker.rcPickerStrings.both
import web.typings.rcPicker.rcPickerStrings.cellRender
import web.typings.rcPicker.rcPickerStrings.copy
import web.typings.rcPicker.rcPickerStrings.date
import web.typings.rcPicker.rcPickerStrings.defaultPickerValue
import web.typings.rcPicker.rcPickerStrings.defaultValue
import web.typings.rcPicker.rcPickerStrings.descending
import web.typings.rcPicker.rcPickerStrings.dialog
import web.typings.rcPicker.rcPickerStrings.disabled
import web.typings.rcPicker.rcPickerStrings.disabledTime
import web.typings.rcPicker.rcPickerStrings.execute
import web.typings.rcPicker.rcPickerStrings.grammar
import web.typings.rcPicker.rcPickerStrings.grid
import web.typings.rcPicker.rcPickerStrings.horizontal
import web.typings.rcPicker.rcPickerStrings.link
import web.typings.rcPicker.rcPickerStrings.list
import web.typings.rcPicker.rcPickerStrings.listbox
import web.typings.rcPicker.rcPickerStrings.location
import web.typings.rcPicker.rcPickerStrings.ltr
import web.typings.rcPicker.rcPickerStrings.menu
import web.typings.rcPicker.rcPickerStrings.mixed
import web.typings.rcPicker.rcPickerStrings.mode
import web.typings.rcPicker.rcPickerStrings.move
import web.typings.rcPicker.rcPickerStrings.none
import web.typings.rcPicker.rcPickerStrings.off
import web.typings.rcPicker.rcPickerStrings.onChange
import web.typings.rcPicker.rcPickerStrings.onOk
import web.typings.rcPicker.rcPickerStrings.onPanelChange
import web.typings.rcPicker.rcPickerStrings.onPickerValueChange
import web.typings.rcPicker.rcPickerStrings.onSelect
import web.typings.rcPicker.rcPickerStrings.other
import web.typings.rcPicker.rcPickerStrings.page
import web.typings.rcPicker.rcPickerStrings.pickerValue
import web.typings.rcPicker.rcPickerStrings.placeholder
import web.typings.rcPicker.rcPickerStrings.polite
import web.typings.rcPicker.rcPickerStrings.popup
import web.typings.rcPicker.rcPickerStrings.presets
import web.typings.rcPicker.rcPickerStrings.removals
import web.typings.rcPicker.rcPickerStrings.rtl
import web.typings.rcPicker.rcPickerStrings.showTime
import web.typings.rcPicker.rcPickerStrings.showToday
import web.typings.rcPicker.rcPickerStrings.spelling
import web.typings.rcPicker.rcPickerStrings.step
import web.typings.rcPicker.rcPickerStrings.text
import web.typings.rcPicker.rcPickerStrings.time
import web.typings.rcPicker.rcPickerStrings.tree
import web.typings.rcPicker.rcPickerStrings.value
import web.typings.rcPicker.rcPickerStrings.vertical
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Component
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.InputHTMLAttributes
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.MutableRefObject
import web.typings.std.Exclude
import web.typings.std.Omit
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRangePickerMod {
  
  @JSImport("rc-picker/es/RangePicker", JSImport.Default)
  @js.native
  class default[DateType] () extends RangePicker[DateType]
  
  type OmitPickerProps[Props] = Omit[
    Props, 
    value | defaultValue | defaultPickerValue | placeholder | disabled | disabledTime | showToday | showTime | mode | onChange | onSelect | onPanelChange | pickerValue | onPickerValueChange | onOk | cellRender | presets
  ]
  
  type RangeDateRender[DateType] = js.Function3[/* currentDate */ DateType, /* today */ DateType, /* info */ RangeInfo, ReactElement]
  
  @js.native
  trait RangeInfo extends StObject {
    
    var range: RangeType = js.native
  }
  object RangeInfo {
    
    @scala.inline
    def apply(range: RangeType): RangeInfo = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRange(value: RangeType): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RangePicker[DateType]
    extends Component[RangePickerProps[DateType], js.Object, Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var pickerRef: ReactRef[PickerRefConfig] = js.native
  }
  
  /* Inlined {} & rc-picker.rc-picker/es/RangePicker.RangePickerSharedProps<DateType> & rc-picker.rc-picker/es/RangePicker.OmitPickerProps<rc-picker.rc-picker/es/Picker.PickerBaseProps<DateType>> */
  @js.native
  trait RangePickerBaseProps[DateType]
    extends StObject
       with RangePickerProps[DateType] {
    
    /** @private Internal control of active picker. Do not use since it's private usage */
    var activePickerIndex: js.UndefOr[`0` | `1`] = js.native
    
    var allowClear: js.UndefOr[Boolean | ClearIcon] = js.native
    
    var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-braillelabel`: js.UndefOr[String] = js.native
    
    var `aria-brailleroledescription`: js.UndefOr[String] = js.native
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colindextext`: js.UndefOr[String] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-description`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Booleanish] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowindextext`: js.UndefOr[String] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
    
    /**
      * Trigger `onChange` event when blur.
      * If you don't want to user click `confirm` to trigger change, can use this.
      */
    var changeOnBlur: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearIcon: js.UndefOr[ReactElement] = js.native
    
    var components: js.UndefOr[Components] = js.native
    
    /** @deprecated use cellRender instead of dateRender */
    var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated please use `defaultValue` instead.
      * Set default display picker view date
      */
    var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
    
    var defaultValue: js.UndefOr[RangeValue[DateType]] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var disabledTime: js.UndefOr[
        js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
      ] = js.native
    
    var dropdownAlign: js.UndefOr[AlignType] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputReadOnly: js.UndefOr[Boolean] = js.native
    
    var inputRender: js.UndefOr[js.Function1[/* props */ InputHTMLAttributes[HTMLInputElement], ReactElement]] = js.native
    
    var locale: Locale = js.native
    
    var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.native
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nextIcon: js.UndefOr[ReactElement] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onCalendarChange: js.UndefOr[
        js.Function3[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          /* info */ RangeInfo, 
          Unit
        ]
      ] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          Unit
        ]
      ] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ SyntheticKeyboardEvent[HTMLInputElement], 
          /* preventDefault */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[
        js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
      ] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactElement, ReactElement]] = js.native
    
    var picker: Exclude[PickerMode, date | time] = js.native
    
    var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
    
    var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var presets: js.UndefOr[js.Array[PresetDate[Exclude[RangeValue[DateType], Null]]]] = js.native
    
    var prevIcon: js.UndefOr[ReactElement] = js.native
    
    /** @deprecated Please use `presets` instead */
    var ranges: js.UndefOr[
        Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
      ] = js.native
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffixIcon: js.UndefOr[ReactElement] = js.native
    
    var superNextIcon: js.UndefOr[ReactElement] = js.native
    
    var superPrevIcon: js.UndefOr[ReactElement] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[RangeValue[DateType]] = js.native
  }
  object RangePickerBaseProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): RangePickerBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePickerBaseProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RangePickerBaseProps[_], DateType] (val x: Self with RangePickerBaseProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setActivePickerIndex(value: `0` | `1`): Self = StObject.set(x, "activePickerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePickerIndexUndefined: Self = StObject.set(x, "activePickerIndex", js.undefined)
      
      @scala.inline
      def setAllowClear(value: Boolean | ClearIcon): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-braillelabel`(value: String): Self = StObject.set(x, "aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-braillelabelUndefined`: Self = StObject.set(x, "aria-braillelabel", js.undefined)
      
      @scala.inline
      def `setAria-brailleroledescription`(value: String): Self = StObject.set(x, "aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-brailleroledescriptionUndefined`: Self = StObject.set(x, "aria-brailleroledescription", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colindextext`(value: String): Self = StObject.set(x, "aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindextextUndefined`: Self = StObject.set(x, "aria-colindextext", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-description`(value: String): Self = StObject.set(x, "aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-descriptionUndefined`: Self = StObject.set(x, "aria-description", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowindextext`(value: String): Self = StObject.set(x, "aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindextextUndefined`: Self = StObject.set(x, "aria-rowindextext", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setChangeOnBlur(value: Boolean): Self = StObject.set(x, "changeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnBlurUndefined: Self = StObject.set(x, "changeOnBlur", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: RangeValue[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setFormat(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      @scala.inline
      def setInputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => ReactElement): Self = StObject.set(x, "inputRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRenderUndefined: Self = StObject.set(x, "inputRender", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNextIcon(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
      ): Self = StObject.set(x, "onCalendarChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCalendarChangeUndefined: Self = StObject.set(x, "onCalendarChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(
        value: (/* event */ SyntheticKeyboardEvent[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* dates */ RangeValue[DateType] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPanelRender(value: /* originPanel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setPicker(value: Exclude[PickerMode, date | time]): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: js.Tuple2[String, String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPresets(value: js.Array[PresetDate[Exclude[RangeValue[DateType], Null]]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: (PresetDate[Exclude[RangeValue[DateType], Null]])*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setPrevIcon(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setRanges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setSuperNextIcon(value: ReactElement): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      @scala.inline
      def setSuperPrevIcon(value: ReactElement): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setValue(value: RangeValue[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined {  showTime :boolean | rc-picker.rc-picker/es/RangePicker.RangeShowTimeObject<DateType> | undefined} & rc-picker.rc-picker/es/RangePicker.RangePickerSharedProps<DateType> & rc-picker.rc-picker/es/RangePicker.OmitPickerProps<rc-picker.rc-picker/es/Picker.PickerDateProps<DateType>> */
  @js.native
  trait RangePickerDateProps[DateType]
    extends StObject
       with RangePickerProps[DateType] {
    
    /** @private Internal control of active picker. Do not use since it's private usage */
    var activePickerIndex: js.UndefOr[`0` | `1`] = js.native
    
    var allowClear: js.UndefOr[Boolean | ClearIcon] = js.native
    
    var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-braillelabel`: js.UndefOr[String] = js.native
    
    var `aria-brailleroledescription`: js.UndefOr[String] = js.native
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colindextext`: js.UndefOr[String] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-description`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Booleanish] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowindextext`: js.UndefOr[String] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
    
    /**
      * Trigger `onChange` event when blur.
      * If you don't want to user click `confirm` to trigger change, can use this.
      */
    var changeOnBlur: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearIcon: js.UndefOr[ReactElement] = js.native
    
    var components: js.UndefOr[Components] = js.native
    
    /** @deprecated use cellRender instead of dateRender */
    var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated please use `defaultValue` instead.
      * Set default display picker view date
      */
    var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
    
    var defaultValue: js.UndefOr[RangeValue[DateType]] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var disabledTime: js.UndefOr[
        js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
      ] = js.native
    
    var dropdownAlign: js.UndefOr[AlignType] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputReadOnly: js.UndefOr[Boolean] = js.native
    
    var inputRender: js.UndefOr[js.Function1[/* props */ InputHTMLAttributes[HTMLInputElement], ReactElement]] = js.native
    
    var locale: Locale = js.native
    
    var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.native
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nextIcon: js.UndefOr[ReactElement] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onCalendarChange: js.UndefOr[
        js.Function3[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          /* info */ RangeInfo, 
          Unit
        ]
      ] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          Unit
        ]
      ] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ SyntheticKeyboardEvent[HTMLInputElement], 
          /* preventDefault */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[
        js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
      ] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactElement, ReactElement]] = js.native
    
    var picker: js.UndefOr[date] = js.native
    
    var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
    
    var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var presets: js.UndefOr[js.Array[PresetDate[Exclude[RangeValue[DateType], Null]]]] = js.native
    
    var prevIcon: js.UndefOr[ReactElement] = js.native
    
    /** @deprecated Please use `presets` instead */
    var ranges: js.UndefOr[
        Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
      ] = js.native
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showTime: js.UndefOr[Boolean | RangeShowTimeObject[DateType]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffixIcon: js.UndefOr[ReactElement] = js.native
    
    var superNextIcon: js.UndefOr[ReactElement] = js.native
    
    var superPrevIcon: js.UndefOr[ReactElement] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[RangeValue[DateType]] = js.native
  }
  object RangePickerDateProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): RangePickerDateProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePickerDateProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RangePickerDateProps[_], DateType] (val x: Self with RangePickerDateProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setActivePickerIndex(value: `0` | `1`): Self = StObject.set(x, "activePickerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePickerIndexUndefined: Self = StObject.set(x, "activePickerIndex", js.undefined)
      
      @scala.inline
      def setAllowClear(value: Boolean | ClearIcon): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-braillelabel`(value: String): Self = StObject.set(x, "aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-braillelabelUndefined`: Self = StObject.set(x, "aria-braillelabel", js.undefined)
      
      @scala.inline
      def `setAria-brailleroledescription`(value: String): Self = StObject.set(x, "aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-brailleroledescriptionUndefined`: Self = StObject.set(x, "aria-brailleroledescription", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colindextext`(value: String): Self = StObject.set(x, "aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindextextUndefined`: Self = StObject.set(x, "aria-colindextext", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-description`(value: String): Self = StObject.set(x, "aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-descriptionUndefined`: Self = StObject.set(x, "aria-description", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowindextext`(value: String): Self = StObject.set(x, "aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindextextUndefined`: Self = StObject.set(x, "aria-rowindextext", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setChangeOnBlur(value: Boolean): Self = StObject.set(x, "changeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnBlurUndefined: Self = StObject.set(x, "changeOnBlur", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: RangeValue[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setFormat(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      @scala.inline
      def setInputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => ReactElement): Self = StObject.set(x, "inputRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRenderUndefined: Self = StObject.set(x, "inputRender", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNextIcon(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
      ): Self = StObject.set(x, "onCalendarChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCalendarChangeUndefined: Self = StObject.set(x, "onCalendarChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(
        value: (/* event */ SyntheticKeyboardEvent[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* dates */ RangeValue[DateType] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPanelRender(value: /* originPanel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setPicker(value: date): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: js.Tuple2[String, String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPresets(value: js.Array[PresetDate[Exclude[RangeValue[DateType], Null]]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: (PresetDate[Exclude[RangeValue[DateType], Null]])*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setPrevIcon(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setRanges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowTime(value: Boolean | RangeShowTimeObject[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setSuperNextIcon(value: ReactElement): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      @scala.inline
      def setSuperPrevIcon(value: ReactElement): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setValue(value: RangeValue[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcPicker.esRangePickerMod.RangePickerBaseProps[DateType]
    - `web.typings`.rcPicker.esRangePickerMod.RangePickerDateProps[DateType]
    - `web.typings`.rcPicker.esRangePickerMod.RangePickerTimeProps[DateType]
  */
  trait RangePickerProps[DateType] extends StObject
  object RangePickerProps {
    
    @scala.inline
    def RangePickerBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): web.typings.rcPicker.esRangePickerMod.RangePickerBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcPicker.esRangePickerMod.RangePickerBaseProps[DateType]]
    }
    
    @scala.inline
    def RangePickerDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): web.typings.rcPicker.esRangePickerMod.RangePickerDateProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcPicker.esRangePickerMod.RangePickerDateProps[DateType]]
    }
    
    @scala.inline
    def RangePickerTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): web.typings.rcPicker.esRangePickerMod.RangePickerTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      __obj.asInstanceOf[web.typings.rcPicker.esRangePickerMod.RangePickerTimeProps[DateType]]
    }
  }
  
  @js.native
  trait RangePickerSharedProps[DateType] extends StObject {
    
    /** @private Internal control of active picker. Do not use since it's private usage */
    var activePickerIndex: js.UndefOr[`0` | `1`] = js.native
    
    var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
    
    /**
      * Trigger `onChange` event when blur.
      * If you don't want to user click `confirm` to trigger change, can use this.
      */
    var changeOnBlur: js.UndefOr[Boolean] = js.native
    
    /** @deprecated use cellRender instead of dateRender */
    var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.native
    
    /**
      * @deprecated please use `defaultValue` instead.
      * Set default display picker view date
      */
    var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
    
    var defaultValue: js.UndefOr[RangeValue[DateType]] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.native
    
    var disabledTime: js.UndefOr[
        js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
      ] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onCalendarChange: js.UndefOr[
        js.Function3[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          /* info */ RangeInfo, 
          Unit
        ]
      ] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          Unit
        ]
      ] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.native
    
    var onPanelChange: js.UndefOr[
        js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
      ] = js.native
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactElement, ReactElement]] = js.native
    
    var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var presets: js.UndefOr[js.Array[PresetDate[Exclude[RangeValue[DateType], Null]]]] = js.native
    
    /** @deprecated Please use `presets` instead */
    var ranges: js.UndefOr[
        Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
      ] = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var value: js.UndefOr[RangeValue[DateType]] = js.native
  }
  object RangePickerSharedProps {
    
    @scala.inline
    def apply[DateType](): RangePickerSharedProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangePickerSharedProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RangePickerSharedProps[_], DateType] (val x: Self with RangePickerSharedProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setActivePickerIndex(value: `0` | `1`): Self = StObject.set(x, "activePickerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePickerIndexUndefined: Self = StObject.set(x, "activePickerIndex", js.undefined)
      
      @scala.inline
      def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setCellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setChangeOnBlur(value: Boolean): Self = StObject.set(x, "changeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnBlurUndefined: Self = StObject.set(x, "changeOnBlur", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: RangeValue[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
      ): Self = StObject.set(x, "onCalendarChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCalendarChangeUndefined: Self = StObject.set(x, "onCalendarChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* dates */ RangeValue[DateType] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setPanelRender(value: /* originPanel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: js.Tuple2[String, String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPresets(value: js.Array[PresetDate[Exclude[RangeValue[DateType], Null]]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: (PresetDate[Exclude[RangeValue[DateType], Null]])*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setRanges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setValue(value: RangeValue[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined {  order :boolean | undefined} & rc-picker.rc-picker/es/RangePicker.RangePickerSharedProps<DateType> & rc-picker.rc-picker/es/RangePicker.OmitPickerProps<rc-picker.rc-picker/es/Picker.PickerTimeProps<DateType>> */
  @js.native
  trait RangePickerTimeProps[DateType]
    extends StObject
       with RangePickerProps[DateType] {
    
    /** @private Internal control of active picker. Do not use since it's private usage */
    var activePickerIndex: js.UndefOr[`0` | `1`] = js.native
    
    var allowClear: js.UndefOr[Boolean | ClearIcon] = js.native
    
    var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-braillelabel`: js.UndefOr[String] = js.native
    
    var `aria-brailleroledescription`: js.UndefOr[String] = js.native
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colindextext`: js.UndefOr[String] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-description`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Booleanish] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowindextext`: js.UndefOr[String] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
    
    /**
      * Trigger `onChange` event when blur.
      * If you don't want to user click `confirm` to trigger change, can use this.
      */
    var changeOnBlur: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearIcon: js.UndefOr[ReactElement] = js.native
    
    var components: js.UndefOr[Components] = js.native
    
    /** @deprecated use cellRender instead of dateRender */
    var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var defaultOpenValue: js.UndefOr[DateType] = js.native
    
    /**
      * @deprecated please use `defaultValue` instead.
      * Set default display picker view date
      */
    var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
    
    var defaultValue: js.UndefOr[RangeValue[DateType]] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
    
    var disabledTime: js.UndefOr[
        js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
      ] = js.native
    
    var dropdownAlign: js.UndefOr[AlignType] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.native
    
    var hourStep: js.UndefOr[IntRange[`1`, `23`]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputReadOnly: js.UndefOr[Boolean] = js.native
    
    var inputRender: js.UndefOr[js.Function1[/* props */ InputHTMLAttributes[HTMLInputElement], ReactElement]] = js.native
    
    var locale: Locale = js.native
    
    var minuteStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.native
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nextIcon: js.UndefOr[ReactElement] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onCalendarChange: js.UndefOr[
        js.Function3[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          /* info */ RangeInfo, 
          Unit
        ]
      ] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[
          /* values */ RangeValue[DateType], 
          /* formatString */ js.Tuple2[String, String], 
          Unit
        ]
      ] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ SyntheticKeyboardEvent[HTMLInputElement], 
          /* preventDefault */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[
        js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
      ] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var order: js.UndefOr[Boolean] = js.native
    
    var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactElement, ReactElement]] = js.native
    
    var picker: time = js.native
    
    var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
    
    var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var presets: js.UndefOr[js.Array[PresetDate[Exclude[RangeValue[DateType], Null]]]] = js.native
    
    var prevIcon: js.UndefOr[ReactElement] = js.native
    
    /** @deprecated Please use `presets` instead */
    var ranges: js.UndefOr[
        Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
      ] = js.native
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var secondStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var showHour: js.UndefOr[Boolean] = js.native
    
    var showMinute: js.UndefOr[Boolean] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showSecond: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffixIcon: js.UndefOr[ReactElement] = js.native
    
    var superNextIcon: js.UndefOr[ReactElement] = js.native
    
    var superPrevIcon: js.UndefOr[ReactElement] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var use12Hours: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[RangeValue[DateType]] = js.native
  }
  object RangePickerTimeProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): RangePickerTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      __obj.asInstanceOf[RangePickerTimeProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RangePickerTimeProps[_], DateType] (val x: Self with RangePickerTimeProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setActivePickerIndex(value: `0` | `1`): Self = StObject.set(x, "activePickerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePickerIndexUndefined: Self = StObject.set(x, "activePickerIndex", js.undefined)
      
      @scala.inline
      def setAllowClear(value: Boolean | ClearIcon): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-braillelabel`(value: String): Self = StObject.set(x, "aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-braillelabelUndefined`: Self = StObject.set(x, "aria-braillelabel", js.undefined)
      
      @scala.inline
      def `setAria-brailleroledescription`(value: String): Self = StObject.set(x, "aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-brailleroledescriptionUndefined`: Self = StObject.set(x, "aria-brailleroledescription", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colindextext`(value: String): Self = StObject.set(x, "aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindextextUndefined`: Self = StObject.set(x, "aria-colindextext", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-description`(value: String): Self = StObject.set(x, "aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-descriptionUndefined`: Self = StObject.set(x, "aria-description", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowindextext`(value: String): Self = StObject.set(x, "aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindextextUndefined`: Self = StObject.set(x, "aria-rowindextext", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setChangeOnBlur(value: Boolean): Self = StObject.set(x, "changeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnBlurUndefined: Self = StObject.set(x, "changeOnBlur", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultOpenValue(value: DateType): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: RangeValue[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      @scala.inline
      def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setFormat(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      @scala.inline
      def setHourStep(value: IntRange[`1`, `23`]): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
      
      @scala.inline
      def setInputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => ReactElement): Self = StObject.set(x, "inputRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRenderUndefined: Self = StObject.set(x, "inputRender", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStep(value: IntRange[`1`, `59`]): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNextIcon(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
      ): Self = StObject.set(x, "onCalendarChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCalendarChangeUndefined: Self = StObject.set(x, "onCalendarChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(
        value: (/* event */ SyntheticKeyboardEvent[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* dates */ RangeValue[DateType] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPanelRender(value: /* originPanel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setPicker(value: time): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: js.Tuple2[String, String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPresets(value: js.Array[PresetDate[Exclude[RangeValue[DateType], Null]]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: (PresetDate[Exclude[RangeValue[DateType], Null]])*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setPrevIcon(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setRanges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecondStep(value: IntRange[`1`, `59`]): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      @scala.inline
      def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setSuperNextIcon(value: ReactElement): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      @scala.inline
      def setSuperPrevIcon(value: ReactElement): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
      
      @scala.inline
      def setValue(value: RangeValue[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Omit<rc-picker.rc-picker/es/panels/TimePanel.SharedTimeProps<DateType>, 'defaultValue'> & {  defaultValue :std.Array<DateType> | undefined} */
  @js.native
  trait RangeShowTimeObject[DateType] extends StObject {
    
    var defaultValue: js.UndefOr[js.Array[DateType]] = js.native
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ DateType, DisabledTimes]] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.native
    
    var hourStep: js.UndefOr[IntRange[`1`, `23`]] = js.native
    
    var minuteStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var secondStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var showHour: js.UndefOr[Boolean] = js.native
    
    var showMinute: js.UndefOr[Boolean] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showSecond: js.UndefOr[Boolean] = js.native
    
    var use12Hours: js.UndefOr[Boolean] = js.native
  }
  object RangeShowTimeObject {
    
    @scala.inline
    def apply[DateType](): RangeShowTimeObject[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeShowTimeObject[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RangeShowTimeObject[_], DateType] (val x: Self with RangeShowTimeObject[DateType]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Array[DateType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: DateType*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      @scala.inline
      def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: /* date */ DateType => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      @scala.inline
      def setHourStep(value: IntRange[`1`, `23`]): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setMinuteStep(value: IntRange[`1`, `59`]): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setSecondStep(value: IntRange[`1`, `59`]): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      @scala.inline
      def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      @scala.inline
      def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcPicker.rcPickerStrings.start
    - `web.typings`.rcPicker.rcPickerStrings.end
  */
  trait RangeType extends StObject
  object RangeType {
    
    @scala.inline
    def end: web.typings.rcPicker.rcPickerStrings.end = "end".asInstanceOf[web.typings.rcPicker.rcPickerStrings.end]
    
    @scala.inline
    def start: web.typings.rcPicker.rcPickerStrings.start = "start".asInstanceOf[web.typings.rcPicker.rcPickerStrings.start]
  }
}
