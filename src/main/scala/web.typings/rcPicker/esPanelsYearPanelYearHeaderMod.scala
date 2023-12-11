package web.typings.rcPicker

import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsYearPanelYearHeaderMod {
  
  @JSImport("rc-picker/es/panels/YearPanel/YearHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: YearHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait YearHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    def onDecadeClick(): Unit = js.native
    
    def onNextDecade(): Unit = js.native
    
    def onPrevDecade(): Unit = js.native
    
    var prefixCls: String = js.native
    
    var value: js.UndefOr[DateType | Null] = js.native
    
    var viewDate: DateType = js.native
  }
  object YearHeaderProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      onDecadeClick: () => Unit,
      onNextDecade: () => Unit,
      onPrevDecade: () => Unit,
      prefixCls: String,
      viewDate: DateType
    ): YearHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onDecadeClick = js.Any.fromFunction0(onDecadeClick), onNextDecade = js.Any.fromFunction0(onNextDecade), onPrevDecade = js.Any.fromFunction0(onPrevDecade), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearHeaderProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: YearHeaderProps[_], DateType] (val x: Self with YearHeaderProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDecadeClick(value: () => Unit): Self = StObject.set(x, "onDecadeClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNextDecade(value: () => Unit): Self = StObject.set(x, "onNextDecade", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrevDecade(value: () => Unit): Self = StObject.set(x, "onPrevDecade", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}
