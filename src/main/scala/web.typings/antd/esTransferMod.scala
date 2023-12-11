package web.typings.antd

import web.typings.antd.anon.CallProps
import web.typings.antd.anon.DirectionTransferDirection
import web.typings.antd.anon.KeyString
import web.typings.antd.anon.PartialTransferLocale
import web.typings.antd.anon.SelectedCount
import web.typings.antd.esTransferInterfaceMod.PaginationType
import web.typings.antd.esTransferListMod.TransferCustomListBodyProps
import web.typings.antd.esTransferListMod.TransferListProps
import web.typings.antd.esTransferOperationMod.TransferOperationProps
import web.typings.antd.esTransferSearchMod.TransferSearchProps
import web.typings.antd.esUtilStatusUtilsMod.InputStatus
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLUListElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransferMod {
  
  object default {
    
    @scala.inline
    def apply[RecordType /* <: TransferItem */](props: TransferProps[RecordType]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/transfer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/transfer", "default.List")
    @js.native
    def List: CallProps = js.native
    @scala.inline
    def List_=(x: CallProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/transfer", "default.Operation")
    @js.native
    def Operation: ReactComponentClass[TransferOperationProps] = js.native
    @scala.inline
    def Operation_=(x: ReactComponentClass[TransferOperationProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operation")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/transfer", "default.Search")
    @js.native
    def Search: ReactComponentClass[TransferSearchProps] = js.native
    @scala.inline
    def Search_=(x: ReactComponentClass[TransferSearchProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Search")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/transfer", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type KeyWise[T] = T with KeyString
  
  /* Inlined antd.antd/es/transfer.KeyWise<antd.antd/es/transfer.TransferItem> */
  @js.native
  trait KeyWiseTransferItem
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var description: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object KeyWiseTransferItem {
    
    @scala.inline
    def apply(): KeyWiseTransferItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyWiseTransferItem]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: KeyWiseTransferItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ListStyle extends StObject {
    
    var direction: TransferDirection = js.native
  }
  object ListStyle {
    
    @scala.inline
    def apply(direction: TransferDirection): ListStyle = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListStyle]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: TransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderResult = ReactElement | RenderResultObject | String | Null
  
  @js.native
  trait RenderResultObject extends StObject {
    
    var label: ReactElement = js.native
    
    var value: String = js.native
  }
  object RenderResultObject {
    
    @scala.inline
    def apply(label: ReactElement, value: String): RenderResultObject = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderResultObject]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RenderResultObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectAllLabel = ReactElement | (js.Function1[/* info */ SelectedCount, ReactElement])
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.left
    - `web.typings`.antd.antdStrings.right
  */
  trait TransferDirection extends StObject
  object TransferDirection {
    
    @scala.inline
    def left: web.typings.antd.antdStrings.left = "left".asInstanceOf[web.typings.antd.antdStrings.left]
    
    @scala.inline
    def right: web.typings.antd.antdStrings.right = "right".asInstanceOf[web.typings.antd.antdStrings.right]
  }
  
  @js.native
  trait TransferItem
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var description: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object TransferItem {
    
    @scala.inline
    def apply(): TransferItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferItem]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransferItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait TransferLocale extends StObject {
    
    var itemUnit: String = js.native
    
    var itemsUnit: String = js.native
    
    var notFoundContent: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
    
    var remove: js.UndefOr[String] = js.native
    
    var removeAll: js.UndefOr[String] = js.native
    
    var removeCurrent: js.UndefOr[String] = js.native
    
    var searchPlaceholder: String = js.native
    
    var selectAll: js.UndefOr[String] = js.native
    
    var selectCurrent: js.UndefOr[String] = js.native
    
    var selectInvert: js.UndefOr[String] = js.native
    
    var titles: js.UndefOr[js.Array[ReactElement]] = js.native
  }
  object TransferLocale {
    
    @scala.inline
    def apply(itemUnit: String, itemsUnit: String, searchPlaceholder: String): TransferLocale = {
      val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransferLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemUnit(value: String): Self = StObject.set(x, "itemUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUnit(value: String): Self = StObject.set(x, "itemsUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContent(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentReactElement(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setNotFoundContentVarargs(value: ReactElement*): Self = StObject.set(x, "notFoundContent", js.Array(value :_*))
      
      @scala.inline
      def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAll(value: String): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      @scala.inline
      def setRemoveCurrent(value: String): Self = StObject.set(x, "removeCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCurrentUndefined: Self = StObject.set(x, "removeCurrent", js.undefined)
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
      
      @scala.inline
      def setSelectCurrent(value: String): Self = StObject.set(x, "selectCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectCurrentUndefined: Self = StObject.set(x, "selectCurrent", js.undefined)
      
      @scala.inline
      def setSelectInvert(value: String): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectInvertUndefined: Self = StObject.set(x, "selectInvert", js.undefined)
      
      @scala.inline
      def setTitles(value: js.Array[ReactElement]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
      
      @scala.inline
      def setTitlesVarargs(value: ReactElement*): Self = StObject.set(x, "titles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransferProps[RecordType] extends StObject {
    
    var children: js.UndefOr[js.Function1[/* props */ TransferCustomListBodyProps[RecordType], ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dataSource: js.UndefOr[js.Array[RecordType]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var filterOption: js.UndefOr[
        js.Function3[
          /* inputValue */ String, 
          /* item */ RecordType, 
          /* direction */ TransferDirection, 
          Boolean
        ]
      ] = js.native
    
    var footer: js.UndefOr[
        js.Function2[
          /* props */ TransferListProps[RecordType], 
          /* info */ js.UndefOr[DirectionTransferDirection], 
          ReactElement
        ]
      ] = js.native
    
    var listStyle: js.UndefOr[(js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties] = js.native
    
    var locale: js.UndefOr[PartialTransferLocale] = js.native
    
    var onChange: js.UndefOr[
        js.Function3[
          /* targetKeys */ js.Array[String], 
          /* direction */ TransferDirection, 
          /* moveKeys */ js.Array[String], 
          Unit
        ]
      ] = js.native
    
    var onScroll: js.UndefOr[
        js.Function2[
          /* direction */ TransferDirection, 
          /* e */ SyntheticEvent[Event, HTMLUListElement], 
          Unit
        ]
      ] = js.native
    
    var onSearch: js.UndefOr[js.Function2[/* direction */ TransferDirection, /* value */ String, Unit]] = js.native
    
    var onSelectChange: js.UndefOr[
        js.Function2[
          /* sourceSelectedKeys */ js.Array[String], 
          /* targetSelectedKeys */ js.Array[String], 
          Unit
        ]
      ] = js.native
    
    var oneWay: js.UndefOr[Boolean] = js.native
    
    var operationStyle: js.UndefOr[CSSProperties] = js.native
    
    var operations: js.UndefOr[js.Array[String]] = js.native
    
    var pagination: js.UndefOr[PaginationType] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var render: js.UndefOr[TransferRender[RecordType]] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rowKey: js.UndefOr[js.Function1[/* record */ RecordType, String]] = js.native
    
    var selectAllLabels: js.UndefOr[js.Array[SelectAllLabel]] = js.native
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.native
    
    var selectionsIcon: js.UndefOr[ReactElement] = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var showSelectAll: js.UndefOr[Boolean] = js.native
    
    var status: js.UndefOr[InputStatus] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var targetKeys: js.UndefOr[js.Array[String]] = js.native
    
    var titles: js.UndefOr[js.Array[ReactElement]] = js.native
  }
  object TransferProps {
    
    @scala.inline
    def apply[RecordType](): TransferProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransferProps[_], RecordType] (val x: Self with TransferProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* props */ TransferCustomListBodyProps[RecordType] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFilterOption(
        value: (/* inputValue */ String, /* item */ RecordType, /* direction */ TransferDirection) => Boolean
      ): Self = StObject.set(x, "filterOption", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setFooter(
        value: (/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[DirectionTransferDirection]) => ReactElement
      ): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setListStyle(value: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleFunction1(value: /* style */ ListStyle => CSSProperties): Self = StObject.set(x, "listStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      @scala.inline
      def setLocale(value: PartialTransferLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* targetKeys */ js.Array[String], /* direction */ TransferDirection, /* moveKeys */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnScroll(
        value: (/* direction */ TransferDirection, /* e */ SyntheticEvent[Event, HTMLUListElement]) => Unit
      ): Self = StObject.set(x, "onScroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSearch(value: (/* direction */ TransferDirection, /* value */ String) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSelectChange(
        value: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onSelectChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectChangeUndefined: Self = StObject.set(x, "onSelectChange", js.undefined)
      
      @scala.inline
      def setOneWay(value: Boolean): Self = StObject.set(x, "oneWay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneWayUndefined: Self = StObject.set(x, "oneWay", js.undefined)
      
      @scala.inline
      def setOperationStyle(value: CSSProperties): Self = StObject.set(x, "operationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationStyleUndefined: Self = StObject.set(x, "operationStyle", js.undefined)
      
      @scala.inline
      def setOperations(value: js.Array[String]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      @scala.inline
      def setOperationsVarargs(value: String*): Self = StObject.set(x, "operations", js.Array(value :_*))
      
      @scala.inline
      def setPagination(value: PaginationType): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRender(value: RecordType => RenderResult): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRowKey(value: /* record */ RecordType => String): Self = StObject.set(x, "rowKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      @scala.inline
      def setSelectAllLabels(value: js.Array[SelectAllLabel]): Self = StObject.set(x, "selectAllLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllLabelsUndefined: Self = StObject.set(x, "selectAllLabels", js.undefined)
      
      @scala.inline
      def setSelectAllLabelsVarargs(value: SelectAllLabel*): Self = StObject.set(x, "selectAllLabels", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setSelectionsIcon(value: ReactElement): Self = StObject.set(x, "selectionsIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionsIconUndefined: Self = StObject.set(x, "selectionsIcon", js.undefined)
      
      @scala.inline
      def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setShowSelectAll(value: Boolean): Self = StObject.set(x, "showSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSelectAllUndefined: Self = StObject.set(x, "showSelectAll", js.undefined)
      
      @scala.inline
      def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTargetKeys(value: js.Array[String]): Self = StObject.set(x, "targetKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetKeysUndefined: Self = StObject.set(x, "targetKeys", js.undefined)
      
      @scala.inline
      def setTargetKeysVarargs(value: String*): Self = StObject.set(x, "targetKeys", js.Array(value :_*))
      
      @scala.inline
      def setTitles(value: js.Array[ReactElement]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
      
      @scala.inline
      def setTitlesVarargs(value: ReactElement*): Self = StObject.set(x, "titles", js.Array(value :_*))
    }
  }
  
  type TransferRender[RecordType] = js.Function1[/* item */ RecordType, RenderResult]
}
