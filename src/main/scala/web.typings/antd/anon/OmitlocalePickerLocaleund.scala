package web.typings.antd.anon

import web.typings.antd.antdStrings._empty
import web.typings.antd.antdStrings.`additions removals`
import web.typings.antd.antdStrings.`additions text`
import web.typings.antd.antdStrings.`inline`
import web.typings.antd.antdStrings.`removals additions`
import web.typings.antd.antdStrings.`removals text`
import web.typings.antd.antdStrings.`text additions`
import web.typings.antd.antdStrings.`text removals`
import web.typings.antd.antdStrings.additions
import web.typings.antd.antdStrings.all
import web.typings.antd.antdStrings.ascending
import web.typings.antd.antdStrings.assertive
import web.typings.antd.antdStrings.both
import web.typings.antd.antdStrings.bottomLeft
import web.typings.antd.antdStrings.bottomRight
import web.typings.antd.antdStrings.copy
import web.typings.antd.antdStrings.date
import web.typings.antd.antdStrings.descending
import web.typings.antd.antdStrings.dialog
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.execute
import web.typings.antd.antdStrings.grammar
import web.typings.antd.antdStrings.grid_
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.link
import web.typings.antd.antdStrings.list_
import web.typings.antd.antdStrings.listbox
import web.typings.antd.antdStrings.location
import web.typings.antd.antdStrings.ltr
import web.typings.antd.antdStrings.menu_
import web.typings.antd.antdStrings.mixed
import web.typings.antd.antdStrings.move
import web.typings.antd.antdStrings.none
import web.typings.antd.antdStrings.off
import web.typings.antd.antdStrings.other
import web.typings.antd.antdStrings.page
import web.typings.antd.antdStrings.polite
import web.typings.antd.antdStrings.popup
import web.typings.antd.antdStrings.removals
import web.typings.antd.antdStrings.rtl
import web.typings.antd.antdStrings.spelling
import web.typings.antd.antdStrings.step
import web.typings.antd.antdStrings.text_
import web.typings.antd.antdStrings.time
import web.typings.antd.antdStrings.topLeft
import web.typings.antd.antdStrings.topRight
import web.typings.antd.antdStrings.tree_
import web.typings.antd.antdStrings.vertical
import web.typings.antd.antdStrings.warning
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import web.typings.dayjs.mod.Dayjs
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcPicker.esInterfaceMod.CellRender
import web.typings.rcPicker.esInterfaceMod.CellRenderInfo
import web.typings.rcPicker.esInterfaceMod.CustomFormat
import web.typings.rcPicker.esInterfaceMod.DisabledTimes
import web.typings.rcPicker.esInterfaceMod.IntRange
import web.typings.rcPicker.esInterfaceMod.OnPanelChange
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.esInterfaceMod.PresetDate
import web.typings.rcPicker.esPanelsDatePanelDateBodyMod.DateRender
import web.typings.rcPicker.esPanelsMonthPanelMonthBodyMod.MonthCellRender
import web.typings.rcPicker.esPickerMod.PickerRefConfig
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.InputHTMLAttributes
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.MutableRefObject
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<{  locale :antd.antd/es/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/es/button.ButtonSize | undefined,   placement :'bottomLeft' | 'bottomRight' | 'topLeft' | 'topRight' | undefined,   bordered :boolean | undefined,   status :'' | 'error' | 'warning' | undefined,   hashId :string | undefined,   popupClassName :string | undefined,   rootClassName :string | undefined} & std.Omit<rc-picker.rc-picker/es/Picker.PickerTimeProps<dayjs.dayjs.Dayjs>, 'components' | 'locale' | 'generateConfig' | 'hideHeader'>, 'picker'> */
@js.native
trait OmitlocalePickerLocaleund extends StObject {
  
  var allowClear: js.UndefOr[Boolean | web.typings.rcPicker.anon.ClearIcon] = js.native
  
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  
  var `aria-atomic`: js.UndefOr[Booleanish] = js.native
  
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list_ | both] = js.native
  
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
  
  var `aria-haspopup`: js.UndefOr[Boolean | menu_ | listbox | tree_ | grid_ | dialog] = js.native
  
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
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var cellRender: js.UndefOr[CellRender[Dayjs, Double]] = js.native
  
  var changeOnBlur: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clearIcon: js.UndefOr[ReactElement] = js.native
  
  var dateRender: js.UndefOr[DateRender[Dayjs]] = js.native
  
  var defaultOpen: js.UndefOr[Boolean] = js.native
  
  var defaultOpenValue: js.UndefOr[Dayjs] = js.native
  
  var defaultPickerValue: js.UndefOr[Dayjs] = js.native
  
  var defaultValue: js.UndefOr[Dayjs] = js.native
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var disabledDate: js.UndefOr[js.Function1[/* date */ Dayjs, Boolean]] = js.native
  
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
  
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
  
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
  
  var disabledTime: js.UndefOr[js.Function1[/* date */ Dayjs, DisabledTimes]] = js.native
  
  var dropdownAlign: js.UndefOr[AlignType] = js.native
  
  var dropdownClassName: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String | CustomFormat[Dayjs] | (js.Array[String | CustomFormat[Dayjs]])] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  
  var hashId: js.UndefOr[String] = js.native
  
  var hideDisabledOptions: js.UndefOr[Boolean] = js.native
  
  var hourStep: js.UndefOr[IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`23`]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inputReadOnly: js.UndefOr[Boolean] = js.native
  
  var inputRender: js.UndefOr[js.Function1[/* props */ InputHTMLAttributes[HTMLInputElement], ReactElement]] = js.native
  
  var locale: js.UndefOr[PickerLocale] = js.native
  
  var minuteStep: js.UndefOr[IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`59`]] = js.native
  
  var mode: js.UndefOr[PanelMode] = js.native
  
  var monthCellRender: js.UndefOr[MonthCellRender[Dayjs]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nextIcon: js.UndefOr[ReactElement] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* value */ Dayjs | Null, /* dateString */ String, scala.Unit]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDown: js.UndefOr[
    js.Function2[
      /* event */ SyntheticKeyboardEvent[HTMLInputElement], 
      /* preventDefault */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onOk: js.UndefOr[js.Function1[/* date */ Dayjs, scala.Unit]] = js.native
  
  var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, scala.Unit]] = js.native
  
  var onPanelChange: js.UndefOr[OnPanelChange[Dayjs]] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* value */ Dayjs, scala.Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactElement, ReactElement]] = js.native
  
  var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var placement: js.UndefOr[bottomLeft | bottomRight | topLeft | topRight] = js.native
  
  var popupClassName: js.UndefOr[String] = js.native
  
  var popupStyle: js.UndefOr[CSSProperties] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var presets: js.UndefOr[js.Array[PresetDate[Dayjs]]] = js.native
  
  var prevIcon: js.UndefOr[ReactElement] = js.native
  
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var secondStep: js.UndefOr[IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`59`]] = js.native
  
  var showHour: js.UndefOr[Boolean] = js.native
  
  var showMinute: js.UndefOr[Boolean] = js.native
  
  var showNow: js.UndefOr[Boolean] = js.native
  
  var showSecond: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
  
  var status: js.UndefOr[_empty | error | warning] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suffixIcon: js.UndefOr[ReactElement] = js.native
  
  var superNextIcon: js.UndefOr[ReactElement] = js.native
  
  var superPrevIcon: js.UndefOr[ReactElement] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var use12Hours: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[Dayjs | Null] = js.native
}
object OmitlocalePickerLocaleund {
  
  @scala.inline
  def apply(): OmitlocalePickerLocaleund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitlocalePickerLocaleund]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OmitlocalePickerLocaleund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowClear(value: Boolean | web.typings.rcPicker.anon.ClearIcon): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list_ | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
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
    def `setAria-haspopup`(value: Boolean | menu_ | listbox | tree_ | grid_ | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
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
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
    def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setCellRender(value: (Double, /* info */ CellRenderInfo[Dayjs]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
    
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
    def setDateRender(value: (Dayjs, Dayjs) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
    
    @scala.inline
    def setDefaultOpenValue(value: Dayjs): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
    
    @scala.inline
    def setDefaultPickerValue(value: Dayjs): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Dayjs): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDate(value: /* date */ Dayjs => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
    
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
    def setDisabledTime(value: /* date */ Dayjs => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
    
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
    def setFormat(value: String | CustomFormat[Dayjs] | (js.Array[String | CustomFormat[Dayjs]])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(value: Dayjs => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatVarargs(value: (String | CustomFormat[Dayjs])*): Self = StObject.set(x, "format", js.Array(value :_*))
    
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
    
    @scala.inline
    def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashIdUndefined: Self = StObject.set(x, "hashId", js.undefined)
    
    @scala.inline
    def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
    
    @scala.inline
    def setHourStep(value: IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`23`]): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
    
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
    def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`59`]): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    @scala.inline
    def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMonthCellRender(value: (Dayjs, /* locale */ web.typings.rcPicker.esInterfaceMod.Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
    
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
    def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => scala.Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* value */ Dayjs | Null, /* dateString */ String) => scala.Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => scala.Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(
      value: (/* event */ SyntheticKeyboardEvent[HTMLInputElement], /* preventDefault */ js.Function0[scala.Unit]) => scala.Unit
    ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => scala.Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnOk(value: /* date */ Dayjs => scala.Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    
    @scala.inline
    def setOnOpenChange(value: /* open */ Boolean => scala.Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
    
    @scala.inline
    def setOnPanelChange(value: (Dayjs, /* mode */ PanelMode) => scala.Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* value */ Dayjs => scala.Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPanelRender(value: /* originPanel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
    
    @scala.inline
    def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPlacement(value: bottomLeft | bottomRight | topLeft | topRight): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
    
    @scala.inline
    def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setPresets(value: js.Array[PresetDate[Dayjs]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
    
    @scala.inline
    def setPresetsVarargs(value: PresetDate[Dayjs]*): Self = StObject.set(x, "presets", js.Array(value :_*))
    
    @scala.inline
    def setPrevIcon(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
    
    @scala.inline
    def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setSecondStep(value: IntRange[web.typings.antd.antdInts.`1`, web.typings.antd.antdInts.`59`]): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
    
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
    def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: _empty | error | warning): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
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
    def setValue(value: Dayjs): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
