package web.typings.rcSelect

import web.typings.rcSelect.anon.Children
import web.typings.rcSelect.anon.Index
import web.typings.rcSelect.anon.OmitDefaultOptionTypechil
import web.typings.rcSelect.anon.OptGroup
import web.typings.rcSelect.anon.Selected
import web.typings.rcSelect.anon.`0`
import web.typings.rcSelect.libBaseSelectMod.BaseSelectPropsWithoutPrivate
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.FlattenOptionData
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.rcSelectStrings.combobox
import web.typings.rcSelect.rcSelectStrings.multiple
import web.typings.rcSelect.rcSelectStrings.tags
import web.typings.react.mod.Key
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectMod extends Shortcut {
  
  @JSImport("rc-select/lib/Select", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children with (SelectProps[Any, DefaultOptionType]), ReactElement]) with OptGroup = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<infer E> ? E : T
    }}}
    */
  type ArrayElementType[T] = T
  
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
  
  @js.native
  trait DefaultOptionType
    extends StObject
       with BaseOptionType {
    
    var children: js.UndefOr[js.Array[OmitDefaultOptionTypechil]] = js.native
    
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
      def setChildren(value: js.Array[OmitDefaultOptionTypechil]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: OmitDefaultOptionTypechil*): Self = StObject.set(x, "children", js.Array(value :_*))
      
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
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcSelect.libSelectMod.RawValueType
    - `web.typings`.rcSelect.libSelectMod.LabelInValueType
    - `web.typings`.rcSelect.libInterfaceMod.DisplayValueType
    - js.Array[
  `web.typings`.rcSelect.libSelectMod.RawValueType | `web.typings`.rcSelect.libSelectMod.LabelInValueType | `web.typings`.rcSelect.libInterfaceMod.DisplayValueType]
  */
  type DraftValueType = _DraftValueType | (js.Array[RawValueType | LabelInValueType | DisplayValueType]) | RawValueType
  
  @js.native
  trait FieldNames extends StObject {
    
    var groupLabel: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[String] = js.native
    
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
      def setGroupLabel(value: String): Self = StObject.set(x, "groupLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupLabelUndefined: Self = StObject.set(x, "groupLabel", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type FilterFunc[OptionType] = js.Function2[/* inputValue */ String, /* option */ js.UndefOr[OptionType], Boolean]
  
  @js.native
  trait LabelInValueType
    extends StObject
       with _DraftValueType {
    
    /** @deprecated `key` is useless since it should always same as `value` */
    var key: js.UndefOr[Key] = js.native
    
    var label: ReactElement = js.native
    
    var value: RawValueType = js.native
  }
  object LabelInValueType {
    
    @scala.inline
    def apply(label: ReactElement, value: RawValueType): LabelInValueType = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelInValueType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: LabelInValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OnActiveValue = js.Function3[/* active */ RawValueType, /* index */ Double, /* info */ js.UndefOr[`0`], Unit]
  
  type OnInternalSelect = js.Function2[/* value */ RawValueType, /* info */ Selected, Unit]
  
  type RawValueType = String | Double
  
  type SelectHandler[ValueType, OptionType /* <: BaseOptionType */] = js.Function2[/* value */ ValueType, /* option */ OptionType, Unit]
  
  @js.native
  trait SelectProps[ValueType, OptionType /* <: BaseOptionType */]
    extends StObject
       with BaseSelectPropsWithoutPrivate {
    
    var autoClearSearchValue: js.UndefOr[Boolean] = js.native
    
    var backfill: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[ValueType | Null] = js.native
    
    var fieldNames: js.UndefOr[FieldNames] = js.native
    
    /**
      * In Select, `false` means do nothing.
      * In TreeSelect, `false` will highlight match item.
      * It's by design.
      */
    var filterOption: js.UndefOr[Boolean | FilterFunc[OptionType]] = js.native
    
    var filterSort: js.UndefOr[js.Function2[/* optionA */ OptionType, /* optionB */ OptionType, Double]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    /** @deprecated Use `searchValue` instead */
    var inputValue: js.UndefOr[String] = js.native
    
    var labelInValue: js.UndefOr[Boolean] = js.native
    
    var listHeight: js.UndefOr[Double] = js.native
    
    var listItemHeight: js.UndefOr[Double] = js.native
    
    var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.native
    
    @JSName("mode")
    var mode_SelectProps: js.UndefOr[combobox | multiple | tags] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* value */ ValueType, /* option */ OptionType | js.Array[OptionType], Unit]
      ] = js.native
    
    var onDeselect: js.UndefOr[SelectHandler[ArrayElementType[ValueType], OptionType]] = js.native
    
    var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onSelect: js.UndefOr[SelectHandler[ArrayElementType[ValueType], OptionType]] = js.native
    
    var optionFilterProp: js.UndefOr[String] = js.native
    
    var optionLabelProp: js.UndefOr[String] = js.native
    
    var optionRender: js.UndefOr[
        js.Function2[/* oriOption */ FlattenOptionData[BaseOptionType], /* info */ Index, ReactElement]
      ] = js.native
    
    var options: js.UndefOr[js.Array[OptionType]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var searchValue: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[ValueType | Null] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object SelectProps {
    
    @scala.inline
    def apply[ValueType, OptionType /* <: BaseOptionType */](): SelectProps[ValueType, OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps[ValueType, OptionType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SelectProps[_, _], ValueType, OptionType /* <: BaseOptionType */] (val x: Self with (SelectProps[ValueType, OptionType])) extends AnyVal {
      
      @scala.inline
      def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
      
      @scala.inline
      def setBackfill(value: Boolean): Self = StObject.set(x, "backfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfillUndefined: Self = StObject.set(x, "backfill", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultActiveFirstOption(value: Boolean): Self = StObject.set(x, "defaultActiveFirstOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveFirstOptionUndefined: Self = StObject.set(x, "defaultActiveFirstOption", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      @scala.inline
      def setFilterOption(value: Boolean | FilterFunc[OptionType]): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptionFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[OptionType]) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setFilterSort(value: (/* optionA */ OptionType, /* optionB */ OptionType) => Double): Self = StObject.set(x, "filterSort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterSortUndefined: Self = StObject.set(x, "filterSort", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelInValueUndefined: Self = StObject.set(x, "labelInValue", js.undefined)
      
      @scala.inline
      def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      @scala.inline
      def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      @scala.inline
      def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemSelectedIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuItemSelectedIconReactElement(value: ReactElement): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
      
      @scala.inline
      def setMode(value: combobox | multiple | tags): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ ValueType, /* option */ OptionType | js.Array[OptionType]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDeselect(value: (ArrayElementType[ValueType], OptionType) => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* value */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (ArrayElementType[ValueType], OptionType) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOptionFilterProp(value: String): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionFilterPropUndefined: Self = StObject.set(x, "optionFilterProp", js.undefined)
      
      @scala.inline
      def setOptionLabelProp(value: String): Self = StObject.set(x, "optionLabelProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionLabelPropUndefined: Self = StObject.set(x, "optionLabelProp", js.undefined)
      
      @scala.inline
      def setOptionRender(value: (/* oriOption */ FlattenOptionData[BaseOptionType], /* info */ Index) => ReactElement): Self = StObject.set(x, "optionRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionRenderUndefined: Self = StObject.set(x, "optionRender", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: OptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  trait _DraftValueType extends StObject
  object _DraftValueType {
    
    @scala.inline
    def DisplayValueType(): web.typings.rcSelect.libInterfaceMod.DisplayValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[web.typings.rcSelect.libInterfaceMod.DisplayValueType]
    }
    
    @scala.inline
    def LabelInValueType(label: ReactElement, value: RawValueType): web.typings.rcSelect.libSelectMod.LabelInValueType = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcSelect.libSelectMod.LabelInValueType]
    }
  }
  
  type _To = (js.Function1[/* props */ Children with (SelectProps[Any, DefaultOptionType]), ReactElement]) with OptGroup
  
  /* This means you don't have to write `default`, but can instead just say `libSelectMod.foo` */
  override def _to: (js.Function1[/* props */ Children with (SelectProps[Any, DefaultOptionType]), ReactElement]) with OptGroup = default
}
