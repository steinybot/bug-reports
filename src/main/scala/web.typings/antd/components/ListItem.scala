package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esTransferListItemMod.ListItemProps
import web.typings.antd.esTransferMod.KeyWiseTransferItem
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  @scala.inline
  def apply(
    apply: /* props */ ListItemProps[KeyWiseTransferItem] => web.typings.react.mod.JSX.Element,
    args: String,
    bind: (js.Any, js.Any) => js.Dynamic,
    call: (js.Any, js.Any) => js.Dynamic,
    length: Int
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), args = args.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), call = js.Any.fromFunction2(call), length = length.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], web.typings.react.mod.JSX.Element]]))
  }
  
  @JSImport("antd/es/transfer/ListItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], web.typings.react.mod.JSX.Element]
  
  def withProps(p: js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], web.typings.react.mod.JSX.Element]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
