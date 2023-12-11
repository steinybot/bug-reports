package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.CellRenderInfo
import web.typings.rcPicker.esInterfaceMod.CustomFormat
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.rcPicker.esInterfaceMod.NullableDateType
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.esInterfaceMod.PickerMode
import web.typings.rcPicker.esInterfaceMod.RangeValue
import web.typings.rcPicker.rcPickerStrings.time
import web.typings.react.mod.FocusEventHandler
import web.typings.std.Omit
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BlurToCancel extends StObject {
    
    var blurToCancel: js.UndefOr[Boolean] = js.native
    
    var changeOnBlur: js.UndefOr[Boolean] = js.native
    
    def forwardKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement]): Boolean = js.native
    
    def isClickOutside(): Boolean = js.native
    def isClickOutside(clickElement: EventTarget): Boolean = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    def onCancel(): Unit = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    def onKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement], preventDefault: js.Function0[Unit]): Unit = js.native
    
    def onSubmit(): Unit | Boolean = js.native
    
    var open: Boolean = js.native
    
    def triggerOpen(open: Boolean): Unit = js.native
    
    var value: String = js.native
  }
  
  @js.native
  trait CellDate[DateType] extends StObject {
    
    var cellDate: DateType = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType] = js.native
    
    var mode: Omit[PanelMode, time] = js.native
  }
  object CellDate {
    
    @scala.inline
    def apply[DateType](
      cellDate: DateType,
      generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      mode: Omit[PanelMode, time]
    ): CellDate[DateType] = {
      val __obj = js.Dynamic.literal(cellDate = cellDate.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellDate[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CellDate[_], DateType] (val x: Self with CellDate[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellDate(value: DateType): Self = StObject.set(x, "cellDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Omit[PanelMode, time]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CellPrefixCls[DateType] extends StObject {
    
    var cellPrefixCls: String = js.native
    
    var generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType] = js.native
    
    var hoverRangedValue: js.UndefOr[RangeValue[DateType]] = js.native
    
    def isInView(date: DateType): Boolean = js.native
    
    def isSameCell(current: NullableDateType[DateType], target: NullableDateType[DateType]): Boolean = js.native
    
    def offsetCell(date: DateType, offset: Double): DateType = js.native
    
    var rangedValue: js.UndefOr[RangeValue[DateType]] = js.native
    
    var today: js.UndefOr[NullableDateType[DateType]] = js.native
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.native
  }
  object CellPrefixCls {
    
    @scala.inline
    def apply[DateType](
      cellPrefixCls: String,
      generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      isInView: DateType => Boolean,
      isSameCell: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean,
      offsetCell: (DateType, Double) => DateType
    ): CellPrefixCls[DateType] = {
      val __obj = js.Dynamic.literal(cellPrefixCls = cellPrefixCls.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], isInView = js.Any.fromFunction1(isInView), isSameCell = js.Any.fromFunction2(isSameCell), offsetCell = js.Any.fromFunction2(offsetCell))
      __obj.asInstanceOf[CellPrefixCls[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CellPrefixCls[_], DateType] (val x: Self with CellPrefixCls[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellPrefixCls(value: String): Self = StObject.set(x, "cellPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateConfig(value: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverRangedValue(value: RangeValue[DateType]): Self = StObject.set(x, "hoverRangedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverRangedValueNull: Self = StObject.set(x, "hoverRangedValue", null)
      
      @scala.inline
      def setHoverRangedValueUndefined: Self = StObject.set(x, "hoverRangedValue", js.undefined)
      
      @scala.inline
      def setIsInView(value: DateType => Boolean): Self = StObject.set(x, "isInView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSameCell(value: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean): Self = StObject.set(x, "isSameCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffsetCell(value: (DateType, Double) => DateType): Self = StObject.set(x, "offsetCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRangedValue(value: RangeValue[DateType]): Self = StObject.set(x, "rangedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangedValueNull: Self = StObject.set(x, "rangedValue", null)
      
      @scala.inline
      def setRangedValueUndefined: Self = StObject.set(x, "rangedValue", js.undefined)
      
      @scala.inline
      def setToday(value: NullableDateType[DateType]): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayNull: Self = StObject.set(x, "today", null)
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setValue(value: NullableDateType[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CellRender[DateType] extends StObject {
    
    var cellRender: web.typings.rcPicker.esInterfaceMod.CellRender[DateType, Double] = js.native
    
    var locale: Locale = js.native
    
    var today: DateType = js.native
  }
  object CellRender {
    
    @scala.inline
    def apply[DateType](
      cellRender: (Double, /* info */ CellRenderInfo[DateType]) => ReactElement,
      locale: Locale,
      today: DateType
    ): CellRender[DateType] = {
      val __obj = js.Dynamic.literal(cellRender = js.Any.fromFunction2(cellRender), locale = locale.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellRender[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CellRender[_], DateType] (val x: Self with CellRender[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellRender(value: (Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToday(value: DateType): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClearIcon extends StObject {
    
    var clearIcon: js.UndefOr[ReactElement] = js.native
  }
  object ClearIcon {
    
    @scala.inline
    def apply(): ClearIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearIcon]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ClearIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearIcon(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    }
  }
  
  @js.native
  trait DefaultDates[DateType] extends StObject {
    
    var defaultDates: js.UndefOr[RangeValue[DateType]] = js.native
    
    var generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType] = js.native
    
    var picker: PickerMode = js.native
    
    var values: RangeValue[DateType] = js.native
  }
  object DefaultDates {
    
    @scala.inline
    def apply[DateType](generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType], picker: PickerMode): DefaultDates[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], values = null)
      __obj.asInstanceOf[DefaultDates[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DefaultDates[_], DateType] (val x: Self with DefaultDates[DateType]) extends AnyVal {
      
      @scala.inline
      def setDefaultDates(value: RangeValue[DateType]): Self = StObject.set(x, "defaultDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDatesNull: Self = StObject.set(x, "defaultDates", null)
      
      @scala.inline
      def setDefaultDatesUndefined: Self = StObject.set(x, "defaultDates", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: RangeValue[DateType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesNull: Self = StObject.set(x, "values", null)
    }
  }
  
  @js.native
  trait Disabled[DateType] extends StObject {
    
    var disabled: js.Tuple2[Boolean, Boolean] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    var picker: PickerMode = js.native
    
    var selectedValue: RangeValue[DateType] = js.native
  }
  object Disabled {
    
    @scala.inline
    def apply[DateType](
      disabled: js.Tuple2[Boolean, Boolean],
      generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      locale: Locale,
      picker: PickerMode
    ): Disabled[DateType] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], selectedValue = null)
      __obj.asInstanceOf[Disabled[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Disabled[_], DateType] (val x: Self with Disabled[DateType]) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValue(value: RangeValue[DateType]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueNull: Self = StObject.set(x, "selectedValue", null)
    }
  }
  
  @js.native
  trait DisabledMinutes[DateType] extends StObject {
    
    def disabledMinutes(hour: Double): js.Array[Double] = js.native
    
    def disabledSeconds(hour: Double, minute: Double): js.Array[Double] = js.native
    
    var generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType] = js.native
    
    var minutes: js.Array[web.typings.rcPicker.esPanelsTimePanelTimeUnitColumnMod.Unit] = js.native
    
    var seconds: js.Array[web.typings.rcPicker.esPanelsTimePanelTimeUnitColumnMod.Unit] = js.native
    
    var use12Hours: Boolean = js.native
    
    var value: DateType = js.native
  }
  object DisabledMinutes {
    
    @scala.inline
    def apply[DateType](
      disabledMinutes: Double => js.Array[Double],
      disabledSeconds: (Double, Double) => js.Array[Double],
      generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      minutes: js.Array[web.typings.rcPicker.esPanelsTimePanelTimeUnitColumnMod.Unit],
      seconds: js.Array[web.typings.rcPicker.esPanelsTimePanelTimeUnitColumnMod.Unit],
      use12Hours: Boolean,
      value: DateType
    ): DisabledMinutes[DateType] = {
      val __obj = js.Dynamic.literal(disabledMinutes = js.Any.fromFunction1(disabledMinutes), disabledSeconds = js.Any.fromFunction2(disabledSeconds), generateConfig = generateConfig.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisabledMinutes[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DisabledMinutes[_], DateType] (val x: Self with DisabledMinutes[DateType]) extends AnyVal {
      
      @scala.inline
      def setDisabledMinutes(value: Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledSeconds(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateConfig(value: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutes(value: js.Array[web.typings.rcPicker.esPanelsTimePanelTimeUnitColumnMod.Unit]): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesVarargs(value: web.typings.rcPicker.esPanelsTimePanelTimeUnitColumnMod.Unit*): Self = StObject.set(x, "minutes", js.Array(value :_*))
      
      @scala.inline
      def setSeconds(value: js.Array[web.typings.rcPicker.esPanelsTimePanelTimeUnitColumnMod.Unit]): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsVarargs(value: web.typings.rcPicker.esPanelsTimePanelTimeUnitColumnMod.Unit*): Self = StObject.set(x, "seconds", js.Array(value :_*))
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Focused extends StObject {
    
    var focused: Boolean = js.native
    
    var typing: Boolean = js.native
  }
  object Focused {
    
    @scala.inline
    def apply(focused: Boolean, typing: Boolean): Focused = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focused]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTyping(value: Boolean): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Format[DateType] extends StObject {
    
    def format(locale: String, date: DateType, format: String): String = js.native
    
    /** A proxy for getting locale with moment or other locale library */
    var getShortMonths: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.native
    
    /** A proxy for getting locale with moment or other locale library */
    var getShortWeekDays: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.native
    
    def getWeek(locale: String, value: DateType): Double = js.native
    
    def getWeekFirstDate(locale: String, value: DateType): DateType = js.native
    
    def getWeekFirstDay(locale: String): Double = js.native
    
    /** Should only return validate date instance */
    def parse(locale: String, text: String, formats: js.Array[String]): DateType | Null = js.native
  }
  object Format {
    
    @scala.inline
    def apply[DateType](
      format: (String, DateType, String) => String,
      getWeek: (String, DateType) => Double,
      getWeekFirstDate: (String, DateType) => DateType,
      getWeekFirstDay: String => Double,
      parse: (String, String, js.Array[String]) => DateType | Null
    ): Format[DateType] = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), getWeek = js.Any.fromFunction2(getWeek), getWeekFirstDate = js.Any.fromFunction2(getWeekFirstDate), getWeekFirstDay = js.Any.fromFunction1(getWeekFirstDay), parse = js.Any.fromFunction3(parse))
      __obj.asInstanceOf[Format[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Format[_], DateType] (val x: Self with Format[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (String, DateType, String) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetShortMonths(value: /* locale */ String => js.Array[String]): Self = StObject.set(x, "getShortMonths", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetShortMonthsUndefined: Self = StObject.set(x, "getShortMonths", js.undefined)
      
      @scala.inline
      def setGetShortWeekDays(value: /* locale */ String => js.Array[String]): Self = StObject.set(x, "getShortWeekDays", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetShortWeekDaysUndefined: Self = StObject.set(x, "getShortWeekDays", js.undefined)
      
      @scala.inline
      def setGetWeek(value: (String, DateType) => Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetWeekFirstDate(value: (String, DateType) => DateType): Self = StObject.set(x, "getWeekFirstDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetWeekFirstDay(value: String => Double): Self = StObject.set(x, "getWeekFirstDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParse(value: (String, String, js.Array[String]) => DateType | Null): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait FormatList[DateType] extends StObject {
    
    var formatList: js.Array[String | CustomFormat[DateType]] = js.native
    
    var generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
  }
  object FormatList {
    
    @scala.inline
    def apply[DateType](
      formatList: js.Array[String | CustomFormat[DateType]],
      generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      locale: Locale
    ): FormatList[DateType] = {
      val __obj = js.Dynamic.literal(formatList = formatList.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatList[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormatList[_], DateType] (val x: Self with FormatList[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormatList(value: js.Array[String | CustomFormat[DateType]]): Self = StObject.set(x, "formatList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatListVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "formatList", js.Array(value :_*))
      
      @scala.inline
      def setGenerateConfig(value: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GenerateConfig[DateType] extends StObject {
    
    var format: String | CustomFormat[DateType] = js.native
    
    var generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
  }
  object GenerateConfig {
    
    @scala.inline
    def apply[DateType](
      format: String | CustomFormat[DateType],
      generateConfig: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      locale: Locale
    ): GenerateConfig[DateType] = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateConfig[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GenerateConfig[_], DateType] (val x: Self with GenerateConfig[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String | CustomFormat[DateType]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateConfig(value: web.typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var label: ReactElement = js.native
    
    def onClick(): Unit = js.native
    
    def onMouseEnter(): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: ReactElement, onClick: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave))
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnTextChange extends StObject {
    
    def onTextChange(text: String): Unit = js.native
    
    /** Must useMemo, to assume that `valueTexts` only match on the first change */
    var valueTexts: js.Array[String] = js.native
  }
  object OnTextChange {
    
    @scala.inline
    def apply(onTextChange: String => Unit, valueTexts: js.Array[String]): OnTextChange = {
      val __obj = js.Dynamic.literal(onTextChange = js.Any.fromFunction1(onTextChange), valueTexts = valueTexts.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnTextChange]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OnTextChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnTextChange(value: String => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueTexts(value: js.Array[String]): Self = StObject.set(x, "valueTexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTextsVarargs(value: String*): Self = StObject.set(x, "valueTexts", js.Array(value :_*))
    }
  }
}
