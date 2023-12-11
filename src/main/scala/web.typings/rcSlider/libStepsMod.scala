package web.typings.rcSlider

import web.typings.rcSlider.libMarksMod.InternalMarkObj
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsMod {
  
  @JSImport("rc-slider/lib/Steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: StepsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait StepsProps extends StObject {
    
    var activeStyle: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.native
    
    var dots: js.UndefOr[Boolean] = js.native
    
    var marks: js.Array[InternalMarkObj] = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.native
  }
  object StepsProps {
    
    @scala.inline
    def apply(marks: js.Array[InternalMarkObj], prefixCls: String): StepsProps = {
      val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StepsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "activeStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setMarks(value: js.Array[InternalMarkObj]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksVarargs(value: InternalMarkObj*): Self = StObject.set(x, "marks", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
