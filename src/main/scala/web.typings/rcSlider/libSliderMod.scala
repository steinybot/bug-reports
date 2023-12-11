package web.typings.rcSlider

import web.typings.rcSlider.libInterfaceMod.AriaValueFormat
import web.typings.rcSlider.libInterfaceMod.SliderClassNames
import web.typings.rcSlider.libInterfaceMod.SliderStyles
import web.typings.rcSlider.libMarksMod.MarkObj
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import web.typings.std.Record
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSliderMod extends Shortcut {
  
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[(SliderProps[Double | js.Array[Double]]) with RefAttributes[SliderRef]] = js.native
  
  @js.native
  trait SliderProps[ValueType] extends StObject {
    
    var activeDotStyle: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.native
    
    var allowCross: js.UndefOr[Boolean] = js.native
    
    var ariaLabelForHandle: js.UndefOr[String | js.Array[String]] = js.native
    
    var ariaLabelledByForHandle: js.UndefOr[String | js.Array[String]] = js.native
    
    var ariaValueTextFormatterForHandle: js.UndefOr[AriaValueFormat | js.Array[AriaValueFormat]] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[SliderClassNames] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var defaultValue: js.UndefOr[ValueType] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dotStyle: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.native
    
    var dots: js.UndefOr[Boolean] = js.native
    
    /** range only */
    var draggableTrack: js.UndefOr[Boolean] = js.native
    
    var handleRender: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: rc-slider.rc-slider/lib/Handles/Handle.HandleProps['render'] */ js.Any
      ] = js.native
    
    /** @deprecated Please use `styles.handle` instead */
    var handleStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
    
    var included: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var marks: js.UndefOr[Record[String | Double, ReactElement | MarkObj]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    /** @deprecated Use `onChangeComplete` instead */
    var onAfterChange: js.UndefOr[js.Function1[/* value */ ValueType, Unit]] = js.native
    
    /** @deprecated It's always better to use `onChange` instead */
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ ValueType, Unit]] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ ValueType, Unit]] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function1[/* value */ ValueType, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var pushable: js.UndefOr[Boolean | Double] = js.native
    
    /** @deprecated Please use `styles.rail` instead */
    var railStyle: js.UndefOr[CSSProperties] = js.native
    
    var range: js.UndefOr[Boolean] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var startPoint: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double | Null] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[SliderStyles] = js.native
    
    var tabIndex: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /** @deprecated Please use `styles.track` instead */
    var trackStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
    
    var value: js.UndefOr[ValueType] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object SliderProps {
    
    @scala.inline
    def apply[ValueType](): SliderProps[ValueType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps[ValueType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderProps[_], ValueType] (val x: Self with SliderProps[ValueType]) extends AnyVal {
      
      @scala.inline
      def setActiveDotStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDotStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "activeDotStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActiveDotStyleUndefined: Self = StObject.set(x, "activeDotStyle", js.undefined)
      
      @scala.inline
      def setAllowCross(value: Boolean): Self = StObject.set(x, "allowCross", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCrossUndefined: Self = StObject.set(x, "allowCross", js.undefined)
      
      @scala.inline
      def setAriaLabelForHandle(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelForHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelForHandleUndefined: Self = StObject.set(x, "ariaLabelForHandle", js.undefined)
      
      @scala.inline
      def setAriaLabelForHandleVarargs(value: String*): Self = StObject.set(x, "ariaLabelForHandle", js.Array(value :_*))
      
      @scala.inline
      def setAriaLabelledByForHandle(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelledByForHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByForHandleUndefined: Self = StObject.set(x, "ariaLabelledByForHandle", js.undefined)
      
      @scala.inline
      def setAriaLabelledByForHandleVarargs(value: String*): Self = StObject.set(x, "ariaLabelledByForHandle", js.Array(value :_*))
      
      @scala.inline
      def setAriaValueTextFormatterForHandle(value: AriaValueFormat | js.Array[AriaValueFormat]): Self = StObject.set(x, "ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaValueTextFormatterForHandleFunction1(value: /* value */ Double => String): Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAriaValueTextFormatterForHandleUndefined: Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.undefined)
      
      @scala.inline
      def setAriaValueTextFormatterForHandleVarargs(value: AriaValueFormat*): Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.Array(value :_*))
      
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
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDotStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "dotStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setDraggableTrack(value: Boolean): Self = StObject.set(x, "draggableTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableTrackUndefined: Self = StObject.set(x, "draggableTrack", js.undefined)
      
      @scala.inline
      def setHandleRender(
        value: /* import warning: importer.ImportType#apply Failed type conversion: rc-slider.rc-slider/lib/Handles/Handle.HandleProps['render'] */ js.Any
      ): Self = StObject.set(x, "handleRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleRenderUndefined: Self = StObject.set(x, "handleRender", js.undefined)
      
      @scala.inline
      def setHandleStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMarks(value: Record[String | Double, ReactElement | MarkObj]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
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
      def setOnAfterChange(value: /* value */ ValueType => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnBeforeChange(value: /* value */ ValueType => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ ValueType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeComplete(value: /* value */ ValueType => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPushable(value: Boolean | Double): Self = StObject.set(x, "pushable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushableUndefined: Self = StObject.set(x, "pushable", js.undefined)
      
      @scala.inline
      def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setStartPoint(value: Double): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
      
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
      def setTabIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTabIndexVarargs(value: Double*): Self = StObject.set(x, "tabIndex", js.Array(value :_*))
      
      @scala.inline
      def setTrackStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait SliderRef extends StObject {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
  }
  object SliderRef {
    
    @scala.inline
    def apply(blur: () => Unit, focus: () => Unit): SliderRef = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[SliderRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ReactComponentClass[(SliderProps[Double | js.Array[Double]]) with RefAttributes[SliderRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libSliderMod.foo` */
  override def _to: ReactComponentClass[(SliderProps[Double | js.Array[Double]]) with RefAttributes[SliderRef]] = default
}
