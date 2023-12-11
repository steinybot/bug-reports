package web.typings.rcRate

import web.typings.rcRate.esRateMod.RateProps
import web.typings.rcRate.esRateMod.RateRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-rate", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RateProps with RefAttributes[RateRef]] = js.native
  
  type _To = ReactComponentClass[RateProps with RefAttributes[RateRef]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[RateProps with RefAttributes[RateRef]] = default
}
