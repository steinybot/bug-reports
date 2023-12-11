package web.typings.rcSlider

import web.typings.rcSlider.libInterfaceMod.OnStartMove
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTracksMod {
  
  @JSImport("rc-slider/lib/Tracks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: TrackProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @js.native
  trait TrackProps extends StObject {
    
    var onStartMove: js.UndefOr[OnStartMove] = js.native
    
    var prefixCls: String = js.native
    
    var startPoint: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
    
    var values: js.Array[Double] = js.native
  }
  object TrackProps {
    
    @scala.inline
    def apply(prefixCls: String, values: js.Array[Double]): TrackProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TrackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnStartMove(
        value: (/* e */ SyntheticMouseEvent[Element] | SyntheticTouchEvent[Element], /* valueIndex */ Double, /* startValues */ js.UndefOr[js.Array[Double]]) => Unit
      ): Self = StObject.set(x, "onStartMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStartMoveUndefined: Self = StObject.set(x, "onStartMove", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPoint(value: Double): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
