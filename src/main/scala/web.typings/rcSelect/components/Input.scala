package web.typings.rcSelect.components

import web.typings.StBuildingComponent
import web.typings.rcSelect.libSelectorInputMod.InputProps
import web.typings.rcSelect.libSelectorInputMod.InputRef
import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.RefAttributes
import web.typings.std.Record
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.textarea.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
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
  ): Builder = {
    val __props = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onCompositionEnd = js.Any.fromFunction1(onCompositionEnd), onCompositionStart = js.Any.fromFunction1(onCompositionStart), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onPaste = js.Any.fromFunction1(onPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InputProps with RefAttributes[InputRef]]))
  }
  
  @JSImport("rc-select/lib/Selector/Input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, InputRef with js.Object] {
    
    @scala.inline
    def activeDescendantId(value: String): this.type = set("activeDescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  }
  
  type Props = InputProps with RefAttributes[InputRef]
  
  def withProps(p: InputProps with RefAttributes[InputRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
