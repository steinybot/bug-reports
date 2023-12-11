package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEventInit
  extends StObject
     with MouseEventInit {
  
  /* standard dom */
  var dataTransfer: js.UndefOr[org.scalajs.dom.DataTransfer | Null] = js.native
}
object DragEventInit {
  
  @scala.inline
  def apply(): DragEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DragEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTransfer(value: org.scalajs.dom.DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferNull: Self = StObject.set(x, "dataTransfer", null)
    
    @scala.inline
    def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
  }
}
