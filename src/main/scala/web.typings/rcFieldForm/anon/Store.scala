package web.typings.rcFieldForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends StObject {
  
  var store: web.typings.rcFieldForm.esInterfaceMod.Store = js.native
}
object Store {
  
  @scala.inline
  def apply(store: web.typings.rcFieldForm.esInterfaceMod.Store): Store = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStore(value: web.typings.rcFieldForm.esInterfaceMod.Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
