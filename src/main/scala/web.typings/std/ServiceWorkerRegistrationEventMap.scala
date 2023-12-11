package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerRegistrationEventMap extends StObject {
  
  /* standard dom */
  var updatefound: org.scalajs.dom.Event = js.native
}
object ServiceWorkerRegistrationEventMap {
  
  @scala.inline
  def apply(updatefound: org.scalajs.dom.Event): ServiceWorkerRegistrationEventMap = {
    val __obj = js.Dynamic.literal(updatefound = updatefound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistrationEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ServiceWorkerRegistrationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdatefound(value: org.scalajs.dom.Event): Self = StObject.set(x, "updatefound", value.asInstanceOf[js.Any])
  }
}
