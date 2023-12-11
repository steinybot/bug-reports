package web.typings.rcRate.components

import web.typings.rcRate.esRateMod.RateProps
import web.typings.rcRate.esRateMod.RateRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcRate {
  
  @JSImport("rc-rate", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = RateProps with RefAttributes[RateRef]
  
  implicit def make(companion: RcRate.type): SharedBuilder_RatePropsRefAttributes66151370[RateRef] = new SharedBuilder_RatePropsRefAttributes66151370[RateRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RateProps with RefAttributes[RateRef]): SharedBuilder_RatePropsRefAttributes66151370[RateRef] = new SharedBuilder_RatePropsRefAttributes66151370[RateRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
