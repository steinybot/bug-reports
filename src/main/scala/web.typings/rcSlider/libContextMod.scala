package web.typings.rcSlider

import web.typings.rcSlider.libInterfaceMod.AriaValueFormat
import web.typings.rcSlider.libInterfaceMod.Direction
import web.typings.rcSlider.libInterfaceMod.SliderClassNames
import web.typings.rcSlider.libInterfaceMod.SliderStyles
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod extends Shortcut {
  
  @JSImport("rc-slider/lib/context", JSImport.Default)
  @js.native
  val default: Context[SliderContextProps] = js.native
  
  @js.native
  trait SliderContextProps extends StObject {
    
    var ariaLabelForHandle: js.UndefOr[String | js.Array[String]] = js.native
    
    var ariaLabelledByForHandle: js.UndefOr[String | js.Array[String]] = js.native
    
    var ariaValueTextFormatterForHandle: js.UndefOr[AriaValueFormat | js.Array[AriaValueFormat]] = js.native
    
    var classNames: SliderClassNames = js.native
    
    var direction: Direction = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var included: js.UndefOr[Boolean] = js.native
    
    var includedEnd: Double = js.native
    
    var includedStart: Double = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var range: js.UndefOr[Boolean] = js.native
    
    var step: Double | Null = js.native
    
    var styles: SliderStyles = js.native
    
    var tabIndex: Double | js.Array[Double] = js.native
  }
  object SliderContextProps {
    
    @scala.inline
    def apply(
      classNames: SliderClassNames,
      direction: Direction,
      includedEnd: Double,
      includedStart: Double,
      max: Double,
      min: Double,
      styles: SliderStyles,
      tabIndex: Double | js.Array[Double]
    ): SliderContextProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], includedEnd = includedEnd.asInstanceOf[js.Any], includedStart = includedStart.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], step = null)
      __obj.asInstanceOf[SliderContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderContextProps] (val x: Self) extends AnyVal {
      
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
      def setClassNames(value: SliderClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedEnd(value: Double): Self = StObject.set(x, "includedEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedStart(value: Double): Self = StObject.set(x, "includedStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setStyles(value: SliderStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexVarargs(value: Double*): Self = StObject.set(x, "tabIndex", js.Array(value :_*))
    }
  }
  
  type _To = Context[SliderContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libContextMod.foo` */
  override def _to: Context[SliderContextProps] = default
}
