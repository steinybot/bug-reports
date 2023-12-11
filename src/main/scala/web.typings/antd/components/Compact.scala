package web.typings.antd.components

import web.typings.antd.esSpaceCompactMod.SpaceCompactProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compact {
  
  @JSImport("antd/es/space/Compact", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = SpaceCompactProps
  
  implicit def make(companion: Compact.type): SharedBuilder_SpaceCompactProps_434422181 = new SharedBuilder_SpaceCompactProps_434422181(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpaceCompactProps): SharedBuilder_SpaceCompactProps_434422181 = new SharedBuilder_SpaceCompactProps_434422181(js.Array(this.component, p.asInstanceOf[js.Any]))
}
