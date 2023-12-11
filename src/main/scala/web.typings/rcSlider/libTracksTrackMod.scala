package web.typings.rcSlider

import web.typings.rcSlider.libInterfaceMod.OnStartMove
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTracksTrackMod {
  
  @JSImport("rc-slider/lib/Tracks/Track", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: TrackProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait TrackProps extends StObject {
    
    var end: Double = js.native
    
    var index: Double = js.native
    
    var onStartMove: js.UndefOr[OnStartMove] = js.native
    
    var prefixCls: String = js.native
    
    /** Replace with origin prefix concat className */
    var replaceCls: js.UndefOr[String] = js.native
    
    var start: Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TrackProps {
    
    @scala.inline
    def apply(end: Double, index: Double, prefixCls: String, start: Double): TrackProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TrackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartMove(
        value: (/* e */ SyntheticMouseEvent[org.scalajs.dom.Element] | SyntheticTouchEvent[org.scalajs.dom.Element], /* valueIndex */ Double, /* startValues */ js.UndefOr[js.Array[Double]]) => Unit
      ): Self = StObject.set(x, "onStartMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStartMoveUndefined: Self = StObject.set(x, "onStartMove", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceCls(value: String): Self = StObject.set(x, "replaceCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceClsUndefined: Self = StObject.set(x, "replaceCls", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
