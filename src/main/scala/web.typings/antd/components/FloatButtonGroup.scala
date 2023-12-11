package web.typings.antd.components

import web.typings.antd.esFloatButtonInterfaceMod.FloatButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FloatButtonGroup {
  
  @JSImport("antd/es/float-button/FloatButtonGroup", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = FloatButtonGroupProps
  
  implicit def make(companion: FloatButtonGroup.type): SharedBuilder_FloatButtonGroupProps_399423176 = new SharedBuilder_FloatButtonGroupProps_399423176(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FloatButtonGroupProps): SharedBuilder_FloatButtonGroupProps_399423176 = new SharedBuilder_FloatButtonGroupProps_399423176(js.Array(this.component, p.asInstanceOf[js.Any]))
}
