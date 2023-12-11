package web.typings.antd

import web.typings.antd.antdStrings.customize
import web.typings.antd.antdStrings.date
import web.typings.antd.antdStrings.month
import web.typings.antd.antdStrings.year
import web.typings.antd.esCalendarGenerateCalendarMod.CalendarMode
import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCalendarHeaderMod {
  
  @JSImport("antd/es/calendar/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: CalendarHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait CalendarHeaderProps[DateType] extends StObject {
    
    var fullscreen: Boolean = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    var mode: CalendarMode = js.native
    
    def onChange(date: DateType, source: year | month | date | customize): Unit = js.native
    
    def onModeChange(mode: CalendarMode): Unit = js.native
    
    var prefixCls: String = js.native
    
    var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
    
    var value: DateType = js.native
  }
  object CalendarHeaderProps {
    
    @scala.inline
    def apply[DateType](
      fullscreen: Boolean,
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      mode: CalendarMode,
      onChange: (DateType, year | month | date | customize) => Unit,
      onModeChange: CalendarMode => Unit,
      prefixCls: String,
      value: DateType
    ): CalendarHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange), onModeChange = js.Any.fromFunction1(onModeChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarHeaderProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CalendarHeaderProps[_], DateType] (val x: Self with CalendarHeaderProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: CalendarMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: (DateType, year | month | date | customize) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnModeChange(value: CalendarMode => Unit): Self = StObject.set(x, "onModeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidRange(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "validRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidRangeUndefined: Self = StObject.set(x, "validRange", js.undefined)
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
