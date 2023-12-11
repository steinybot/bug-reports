package web.typings.rcPicker.components

import web.typings.StBuildingComponent
import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.CellRenderInfo
import web.typings.rcPicker.esInterfaceMod.Components
import web.typings.rcPicker.esInterfaceMod.DisabledTimes
import web.typings.rcPicker.esInterfaceMod.IntRange
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.esInterfaceMod.PickerMode
import web.typings.rcPicker.esPanelsTimePanelMod.SharedTimeProps
import web.typings.rcPicker.rcPickerInts.`1`
import web.typings.rcPicker.rcPickerInts.`23`
import web.typings.rcPicker.rcPickerInts.`59`
import web.typings.rcPicker.rcPickerStrings.date
import web.typings.rcPicker.rcPickerStrings.ltr
import web.typings.rcPicker.rcPickerStrings.rtl
import web.typings.rcPicker.rcPickerStrings.time
import web.typings.react.mod.CSSProperties
import web.typings.std.Exclude
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerPanel {
  
  object PickerPanelBaseProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[web.typings.rcPicker.esPickerPanelMod.PickerPanelBaseProps[DateType]]))
    }
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def cellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): this.type = set("cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def onChange(value: DateType => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: DateType => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onPickerValueChange(value: DateType => Unit): this.type = set("onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: DateType => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    type Props[DateType] = web.typings.rcPicker.esPickerPanelMod.PickerPanelBaseProps[DateType]
    
    def withProps[DateType](p: web.typings.rcPicker.esPickerPanelMod.PickerPanelBaseProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PickerPanelDateProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[web.typings.rcPicker.esPickerPanelMod.PickerPanelDateProps[DateType]]))
    }
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def cellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): this.type = set("cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledTime(value: /* date */ DateType | Null => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def onChange(value: DateType => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: DateType => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onPickerValueChange(value: DateType => Unit): this.type = set("onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: DateType => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def picker(value: date): this.type = set("picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showTime(value: Boolean | SharedTimeProps[DateType]): this.type = set("showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showToday(value: Boolean): this.type = set("showToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    type Props[DateType] = web.typings.rcPicker.esPickerPanelMod.PickerPanelDateProps[DateType]
    
    def withProps[DateType](p: web.typings.rcPicker.esPickerPanelMod.PickerPanelDateProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PickerPanelTimeProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[web.typings.rcPicker.esPickerPanelMod.PickerPanelTimeProps[DateType]]))
    }
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def cellRender(value: (Double, /* info */ CellRenderInfo[DateType]) => ReactElement): this.type = set("cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def disabledTime(value: DateType => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hourStep(value: IntRange[`1`, `23`]): this.type = set("hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minuteStep(value: IntRange[`1`, `59`]): this.type = set("minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def onChange(value: DateType => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: DateType => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onPickerValueChange(value: DateType => Unit): this.type = set("onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: DateType => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
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
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    type Props[DateType] = web.typings.rcPicker.esPickerPanelMod.PickerPanelTimeProps[DateType]
    
    def withProps[DateType](p: web.typings.rcPicker.esPickerPanelMod.PickerPanelTimeProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
