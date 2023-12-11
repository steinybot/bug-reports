package web.typings.rcSegmented

import web.typings.rcSegmented.mod.SegmentedValue
import web.typings.rcSegmented.rcSegmentedStrings.ltr
import web.typings.rcSegmented.rcSegmentedStrings.rtl
import web.typings.react.mod.JSX.Element
import web.typings.std.VoidFunction
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMotionThumbMod {
  
  @JSImport("rc-segmented/es/MotionThumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: MotionThumbInterface): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @js.native
  trait MotionThumbInterface extends StObject {
    
    var containerRef: ReactRef[HTMLDivElement] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    def getValueIndex(value: SegmentedValue): Double = js.native
    
    var motionName: String = js.native
    
    var onMotionEnd: VoidFunction = js.native
    
    var onMotionStart: VoidFunction = js.native
    
    var prefixCls: String = js.native
    
    var value: SegmentedValue = js.native
  }
  object MotionThumbInterface {
    
    @scala.inline
    def apply(
      containerRef: ReactRef[HTMLDivElement],
      getValueIndex: SegmentedValue => Double,
      motionName: String,
      onMotionEnd: () => Unit,
      onMotionStart: () => Unit,
      prefixCls: String,
      value: SegmentedValue
    ): MotionThumbInterface = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], getValueIndex = js.Any.fromFunction1(getValueIndex), motionName = motionName.asInstanceOf[js.Any], onMotionEnd = js.Any.fromFunction0(onMotionEnd), onMotionStart = js.Any.fromFunction0(onMotionStart), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotionThumbInterface]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MotionThumbInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setGetValueIndex(value: SegmentedValue => Double): Self = StObject.set(x, "getValueIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMotionEnd(value: () => Unit): Self = StObject.set(x, "onMotionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMotionStart(value: () => Unit): Self = StObject.set(x, "onMotionStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: SegmentedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
