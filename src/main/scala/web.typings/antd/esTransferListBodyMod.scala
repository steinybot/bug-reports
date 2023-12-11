package web.typings.antd

import web.typings.antd.antdStrings.checkedKeys
import web.typings.antd.antdStrings.handleClear
import web.typings.antd.antdStrings.handleFilter
import web.typings.antd.esTransferListMod.RenderedItem
import web.typings.antd.esTransferListMod.TransferListProps
import web.typings.antd.esTransferMod.KeyWiseTransferItem
import web.typings.react.mod.RefAttributes
import web.typings.std.Omit
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransferListBodyMod extends Shortcut {
  
  @JSImport("antd/es/transfer/ListBody", JSImport.Default)
  @js.native
  val default: ReactComponentClass[
    TransferListBodyProps[KeyWiseTransferItem] with RefAttributes[ListBodyRef[KeyWiseTransferItem]]
  ] = js.native
  
  @JSImport("antd/es/transfer/ListBody", "OmitProps")
  @js.native
  val OmitProps: js.Tuple3[handleFilter, handleClear, checkedKeys] = js.native
  
  @js.native
  trait ListBodyRef[RecordType /* <: KeyWiseTransferItem */] extends StObject {
    
    var items: js.UndefOr[js.Array[RenderedItem[RecordType]]] = js.native
  }
  object ListBodyRef {
    
    @scala.inline
    def apply[RecordType /* <: KeyWiseTransferItem */](): ListBodyRef[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBodyRef[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListBodyRef[_], RecordType /* <: KeyWiseTransferItem */] (val x: Self with ListBodyRef[RecordType]) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[RenderedItem[RecordType]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: RenderedItem[RecordType]*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.handleFilter
    - `web.typings`.antd.antdStrings.handleClear
    - `web.typings`.antd.antdStrings.checkedKeys
  */
  trait OmitProp extends StObject
  
  type PartialTransferListProps[RecordType] = Omit[TransferListProps[RecordType], OmitProp]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof antd.antd/es/transfer/list.TransferListProps<RecordType>, antd.antd/es/transfer/ListBody.OmitProp> ]: antd.antd/es/transfer/list.TransferListProps<RecordType>[P]} */ @js.native
  trait TransferListBodyProps[RecordType] extends StObject {
    
    var filteredItems: js.Array[RecordType] = js.native
    
    var filteredRenderItems: js.Array[RenderedItem[RecordType]] = js.native
    
    var selectedKeys: js.Array[String] = js.native
  }
  object TransferListBodyProps {
    
    @scala.inline
    def apply[RecordType](
      filteredItems: js.Array[RecordType],
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      selectedKeys: js.Array[String]
    ): TransferListBodyProps[RecordType] = {
      val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListBodyProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransferListBodyProps[_], RecordType] (val x: Self with TransferListBodyProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setFilteredItems(value: js.Array[RecordType]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredItemsVarargs(value: RecordType*): Self = StObject.set(x, "filteredItems", js.Array(value :_*))
      
      @scala.inline
      def setFilteredRenderItems(value: js.Array[RenderedItem[RecordType]]): Self = StObject.set(x, "filteredRenderItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredRenderItemsVarargs(value: RenderedItem[RecordType]*): Self = StObject.set(x, "filteredRenderItems", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[
    TransferListBodyProps[KeyWiseTransferItem] with RefAttributes[ListBodyRef[KeyWiseTransferItem]]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `esTransferListBodyMod.foo` */
  override def _to: ReactComponentClass[
    TransferListBodyProps[KeyWiseTransferItem] with RefAttributes[ListBodyRef[KeyWiseTransferItem]]
  ] = default
}
