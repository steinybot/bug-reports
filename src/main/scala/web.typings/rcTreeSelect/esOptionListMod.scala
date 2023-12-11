package web.typings.rcTreeSelect

import web.typings.rcVirtualList.esListMod.ScrollConfig
import web.typings.rcVirtualList.esListMod.ScrollTo
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/OptionList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RefAttributes[ReviseRefOptionListProps]] = js.native
  
  /* Inlined std.Omit<rc-select.rc-select/lib/OptionList.RefOptionListProps, 'scrollTo'> & {  scrollTo :rc-tree.rc-tree/es/interface.ScrollTo} */
  @js.native
  trait ReviseRefOptionListProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[Element] = js.native
    
    var onKeyUp: KeyboardEventHandler[Element] = js.native
    
    var scrollTo: ScrollTo = js.native
  }
  object ReviseRefOptionListProps {
    
    @scala.inline
    def apply(
      onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
      onKeyUp: SyntheticKeyboardEvent[Element] => Unit,
      scrollTo: /* arg */ Double | ScrollConfig => Unit
    ): ReviseRefOptionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[ReviseRefOptionListProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ReviseRefOptionListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollTo(value: /* arg */ Double | ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ReactComponentClass[RefAttributes[ReviseRefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionListMod.foo` */
  override def _to: ReactComponentClass[RefAttributes[ReviseRefOptionListProps]] = default
}
