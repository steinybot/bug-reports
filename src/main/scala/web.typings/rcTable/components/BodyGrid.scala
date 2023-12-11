package web.typings.rcTable.components

import web.typings.StBuildingComponent.Default
import web.typings.rcTable.anon.ScrollLeft
import web.typings.rcTable.libVirtualTableBodyGridMod.GridProps
import web.typings.rcTable.libVirtualTableBodyGridMod.GridRef
import web.typings.react.mod.RefAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BodyGrid {
  
  @scala.inline
  def apply(data: js.Array[Any], onScroll: /* info */ ScrollLeft => Unit): Default[tag.type, GridRef] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll))
    new Default[tag.type, GridRef](js.Array(this.component, __props.asInstanceOf[GridProps[Any] with RefAttributes[GridRef]]))
  }
  
  @JSImport("rc-table/lib/VirtualTable/BodyGrid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = GridProps[Any] with RefAttributes[GridRef]
  
  def withProps(p: GridProps[Any] with RefAttributes[GridRef]): Default[tag.type, GridRef] = new Default[tag.type, GridRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
