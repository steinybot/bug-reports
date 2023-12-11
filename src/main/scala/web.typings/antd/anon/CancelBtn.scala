package web.typings.antd.anon

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelBtn extends StObject {
  
  var CancelBtn: ReactComponentClass[js.Object] = js.native
  
  var OkBtn: ReactComponentClass[js.Object] = js.native
}
object CancelBtn {
  
  @scala.inline
  def apply(CancelBtn: ReactComponentClass[js.Object], OkBtn: ReactComponentClass[js.Object]): CancelBtn = {
    val __obj = js.Dynamic.literal(CancelBtn = CancelBtn.asInstanceOf[js.Any], OkBtn = OkBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBtn]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: CancelBtn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelBtn(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "CancelBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkBtn(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "OkBtn", value.asInstanceOf[js.Any])
  }
}
