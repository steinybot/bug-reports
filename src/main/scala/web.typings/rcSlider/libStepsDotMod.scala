package web.typings.rcSlider

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsDotMod {
  
  @JSImport("rc-slider/lib/Steps/Dot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: DotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait DotProps extends StObject {
    
    var activeStyle: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.native
    
    var value: Double = js.native
  }
  object DotProps {
    
    @scala.inline
    def apply(prefixCls: String, value: Double): DotProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DotProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "activeStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
