package web.typings.rcImage.components

import web.typings.rcImage.libPreviewGroupMod.GroupConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PreviewGroup {
  
  @JSImport("rc-image/lib/PreviewGroup", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = GroupConsumerProps
  
  implicit def make(companion: PreviewGroup.type): SharedBuilder_GroupConsumerProps_1165707419 = new SharedBuilder_GroupConsumerProps_1165707419(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GroupConsumerProps): SharedBuilder_GroupConsumerProps_1165707419 = new SharedBuilder_GroupConsumerProps_1165707419(js.Array(this.component, p.asInstanceOf[js.Any]))
}
