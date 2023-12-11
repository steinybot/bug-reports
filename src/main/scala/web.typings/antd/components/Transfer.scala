package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.DirectionTransferDirection
import web.typings.antd.anon.PartialTransferLocale
import web.typings.antd.anon.SelectedCount
import web.typings.antd.antdStrings.replace
import web.typings.antd.esTransferInterfaceMod.PaginationType
import web.typings.antd.esTransferListBodyMod.TransferListBodyProps
import web.typings.antd.esTransferListMod.TransferCustomListBodyProps
import web.typings.antd.esTransferListMod.TransferListProps
import web.typings.antd.esTransferMod.KeyWiseTransferItem
import web.typings.antd.esTransferMod.ListStyle
import web.typings.antd.esTransferMod.RenderResult
import web.typings.antd.esTransferMod.SelectAllLabel
import web.typings.antd.esTransferMod.TransferDirection
import web.typings.antd.esTransferMod.TransferItem
import web.typings.antd.esTransferMod.TransferProps
import web.typings.antd.esTransferOperationMod.TransferOperationProps
import web.typings.antd.esTransferSearchMod.TransferSearchProps
import web.typings.antd.esUtilStatusUtilsMod.InputStatus
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.FormEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import slinky.web.html.input.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transfer {
  
  @scala.inline
  def apply[RecordType /* <: TransferItem */](): Builder[RecordType] = {
    val __props = js.Dynamic.literal()
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[TransferProps[RecordType]]))
  }
  
  object List {
    
    @scala.inline
    def apply[RecordType_1 /* <: KeyWiseTransferItem */](
      checkedKeys: js.Array[String],
      dataSource: js.Array[RecordType_1],
      direction: TransferDirection,
      handleClear: () => Unit,
      handleFilter: ChangeEvent[HTMLInputElement] => Unit,
      itemUnit: String,
      itemsUnit: String,
      onItemSelect: (String, Boolean, js.UndefOr[SyntheticMouseEvent[org.scalajs.dom.Element]]) => Unit,
      onItemSelectAll: (js.Array[String], Boolean | replace) => Unit,
      onScroll: SyntheticUIEvent[HTMLUListElement] => Unit,
      prefixCls: String,
      searchPlaceholder: String,
      titleText: ReactElement
    ): web.typings.antd.components.Transfer.List.Builder[RecordType_1] = {
      val __props = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction3(onItemSelect), onItemSelectAll = js.Any.fromFunction2(onItemSelectAll), onScroll = js.Any.fromFunction1(onScroll), prefixCls = prefixCls.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
      new web.typings.antd.components.Transfer.List.Builder[RecordType_1](js.Array(this.component, __props.asInstanceOf[TransferListProps[RecordType_1]]))
    }
    
    @JSImport("antd", "Transfer.List")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder[RecordType_1 /* <: KeyWiseTransferItem */] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def filterOption(value: (/* filterText */ String, RecordType_1, /* direction */ TransferDirection) => Boolean): this.type = set("filterOption", js.Any.fromFunction3(value))
      
      @scala.inline
      def footer(
        value: (/* props */ TransferListProps[RecordType_1], /* info */ js.UndefOr[DirectionTransferDirection]) => ReactElement
      ): this.type = set("footer", js.Any.fromFunction2(value))
      
      @scala.inline
      def notFoundContent(value: ReactElement | js.Array[ReactElement]): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def notFoundContentReactElement(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def notFoundContentVarargs(value: ReactElement*): this.type = set("notFoundContent", js.Array(value :_*))
      
      @scala.inline
      def onItemRemove(value: /* keys */ js.Array[String] => Unit): this.type = set("onItemRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def pagination(value: PaginationType): this.type = set("pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def remove(value: String): this.type = set("remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def removeAll(value: String): this.type = set("removeAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def removeCurrent(value: String): this.type = set("removeCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def render(value: RecordType_1 => RenderResult): this.type = set("render", js.Any.fromFunction1(value))
      
      @scala.inline
      def renderList(value: /* props */ TransferListBodyProps[RecordType_1] => ReactElement): this.type = set("renderList", js.Any.fromFunction1(value))
      
      @scala.inline
      def selectAll(value: String): this.type = set("selectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectAllLabel(value: SelectAllLabel): this.type = set("selectAllLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectAllLabelFunction1(value: /* info */ SelectedCount => ReactElement): this.type = set("selectAllLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def selectAllLabelReactElement(value: ReactElement): this.type = set("selectAllLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectCurrent(value: String): this.type = set("selectCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectInvert(value: String): this.type = set("selectInvert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectionsIcon(value: ReactElement): this.type = set("selectionsIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showRemove(value: Boolean): this.type = set("showRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSelectAll(value: Boolean): this.type = set("showSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def titles(value: js.Array[ReactElement]): this.type = set("titles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def titlesVarargs(value: ReactElement*): this.type = set("titles", js.Array(value :_*))
    }
    
    type Props[RecordType_1 /* <: KeyWiseTransferItem */] = TransferListProps[RecordType_1]
    
    def withProps[RecordType_1 /* <: KeyWiseTransferItem */](p: TransferListProps[RecordType_1]): web.typings.antd.components.Transfer.List.Builder[RecordType_1] = new web.typings.antd.components.Transfer.List.Builder[RecordType_1](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Operation {
    
    @JSImport("antd", "Transfer.Operation")
    @js.native
    val component: js.Object = js.native
    
    type Props = TransferOperationProps
    
    implicit def make(companion: Operation.type): SharedBuilder_TransferOperationProps502467532 = new SharedBuilder_TransferOperationProps502467532(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransferOperationProps): SharedBuilder_TransferOperationProps502467532 = new SharedBuilder_TransferOperationProps502467532(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Search {
    
    @JSImport("antd", "Transfer.Search")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def handleClear(value: () => Unit): this.type = set("handleClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def onChange(value: /* e */ FormEvent[HTMLElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    type Props = TransferSearchProps
    
    implicit def make(companion: Search.type): web.typings.antd.components.Transfer.Search.Builder = new web.typings.antd.components.Transfer.Search.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransferSearchProps): web.typings.antd.components.Transfer.Search.Builder = new web.typings.antd.components.Transfer.Search.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Transfer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RecordType /* <: TransferItem */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.ul.tag.type, js.Object] {
    
    @scala.inline
    def children(value: /* props */ TransferCustomListBodyProps[RecordType] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSource(value: js.Array[RecordType]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSourceVarargs(value: RecordType*): this.type = set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterOption(value: (/* inputValue */ String, RecordType, /* direction */ TransferDirection) => Boolean): this.type = set("filterOption", js.Any.fromFunction3(value))
    
    @scala.inline
    def footer(
      value: (/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[DirectionTransferDirection]) => ReactElement
    ): this.type = set("footer", js.Any.fromFunction2(value))
    
    @scala.inline
    def listStyle(value: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyleFunction1(value: /* style */ ListStyle => CSSProperties): this.type = set("listStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def locale(value: PartialTransferLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* targetKeys */ js.Array[String], /* direction */ TransferDirection, /* moveKeys */ js.Array[String]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onScroll(
      value: (/* direction */ TransferDirection, /* e */ SyntheticEvent[Event, HTMLUListElement]) => Unit
    ): this.type = set("onScroll", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSearch(value: (/* direction */ TransferDirection, /* value */ String) => Unit): this.type = set("onSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSelectChange(
      value: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit
    ): this.type = set("onSelectChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def oneWay(value: Boolean): this.type = set("oneWay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def operationStyle(value: CSSProperties): this.type = set("operationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def operations(value: js.Array[String]): this.type = set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def operationsVarargs(value: String*): this.type = set("operations", js.Array(value :_*))
    
    @scala.inline
    def pagination(value: PaginationType): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: RecordType => RenderResult): this.type = set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowKey(value: RecordType => String): this.type = set("rowKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectAllLabels(value: js.Array[SelectAllLabel]): this.type = set("selectAllLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectAllLabelsVarargs(value: SelectAllLabel*): this.type = set("selectAllLabels", js.Array(value :_*))
    
    @scala.inline
    def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedKeysVarargs(value: String*): this.type = set("selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def selectionsIcon(value: ReactElement): this.type = set("selectionsIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSelectAll(value: Boolean): this.type = set("showSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetKeys(value: js.Array[String]): this.type = set("targetKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetKeysVarargs(value: String*): this.type = set("targetKeys", js.Array(value :_*))
    
    @scala.inline
    def titles(value: js.Array[ReactElement]): this.type = set("titles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titlesVarargs(value: ReactElement*): this.type = set("titles", js.Array(value :_*))
  }
  
  type Props[RecordType /* <: TransferItem */] = TransferProps[RecordType]
  
  implicit def make[RecordType /* <: TransferItem */](companion: Transfer.type): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[RecordType /* <: TransferItem */](p: TransferProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
