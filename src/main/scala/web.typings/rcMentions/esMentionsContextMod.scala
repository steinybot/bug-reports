package web.typings.rcMentions

import web.typings.rcMentions.esOptionMod.OptionProps
import web.typings.react.mod.Context
import web.typings.react.mod.FocusEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMentionsContextMod extends Shortcut {
  
  @JSImport("rc-mentions/es/MentionsContext", JSImport.Default)
  @js.native
  val default: Context[MentionsContextProps] = js.native
  
  @js.native
  trait MentionsContextProps extends StObject {
    
    var activeIndex: Double = js.native
    
    var notFoundContent: ReactElement = js.native
    
    var onBlur: FocusEventHandler[HTMLElement] = js.native
    
    var onFocus: FocusEventHandler[HTMLElement] = js.native
    
    def selectOption(option: OptionProps): Unit = js.native
    
    def setActiveIndex(index: Double): Unit = js.native
  }
  object MentionsContextProps {
    
    @scala.inline
    def apply(
      activeIndex: Double,
      notFoundContent: ReactElement,
      onBlur: SyntheticFocusEvent[HTMLElement] => Unit,
      onFocus: SyntheticFocusEvent[HTMLElement] => Unit,
      selectOption: OptionProps => Unit,
      setActiveIndex: Double => Unit
    ): MentionsContextProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), selectOption = js.Any.fromFunction1(selectOption), setActiveIndex = js.Any.fromFunction1(setActiveIndex))
      __obj.asInstanceOf[MentionsContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MentionsContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContent(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectOption(value: OptionProps => Unit): Self = StObject.set(x, "selectOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveIndex(value: Double => Unit): Self = StObject.set(x, "setActiveIndex", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[MentionsContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esMentionsContextMod.foo` */
  override def _to: Context[MentionsContextProps] = default
}
