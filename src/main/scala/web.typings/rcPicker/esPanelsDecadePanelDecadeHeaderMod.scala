package web.typings.rcPicker

import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDecadePanelDecadeHeaderMod {
  
  @JSImport("rc-picker/es/panels/DecadePanel/DecadeHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: YearHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait YearHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    def onNextDecades(): Unit = js.native
    
    def onPrevDecades(): Unit = js.native
    
    var prefixCls: String = js.native
    
    var viewDate: DateType = js.native
  }
  object YearHeaderProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      onNextDecades: () => Unit,
      onPrevDecades: () => Unit,
      prefixCls: String,
      viewDate: DateType
    ): YearHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onNextDecades = js.Any.fromFunction0(onNextDecades), onPrevDecades = js.Any.fromFunction0(onPrevDecades), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearHeaderProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: YearHeaderProps[_], DateType] (val x: Self with YearHeaderProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNextDecades(value: () => Unit): Self = StObject.set(x, "onNextDecades", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrevDecades(value: () => Unit): Self = StObject.set(x, "onPrevDecades", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}
