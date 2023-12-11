package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.anon.PropsWithChildren
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoCompactStyle {
  
  @JSImport("antd/es/space/Compact", "NoCompactStyle")
  @js.native
  val component: js.Object = js.native
  
  type Props = PropsWithChildren
  
  implicit def make(companion: NoCompactStyle.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
