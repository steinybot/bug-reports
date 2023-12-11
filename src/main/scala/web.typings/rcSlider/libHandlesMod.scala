package web.typings.rcSlider

import web.typings.rcSlider.libHandlesHandleMod.RenderProps
import web.typings.rcSlider.libInterfaceMod.OnStartMove
import web.typings.rcSlider.rcSliderStrings.max
import web.typings.rcSlider.rcSliderStrings.min
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandlesMod extends Shortcut {
  
  @JSImport("rc-slider/lib/Handles", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HandlesProps with RefAttributes[HandlesRef]] = js.native
  
  @js.native
  trait HandlesProps extends StObject {
    
    var draggingIndex: Double = js.native
    
    var handleRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ RenderProps, ReactElement]] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    def onOffsetChange(value: min | max, valueIndex: Double): Unit = js.native
    def onOffsetChange(value: Double, valueIndex: Double): Unit = js.native
    
    var onStartMove: OnStartMove = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
    
    var values: js.Array[Double] = js.native
  }
  
  @js.native
  trait HandlesRef extends StObject {
    
    def focus(index: Double): Unit = js.native
  }
  object HandlesRef {
    
    @scala.inline
    def apply(focus: Double => Unit): HandlesRef = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction1(focus))
      __obj.asInstanceOf[HandlesRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HandlesRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: Double => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ReactComponentClass[HandlesProps with RefAttributes[HandlesRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libHandlesMod.foo` */
  override def _to: ReactComponentClass[HandlesProps with RefAttributes[HandlesRef]] = default
}
