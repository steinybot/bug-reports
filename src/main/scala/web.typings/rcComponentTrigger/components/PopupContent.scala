package web.typings.rcComponentTrigger.components

import web.typings.StBuildingComponent.Default
import web.typings.rcComponentTrigger.esPopupPopupContentMod.PopupContentProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupContent {
  
  @scala.inline
  def apply(
    apply: /* param0 */ PopupContentProps => ReactElement,
    args: String,
    bind: (js.Any, js.Any) => js.Dynamic,
    call: (js.Any, js.Any) => js.Dynamic,
    length: Int
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), args = args.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), call = js.Any.fromFunction2(call), length = length.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[js.Function1[/* param0 */ PopupContentProps, ReactElement]]))
  }
  
  @JSImport("@rc-component/trigger/es/Popup/PopupContent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = js.Function1[/* param0 */ PopupContentProps, ReactElement]
  
  def withProps(p: js.Function1[/* param0 */ PopupContentProps, ReactElement]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
