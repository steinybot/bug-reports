package web.typings.rcNotification.components

import web.typings.StBuildingComponent
import web.typings.rcNotification.esNotificationProviderMod.NotificationProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotificationProvider {
  
  @JSImport("rc-notification", "NotificationProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classNames(value: web.typings.rcNotification.anon.List): this.type = set("classNames", value.asInstanceOf[js.Any])
  }
  
  type Props = NotificationProviderProps
  
  implicit def make(companion: NotificationProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NotificationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
