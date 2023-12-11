package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSider extends StObject {
  
  def addSider(id: String): scala.Unit = js.native
  
  def removeSider(id: String): scala.Unit = js.native
}
object AddSider {
  
  @scala.inline
  def apply(addSider: String => scala.Unit, removeSider: String => scala.Unit): AddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
    __obj.asInstanceOf[AddSider]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AddSider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSider(value: String => scala.Unit): Self = StObject.set(x, "addSider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSider(value: String => scala.Unit): Self = StObject.set(x, "removeSider", js.Any.fromFunction1(value))
  }
}
