package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esListContextMod.ListConsumerProps
import web.typings.react.mod.ConsumerProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListConsumer {
  
  @scala.inline
  def apply(children: ListConsumerProps => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[ListConsumerProps]]))
  }
  
  @JSImport("antd/es/list/context", "ListConsumer")
  @js.native
  val component: js.Object = js.native
  
  type Props = ConsumerProps[ListConsumerProps]
  
  def withProps(p: ConsumerProps[ListConsumerProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
