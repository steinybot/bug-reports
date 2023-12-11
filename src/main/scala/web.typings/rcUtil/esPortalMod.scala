package web.typings.rcUtil

import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPortalMod extends Shortcut {
  
  @JSImport("rc-util/es/Portal", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PortalProps with RefAttributes[PortalRef]] = js.native
  
  @js.native
  trait PortalProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var didUpdate: js.UndefOr[js.Function1[/* prevProps */ this.type, Unit]] = js.native
    
    def getContainer(): HTMLElement = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(getContainer: () => HTMLElement): PortalProps = {
      val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer))
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDidUpdate(value: PortalProps => Unit): Self = StObject.set(x, "didUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDidUpdateUndefined: Self = StObject.set(x, "didUpdate", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    }
  }
  
  type PortalRef = js.Object
  
  type _To = ReactComponentClass[PortalProps with RefAttributes[PortalRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esPortalMod.foo` */
  override def _to: ReactComponentClass[PortalProps with RefAttributes[PortalRef]] = default
}
