package web.typings.rcPicker

import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsMonthPanelMonthHeaderMod {
  
  @JSImport("rc-picker/es/panels/MonthPanel/MonthHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: MonthHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait MonthHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    def onNextYear(): Unit = js.native
    
    def onPrevYear(): Unit = js.native
    
    def onYearClick(): Unit = js.native
    
    var prefixCls: String = js.native
    
    var viewDate: DateType = js.native
  }
  object MonthHeaderProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onNextYear: () => Unit,
      onPrevYear: () => Unit,
      onYearClick: () => Unit,
      prefixCls: String,
      viewDate: DateType
    ): MonthHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onNextYear = js.Any.fromFunction0(onNextYear), onPrevYear = js.Any.fromFunction0(onPrevYear), onYearClick = js.Any.fromFunction0(onYearClick), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthHeaderProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MonthHeaderProps[_], DateType] (val x: Self with MonthHeaderProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNextYear(value: () => Unit): Self = StObject.set(x, "onNextYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrevYear(value: () => Unit): Self = StObject.set(x, "onPrevYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnYearClick(value: () => Unit): Self = StObject.set(x, "onYearClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}
