package web.typings.antd

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStatisticUtilsMod {
  
  @JSImport("antd/es/statistic/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatCountdown(value: valueType, config: CountdownFormatConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCountdown")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatTimeStr(duration: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeStr")(duration.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait CountdownFormatConfig
    extends StObject
       with FormatConfig {
    
    var format: js.UndefOr[String] = js.native
  }
  object CountdownFormatConfig {
    
    @scala.inline
    def apply(): CountdownFormatConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountdownFormatConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CountdownFormatConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait FormatConfig extends StObject {
    
    var decimalSeparator: js.UndefOr[String] = js.native
    
    var formatter: js.UndefOr[Formatter] = js.native
    
    var groupSeparator: js.UndefOr[String] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object FormatConfig {
    
    @scala.inline
    def apply(): FormatConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormatConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
      
      @scala.inline
      def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactElement): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setGroupSeparator(value: String): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSeparatorUndefined: Self = StObject.set(x, "groupSeparator", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdBooleans.`false`
    - `web.typings`.antd.antdStrings.number
    - `web.typings`.antd.antdStrings.countdown
    - js.Function2[
  / * value * / `web.typings`.antd.esStatisticUtilsMod.valueType, 
  / * config * / js.UndefOr[`web.typings`.antd.esStatisticUtilsMod.FormatConfig], 
  slinky.core.facade.ReactElement]
  */
  type Formatter = _Formatter | (js.Function2[/* value */ valueType, /* config */ js.UndefOr[FormatConfig], ReactElement])
  
  trait _Formatter extends StObject
  
  type countdownValueType = Double | String
  
  type valueType = Double | String
}
