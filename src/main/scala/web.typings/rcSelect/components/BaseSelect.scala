package web.typings.rcSelect.components

import web.typings.StBuildingComponent
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcSelect.anon.ClearIcon
import web.typings.rcSelect.anon.Source
import web.typings.rcSelect.anon.Type
import web.typings.rcSelect.libBaseSelectMod.BaseSelectProps
import web.typings.rcSelect.libBaseSelectMod.BaseSelectRef
import web.typings.rcSelect.libBaseSelectMod.CustomTagProps
import web.typings.rcSelect.libBaseSelectMod.RefOptionListProps
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.Mode
import web.typings.rcSelect.libInterfaceMod.Placement
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.rcSelectStrings.click
import web.typings.rcSelect.rcSelectStrings.focus
import web.typings.rcSelect.rcSelectStrings.ltr
import web.typings.rcSelect.rcSelectStrings.responsive
import web.typings.rcSelect.rcSelectStrings.rtl
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.PropsWithoutRef
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.global.JSX.Element
import web.typings.react.reactStrings.`additions removals`
import web.typings.react.reactStrings.`additions text`
import web.typings.react.reactStrings.`inline`
import web.typings.react.reactStrings.`removals additions`
import web.typings.react.reactStrings.`removals text`
import web.typings.react.reactStrings.`text additions`
import web.typings.react.reactStrings.`text removals`
import web.typings.react.reactStrings.additions
import web.typings.react.reactStrings.all
import web.typings.react.reactStrings.ascending
import web.typings.react.reactStrings.assertive
import web.typings.react.reactStrings.both
import web.typings.react.reactStrings.copy
import web.typings.react.reactStrings.date
import web.typings.react.reactStrings.descending
import web.typings.react.reactStrings.dialog
import web.typings.react.reactStrings.execute
import web.typings.react.reactStrings.grammar
import web.typings.react.reactStrings.grid
import web.typings.react.reactStrings.horizontal
import web.typings.react.reactStrings.link
import web.typings.react.reactStrings.list
import web.typings.react.reactStrings.listbox
import web.typings.react.reactStrings.location
import web.typings.react.reactStrings.menu
import web.typings.react.reactStrings.mixed
import web.typings.react.reactStrings.move
import web.typings.react.reactStrings.none
import web.typings.react.reactStrings.off
import web.typings.react.reactStrings.other
import web.typings.react.reactStrings.page
import web.typings.react.reactStrings.polite
import web.typings.react.reactStrings.popup
import web.typings.react.reactStrings.removals
import web.typings.react.reactStrings.spelling
import web.typings.react.reactStrings.step
import web.typings.react.reactStrings.text
import web.typings.react.reactStrings.time
import web.typings.react.reactStrings.tree
import web.typings.react.reactStrings.vertical
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseSelect {
  
  @scala.inline
  def apply(
    OptionList: ReactComponentClass[PropsWithoutRef[Any] with RefAttributes[RefOptionListProps]],
    displayValues: js.Array[DisplayValueType],
    emptyOptions: Boolean,
    id: String,
    onDisplayValuesChange: (js.Array[DisplayValueType], Type) => Unit,
    onSearch: (String, Source) => Unit,
    prefixCls: String,
    searchValue: String
  ): Builder = {
    val __props = js.Dynamic.literal(OptionList = OptionList.asInstanceOf[js.Any], displayValues = displayValues.asInstanceOf[js.Any], emptyOptions = emptyOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onDisplayValuesChange = js.Any.fromFunction2(onDisplayValuesChange), onSearch = js.Any.fromFunction2(onSearch), prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BaseSelectProps with RefAttributes[BaseSelectRef]]))
  }
  
  @JSImport("rc-select", "BaseSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, BaseSelectRef] {
    
    @scala.inline
    def activeDescendantId(value: String): this.type = set("activeDescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeValue(value: String): this.type = set("activeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowClear(value: Boolean | ClearIcon): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-braillelabel`(value: String): this.type = set("aria-braillelabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-brailleroledescription`(value: String): this.type = set("aria-brailleroledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindextext`(value: String): this.type = set("aria-colindextext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-description`(value: String): this.type = set("aria-description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindextext`(value: String): this.type = set("aria-rowindextext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoClearSearchValue(value: Boolean): this.type = set("autoClearSearchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearIcon(value: RenderNode): this.type = set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearIconFunction1(value: /* props */ Any => ReactElement): this.type = set("clearIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownMatchSelectWidth(value: Boolean | Double): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownRender(value: /* menu */ ReactElement => ReactElement): this.type = set("dropdownRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def dropdownStyle(value: CSSProperties): this.type = set("dropdownStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getInputElement(value: () => Element): this.type = set("getInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def getPopupContainer(value: /* props */ Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def getRawInputElement(value: () => Element): this.type = set("getRawInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
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
    def mode(value: Mode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFoundContent(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def omitDomProps(value: js.Array[String]): this.type = set("omitDomProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def omitDomPropsVarargs(value: String*): this.type = set("omitDomProps", js.Array(value :_*))
    
    @scala.inline
    def onActiveValueChange(value: /* value */ String | Null => Unit): this.type = set("onActiveValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDropdownVisibleChange(value: /* open */ Boolean => Unit): this.type = set("onDropdownVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): this.type = set("onInputKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPopupScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): this.type = set("onPopupScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSearchSplit(value: /* words */ js.Array[String] => Unit): this.type = set("onSearchSplit", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIcon(value: RenderNode): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIconFunction1(value: /* props */ Any => ReactElement): this.type = set("removeIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showAction(value: js.Array[focus | click]): this.type = set("showAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showActionVarargs(value: (focus | click)*): this.type = set("showAction", js.Array(value :_*))
    
    @scala.inline
    def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffixIcon(value: RenderNode): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffixIconFunction1(value: /* props */ Any => ReactElement): this.type = set("suffixIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  }
  
  type Props = BaseSelectProps with RefAttributes[BaseSelectRef]
  
  def withProps(p: BaseSelectProps with RefAttributes[BaseSelectRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
