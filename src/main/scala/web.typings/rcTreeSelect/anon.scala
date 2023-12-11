package web.typings.rcTreeSelect

import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcSelect.anon.ClearIcon
import web.typings.rcSelect.libBaseSelectMod.BaseSelectRef
import web.typings.rcSelect.libBaseSelectMod.CustomTagProps
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.Placement
import web.typings.rcSelect.libInterfaceMod.RenderDOMFunc
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.libSelectMod.ArrayElementType
import web.typings.rcSelect.libSelectMod.SelectHandler
import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.IconType
import web.typings.rcTree.esTreeMod.ExpandAction
import web.typings.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import web.typings.rcTreeSelect.esTreeSelectMod.ChangeEventExtra
import web.typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import web.typings.rcTreeSelect.esTreeSelectMod.InternalFieldName
import web.typings.rcTreeSelect.esTreeSelectMod.LegacyDataNode
import web.typings.rcTreeSelect.esTreeSelectMod.RawValueType
import web.typings.rcTreeSelect.esTreeSelectMod.SimpleModeConfig
import web.typings.rcTreeSelect.esUtilsStrategyUtilMod.CheckedStrategy
import web.typings.rcTreeSelect.rcTreeSelectStrings.`additions removals`
import web.typings.rcTreeSelect.rcTreeSelectStrings.`additions text`
import web.typings.rcTreeSelect.rcTreeSelectStrings.`inline`
import web.typings.rcTreeSelect.rcTreeSelectStrings.`removals additions`
import web.typings.rcTreeSelect.rcTreeSelectStrings.`removals text`
import web.typings.rcTreeSelect.rcTreeSelectStrings.`text additions`
import web.typings.rcTreeSelect.rcTreeSelectStrings.`text removals`
import web.typings.rcTreeSelect.rcTreeSelectStrings.additions
import web.typings.rcTreeSelect.rcTreeSelectStrings.all
import web.typings.rcTreeSelect.rcTreeSelectStrings.ascending
import web.typings.rcTreeSelect.rcTreeSelectStrings.assertive
import web.typings.rcTreeSelect.rcTreeSelectStrings.both
import web.typings.rcTreeSelect.rcTreeSelectStrings.click
import web.typings.rcTreeSelect.rcTreeSelectStrings.copy
import web.typings.rcTreeSelect.rcTreeSelectStrings.date
import web.typings.rcTreeSelect.rcTreeSelectStrings.descending
import web.typings.rcTreeSelect.rcTreeSelectStrings.dialog
import web.typings.rcTreeSelect.rcTreeSelectStrings.execute
import web.typings.rcTreeSelect.rcTreeSelectStrings.focus
import web.typings.rcTreeSelect.rcTreeSelectStrings.grammar
import web.typings.rcTreeSelect.rcTreeSelectStrings.grid
import web.typings.rcTreeSelect.rcTreeSelectStrings.horizontal
import web.typings.rcTreeSelect.rcTreeSelectStrings.link
import web.typings.rcTreeSelect.rcTreeSelectStrings.list
import web.typings.rcTreeSelect.rcTreeSelectStrings.listbox
import web.typings.rcTreeSelect.rcTreeSelectStrings.location
import web.typings.rcTreeSelect.rcTreeSelectStrings.ltr
import web.typings.rcTreeSelect.rcTreeSelectStrings.menu
import web.typings.rcTreeSelect.rcTreeSelectStrings.mixed
import web.typings.rcTreeSelect.rcTreeSelectStrings.move
import web.typings.rcTreeSelect.rcTreeSelectStrings.none
import web.typings.rcTreeSelect.rcTreeSelectStrings.off
import web.typings.rcTreeSelect.rcTreeSelectStrings.other
import web.typings.rcTreeSelect.rcTreeSelectStrings.page
import web.typings.rcTreeSelect.rcTreeSelectStrings.polite
import web.typings.rcTreeSelect.rcTreeSelectStrings.popup
import web.typings.rcTreeSelect.rcTreeSelectStrings.removals
import web.typings.rcTreeSelect.rcTreeSelectStrings.responsive
import web.typings.rcTreeSelect.rcTreeSelectStrings.rtl
import web.typings.rcTreeSelect.rcTreeSelectStrings.spelling
import web.typings.rcTreeSelect.rcTreeSelectStrings.step
import web.typings.rcTreeSelect.rcTreeSelectStrings.text
import web.typings.rcTreeSelect.rcTreeSelectStrings.time
import web.typings.rcTreeSelect.rcTreeSelectStrings.tree
import web.typings.rcTreeSelect.rcTreeSelectStrings.vertical
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.Ref
import web.typings.react.mod.UIEventHandler
import web.typings.react.mod.global.JSX.Element
import web.typings.std.Map
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var ref: js.UndefOr[Ref[BaseSelectRef]] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[BaseSelectRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ BaseSelectRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[BaseSelectRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait FieldNames extends StObject {
    
    var fieldNames: InternalFieldName = js.native
    
    var filterTreeNode: js.UndefOr[
        Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ] = js.native
    
    var treeNodeFilterProp: String = js.native
  }
  object FieldNames {
    
    @scala.inline
    def apply(fieldNames: InternalFieldName, treeNodeFilterProp: String): FieldNames = {
      val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldNames]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FieldNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldNames(value: InternalFieldName): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTreeNode(
        value: Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ): Self = StObject.set(x, "filterTreeNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTreeNodeFunction2(value: (/* inputValue */ String, /* treeNode */ DefaultOptionType) => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      @scala.inline
      def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var _title: js.Array[String] = js.native
    
    var children: String = js.native
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(_title: js.Array[String], children: String, key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(_title = _title.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_title(value: js.Array[String]): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_titleVarargs(value: String*): Self = StObject.set(x, "_title", js.Array(value :_*))
    }
  }
  
  @js.native
  trait KeyEntities extends StObject {
    
    var keyEntities: Record[String, DataEntity[DataNode]] = js.native
    
    var valueEntities: Map[RawValueType, DataEntity[DataNode]] = js.native
  }
  object KeyEntities {
    
    @scala.inline
    def apply(
      keyEntities: Record[String, DataEntity[DataNode]],
      valueEntities: Map[RawValueType, DataEntity[DataNode]]
    ): KeyEntities = {
      val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any], valueEntities = valueEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyEntities]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: KeyEntities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyEntities(value: Record[String, DataEntity[DataNode]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueEntities(value: Map[RawValueType, DataEntity[DataNode]]): Self = StObject.set(x, "valueEntities", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SHOWALL extends StObject {
    
    var SHOW_ALL: /* "SHOW_ALL" */ String = js.native
    
    var SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
    
    var SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
    
    var TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  }
  object SHOWALL {
    
    @scala.inline
    def apply(
      SHOW_ALL: /* "SHOW_ALL" */ String,
      SHOW_CHILD: /* "SHOW_CHILD" */ String,
      SHOW_PARENT: /* "SHOW_PARENT" */ String,
      TreeNode: ReactComponentClass[TreeNodeProps]
    ): SHOWALL = {
      val __obj = js.Dynamic.literal(SHOW_ALL = SHOW_ALL.asInstanceOf[js.Any], SHOW_CHILD = SHOW_CHILD.asInstanceOf[js.Any], SHOW_PARENT = SHOW_PARENT.asInstanceOf[js.Any], TreeNode = TreeNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SHOWALL]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SHOWALL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSHOW_ALL(value: /* "SHOW_ALL" */ String): Self = StObject.set(x, "SHOW_ALL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHOW_CHILD(value: /* "SHOW_CHILD" */ String): Self = StObject.set(x, "SHOW_CHILD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHOW_PARENT(value: /* "SHOW_PARENT" */ String): Self = StObject.set(x, "SHOW_PARENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeNode(value: ReactComponentClass[TreeNodeProps]): Self = StObject.set(x, "TreeNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Selected extends StObject {
    
    var selected: Boolean = js.native
  }
  object Selected {
    
    @scala.inline
    def apply(selected: Boolean): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-tree-select.rc-tree-select/es/TreeSelect.TreeSelectProps<any, rc-tree-select.rc-tree-select/es/TreeSelect.DefaultOptionType> & {  searchPlaceholder :string | undefined} */
  @js.native
  trait TreeSelectPropsanyDefault extends StObject {
    
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
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearIcon: js.UndefOr[RenderNode] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[Any] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dropdownAlign: js.UndefOr[AlignType] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.native
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.native
    
    var dropdownStyle: js.UndefOr[CSSProperties] = js.native
    
    var fieldNames: js.UndefOr[web.typings.rcTreeSelect.esTreeSelectMod.FieldNames] = js.native
    
    var filterTreeNode: js.UndefOr[
        Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ] = js.native
    
    var getInputElement: js.UndefOr[js.Function0[Element]] = js.native
    
    var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.native
    
    var getRawInputElement: js.UndefOr[js.Function0[Element]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    /** @deprecated Use `searchValue` instead */
    var inputValue: js.UndefOr[String] = js.native
    
    var labelInValue: js.UndefOr[Boolean] = js.native
    
    var listHeight: js.UndefOr[Double] = js.native
    
    var listItemHeight: js.UndefOr[Double] = js.native
    
    var listItemScrollOffset: js.UndefOr[Double] = js.native
    
    var loadData: js.UndefOr[js.Function1[/* dataNode */ LegacyDataNode, js.Promise[Any]]] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var maxTagCount: js.UndefOr[Double | responsive] = js.native
    
    var maxTagPlaceholder: js.UndefOr[
        ReactElement | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactElement])
      ] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var notFoundContent: js.UndefOr[ReactElement] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ Any, 
          /* labelList */ js.Array[ReactElement], 
          /* extra */ ChangeEventExtra, 
          Unit
        ]
      ] = js.native
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDeselect: js.UndefOr[SelectHandler[ArrayElementType[Any], DefaultOptionType]] = js.native
    
    var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
    
    var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
    
    var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onSelect: js.UndefOr[SelectHandler[ArrayElementType[Any], DefaultOptionType]] = js.native
    
    var onTreeExpand: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[web.typings.react.mod.Key], Unit]] = js.native
    
    var onTreeLoad: js.UndefOr[js.Function1[/* loadedKeys */ js.Array[web.typings.react.mod.Key], Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var placeholder: js.UndefOr[ReactElement] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var searchPlaceholder: js.UndefOr[String] = js.native
    
    var searchValue: js.UndefOr[String] = js.native
    
    var showAction: js.UndefOr[js.Array[focus | click]] = js.native
    
    var showCheckedStrategy: js.UndefOr[CheckedStrategy] = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var showTreeIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffixIcon: js.UndefOr[RenderNode] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var treeCheckStrictly: js.UndefOr[Boolean] = js.native
    
    var treeCheckable: js.UndefOr[Boolean | ReactElement] = js.native
    
    var treeData: js.UndefOr[js.Array[DefaultOptionType]] = js.native
    
    var treeDataSimpleMode: js.UndefOr[Boolean | SimpleModeConfig] = js.native
    
    var treeDefaultExpandAll: js.UndefOr[Boolean] = js.native
    
    var treeDefaultExpandedKeys: js.UndefOr[js.Array[web.typings.react.mod.Key]] = js.native
    
    var treeExpandAction: js.UndefOr[ExpandAction] = js.native
    
    var treeExpandedKeys: js.UndefOr[js.Array[web.typings.react.mod.Key]] = js.native
    
    var treeIcon: js.UndefOr[IconType] = js.native
    
    var treeLine: js.UndefOr[Boolean] = js.native
    
    var treeLoadedKeys: js.UndefOr[js.Array[web.typings.react.mod.Key]] = js.native
    
    var treeMotion: js.UndefOr[Any] = js.native
    
    var treeNodeFilterProp: js.UndefOr[String] = js.native
    
    var treeNodeLabelProp: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Any] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object TreeSelectPropsanyDefault {
    
    @scala.inline
    def apply(): TreeSelectPropsanyDefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeSelectPropsanyDefault]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeSelectPropsanyDefault] (val x: Self) extends AnyVal {
      
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
      def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
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
      def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      @scala.inline
      def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      @scala.inline
      def setFieldNames(value: web.typings.rcTreeSelect.esTreeSelectMod.FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      @scala.inline
      def setFilterTreeNode(
        value: Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ): Self = StObject.set(x, "filterTreeNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTreeNodeFunction2(value: (/* inputValue */ String, /* treeNode */ DefaultOptionType) => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
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
      def setListItemScrollOffset(value: Double): Self = StObject.set(x, "listItemScrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemScrollOffsetUndefined: Self = StObject.set(x, "listItemScrollOffset", js.undefined)
      
      @scala.inline
      def setLoadData(value: /* dataNode */ LegacyDataNode => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
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
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setNotFoundContent(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* value */ Any, /* labelList */ js.Array[ReactElement], /* extra */ ChangeEventExtra) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDeselect(value: (ArrayElementType[Any], DefaultOptionType) => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
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
      def setOnSearch(value: /* value */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (ArrayElementType[Any], DefaultOptionType) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnTreeExpand(value: /* expandedKeys */ js.Array[web.typings.react.mod.Key] => Unit): Self = StObject.set(x, "onTreeExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTreeExpandUndefined: Self = StObject.set(x, "onTreeExpand", js.undefined)
      
      @scala.inline
      def setOnTreeLoad(value: /* loadedKeys */ js.Array[web.typings.react.mod.Key] => Unit): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTreeLoadUndefined: Self = StObject.set(x, "onTreeLoad", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
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
      def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
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
      def setShowCheckedStrategy(value: CheckedStrategy): Self = StObject.set(x, "showCheckedStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckedStrategyUndefined: Self = StObject.set(x, "showCheckedStrategy", js.undefined)
      
      @scala.inline
      def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setShowTreeIcon(value: Boolean): Self = StObject.set(x, "showTreeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTreeIconUndefined: Self = StObject.set(x, "showTreeIcon", js.undefined)
      
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
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ web.typings.rcTree.esInterfaceMod.TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
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
      def setTokenSeparators(value: js.Array[String]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
      
      @scala.inline
      def setTokenSeparatorsVarargs(value: String*): Self = StObject.set(x, "tokenSeparators", js.Array(value :_*))
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTreeCheckStrictly(value: Boolean): Self = StObject.set(x, "treeCheckStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeCheckStrictlyUndefined: Self = StObject.set(x, "treeCheckStrictly", js.undefined)
      
      @scala.inline
      def setTreeCheckable(value: Boolean | ReactElement): Self = StObject.set(x, "treeCheckable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeCheckableReactElement(value: ReactElement): Self = StObject.set(x, "treeCheckable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeCheckableUndefined: Self = StObject.set(x, "treeCheckable", js.undefined)
      
      @scala.inline
      def setTreeData(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataSimpleMode(value: Boolean | SimpleModeConfig): Self = StObject.set(x, "treeDataSimpleMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataSimpleModeUndefined: Self = StObject.set(x, "treeDataSimpleMode", js.undefined)
      
      @scala.inline
      def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      @scala.inline
      def setTreeDataVarargs(value: DefaultOptionType*): Self = StObject.set(x, "treeData", js.Array(value :_*))
      
      @scala.inline
      def setTreeDefaultExpandAll(value: Boolean): Self = StObject.set(x, "treeDefaultExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandAllUndefined: Self = StObject.set(x, "treeDefaultExpandAll", js.undefined)
      
      @scala.inline
      def setTreeDefaultExpandedKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandedKeysUndefined: Self = StObject.set(x, "treeDefaultExpandedKeys", js.undefined)
      
      @scala.inline
      def setTreeDefaultExpandedKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "treeDefaultExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeExpandAction(value: ExpandAction): Self = StObject.set(x, "treeExpandAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeExpandActionUndefined: Self = StObject.set(x, "treeExpandAction", js.undefined)
      
      @scala.inline
      def setTreeExpandedKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "treeExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeExpandedKeysUndefined: Self = StObject.set(x, "treeExpandedKeys", js.undefined)
      
      @scala.inline
      def setTreeExpandedKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "treeExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeIcon(value: IconType): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIconFunction1(value: /* props */ web.typings.rcTree.esInterfaceMod.TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "treeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeIconReactElement(value: ReactElement): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIconUndefined: Self = StObject.set(x, "treeIcon", js.undefined)
      
      @scala.inline
      def setTreeLine(value: Boolean): Self = StObject.set(x, "treeLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLineUndefined: Self = StObject.set(x, "treeLine", js.undefined)
      
      @scala.inline
      def setTreeLoadedKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "treeLoadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLoadedKeysUndefined: Self = StObject.set(x, "treeLoadedKeys", js.undefined)
      
      @scala.inline
      def setTreeLoadedKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "treeLoadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeMotion(value: Any): Self = StObject.set(x, "treeMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeMotionUndefined: Self = StObject.set(x, "treeMotion", js.undefined)
      
      @scala.inline
      def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeNodeFilterPropUndefined: Self = StObject.set(x, "treeNodeFilterProp", js.undefined)
      
      @scala.inline
      def setTreeNodeLabelProp(value: String): Self = StObject.set(x, "treeNodeLabelProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeNodeLabelPropUndefined: Self = StObject.set(x, "treeNodeLabelProp", js.undefined)
      
      @scala.inline
      def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
