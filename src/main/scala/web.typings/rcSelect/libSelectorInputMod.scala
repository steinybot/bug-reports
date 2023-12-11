package web.typings.rcSelect

import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.ChangeEventHandler
import web.typings.react.mod.ClipboardEventHandler
import web.typings.react.mod.CompositionEventHandler
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.RefAttributes
import web.typings.std.Record
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
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

object libSelectorInputMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/Input", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InputProps with RefAttributes[InputRef]] = js.native
  
  @js.native
  trait InputProps extends StObject {
    
    var activeDescendantId: js.UndefOr[String] = js.native
    
    /** Pass accessibility props to input */
    var attrs: Record[String, Any] = js.native
    
    var autoComplete: String = js.native
    
    var autoFocus: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var editable: Boolean = js.native
    
    var id: String = js.native
    
    var inputElement: ReactElement = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var onChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
    
    var onCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
    
    var onCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
    
    var onMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
    
    var onPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
    
    var open: Boolean = js.native
    
    var prefixCls: String = js.native
    
    var tabIndex: Double = js.native
    
    var value: String = js.native
  }
  object InputProps {
    
    @scala.inline
    def apply(
      attrs: Record[String, Any],
      autoComplete: String,
      autoFocus: Boolean,
      disabled: Boolean,
      editable: Boolean,
      id: String,
      inputElement: ReactElement,
      onChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
      onCompositionEnd: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
      onCompositionStart: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
      onKeyDown: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
      onMouseDown: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
      onPaste: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
      open: Boolean,
      prefixCls: String,
      tabIndex: Double,
      value: String
    ): InputProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onCompositionEnd = js.Any.fromFunction1(onCompositionEnd), onCompositionStart = js.Any.fromFunction1(onCompositionStart), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onPaste = js.Any.fromFunction1(onPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDescendantId(value: String): Self = StObject.set(x, "activeDescendantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDescendantIdUndefined: Self = StObject.set(x, "activeDescendantId", js.undefined)
      
      @scala.inline
      def setAttrs(value: Record[String, Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputElement(value: ReactElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type InputRef = HTMLInputElement | HTMLTextAreaElement
  
  type _To = ReactComponentClass[InputProps with RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorInputMod.foo` */
  override def _to: ReactComponentClass[InputProps with RefAttributes[InputRef]] = default
}
