package web.typings.rcDialog

import web.typings.react.mod.Context
import web.typings.react.mod.Ref
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod {
  
  @JSImport("rc-dialog/es/context", "RefContext")
  @js.native
  val RefContext: Context[RefContextProps] = js.native
  
  @js.native
  trait RefContextProps extends StObject {
    
    var panel: js.UndefOr[Ref[HTMLDivElement]] = js.native
  }
  object RefContextProps {
    
    @scala.inline
    def apply(): RefContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RefContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPanel(value: Ref[HTMLDivElement]): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "panel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelNull: Self = StObject.set(x, "panel", null)
      
      @scala.inline
      def setPanelReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    }
  }
}
