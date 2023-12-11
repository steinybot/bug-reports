package web.typings.antd

import web.typings.antd.anon.CallDisplayName
import web.typings.antd.anon.Locale
import web.typings.antd.anon.OnChange
import web.typings.antd.antdInts.`1`
import web.typings.antd.antdInts.`23`
import web.typings.antd.antdInts.`59`
import web.typings.antd.antdStrings.customize
import web.typings.antd.antdStrings.date
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.generateConfig
import web.typings.antd.antdStrings.large
import web.typings.antd.antdStrings.locale
import web.typings.antd.antdStrings.ltr
import web.typings.antd.antdStrings.month
import web.typings.antd.antdStrings.nextIcon
import web.typings.antd.antdStrings.prevIcon
import web.typings.antd.antdStrings.rtl
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.superNextIcon
import web.typings.antd.antdStrings.superPrevIcon
import web.typings.antd.antdStrings.time
import web.typings.antd.antdStrings.year
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.CellRender
import web.typings.rcPicker.esInterfaceMod.CellRenderInfo
import web.typings.rcPicker.esInterfaceMod.Components
import web.typings.rcPicker.esInterfaceMod.DisabledTime
import web.typings.rcPicker.esInterfaceMod.DisabledTimes
import web.typings.rcPicker.esInterfaceMod.IntRange
import web.typings.rcPicker.esInterfaceMod.OnPanelChange
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.esInterfaceMod.PickerMode
import web.typings.rcPicker.esPanelsDatePanelDateBodyMod.DateRender
import web.typings.rcPicker.esPanelsMonthPanelMonthBodyMod.MonthCellRender
import web.typings.rcPicker.esPanelsTimePanelMod.SharedTimeProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import web.typings.std.Exclude
import web.typings.std.Omit
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCalendarGenerateCalendarMod {
  
  @JSImport("antd/es/calendar/generateCalendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](generateConfig: GenerateConfig[DateType]): CallDisplayName[DateType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generateConfig.asInstanceOf[js.Any]).asInstanceOf[CallDisplayName[DateType]]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.year
    - `web.typings`.antd.antdStrings.month
  */
  trait CalendarMode extends StObject
  object CalendarMode {
    
    @scala.inline
    def month: web.typings.antd.antdStrings.month = "month".asInstanceOf[web.typings.antd.antdStrings.month]
    
    @scala.inline
    def year: web.typings.antd.antdStrings.year = "year".asInstanceOf[web.typings.antd.antdStrings.year]
  }
  
  @js.native
  trait CalendarProps[DateType] extends StObject {
    
    var cellRender: js.UndefOr[
        js.Function2[/* date */ DateType, /* info */ CellRenderInfo[DateType], ReactElement]
      ] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** @deprecated Please use cellRender instead. */
    var dateCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.native
    
    /** @deprecated Please use fullCellRender instead. */
    var dateFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.native
    
    var defaultValue: js.UndefOr[DateType] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var fullCellRender: js.UndefOr[
        js.Function2[/* date */ DateType, /* info */ CellRenderInfo[DateType], ReactElement]
      ] = js.native
    
    var fullscreen: js.UndefOr[Boolean] = js.native
    
    var headerRender: js.UndefOr[HeaderRender[DateType]] = js.native
    
    var locale: js.UndefOr[PickerLocale] = js.native
    
    var mode: js.UndefOr[CalendarMode] = js.native
    
    /** @deprecated Please use cellRender instead. */
    var monthCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.native
    
    /** @deprecated Please use fullCellRender instead. */
    var monthFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[js.Function2[/* date */ DateType, /* mode */ CalendarMode, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function2[/* date */ DateType, /* selectInfo */ SelectInfo, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
    
    var value: js.UndefOr[DateType] = js.native
  }
  object CalendarProps {
    
    @scala.inline
    def apply[DateType](): CalendarProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CalendarProps[_], DateType] (val x: Self with CalendarProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellRender(value: (/* date */ DateType, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDateCellRender(value: /* date */ DateType => ReactElement): Self = StObject.set(x, "dateCellRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDateCellRenderUndefined: Self = StObject.set(x, "dateCellRender", js.undefined)
      
      @scala.inline
      def setDateFullCellRender(value: /* date */ DateType => ReactElement): Self = StObject.set(x, "dateFullCellRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDateFullCellRenderUndefined: Self = StObject.set(x, "dateFullCellRender", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setFullCellRender(value: (/* date */ DateType, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "fullCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFullCellRenderUndefined: Self = StObject.set(x, "fullCellRender", js.undefined)
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setHeaderRender(value: /* config */ OnChange[DateType] => ReactElement): Self = StObject.set(x, "headerRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      @scala.inline
      def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMode(value: CalendarMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: /* date */ DateType => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setMonthFullCellRender(value: /* date */ DateType => ReactElement): Self = StObject.set(x, "monthFullCellRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMonthFullCellRenderUndefined: Self = StObject.set(x, "monthFullCellRender", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* date */ DateType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (/* date */ DateType, /* mode */ CalendarMode) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* date */ DateType, /* selectInfo */ SelectInfo) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValidRange(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "validRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidRangeUndefined: Self = StObject.set(x, "validRange", js.undefined)
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type HeaderRender[DateType] = js.Function1[/* config */ OnChange[DateType], ReactElement]
  
  type InjectDefaultProps[Props] = (Omit[
    Props, 
    locale | generateConfig | prevIcon | nextIcon | superPrevIcon | superNextIcon
  ]) with Locale
  
  /* Inlined antd.antd/es/calendar/generateCalendar.InjectDefaultProps<rc-picker.rc-picker/es/PickerPanel.PickerPanelBaseProps<DateType>> */
  @js.native
  trait PickerPanelBaseProps[DateType]
    extends StObject
       with PickerProps[DateType] {
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var components: js.UndefOr[Components] = js.native
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.native
    
    var defaultPickerValue: js.UndefOr[DateType] = js.native
    
    var defaultValue: js.UndefOr[DateType] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var hideHeader: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[PickerLocale] = js.native
    
    var mode: js.UndefOr[PanelMode] = js.native
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.native
    
    var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
    
    var picker: Exclude[PickerMode, date | time] = js.native
    
    var pickerValue: js.UndefOr[DateType] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
    
    var size: js.UndefOr[large | default | small] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[DateType | Null] = js.native
  }
  object PickerPanelBaseProps {
    
    @scala.inline
    def apply[DateType](picker: Exclude[PickerMode, date | time]): PickerPanelBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerPanelBaseProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PickerPanelBaseProps[_], DateType] (val x: Self with PickerPanelBaseProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      @scala.inline
      def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (DateType, /* locale */ web.typings.rcPicker.esInterfaceMod.Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ DateType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* date */ DateType => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOnPickerValueChange(value: /* date */ DateType => Unit): Self = StObject.set(x, "onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPickerValueChangeUndefined: Self = StObject.set(x, "onPickerValueChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPicker(value: Exclude[PickerMode, date | time]): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValue(value: DateType): Self = StObject.set(x, "pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueUndefined: Self = StObject.set(x, "pickerValue", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      @scala.inline
      def setSize(value: large | default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined antd.antd/es/calendar/generateCalendar.InjectDefaultProps<rc-picker.rc-picker/es/PickerPanel.PickerPanelDateProps<DateType>> */
  @js.native
  trait PickerPanelDateProps[DateType]
    extends StObject
       with PickerProps[DateType] {
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var components: js.UndefOr[Components] = js.native
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.native
    
    var defaultPickerValue: js.UndefOr[DateType] = js.native
    
    var defaultValue: js.UndefOr[DateType] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.native
    
    var hideHeader: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[PickerLocale] = js.native
    
    var mode: js.UndefOr[PanelMode] = js.native
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.native
    
    var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
    
    var picker: js.UndefOr[date] = js.native
    
    var pickerValue: js.UndefOr[DateType] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.native
    
    var showToday: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[large | default | small] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[DateType | Null] = js.native
  }
  object PickerPanelDateProps {
    
    @scala.inline
    def apply[DateType](): PickerPanelDateProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerPanelDateProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PickerPanelDateProps[_], DateType] (val x: Self with PickerPanelDateProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      @scala.inline
      def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (DateType, /* locale */ web.typings.rcPicker.esInterfaceMod.Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ DateType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* date */ DateType => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOnPickerValueChange(value: /* date */ DateType => Unit): Self = StObject.set(x, "onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPickerValueChangeUndefined: Self = StObject.set(x, "onPickerValueChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPicker(value: date): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setPickerValue(value: DateType): Self = StObject.set(x, "pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueUndefined: Self = StObject.set(x, "pickerValue", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      @scala.inline
      def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
      
      @scala.inline
      def setSize(value: large | default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined antd.antd/es/calendar/generateCalendar.InjectDefaultProps<rc-picker.rc-picker/es/PickerPanel.PickerPanelTimeProps<DateType>> */
  @js.native
  trait PickerPanelTimeProps[DateType]
    extends StObject
       with PickerProps[DateType] {
    
    var cellRender: js.UndefOr[CellRender[DateType, Double]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var components: js.UndefOr[Components] = js.native
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.native
    
    var defaultPickerValue: js.UndefOr[DateType] = js.native
    
    var defaultValue: js.UndefOr[DateType] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ DateType, DisabledTimes]] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.native
    
    var hideHeader: js.UndefOr[Boolean] = js.native
    
    var hourStep: js.UndefOr[IntRange[`1`, `23`]] = js.native
    
    var locale: js.UndefOr[PickerLocale] = js.native
    
    var minuteStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var mode: js.UndefOr[PanelMode] = js.native
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
    
    var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.native
    
    var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
    
    var picker: time = js.native
    
    var pickerValue: js.UndefOr[DateType] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
    
    var secondStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var showHour: js.UndefOr[Boolean] = js.native
    
    var showMinute: js.UndefOr[Boolean] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showSecond: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[large | default | small] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var use12Hours: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[DateType | Null] = js.native
  }
  object PickerPanelTimeProps {
    
    @scala.inline
    def apply[DateType](): PickerPanelTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(picker = "time")
      __obj.asInstanceOf[PickerPanelTimeProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PickerPanelTimeProps[_], DateType] (val x: Self with PickerPanelTimeProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellRender(value: (Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType) => ReactElement): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
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
      def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      @scala.inline
      def setHourStep(value: IntRange[`1`, `23`]): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMinuteStep(value: IntRange[`1`, `59`]): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (DateType, /* locale */ web.typings.rcPicker.esInterfaceMod.Locale) => ReactElement): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ DateType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* date */ DateType => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOnPickerValueChange(value: /* date */ DateType => Unit): Self = StObject.set(x, "onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPickerValueChangeUndefined: Self = StObject.set(x, "onPickerValueChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPicker(value: time): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValue(value: DateType): Self = StObject.set(x, "pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueUndefined: Self = StObject.set(x, "pickerValue", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
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
      def setSize(value: large | default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.esCalendarGenerateCalendarMod.PickerPanelBaseProps[DateType]
    - `web.typings`.antd.esCalendarGenerateCalendarMod.PickerPanelDateProps[DateType]
    - `web.typings`.antd.esCalendarGenerateCalendarMod.PickerPanelTimeProps[DateType]
  */
  trait PickerProps[DateType] extends StObject
  object PickerProps {
    
    @scala.inline
    def PickerPanelBaseProps[DateType](picker: Exclude[PickerMode, date | time]): web.typings.antd.esCalendarGenerateCalendarMod.PickerPanelBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.antd.esCalendarGenerateCalendarMod.PickerPanelBaseProps[DateType]]
    }
    
    @scala.inline
    def PickerPanelDateProps[DateType](): web.typings.antd.esCalendarGenerateCalendarMod.PickerPanelDateProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[web.typings.antd.esCalendarGenerateCalendarMod.PickerPanelDateProps[DateType]]
    }
    
    @scala.inline
    def PickerPanelTimeProps[DateType](): web.typings.antd.esCalendarGenerateCalendarMod.PickerPanelTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(picker = "time")
      __obj.asInstanceOf[web.typings.antd.esCalendarGenerateCalendarMod.PickerPanelTimeProps[DateType]]
    }
  }
  
  @js.native
  trait SelectInfo extends StObject {
    
    var source: year | month | date | customize = js.native
  }
  object SelectInfo {
    
    @scala.inline
    def apply(source: year | month | date | customize): SelectInfo = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SelectInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: year | month | date | customize): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
