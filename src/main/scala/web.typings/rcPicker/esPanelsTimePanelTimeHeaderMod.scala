package web.typings.rcPicker

import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsTimePanelTimeHeaderMod {
  
  @JSImport("rc-picker/es/panels/TimePanel/TimeHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: TimeHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait TimeHeaderProps[DateType] extends StObject {
    
    var format: String = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    var prefixCls: String = js.native
    
    var value: js.UndefOr[DateType | Null] = js.native
  }
  object TimeHeaderProps {
    
    @scala.inline
    def apply[DateType](format: String, generateConfig: GenerateConfig[DateType], locale: Locale, prefixCls: String): TimeHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeHeaderProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TimeHeaderProps[_], DateType] (val x: Self with TimeHeaderProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
