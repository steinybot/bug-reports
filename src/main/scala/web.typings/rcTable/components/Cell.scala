package web.typings.rcTable.components

import web.typings.StBuildingComponent.Default
import web.typings.rcTable.anon.FnCallProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cell {
  
  @JSImport("rc-table/lib/Cell", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = FnCallProps
  
  implicit def make(companion: Cell.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FnCallProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
