package web.typings.antd.anon

import web.typings.antd.esModalConfirmMod.ConfigUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends StObject {
  
  def destroy(args: Any*): scala.Unit = js.native
  
  def update(configUpdate: ConfigUpdate): scala.Unit = js.native
}
object Update {
  
  @scala.inline
  def apply(destroy: /* repeated */ Any => scala.Unit, update: ConfigUpdate => scala.Unit): Update = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: /* repeated */ Any => scala.Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: ConfigUpdate => scala.Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
