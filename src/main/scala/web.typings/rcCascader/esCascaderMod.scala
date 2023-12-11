package web.typings.rcCascader

import web.typings.rcCascader.anon.DisplayName
import web.typings.rcCascader.anon.OnChange
import web.typings.rcCascader.anon.Ref
import web.typings.rcCascader.rcCascaderBooleans.`false`
import web.typings.rcCascader.rcCascaderBooleans.`true`
import web.typings.rcCascader.rcCascaderStrings.`additions removals`
import web.typings.rcCascader.rcCascaderStrings.`additions text`
import web.typings.rcCascader.rcCascaderStrings.`inline`
import web.typings.rcCascader.rcCascaderStrings.`removals additions`
import web.typings.rcCascader.rcCascaderStrings.`removals text`
import web.typings.rcCascader.rcCascaderStrings.`text additions`
import web.typings.rcCascader.rcCascaderStrings.`text removals`
import web.typings.rcCascader.rcCascaderStrings.additions
import web.typings.rcCascader.rcCascaderStrings.all
import web.typings.rcCascader.rcCascaderStrings.ascending
import web.typings.rcCascader.rcCascaderStrings.assertive
import web.typings.rcCascader.rcCascaderStrings.both
import web.typings.rcCascader.rcCascaderStrings.click
import web.typings.rcCascader.rcCascaderStrings.copy
import web.typings.rcCascader.rcCascaderStrings.date
import web.typings.rcCascader.rcCascaderStrings.descending
import web.typings.rcCascader.rcCascaderStrings.dialog
import web.typings.rcCascader.rcCascaderStrings.execute
import web.typings.rcCascader.rcCascaderStrings.focus
import web.typings.rcCascader.rcCascaderStrings.grammar
import web.typings.rcCascader.rcCascaderStrings.grid
import web.typings.rcCascader.rcCascaderStrings.horizontal
import web.typings.rcCascader.rcCascaderStrings.hover
import web.typings.rcCascader.rcCascaderStrings.link
import web.typings.rcCascader.rcCascaderStrings.list
import web.typings.rcCascader.rcCascaderStrings.listbox
import web.typings.rcCascader.rcCascaderStrings.location
import web.typings.rcCascader.rcCascaderStrings.ltr
import web.typings.rcCascader.rcCascaderStrings.menu
import web.typings.rcCascader.rcCascaderStrings.mixed
import web.typings.rcCascader.rcCascaderStrings.move
import web.typings.rcCascader.rcCascaderStrings.none
import web.typings.rcCascader.rcCascaderStrings.off
import web.typings.rcCascader.rcCascaderStrings.onChange
import web.typings.rcCascader.rcCascaderStrings.other
import web.typings.rcCascader.rcCascaderStrings.page
import web.typings.rcCascader.rcCascaderStrings.polite
import web.typings.rcCascader.rcCascaderStrings.popup
import web.typings.rcCascader.rcCascaderStrings.removals
import web.typings.rcCascader.rcCascaderStrings.responsive
import web.typings.rcCascader.rcCascaderStrings.rtl
import web.typings.rcCascader.rcCascaderStrings.spelling
import web.typings.rcCascader.rcCascaderStrings.step
import web.typings.rcCascader.rcCascaderStrings.text
import web.typings.rcCascader.rcCascaderStrings.time
import web.typings.rcCascader.rcCascaderStrings.tree
import web.typings.rcCascader.rcCascaderStrings.vertical
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcSelect.anon.ClearIcon
import web.typings.rcSelect.libBaseSelectMod.CustomTagProps
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.Placement
import web.typings.rcSelect.libInterfaceMod.RenderDOMFunc
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.PropsWithChildren
import web.typings.react.mod.UIEventHandler
import web.typings.react.mod.global.JSX.Element
import web.typings.std.Omit
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCascaderMod extends Shortcut {
  
  @JSImport("rc-cascader/es/Cascader", JSImport.Default)
  @js.native
  val default: (js.Function1[
    /* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] with Ref, 
    ReactElement
  ]) with DisplayName = js.native
  
  /* Inlined parent std.Omit<rc-select.rc-select.BaseSelectPropsWithoutPrivate, 'tokenSeparators' | 'labelInValue' | 'mode' | 'showSearch'> */
  @js.native
  trait BaseCascaderProps[OptionType /* <: BaseOptionType */] extends StObject {
    
    var allowClear: js.UndefOr[Boolean | ClearIcon] = js.native
    
    var animation: js.UndefOr[String] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-braillelabel`: js.UndefOr[String] = js.native
    
    var `aria-brailleroledescription`: js.UndefOr[String] = js.native
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colindextext`: js.UndefOr[String] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-description`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Booleanish] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowindextext`: js.UndefOr[String] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoClearSearchValue: js.UndefOr[Boolean] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
    
    var changeOnSelect: js.UndefOr[Boolean] = js.native
    
    var checkable: js.UndefOr[Boolean | ReactElement] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearIcon: js.UndefOr[RenderNode] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[ValueType] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayRender: js.UndefOr[
        js.Function2[
          /* label */ js.Array[String], 
          /* selectedOptions */ js.UndefOr[js.Array[OptionType]], 
          ReactElement
        ]
      ] = js.native
    
    var dropdownAlign: js.UndefOr[AlignType] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.native
    
    var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.native
    
    /** @private Internal usage. Do not use in your production. */
    var dropdownPrefixCls: js.UndefOr[String] = js.native
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.native
    
    var dropdownStyle: js.UndefOr[CSSProperties] = js.native
    
    var expandIcon: js.UndefOr[ReactElement] = js.native
    
    var expandTrigger: js.UndefOr[hover | click] = js.native
    
    var fieldNames: js.UndefOr[FieldNames] = js.native
    
    var getInputElement: js.UndefOr[js.Function0[Element]] = js.native
    
    var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.native
    
    var getRawInputElement: js.UndefOr[js.Function0[Element]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[OptionType], Unit]] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var loadingIcon: js.UndefOr[ReactElement] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var maxTagCount: js.UndefOr[Double | responsive] = js.native
    
    var maxTagPlaceholder: js.UndefOr[
        ReactElement | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactElement])
      ] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    var notFoundContent: js.UndefOr[ReactElement] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
    
    var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
    
    /** @deprecated Use `onDropdownVisibleChange` instead */
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var options: js.UndefOr[js.Array[OptionType]] = js.native
    
    var placeholder: js.UndefOr[ReactElement] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    /** @deprecated Use `dropdownClassName` instead */
    var popupClassName: js.UndefOr[String] = js.native
    
    /** @deprecated Use `placement` instead */
    var popupPlacement: js.UndefOr[Placement] = js.native
    
    /** @deprecated Use `open` instead */
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var searchValue: js.UndefOr[String] = js.native
    
    var showAction: js.UndefOr[js.Array[focus | click]] = js.native
    
    var showCheckedStrategy: js.UndefOr[ShowCheckedStrategy] = js.native
    
    var showSearch: js.UndefOr[Boolean | ShowSearchType[OptionType]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffixIcon: js.UndefOr[RenderNode] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[ValueType] = js.native
  }
  object BaseCascaderProps {
    
    @scala.inline
    def apply[OptionType /* <: BaseOptionType */](): BaseCascaderProps[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseCascaderProps[OptionType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BaseCascaderProps[_], OptionType /* <: BaseOptionType */] (val x: Self with BaseCascaderProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean | ClearIcon): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-braillelabel`(value: String): Self = StObject.set(x, "aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-braillelabelUndefined`: Self = StObject.set(x, "aria-braillelabel", js.undefined)
      
      @scala.inline
      def `setAria-brailleroledescription`(value: String): Self = StObject.set(x, "aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-brailleroledescriptionUndefined`: Self = StObject.set(x, "aria-brailleroledescription", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colindextext`(value: String): Self = StObject.set(x, "aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindextextUndefined`: Self = StObject.set(x, "aria-colindextext", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-description`(value: String): Self = StObject.set(x, "aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-descriptionUndefined`: Self = StObject.set(x, "aria-description", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowindextext`(value: String): Self = StObject.set(x, "aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindextextUndefined`: Self = StObject.set(x, "aria-rowindextext", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setChangeOnSelect(value: Boolean): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
      @scala.inline
      def setCheckable(value: Boolean | ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableReactElement(value: ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChoiceTransitionName(value: String): Self = StObject.set(x, "choiceTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoiceTransitionNameUndefined: Self = StObject.set(x, "choiceTransitionName", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: RenderNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearIconReactElement(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (Double | SingleValueType | String)*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplayRender(
        value: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[OptionType]]) => ReactElement
      ): Self = StObject.set(x, "displayRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisplayRenderUndefined: Self = StObject.set(x, "displayRender", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      @scala.inline
      def setDropdownMenuColumnStyle(value: CSSProperties): Self = StObject.set(x, "dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMenuColumnStyleUndefined: Self = StObject.set(x, "dropdownMenuColumnStyle", js.undefined)
      
      @scala.inline
      def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPrefixClsUndefined: Self = StObject.set(x, "dropdownPrefixCls", js.undefined)
      
      @scala.inline
      def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      @scala.inline
      def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setExpandTrigger(value: hover | click): Self = StObject.set(x, "expandTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandTriggerUndefined: Self = StObject.set(x, "expandTrigger", js.undefined)
      
      @scala.inline
      def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      @scala.inline
      def setGetInputElement(value: () => Element): Self = StObject.set(x, "getInputElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInputElementUndefined: Self = StObject.set(x, "getInputElement", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* props */ Any => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetRawInputElement(value: () => Element): Self = StObject.set(x, "getRawInputElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRawInputElementUndefined: Self = StObject.set(x, "getRawInputElement", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLoadData(value: /* selectOptions */ js.Array[OptionType] => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIcon(value: ReactElement): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxTagCount(value: Double | responsive): Self = StObject.set(x, "maxTagCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagCountUndefined: Self = StObject.set(x, "maxTagCount", js.undefined)
      
      @scala.inline
      def setMaxTagPlaceholder(value: ReactElement | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactElement])): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[DisplayValueType] => ReactElement): Self = StObject.set(x, "maxTagPlaceholder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxTagPlaceholderReactElement(value: ReactElement): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagPlaceholderUndefined: Self = StObject.set(x, "maxTagPlaceholder", js.undefined)
      
      @scala.inline
      def setMaxTagTextLength(value: Double): Self = StObject.set(x, "maxTagTextLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagTextLengthUndefined: Self = StObject.set(x, "maxTagTextLength", js.undefined)
      
      @scala.inline
      def setNotFoundContent(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDropdownVisibleChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onDropdownVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropdownVisibleChangeUndefined: Self = StObject.set(x, "onDropdownVisibleChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInputKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputKeyDownUndefined: Self = StObject.set(x, "onInputKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnPopupScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPopupScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupScrollUndefined: Self = StObject.set(x, "onPopupScroll", js.undefined)
      
      @scala.inline
      def setOnPopupVisibleChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* value */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: OptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupPlacement(value: Placement): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: RenderNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveIconReactElement(value: ReactElement): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      @scala.inline
      def setShowAction(value: js.Array[focus | click]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      @scala.inline
      def setShowActionVarargs(value: (focus | click)*): Self = StObject.set(x, "showAction", js.Array(value :_*))
      
      @scala.inline
      def setShowCheckedStrategy(value: ShowCheckedStrategy): Self = StObject.set(x, "showCheckedStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckedStrategyUndefined: Self = StObject.set(x, "showCheckedStrategy", js.undefined)
      
      @scala.inline
      def setShowSearch(value: Boolean | ShowSearchType[OptionType]): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: RenderNode): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "suffixIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuffixIconReactElement(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = StObject.set(x, "tagRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagRenderUndefined: Self = StObject.set(x, "tagRender", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (Double | SingleValueType | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BaseOptionType
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object BaseOptionType {
    
    @scala.inline
    def apply(): BaseOptionType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptionType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BaseOptionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcCascader.esCascaderMod.SingleCascaderProps[OptionType]
    - `web.typings`.rcCascader.esCascaderMod.MultipleCascaderProps[OptionType]
  */
  trait CascaderProps[OptionType /* <: BaseOptionType */] extends StObject
  object CascaderProps {
    
    @scala.inline
    def MultipleCascaderProps[OptionType /* <: BaseOptionType */](checkable: `true` | ReactElement): web.typings.rcCascader.esCascaderMod.MultipleCascaderProps[OptionType] = {
      val __obj = js.Dynamic.literal(checkable = checkable.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcCascader.esCascaderMod.MultipleCascaderProps[OptionType]]
    }
    
    @scala.inline
    def SingleCascaderProps[OptionType /* <: BaseOptionType */](): web.typings.rcCascader.esCascaderMod.SingleCascaderProps[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[web.typings.rcCascader.esCascaderMod.SingleCascaderProps[OptionType]]
    }
  }
  
  /* Inlined std.Omit<rc-select.rc-select.BaseSelectRef, 'scrollTo'> */
  @js.native
  trait CascaderRef extends StObject {
    
    var blur: js.Function0[Unit] = js.native
    
    var focus: js.Function0[Unit] = js.native
  }
  object CascaderRef {
    
    @scala.inline
    def apply(blur: () => Unit, focus: () => Unit): CascaderRef = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[CascaderRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CascaderRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DefaultOptionType
    extends StObject
       with BaseOptionType {
    
    var children: js.UndefOr[js.Array[DefaultOptionType]] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var label: ReactElement = js.native
    
    var value: js.UndefOr[String | Double | Null] = js.native
  }
  object DefaultOptionType {
    
    @scala.inline
    def apply(label: ReactElement): DefaultOptionType = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptionType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DefaultOptionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: DefaultOptionType*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait FieldNames extends StObject {
    
    var children: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object FieldNames {
    
    @scala.inline
    def apply(): FieldNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNames]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FieldNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type InternalCascaderProps[OptionType /* <: BaseOptionType */] = (Omit[SingleCascaderProps[OptionType] | MultipleCascaderProps[OptionType], onChange]) with OnChange[OptionType]
  
  /* Inlined parent std.Required<rc-cascader.rc-cascader/es/Cascader.FieldNames> */
  @js.native
  trait InternalFieldNames extends StObject {
    
    var children: String = js.native
    
    var key: String = js.native
    
    var label: String = js.native
    
    var value: String = js.native
  }
  object InternalFieldNames {
    
    @scala.inline
    def apply(children: String, key: String, label: String, value: String): InternalFieldNames = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalFieldNames]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalFieldNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultipleCascaderProps[OptionType /* <: BaseOptionType */]
    extends StObject
       with BaseCascaderProps[OptionType]
       with CascaderProps[OptionType] {
    
    @JSName("checkable")
    var checkable_MultipleCascaderProps: `true` | ReactElement = js.native
    
    var onChange: js.UndefOr[OnMultipleChange[OptionType]] = js.native
  }
  object MultipleCascaderProps {
    
    @scala.inline
    def apply[OptionType /* <: BaseOptionType */](checkable: `true` | ReactElement): MultipleCascaderProps[OptionType] = {
      val __obj = js.Dynamic.literal(checkable = checkable.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleCascaderProps[OptionType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MultipleCascaderProps[_], OptionType /* <: BaseOptionType */] (val x: Self with MultipleCascaderProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: `true` | ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableReactElement(value: ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(
        value: (/* value */ js.Array[SingleValueType], /* selectOptions */ js.Array[js.Array[OptionType]]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  type OnMultipleChange[OptionType] = js.Function2[
    /* value */ js.Array[SingleValueType], 
    /* selectOptions */ js.Array[js.Array[OptionType]], 
    Unit
  ]
  
  type OnSingleChange[OptionType] = js.Function2[/* value */ SingleValueType, /* selectOptions */ js.Array[OptionType], Unit]
  
  type ShowCheckedStrategy = /* "SHOW_PARENT" */ String
  
  @js.native
  trait ShowSearchType[OptionType /* <: BaseOptionType */] extends StObject {
    
    var filter: js.UndefOr[
        js.Function3[
          /* inputValue */ String, 
          /* options */ js.Array[OptionType], 
          /* fieldNames */ FieldNames, 
          Boolean
        ]
      ] = js.native
    
    var limit: js.UndefOr[Double | `false`] = js.native
    
    var matchInputWidth: js.UndefOr[Boolean] = js.native
    
    var render: js.UndefOr[
        js.Function4[
          /* inputValue */ String, 
          /* path */ js.Array[OptionType], 
          /* prefixCls */ String, 
          /* fieldNames */ FieldNames, 
          ReactElement
        ]
      ] = js.native
    
    var sort: js.UndefOr[
        js.Function4[
          /* a */ js.Array[OptionType], 
          /* b */ js.Array[OptionType], 
          /* inputValue */ String, 
          /* fieldNames */ FieldNames, 
          Double
        ]
      ] = js.native
  }
  object ShowSearchType {
    
    @scala.inline
    def apply[OptionType /* <: BaseOptionType */](): ShowSearchType[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowSearchType[OptionType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ShowSearchType[_], OptionType /* <: BaseOptionType */] (val x: Self with ShowSearchType[OptionType]) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* inputValue */ String, /* options */ js.Array[OptionType], /* fieldNames */ FieldNames) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLimit(value: Double | `false`): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMatchInputWidth(value: Boolean): Self = StObject.set(x, "matchInputWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchInputWidthUndefined: Self = StObject.set(x, "matchInputWidth", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* inputValue */ String, /* path */ js.Array[OptionType], /* prefixCls */ String, /* fieldNames */ FieldNames) => ReactElement
      ): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSort(
        value: (/* a */ js.Array[OptionType], /* b */ js.Array[OptionType], /* inputValue */ String, /* fieldNames */ FieldNames) => Double
      ): Self = StObject.set(x, "sort", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  @js.native
  trait SingleCascaderProps[OptionType /* <: BaseOptionType */]
    extends StObject
       with BaseCascaderProps[OptionType]
       with CascaderProps[OptionType] {
    
    @JSName("checkable")
    var checkable_SingleCascaderProps: js.UndefOr[`false`] = js.native
    
    var onChange: js.UndefOr[OnSingleChange[OptionType]] = js.native
  }
  object SingleCascaderProps {
    
    @scala.inline
    def apply[OptionType /* <: BaseOptionType */](): SingleCascaderProps[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleCascaderProps[OptionType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SingleCascaderProps[_], OptionType /* <: BaseOptionType */] (val x: Self with SingleCascaderProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: `false`): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ SingleValueType, /* selectOptions */ js.Array[OptionType]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  type SingleValueType = js.Array[String | Double]
  
  type ValueType = SingleValueType | js.Array[SingleValueType]
  
  type _To = (js.Function1[
    /* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] with Ref, 
    ReactElement
  ]) with DisplayName
  
  /* This means you don't have to write `default`, but can instead just say `esCascaderMod.foo` */
  override def _to: (js.Function1[
    /* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] with Ref, 
    ReactElement
  ]) with DisplayName = default
}
