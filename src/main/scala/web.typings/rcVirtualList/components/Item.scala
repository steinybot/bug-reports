package web.typings.rcVirtualList.components

import web.typings.StBuildingComponent.Default
import web.typings.rcVirtualList.esItemMod.ItemProps
import org.scalajs.dom.HTMLElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  @scala.inline
  def apply(setRef: HTMLElement => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(setRef = js.Any.fromFunction1(setRef))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ItemProps]))
  }
  
  @JSImport("rc-virtual-list/es/Item", "Item")
  @js.native
  val component: js.Object = js.native
  
  type Props = ItemProps
  
  def withProps(p: ItemProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
