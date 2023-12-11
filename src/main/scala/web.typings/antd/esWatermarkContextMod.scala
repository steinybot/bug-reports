package web.typings.antd

import web.typings.react.mod.Context
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWatermarkContextMod {
  
  @JSImport("antd/es/watermark/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/watermark/context", JSImport.Default)
  @js.native
  val default: Context[WatermarkContextProps] = js.native
  
  @scala.inline
  def usePanelRef(): js.Function1[/* ele */ HTMLElement | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePanelRef")().asInstanceOf[js.Function1[/* ele */ HTMLElement | Null, Unit]]
  @scala.inline
  def usePanelRef(panelSelector: String): js.Function1[/* ele */ HTMLElement | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePanelRef")(panelSelector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ele */ HTMLElement | Null, Unit]]
  
  @js.native
  trait WatermarkContextProps extends StObject {
    
    def add(ele: HTMLElement): Unit = js.native
    
    def remove(ele: HTMLElement): Unit = js.native
  }
  object WatermarkContextProps {
    
    @scala.inline
    def apply(add: HTMLElement => Unit, remove: HTMLElement => Unit): WatermarkContextProps = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[WatermarkContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WatermarkContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: HTMLElement => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: HTMLElement => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
