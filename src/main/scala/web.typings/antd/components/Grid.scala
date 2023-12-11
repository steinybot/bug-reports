package web.typings.antd.components

import web.typings.antd.esCardGridMod.CardGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("antd/es/card/Grid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = CardGridProps
  
  implicit def make(companion: Grid.type): SharedBuilder_CardGridProps_1740743439 = new SharedBuilder_CardGridProps_1740743439(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardGridProps): SharedBuilder_CardGridProps_1740743439 = new SharedBuilder_CardGridProps_1740743439(js.Array(this.component, p.asInstanceOf[js.Any]))
}
