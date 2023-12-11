package web.typings.rcSelect

import web.typings.rcVirtualList.esListMod.ScrollConfig
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.RefAttributes
import web.typings.std.Record
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionListMod extends Shortcut {
  
  @JSImport("rc-select/lib/OptionList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RefAttributes[RefOptionListProps]] = js.native
  
  type OptionListProps = Record[String, scala.Nothing]
  
  @js.native
  trait RefOptionListProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[Element] = js.native
    
    var onKeyUp: KeyboardEventHandler[Element] = js.native
    
    var scrollTo: js.UndefOr[js.Function1[/* args */ Double | ScrollConfig, Unit]] = js.native
  }
  object RefOptionListProps {
    
    @scala.inline
    def apply(
      onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
      onKeyUp: SyntheticKeyboardEvent[Element] => Unit
    ): RefOptionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
      __obj.asInstanceOf[RefOptionListProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RefOptionListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollTo(value: /* args */ Double | ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `libOptionListMod.foo` */
  override def _to: ReactComponentClass[RefAttributes[RefOptionListProps]] = default
}
