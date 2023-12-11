package web.typings.rcSelect.components

import web.typings.StBuildingComponent
import web.typings.rcSelect.libBaseSelectMod.CustomTagProps
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.Mode
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.libSelectorMod.RefSelectorProps
import web.typings.rcSelect.libSelectorMod.SelectorProps
import web.typings.rcSelect.rcSelectStrings.responsive
import web.typings.react.mod.Ref
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.global.JSX.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.textarea.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Selector {
  
  @scala.inline
  def apply(
    activeValue: String,
    autoClearSearchValue: Boolean,
    id: String,
    inputElement: Element,
    mode: Mode,
    onRemove: DisplayValueType => Unit,
    onSearch: (String, Boolean, Boolean) => Boolean,
    onToggleOpen: js.UndefOr[Boolean] => Unit,
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[DisplayValueType]
  ): Builder = {
    val __props = js.Dynamic.literal(activeValue = activeValue.asInstanceOf[js.Any], autoClearSearchValue = autoClearSearchValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onRemove = js.Any.fromFunction1(onRemove), onSearch = js.Any.fromFunction3(onSearch), onToggleOpen = js.Any.fromFunction1(onToggleOpen), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], domRef = null)
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectorProps with RefAttributes[RefSelectorProps]]))
  }
  
  @JSImport("rc-select/lib/Selector", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RefSelectorProps] {
    
    @scala.inline
    def activeDescendantId(value: String): this.type = set("activeDescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def domRef(value: Ref[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def domRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("domRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def domRefNull: this.type = set("domRef", null)
    
    @scala.inline
    def domRefReactRef(value: ReactRef[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
    
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
    def onInputKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): this.type = set("onInputKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSearchSubmit(value: /* searchText */ String => Unit): this.type = set("onSearchSubmit", js.Any.fromFunction1(value))
    
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
    def tokenWithEnter(value: Boolean): this.type = set("tokenWithEnter", value.asInstanceOf[js.Any])
  }
  
  type Props = SelectorProps with RefAttributes[RefSelectorProps]
  
  def withProps(p: SelectorProps with RefAttributes[RefSelectorProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
