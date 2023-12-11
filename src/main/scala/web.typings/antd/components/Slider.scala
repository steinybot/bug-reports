package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdBooleans.`true`
import web.typings.antd.esSliderMod.SliderMarks
import web.typings.antd.esSliderMod.SliderRange
import web.typings.antd.esSliderMod.SliderRangeProps
import web.typings.antd.esSliderMod.SliderSingleProps
import web.typings.antd.esSliderMod.SliderTooltipProps
import web.typings.antd.esTooltipMod.TooltipPlacement
import web.typings.rcSlider.libInterfaceMod.SliderClassNames
import web.typings.rcSlider.libInterfaceMod.SliderStyles
import web.typings.rcSlider.libSliderMod.SliderRef
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  object SliderRangePropsRefAttributes {
    
    @scala.inline
    def apply(range: `true` | SliderRange): Builder = {
      val __props = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[SliderRangeProps with RefAttributes[SliderRef]]))
    }
    
    @JSImport("antd", "Slider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, SliderRef] {
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def classNames(value: SliderClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: js.Array[Double]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: Double*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def getTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getTooltipPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def handleStyle(value: js.Array[CSSProperties]): this.type = set("handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def handleStyleVarargs(value: CSSProperties*): this.type = set("handleStyle", js.Array(value :_*))
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def marks(value: SliderMarks): this.type = set("marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAfterChange(value: /* value */ js.Array[Double] => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: /* value */ js.Array[Double] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChangeComplete(value: /* value */ js.Array[Double] => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def railStyle(value: CSSProperties): this.type = set("railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def stepNull: this.type = set("step", null)
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def styles(value: SliderStyles): this.type = set("styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tipFormatter(value: /* value */ js.UndefOr[Double] => ReactElement): this.type = set("tipFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def tipFormatterNull: this.type = set("tipFormatter", null)
      
      @scala.inline
      def tooltip(value: SliderTooltipProps): this.type = set("tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tooltipPlacement(value: TooltipPlacement): this.type = set("tooltipPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tooltipPrefixCls(value: String): this.type = set("tooltipPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tooltipVisible(value: Boolean): this.type = set("tooltipVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def trackStyle(value: js.Array[CSSProperties]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def trackStyleVarargs(value: CSSProperties*): this.type = set("trackStyle", js.Array(value :_*))
      
      @scala.inline
      def value(value: js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueVarargs(value: Double*): this.type = set("value", js.Array(value :_*))
      
      @scala.inline
      def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    }
    
    type Props = SliderRangeProps with RefAttributes[SliderRef]
    
    def withProps(p: SliderRangeProps with RefAttributes[SliderRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SliderSinglePropsRefAttributes {
    
    @JSImport("antd", "Slider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, SliderRef] {
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def classNames(value: SliderClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def getTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getTooltipPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def handleStyle(value: CSSProperties): this.type = set("handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def marks(value: SliderMarks): this.type = set("marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAfterChange(value: /* value */ Double => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChangeComplete(value: /* value */ Double => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def railStyle(value: CSSProperties): this.type = set("railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def range(value: `false`): this.type = set("range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def stepNull: this.type = set("step", null)
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def styles(value: SliderStyles): this.type = set("styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tipFormatter(value: /* value */ js.UndefOr[Double] => ReactElement): this.type = set("tipFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def tipFormatterNull: this.type = set("tipFormatter", null)
      
      @scala.inline
      def tooltip(value: SliderTooltipProps): this.type = set("tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tooltipPlacement(value: TooltipPlacement): this.type = set("tooltipPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tooltipPrefixCls(value: String): this.type = set("tooltipPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tooltipVisible(value: Boolean): this.type = set("tooltipVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def trackStyle(value: CSSProperties): this.type = set("trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    }
    
    type Props = SliderSingleProps with RefAttributes[SliderRef]
    
    implicit def make(companion: SliderSinglePropsRefAttributes.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SliderSingleProps with RefAttributes[SliderRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
