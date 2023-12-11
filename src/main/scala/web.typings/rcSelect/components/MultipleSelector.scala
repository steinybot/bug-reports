package web.typings.rcSelect.components

import web.typings.StBuildingComponent
import web.typings.rcSelect.libBaseSelectMod.CustomTagProps
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.Mode
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.libSelectorMultipleSelectorMod.SelectorProps
import web.typings.rcSelect.rcSelectStrings.responsive
import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.Ref
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.textarea.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultipleSelector {
  
  @scala.inline
  def apply(
    id: String,
    mode: Mode,
    onInputChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputCompositionEnd: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputCompositionStart: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputKeyDown: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputMouseDown: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputPaste: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onRemove: DisplayValueType => Unit,
    onToggleOpen: js.UndefOr[Boolean] => Unit,
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[DisplayValueType]
  ): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), onRemove = js.Any.fromFunction1(onRemove), onToggleOpen = js.Any.fromFunction1(onToggleOpen), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], inputRef = null)
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectorProps]))
  }
  
  @JSImport("rc-select/lib/Selector/MultipleSelector", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def activeDescendantId(value: String): this.type = set("activeDescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoClearSearchValue(value: Boolean): this.type = set("autoClearSearchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefFunction1(value: /* instance */ (HTMLInputElement | HTMLTextAreaElement) | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    
    @scala.inline
    def inputRefReactRef(value: ReactRef[HTMLInputElement | HTMLTextAreaElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxTagCount(value: Double | responsive): this.type = set("maxTagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxTagPlaceholder(value: ReactElement | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactElement])): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[DisplayValueType] => ReactElement): this.type = set("maxTagPlaceholder", js.Any.fromFunction1(value))
    
    @scala.inline
    def maxTagPlaceholderReactElement(value: ReactElement): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxTagTextLength(value: Double): this.type = set("maxTagTextLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIcon(value: RenderNode): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIconFunction1(value: /* props */ Any => ReactElement): this.type = set("removeIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagRender(value: /* props */ CustomTagProps => ReactElement): this.type = set("tagRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tokenSeparators(value: js.Array[String]): this.type = set("tokenSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tokenSeparatorsVarargs(value: String*): this.type = set("tokenSeparators", js.Array(value :_*))
  }
  
  type Props = SelectorProps
  
  def withProps(p: SelectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
