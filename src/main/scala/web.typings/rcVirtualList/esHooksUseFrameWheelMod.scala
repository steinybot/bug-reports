package web.typings.rcVirtualList

import web.typings.std.VoidFunction
import org.scalajs.dom.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseFrameWheelMod {
  
  @JSImport("rc-virtual-list/es/hooks/useFrameWheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    inVirtual: Boolean,
    isScrollAtTop: Boolean,
    isScrollAtBottom: Boolean,
    horizontalScroll: Boolean,
    /***
    * Return `true` when you need to prevent default event
    */
  onWheelDelta: js.Function2[/* offset */ Double, /* horizontal */ js.UndefOr[Boolean], Unit]
  ): js.Tuple2[
    js.Function1[/* e */ WheelEvent, Unit], 
    js.Function1[/* e */ FireFoxDOMMouseScrollEvent, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inVirtual.asInstanceOf[js.Any], isScrollAtTop.asInstanceOf[js.Any], isScrollAtBottom.asInstanceOf[js.Any], horizontalScroll.asInstanceOf[js.Any], onWheelDelta.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Function1[/* e */ WheelEvent, Unit], 
    js.Function1[/* e */ FireFoxDOMMouseScrollEvent, Unit]
  ]]
  
  @js.native
  trait FireFoxDOMMouseScrollEvent extends StObject {
    
    var detail: Double = js.native
    
    var preventDefault: VoidFunction = js.native
  }
  object FireFoxDOMMouseScrollEvent {
    
    @scala.inline
    def apply(detail: Double, preventDefault: () => Unit): FireFoxDOMMouseScrollEvent = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[FireFoxDOMMouseScrollEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FireFoxDOMMouseScrollEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
}
