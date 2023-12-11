package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationAction extends StObject {
  
  /* standard dom */
  var action: java.lang.String = js.native
  
  /* standard dom */
  var icon: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var title: java.lang.String = js.native
}
object NotificationAction {
  
  @scala.inline
  def apply(action: java.lang.String, title: java.lang.String): NotificationAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationAction]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: NotificationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: java.lang.String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
