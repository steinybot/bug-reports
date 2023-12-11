package web.typings.rcSelect.anon

import web.typings.rcSelect.libOptGroupMod.OptionGroupFC
import web.typings.rcSelect.libOptionMod.OptionFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptGroup extends StObject {
  
  var OptGroup: OptionGroupFC = js.native
  
  var Option: OptionFC = js.native
}
object OptGroup {
  
  @scala.inline
  def apply(OptGroup: OptionGroupFC, Option: OptionFC): OptGroup = {
    val __obj = js.Dynamic.literal(OptGroup = OptGroup.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroup]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OptGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptGroup(value: OptionGroupFC): Self = StObject.set(x, "OptGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: OptionFC): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
  }
}
