package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.rcComponentColorPicker.esInterfaceMod.TransformOffset
import web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.x
import web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.y
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseColorDragMod {
  
  @JSImport("@rc-component/color-picker/es/hooks/useColorDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: useColorDragProps): js.Tuple2[TransformOffset, EventHandle] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TransformOffset, EventHandle]]
  
  type EventHandle = js.Function1[/* e */ EventType, Unit]
  
  type EventType = MouseEvent | SyntheticMouseEvent[Element] | SyntheticTouchEvent[Element] | TouchEvent
  
  @js.native
  trait useColorDragProps extends StObject {
    
    var calculate: js.UndefOr[js.Function1[/* containerRef */ ReactRef[HTMLDivElement], TransformOffset]] = js.native
    
    var color: js.UndefOr[Color] = js.native
    
    var containerRef: ReactRef[HTMLDivElement] = js.native
    
    var direction: js.UndefOr[x | y] = js.native
    
    /** Disabled drag */
    var disabledDrag: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[TransformOffset] = js.native
    
    var onDragChange: js.UndefOr[js.Function1[/* offset */ TransformOffset, Unit]] = js.native
    
    var onDragChangeComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var targetRef: ReactRef[HTMLDivElement] = js.native
  }
  object useColorDragProps {
    
    @scala.inline
    def apply(containerRef: ReactRef[HTMLDivElement], targetRef: ReactRef[HTMLDivElement]): useColorDragProps = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[useColorDragProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: useColorDragProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculate(value: /* containerRef */ ReactRef[HTMLDivElement] => TransformOffset): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContainerRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.x | y): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabledDrag(value: Boolean): Self = StObject.set(x, "disabledDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDragUndefined: Self = StObject.set(x, "disabledDrag", js.undefined)
      
      @scala.inline
      def setOffset(value: TransformOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnDragChange(value: /* offset */ TransformOffset => Unit): Self = StObject.set(x, "onDragChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragChangeComplete(value: () => Unit): Self = StObject.set(x, "onDragChangeComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragChangeCompleteUndefined: Self = StObject.set(x, "onDragChangeComplete", js.undefined)
      
      @scala.inline
      def setOnDragChangeUndefined: Self = StObject.set(x, "onDragChange", js.undefined)
      
      @scala.inline
      def setTargetRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    }
  }
}
