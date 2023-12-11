package web.typings.antd

import web.typings.antd.anon.PrefixCls
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdBooleans.`true`
import web.typings.antd.esTooltipMod.AbstractTooltipProps
import web.typings.antd.esTooltipMod.TooltipPlacement
import web.typings.rcSlider.libInterfaceMod.SliderClassNames
import web.typings.rcSlider.libInterfaceMod.SliderStyles
import web.typings.rcSlider.libMarksMod.MarkObj
import web.typings.rcSlider.libSliderMod.SliderRef
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.RefAttributes
import web.typings.std.Record
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSliderMod extends Shortcut {
  
  @JSImport("antd/es/slider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[
    (SliderSingleProps with RefAttributes[SliderRef]) | (SliderRangeProps with RefAttributes[SliderRef])
  ] = js.native
  
  type Formatter = (js.Function1[/* value */ js.UndefOr[Double], ReactElement]) | Null
  
  type HandleGeneratorFn = js.Function1[/* config */ PrefixCls, ReactElement]
  
  @js.native
  trait HandleGeneratorInfo extends StObject {
    
    var dragging: js.UndefOr[Boolean] = js.native
    
    var index: Double = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object HandleGeneratorInfo {
    
    @scala.inline
    def apply(index: Double): HandleGeneratorInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleGeneratorInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HandleGeneratorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Opens = NumberDictionary[Boolean]
  
  @js.native
  trait SliderBaseProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[SliderClassNames] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dots: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated `getTooltipPopupContainer` is deprecated. Please use `tooltip.getPopupContainer`
      *   instead.
      */
    var getTooltipPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var included: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var marks: js.UndefOr[SliderMarks] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var step: js.UndefOr[Null | Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[SliderStyles] = js.native
    
    /** @deprecated `tipFormatter` is deprecated. Please use `tooltip.formatter` instead. */
    var tipFormatter: js.UndefOr[Formatter] = js.native
    
    var tooltip: js.UndefOr[SliderTooltipProps] = js.native
    
    /** @deprecated `tooltipPlacement` is deprecated. Please use `tooltip.placement` instead. */
    var tooltipPlacement: js.UndefOr[TooltipPlacement] = js.native
    
    /** @deprecated `tooltipPrefixCls` is deprecated. Please use `tooltip.prefixCls` instead. */
    var tooltipPrefixCls: js.UndefOr[String] = js.native
    
    /** @deprecated `tooltipVisible` is deprecated. Please use `tooltip.open` instead. */
    var tooltipVisible: js.UndefOr[Boolean] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object SliderBaseProps {
    
    @scala.inline
    def apply(): SliderBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderBaseProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: SliderClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setGetTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getTooltipPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTooltipPopupContainerUndefined: Self = StObject.set(x, "getTooltipPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMarks(value: SliderMarks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: SliderStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTipFormatter(value: /* value */ js.UndefOr[Double] => ReactElement): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTipFormatterNull: Self = StObject.set(x, "tipFormatter", null)
      
      @scala.inline
      def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      @scala.inline
      def setTooltip(value: SliderTooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPlacement(value: TooltipPlacement): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
      
      @scala.inline
      def setTooltipPrefixCls(value: String): Self = StObject.set(x, "tooltipPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPrefixClsUndefined: Self = StObject.set(x, "tooltipPrefixCls", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTooltipVisible(value: Boolean): Self = StObject.set(x, "tooltipVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipVisibleUndefined: Self = StObject.set(x, "tooltipVisible", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type SliderMarks = js.UndefOr[Record[String | Double, ReactElement | MarkObj]]
  
  @js.native
  trait SliderRange extends StObject {
    
    var draggableTrack: js.UndefOr[Boolean] = js.native
  }
  object SliderRange {
    
    @scala.inline
    def apply(): SliderRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderRange]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraggableTrack(value: Boolean): Self = StObject.set(x, "draggableTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableTrackUndefined: Self = StObject.set(x, "draggableTrack", js.undefined)
    }
  }
  
  @js.native
  trait SliderRangeProps
    extends StObject
       with SliderBaseProps {
    
    var defaultValue: js.UndefOr[js.Array[Double]] = js.native
    
    /** @deprecated Please use `styles.handle` instead */
    var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
    
    /** @deprecated Please use `onChangeComplete` instead */
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
    
    /** @deprecated Please use `styles.rail` instead */
    var railStyle: js.UndefOr[CSSProperties] = js.native
    
    var range: `true` | SliderRange = js.native
    
    /** @deprecated Please use `styles.track` instead */
    var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
    
    var value: js.UndefOr[js.Array[Double]] = js.native
  }
  object SliderRangeProps {
    
    @scala.inline
    def apply(range: `true` | SliderRange): SliderRangeProps = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderRangeProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderRangeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Array[Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: Double*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setHandleStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
      
      @scala.inline
      def setOnAfterChange(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeComplete(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      @scala.inline
      def setRange(value: `true` | SliderRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SliderSingleProps
    extends StObject
       with SliderBaseProps {
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    /** @deprecated Please use `styles.handle` instead */
    var handleStyle: js.UndefOr[CSSProperties] = js.native
    
    /** @deprecated Please use `onChangeComplete` instead */
    var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /** @deprecated Please use `styles.rail` instead */
    var railStyle: js.UndefOr[CSSProperties] = js.native
    
    var range: js.UndefOr[`false`] = js.native
    
    /** @deprecated Please use `styles.track` instead */
    var trackStyle: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object SliderSingleProps {
    
    @scala.inline
    def apply(): SliderSingleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderSingleProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderSingleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setOnAfterChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      @scala.inline
      def setRange(value: `false`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SliderTooltipProps
    extends StObject
       with AbstractTooltipProps {
    
    @JSName("autoAdjustOverflow")
    var autoAdjustOverflow_SliderTooltipProps: js.UndefOr[Boolean] = js.native
    
    var formatter: js.UndefOr[Formatter] = js.native
  }
  object SliderTooltipProps {
    
    @scala.inline
    def apply(): SliderTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderTooltipProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAdjustOverflow(value: Boolean): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* value */ js.UndefOr[Double] => ReactElement): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterNull: Self = StObject.set(x, "formatter", null)
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[
    (SliderSingleProps with RefAttributes[SliderRef]) | (SliderRangeProps with RefAttributes[SliderRef])
  ]
  
  /* This means you don't have to write `default`, but can instead just say `esSliderMod.foo` */
  override def _to: ReactComponentClass[
    (SliderSingleProps with RefAttributes[SliderRef]) | (SliderRangeProps with RefAttributes[SliderRef])
  ] = default
}
