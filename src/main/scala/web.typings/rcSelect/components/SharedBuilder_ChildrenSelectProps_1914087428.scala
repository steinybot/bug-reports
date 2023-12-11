package web.typings.rcSelect.components

import web.typings.StBuildingComponent
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcSelect.anon.ClearIcon
import web.typings.rcSelect.anon.Index
import web.typings.rcSelect.libBaseSelectMod.CustomTagProps
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.FlattenOptionData
import web.typings.rcSelect.libInterfaceMod.Placement
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.libSelectMod.ArrayElementType
import web.typings.rcSelect.libSelectMod.BaseOptionType
import web.typings.rcSelect.libSelectMod.DefaultOptionType
import web.typings.rcSelect.libSelectMod.FieldNames
import web.typings.rcSelect.libSelectMod.FilterFunc
import web.typings.rcSelect.rcSelectStrings.`additions removals`
import web.typings.rcSelect.rcSelectStrings.`additions text`
import web.typings.rcSelect.rcSelectStrings.`inline`
import web.typings.rcSelect.rcSelectStrings.`removals additions`
import web.typings.rcSelect.rcSelectStrings.`removals text`
import web.typings.rcSelect.rcSelectStrings.`text additions`
import web.typings.rcSelect.rcSelectStrings.`text removals`
import web.typings.rcSelect.rcSelectStrings.additions
import web.typings.rcSelect.rcSelectStrings.all
import web.typings.rcSelect.rcSelectStrings.ascending
import web.typings.rcSelect.rcSelectStrings.assertive
import web.typings.rcSelect.rcSelectStrings.both
import web.typings.rcSelect.rcSelectStrings.click
import web.typings.rcSelect.rcSelectStrings.combobox
import web.typings.rcSelect.rcSelectStrings.copy
import web.typings.rcSelect.rcSelectStrings.date
import web.typings.rcSelect.rcSelectStrings.descending
import web.typings.rcSelect.rcSelectStrings.dialog
import web.typings.rcSelect.rcSelectStrings.execute
import web.typings.rcSelect.rcSelectStrings.focus
import web.typings.rcSelect.rcSelectStrings.grammar
import web.typings.rcSelect.rcSelectStrings.grid
import web.typings.rcSelect.rcSelectStrings.horizontal
import web.typings.rcSelect.rcSelectStrings.link
import web.typings.rcSelect.rcSelectStrings.list
import web.typings.rcSelect.rcSelectStrings.listbox
import web.typings.rcSelect.rcSelectStrings.location
import web.typings.rcSelect.rcSelectStrings.ltr
import web.typings.rcSelect.rcSelectStrings.menu
import web.typings.rcSelect.rcSelectStrings.mixed
import web.typings.rcSelect.rcSelectStrings.move
import web.typings.rcSelect.rcSelectStrings.multiple
import web.typings.rcSelect.rcSelectStrings.none
import web.typings.rcSelect.rcSelectStrings.off
import web.typings.rcSelect.rcSelectStrings.other
import web.typings.rcSelect.rcSelectStrings.page
import web.typings.rcSelect.rcSelectStrings.polite
import web.typings.rcSelect.rcSelectStrings.popup
import web.typings.rcSelect.rcSelectStrings.removals
import web.typings.rcSelect.rcSelectStrings.responsive
import web.typings.rcSelect.rcSelectStrings.rtl
import web.typings.rcSelect.rcSelectStrings.spelling
import web.typings.rcSelect.rcSelectStrings.step
import web.typings.rcSelect.rcSelectStrings.tags
import web.typings.rcSelect.rcSelectStrings.text
import web.typings.rcSelect.rcSelectStrings.time
import web.typings.rcSelect.rcSelectStrings.tree
import web.typings.rcSelect.rcSelectStrings.vertical
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.global.JSX.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
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

@scala.inline
class SharedBuilder_ChildrenSelectProps_1914087428[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
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
  def backfill(value: Boolean): this.type = set("backfill", value.asInstanceOf[js.Any])
  
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
  def defaultActiveFirstOption(value: Boolean): this.type = set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValueNull: this.type = set("defaultValue", null)
  
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
  def fieldNames(value: FieldNames): this.type = set("fieldNames", value.asInstanceOf[js.Any])
  
  @scala.inline
  def filterOption(value: Boolean | FilterFunc[DefaultOptionType]): this.type = set("filterOption", value.asInstanceOf[js.Any])
  
  @scala.inline
  def filterOptionFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[DefaultOptionType]) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
  
  @scala.inline
  def filterSort(value: (DefaultOptionType, DefaultOptionType) => Double): this.type = set("filterSort", js.Any.fromFunction2(value))
  
  @scala.inline
  def getInputElement(value: () => Element): this.type = set("getInputElement", js.Any.fromFunction0(value))
  
  @scala.inline
  def getPopupContainer(value: /* props */ Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  @scala.inline
  def getRawInputElement(value: () => Element): this.type = set("getRawInputElement", js.Any.fromFunction0(value))
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelInValue(value: Boolean): this.type = set("labelInValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def listHeight(value: Double): this.type = set("listHeight", value.asInstanceOf[js.Any])
  
  @scala.inline
  def listItemHeight(value: Double): this.type = set("listItemHeight", value.asInstanceOf[js.Any])
  
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
  def menuItemSelectedIcon(value: RenderNode): this.type = set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuItemSelectedIconFunction1(value: /* props */ Any => ReactElement): this.type = set("menuItemSelectedIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def menuItemSelectedIconReactElement(value: ReactElement): this.type = set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mode(value: combobox | multiple | tags): this.type = set("mode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def notFoundContent(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChange(value: (Any, /* option */ DefaultOptionType | js.Array[DefaultOptionType]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDeselect(value: (ArrayElementType[Any], DefaultOptionType) => Unit): this.type = set("onDeselect", js.Any.fromFunction2(value))
  
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
  def onSearch(value: /* value */ String => Unit): this.type = set("onSearch", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSelect(value: (ArrayElementType[Any], DefaultOptionType) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
  
  @scala.inline
  def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optionFilterProp(value: String): this.type = set("optionFilterProp", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optionLabelProp(value: String): this.type = set("optionLabelProp", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optionRender(value: (/* oriOption */ FlattenOptionData[BaseOptionType], /* info */ Index) => ReactElement): this.type = set("optionRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def options(value: js.Array[DefaultOptionType]): this.type = set("options", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optionsVarargs(value: DefaultOptionType*): this.type = set("options", js.Array(value :_*))
  
  @scala.inline
  def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def removeIcon(value: RenderNode): this.type = set("removeIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def removeIconFunction1(value: /* props */ Any => ReactElement): this.type = set("removeIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def searchValue(value: String): this.type = set("searchValue", value.asInstanceOf[js.Any])
  
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
  
  @scala.inline
  def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def valueNull: this.type = set("value", null)
  
  @scala.inline
  def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
}
