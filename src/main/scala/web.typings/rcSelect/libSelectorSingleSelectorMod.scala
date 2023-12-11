package web.typings.rcSelect

import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.Mode
import web.typings.rcSelect.libSelectorMod.InnerSelectorProps
import web.typings.react.mod.ChangeEvent
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorSingleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/SingleSelector", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SelectorProps] = js.native
  
  @js.native
  trait SelectorProps
    extends StObject
       with InnerSelectorProps {
    
    var activeValue: String = js.native
    
    var inputElement: ReactElement = js.native
  }
  object SelectorProps {
    
    @scala.inline
    def apply(
      activeValue: String,
      id: String,
      inputElement: ReactElement,
      mode: Mode,
      onInputChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionEnd: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionStart: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputKeyDown: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputMouseDown: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputPaste: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      open: Boolean,
      prefixCls: String,
      searchValue: String,
      values: js.Array[DisplayValueType]
    ): SelectorProps = {
      val __obj = js.Dynamic.literal(activeValue = activeValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], inputRef = null)
      __obj.asInstanceOf[SelectorProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveValue(value: String): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputElement(value: ReactElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorSingleSelectorMod.foo` */
  override def _to: ReactComponentClass[SelectorProps] = default
}
