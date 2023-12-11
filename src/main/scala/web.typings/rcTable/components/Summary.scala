package web.typings.rcTable.components

import web.typings.rcTable.libFooterSummaryMod.SummaryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Summary {
  
  @JSImport("rc-table", "Summary")
  @js.native
  val component: js.Object = js.native
  
  type Props = SummaryProps
  
  implicit def make(companion: Summary.type): SharedBuilder_SummaryProps85589058 = new SharedBuilder_SummaryProps85589058(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SummaryProps): SharedBuilder_SummaryProps85589058 = new SharedBuilder_SummaryProps85589058(js.Array(this.component, p.asInstanceOf[js.Any]))
}
