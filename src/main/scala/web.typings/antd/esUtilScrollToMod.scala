package web.typings.antd

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilScrollToMod {
  
  @JSImport("antd/es/_util/scrollTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(y: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(y.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(y: Double, options: ScrollToOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait ScrollToOptions extends StObject {
    
    /** Scroll end callback */
    var callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Animation duration, default as 450 */
    var duration: js.UndefOr[Double] = js.native
    
    /** Scroll container, default as window */
    var getContainer: js.UndefOr[js.Function0[HTMLElement | Window | Document]] = js.native
  }
  object ScrollToOptions {
    
    @scala.inline
    def apply(): ScrollToOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollToOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement | Window | Document): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    }
  }
}
