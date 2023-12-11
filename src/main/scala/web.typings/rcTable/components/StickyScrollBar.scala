package web.typings.rcTable.components

import web.typings.StBuildingComponent.Default
import web.typings.rcTable.anon.`0`
import web.typings.rcTable.libStickyScrollBarMod.StickyScrollBarProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import slinky.core.facade.ReactRef
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StickyScrollBar {
  
  @scala.inline
  def apply(
    container: HTMLElement | Window,
    offsetScroll: Double,
    onScroll: `0` => Unit,
    scrollBodyRef: ReactRef[HTMLDivElement]
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(container = container.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), scrollBodyRef = scrollBodyRef.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[StickyScrollBarProps with RefAttributes[Any]]))
  }
  
  @JSImport("rc-table/lib/stickyScrollBar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = StickyScrollBarProps with RefAttributes[Any]
  
  def withProps(p: StickyScrollBarProps with RefAttributes[Any]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
