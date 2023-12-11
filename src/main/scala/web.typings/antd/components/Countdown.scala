package web.typings.antd.components

import web.typings.antd.esStatisticCountdownMod.CountdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Countdown {
  
  @JSImport("antd/es/statistic/Countdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = CountdownProps
  
  implicit def make(companion: Countdown.type): SharedBuilder_CountdownProps_1372896191 = new SharedBuilder_CountdownProps_1372896191(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CountdownProps): SharedBuilder_CountdownProps_1372896191 = new SharedBuilder_CountdownProps_1372896191(js.Array(this.component, p.asInstanceOf[js.Any]))
}
