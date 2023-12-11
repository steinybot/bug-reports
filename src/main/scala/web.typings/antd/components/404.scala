package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `404` {
  
  @JSImport("antd/es/result", "ExceptionMap.404")
  @js.native
  val component: js.Object = js.native
  
  type Props = js.Object
  
  implicit def make(companion: `404`.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
