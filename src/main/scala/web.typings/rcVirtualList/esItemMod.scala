package web.typings.rcVirtualList

import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esItemMod {
  
  @JSImport("rc-virtual-list/es/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Item(param0: ItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @js.native
  trait ItemProps extends StObject {
    
    var children: ReactElement = js.native
    
    def setRef(element: HTMLElement): Unit = js.native
  }
  object ItemProps {
    
    @scala.inline
    def apply(children: ReactElement, setRef: HTMLElement => Unit): ItemProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], setRef = js.Any.fromFunction1(setRef))
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRef(value: HTMLElement => Unit): Self = StObject.set(x, "setRef", js.Any.fromFunction1(value))
    }
  }
}
