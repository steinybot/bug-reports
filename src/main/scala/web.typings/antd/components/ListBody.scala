package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esTransferListBodyMod.ListBodyRef
import web.typings.antd.esTransferListBodyMod.TransferListBodyProps
import web.typings.antd.esTransferListMod.RenderedItem
import web.typings.antd.esTransferMod.KeyWiseTransferItem
import web.typings.react.mod.RefAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListBody {
  
  @scala.inline
  def apply(
    filteredItems: js.Array[KeyWiseTransferItem],
    filteredRenderItems: js.Array[RenderedItem[KeyWiseTransferItem]],
    selectedKeys: js.Array[String]
  ): Default[tag.type, ListBodyRef[KeyWiseTransferItem]] = {
    val __props = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    new Default[tag.type, ListBodyRef[KeyWiseTransferItem]](js.Array(this.component, __props.asInstanceOf[TransferListBodyProps[KeyWiseTransferItem] with RefAttributes[ListBodyRef[KeyWiseTransferItem]]]))
  }
  
  @JSImport("antd/es/transfer/ListBody", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = TransferListBodyProps[KeyWiseTransferItem] with RefAttributes[ListBodyRef[KeyWiseTransferItem]]
  
  def withProps(p: TransferListBodyProps[KeyWiseTransferItem] with RefAttributes[ListBodyRef[KeyWiseTransferItem]]): Default[tag.type, ListBodyRef[KeyWiseTransferItem]] = new Default[tag.type, ListBodyRef[KeyWiseTransferItem]](js.Array(this.component, p.asInstanceOf[js.Any]))
}
