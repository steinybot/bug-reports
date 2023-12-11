package web.typings.antd.components

import web.typings.antd.esCardMetaMod.CardMetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Meta {
  
  @JSImport("antd/es/card/Meta", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = CardMetaProps
  
  implicit def make(companion: Meta.type): SharedBuilder_CardMetaProps_1139877684 = new SharedBuilder_CardMetaProps_1139877684(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardMetaProps): SharedBuilder_CardMetaProps_1139877684 = new SharedBuilder_CardMetaProps_1139877684(js.Array(this.component, p.asInstanceOf[js.Any]))
}
