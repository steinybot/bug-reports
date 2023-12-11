package web.typings.antd

import web.typings.antd.esStatisticUtilsMod.FormatConfig
import web.typings.antd.esStatisticUtilsMod.valueType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStatisticStatisticMod extends Shortcut {
  
  @JSImport("antd/es/statistic/Statistic", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatisticProps] = js.native
  
  @js.native
  trait StatisticProps
    extends StObject
       with FormatConfig {
    
    var className: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var prefix: js.UndefOr[ReactElement] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffix: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var value: js.UndefOr[valueType] = js.native
    
    var valueRender: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var valueStyle: js.UndefOr[CSSProperties] = js.native
  }
  object StatisticProps {
    
    @scala.inline
    def apply(): StatisticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StatisticProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPrefix(value: ReactElement): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactElement): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: valueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueRender(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "valueRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueRenderUndefined: Self = StObject.set(x, "valueRender", js.undefined)
      
      @scala.inline
      def setValueStyle(value: CSSProperties): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatisticProps]
  
  /* This means you don't have to write `default`, but can instead just say `esStatisticStatisticMod.foo` */
  override def _to: ReactComponentClass[StatisticProps] = default
}
