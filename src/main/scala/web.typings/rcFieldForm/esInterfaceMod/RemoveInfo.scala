package web.typings.rcFieldForm.esInterfaceMod

import web.typings.rcFieldForm.rcFieldFormStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveInfo
  extends StObject
     with NotifyInfo {
  
  var `type`: remove = js.native
}
object RemoveInfo {
  
  @scala.inline
  def apply(): RemoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[RemoveInfo]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RemoveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
