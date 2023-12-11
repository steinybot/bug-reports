package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `web.typings`.rcFieldForm.esInterfaceMod.AggregationRule
  - `web.typings`.rcFieldForm.esInterfaceMod.ArrayRule
*/
trait RuleObject extends StObject
object RuleObject {
  
  @scala.inline
  def AggregationRule(): web.typings.rcFieldForm.esInterfaceMod.AggregationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[web.typings.rcFieldForm.esInterfaceMod.AggregationRule]
  }
  
  @scala.inline
  def ArrayRule(): web.typings.rcFieldForm.esInterfaceMod.ArrayRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[web.typings.rcFieldForm.esInterfaceMod.ArrayRule]
  }
}
