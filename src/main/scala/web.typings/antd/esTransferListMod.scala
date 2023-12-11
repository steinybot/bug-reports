package web.typings.antd

import web.typings.antd.anon.DirectionTransferDirection
import web.typings.antd.antdStrings.replace
import web.typings.antd.esTransferInterfaceMod.PaginationType
import web.typings.antd.esTransferListBodyMod.TransferListBodyProps
import web.typings.antd.esTransferMod.KeyWiseTransferItem
import web.typings.antd.esTransferMod.RenderResult
import web.typings.antd.esTransferMod.SelectAllLabel
import web.typings.antd.esTransferMod.TransferDirection
import web.typings.antd.esTransferMod.TransferLocale
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.JSX.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransferListMod {
  
  object default {
    
    @scala.inline
    def apply[RecordType /* <: KeyWiseTransferItem */](props: TransferListProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/es/transfer/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/transfer/list", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type RenderListFunction[T] = js.Function1[/* props */ TransferListBodyProps[T], ReactElement]
  
  @js.native
  trait RenderedItem[RecordType] extends StObject {
    
    var item: RecordType = js.native
    
    var renderedEl: ReactElement = js.native
    
    var renderedText: String = js.native
  }
  object RenderedItem {
    
    @scala.inline
    def apply[RecordType](item: RecordType, renderedEl: ReactElement, renderedText: String): RenderedItem[RecordType] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedEl = renderedEl.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderedItem[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RenderedItem[_], RecordType] (val x: Self with RenderedItem[RecordType]) extends AnyVal {
      
      @scala.inline
      def setItem(value: RecordType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedEl(value: ReactElement): Self = StObject.set(x, "renderedEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransferCustomListBodyProps[T]
    extends StObject
       with TransferListBodyProps[T] {
    
    def onItemSelect(key: String, check: Boolean): Unit = js.native
  }
  object TransferCustomListBodyProps {
    
    @scala.inline
    def apply[T](
      filteredItems: js.Array[T],
      filteredRenderItems: js.Array[RenderedItem[T]],
      onItemSelect: (String, Boolean) => Unit,
      selectedKeys: js.Array[String]
    ): TransferCustomListBodyProps[T] = {
      val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferCustomListBodyProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransferCustomListBodyProps[_], T] (val x: Self with TransferCustomListBodyProps[T]) extends AnyVal {
      
      @scala.inline
      def setOnItemSelect(value: (String, Boolean) => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TransferListProps[RecordType]
    extends StObject
       with TransferLocale {
    
    var checkedKeys: js.Array[String] = js.native
    
    var dataSource: js.Array[RecordType] = js.native
    
    var direction: TransferDirection = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var filterOption: js.UndefOr[
        js.Function3[
          /* filterText */ String, 
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
    
    def handleClear(): Unit = js.native
    
    def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    var onItemRemove: js.UndefOr[js.Function1[/* keys */ js.Array[String], Unit]] = js.native
    
    def onItemSelect(key: String, check: Boolean): Unit = js.native
    def onItemSelect(key: String, check: Boolean, e: SyntheticMouseEvent[org.scalajs.dom.Element]): Unit = js.native
    
    def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit = js.native
    @JSName("onItemSelectAll")
    def onItemSelectAll_replace(dataSource: js.Array[String], checkAll: replace): Unit = js.native
    
    def onScroll(e: SyntheticUIEvent[HTMLUListElement]): Unit = js.native
    
    var pagination: js.UndefOr[PaginationType] = js.native
    
    var prefixCls: String = js.native
    
    /** Render item */
    var render: js.UndefOr[js.Function1[/* item */ RecordType, RenderResult]] = js.native
    
    var renderList: js.UndefOr[RenderListFunction[RecordType]] = js.native
    
    var selectAllLabel: js.UndefOr[SelectAllLabel] = js.native
    
    var selectionsIcon: js.UndefOr[ReactElement] = js.native
    
    var showRemove: js.UndefOr[Boolean] = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var showSelectAll: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var titleText: ReactElement = js.native
  }
}
