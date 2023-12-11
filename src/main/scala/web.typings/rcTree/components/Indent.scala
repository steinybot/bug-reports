package web.typings.rcTree.components

import web.typings.StBuildingComponent.Default
import web.typings.rcTree.esIndentMod.IndentProps
import web.typings.react.mod.JSX.Element
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Indent {
  
  @scala.inline
  def apply(
    apply: /* param0 */ IndentProps => Element,
    args: String,
    bind: (js.Any, js.Any) => js.Dynamic,
    call: (js.Any, js.Any) => js.Dynamic,
    length: Int
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), args = args.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), call = js.Any.fromFunction2(call), length = length.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[js.Function1[/* param0 */ IndentProps, Element]]))
  }
  
  @JSImport("rc-tree/es/Indent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = js.Function1[/* param0 */ IndentProps, Element]
  
  def withProps(p: js.Function1[/* param0 */ IndentProps, Element]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
