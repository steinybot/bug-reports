package web.typings.rcSelect.components

import web.typings.rcSelect.libOptGroupMod.OptGroupProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptGroup {
  
  @scala.inline
  def apply(label: ReactElement): SharedBuilder_OptGroupProps_1412863601 = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    new SharedBuilder_OptGroupProps_1412863601(js.Array(this.component, __props.asInstanceOf[OptGroupProps]))
  }
  
  @JSImport("rc-select", "OptGroup")
  @js.native
  val component: js.Object = js.native
  
  type Props = OptGroupProps
  
  def withProps(p: OptGroupProps): SharedBuilder_OptGroupProps_1412863601 = new SharedBuilder_OptGroupProps_1412863601(js.Array(this.component, p.asInstanceOf[js.Any]))
}
