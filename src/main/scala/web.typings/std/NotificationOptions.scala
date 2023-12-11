package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationOptions extends StObject {
  
  /* standard dom */
  var actions: js.UndefOr[js.Array[NotificationAction]] = js.native
  
  /* standard dom */
  var badge: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var body: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var data: js.UndefOr[Any] = js.native
  
  /* standard dom */
  var dir: js.UndefOr[NotificationDirection] = js.native
  
  /* standard dom */
  var icon: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var image: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var lang: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var renotify: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var requireInteraction: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var silent: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var tag: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var timestamp: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var vibrate: js.UndefOr[VibratePattern] = js.native
}
object NotificationOptions {
  
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[NotificationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: NotificationAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setBadge(value: java.lang.String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setBody(value: java.lang.String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDir(value: NotificationDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImage(value: java.lang.String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLang(value: java.lang.String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setRenotify(value: scala.Boolean): Self = StObject.set(x, "renotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenotifyUndefined: Self = StObject.set(x, "renotify", js.undefined)
    
    @scala.inline
    def setRequireInteraction(value: scala.Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
    
    @scala.inline
    def setSilent(value: scala.Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setTag(value: java.lang.String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setVibrate(value: VibratePattern): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    
    @scala.inline
    def setVibrateVarargs(value: Double*): Self = StObject.set(x, "vibrate", js.Array(value :_*))
  }
}
