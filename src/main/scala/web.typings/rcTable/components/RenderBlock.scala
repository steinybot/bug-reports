package web.typings.rcTable.components

import web.typings.StBuildingComponent.Default
import web.typings.react.mod.JSX.Element
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenderBlock {
  
  @scala.inline
  def apply(
    apply: () => Element,
    args: String,
    bind: (js.Any, js.Any) => js.Dynamic,
    call: (js.Any, js.Any) => js.Dynamic,
    length: Int
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), args = args.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), call = js.Any.fromFunction2(call), length = length.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[js.Function0[Element]]))
  }
  
  @JSImport("rc-table/lib/hooks/useRenderTimes", "RenderBlock")
  @js.native
  val component: js.Object = js.native
  
  type Props = js.Function0[Element]
  
  def withProps(p: js.Function0[Element]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
