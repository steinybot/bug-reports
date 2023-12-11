package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdInts.`0`
import web.typings.antd.antdInts.`1`
import web.typings.antd.antdInts.`23`
import web.typings.antd.antdInts.`59`
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
import web.typings.antd.antdStrings.copy
import web.typings.antd.antdStrings.date
import web.typings.antd.antdStrings.descending
import web.typings.antd.antdStrings.dialog
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
import web.typings.antd.antdStrings.tree_
import web.typings.antd.antdStrings.vertical
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esDatePickerGeneratePickerMod.DataPickerPlacement
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import web.typings.antd.esTimePickerMod.TimePickerProps
import web.typings.antd.esTimePickerMod.TimeRangePickerProps
import web.typings.antd.esUtilStatusUtilsMod.InputStatus
import web.typings.dayjs.mod.Dayjs
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcPicker.anon.ClearIcon
import web.typings.rcPicker.esInterfaceMod.CellRenderInfo
import web.typings.rcPicker.esInterfaceMod.CustomFormat
import web.typings.rcPicker.esInterfaceMod.DisabledTimes
import web.typings.rcPicker.esInterfaceMod.EventValue
import web.typings.rcPicker.esInterfaceMod.IntRange
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.esInterfaceMod.PresetDate
import web.typings.rcPicker.esInterfaceMod.RangeValue
import web.typings.rcPicker.esPickerMod.PickerRefConfig
import web.typings.rcPicker.esRangePickerMod.RangeInfo
import web.typings.rcPicker.esRangePickerMod.RangeType
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.InputHTMLAttributes
import web.typings.react.mod.MutableRefObject
import web.typings.react.mod.RefAttributes
import web.typings.std.Exclude
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  object RangePicker {
    
    @JSImport("antd", "TimePicker.RangePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def activePickerIndex(value: `0` | `1`): this.type = set("activePickerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowClear(value: Boolean | ClearIcon): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowEmpty(value: js.Tuple2[Boolean, Boolean]): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-autocomplete`(value: none | `inline` | list_ | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-braillelabel`(value: String): this.type = set("aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-brailleroledescription`(value: String): this.type = set("aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindextext`(value: String): this.type = set("aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-description`(value: String): this.type = set("aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-haspopup`(value: Boolean | menu_ | listbox | tree_ | grid_ | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindextext`(value: String): this.type = set("aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def cellRender(value: (Dayjs | Double, /* info */ CellRenderInfo[Dayjs]) => ReactElement): this.type = set("cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def changeOnBlur(value: Boolean): this.type = set("changeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (Dayjs, Dayjs, /* info */ RangeInfo) => ReactElement): this.type = set("dateRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultOpenValue(value: Dayjs): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultPickerValue(value: js.Tuple2[Dayjs, Dayjs]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: RangeValue[Dayjs]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueNull: this.type = set("defaultValue", null)
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: /* date */ Dayjs => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def disabledTime(value: (/* date */ EventValue[Dayjs], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
      
      @scala.inline
      def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def format(value: String | CustomFormat[Dayjs] | (js.Array[String | CustomFormat[Dayjs]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formatFunction1(value: Dayjs => String): this.type = set("format", js.Any.fromFunction1(value))
      
      @scala.inline
      def formatVarargs(value: (String | CustomFormat[Dayjs])*): this.type = set("format", js.Array(value :_*))
      
      @scala.inline
      def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hourStep(value: IntRange[`1`, `23`]): this.type = set("hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => ReactElement): this.type = set("inputRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minuteStep(value: IntRange[`1`, `59`]): this.type = set("minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (Dayjs, /* locale */ web.typings.rcPicker.esInterfaceMod.Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nextIcon(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCalendarChange(
        value: (/* values */ RangeValue[Dayjs], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
      ): this.type = set("onCalendarChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def onChange(value: (/* values */ RangeValue[Dayjs], /* formatString */ js.Tuple2[String, String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDown(
        value: (/* event */ SyntheticKeyboardEvent[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Unit
      ): this.type = set("onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: /* dates */ RangeValue[Dayjs] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (/* values */ RangeValue[Dayjs], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def order(value: Boolean): this.type = set("order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def panelRender(value: /* originPanel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: js.Tuple2[String, String]): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placement(value: DataPickerPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def presets(value: js.Array[PresetDate[Exclude[RangeValue[Dayjs], Null]]]): this.type = set("presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def presetsVarargs(value: (PresetDate[Exclude[RangeValue[Dayjs], Null]])*): this.type = set("presets", js.Array(value :_*))
      
      @scala.inline
      def prevIcon(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ranges(
        value: Record[
              String, 
              (Exclude[RangeValue[Dayjs], Null]) | (js.Function0[Exclude[RangeValue[Dayjs], Null]])
            ]
      ): this.type = set("ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def secondStep(value: IntRange[`1`, `59`]): this.type = set("secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superNextIcon(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def superPrevIcon(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: RangeValue[Dayjs]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    type Props = TimeRangePickerProps with RefAttributes[Any]
    
    implicit def make(companion: RangePicker.type): web.typings.antd.components.TimePicker.RangePicker.Builder = new web.typings.antd.components.TimePicker.RangePicker.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TimeRangePickerProps with RefAttributes[Any]): web.typings.antd.components.TimePicker.RangePicker.Builder = new web.typings.antd.components.TimePicker.RangePicker.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "TimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def addon(value: () => ReactElement): this.type = set("addon", js.Any.fromFunction0(value))
    
    @scala.inline
    def allowClear(value: Boolean | ClearIcon): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list_ | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-braillelabel`(value: String): this.type = set("aria-braillelabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-brailleroledescription`(value: String): this.type = set("aria-brailleroledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindextext`(value: String): this.type = set("aria-colindextext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-description`(value: String): this.type = set("aria-description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu_ | listbox | tree_ | grid_ | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindextext`(value: String): this.type = set("aria-rowindextext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellRender(value: (Double, /* info */ CellRenderInfo[Dayjs]) => ReactElement): this.type = set("cellRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def changeOnBlur(value: Boolean): this.type = set("changeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateRender(value: (Dayjs, Dayjs) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpenValue(value: Dayjs): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultPickerValue(value: Dayjs): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: Dayjs): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledDate(value: /* date */ Dayjs => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def disabledTime(value: /* date */ Dayjs => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: String | CustomFormat[Dayjs] | (js.Array[String | CustomFormat[Dayjs]])): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatFunction1(value: Dayjs => String): this.type = set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def formatVarargs(value: (String | CustomFormat[Dayjs])*): this.type = set("format", js.Array(value :_*))
    
    @scala.inline
    def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hourStep(value: IntRange[`1`, `23`]): this.type = set("hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => ReactElement): this.type = set("inputRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minuteStep(value: IntRange[`1`, `59`]): this.type = set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monthCellRender(value: (Dayjs, /* locale */ web.typings.rcPicker.esInterfaceMod.Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextIcon(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: (/* value */ Dayjs | Null, /* dateString */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(
      value: (/* event */ SyntheticKeyboardEvent[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Unit
    ): this.type = set("onKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOk(value: /* date */ Dayjs => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanelChange(value: (Dayjs, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSelect(value: /* value */ Dayjs => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelRender(value: /* originPanel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: DataPickerPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def presets(value: js.Array[PresetDate[Dayjs]]): this.type = set("presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def presetsVarargs(value: PresetDate[Dayjs]*): this.type = set("presets", js.Array(value :_*))
    
    @scala.inline
    def prevIcon(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondStep(value: IntRange[`1`, `59`]): this.type = set("secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def superNextIcon(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def superPrevIcon(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Dayjs): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  type Props = TimePickerProps with RefAttributes[Any]
  
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimePickerProps with RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
