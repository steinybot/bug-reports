package web.typings.rcNotification

import web.typings.rcNotification.anon.NoticePropstimesnumberund
import web.typings.rcNotification.esHooksUseNotificationMod.NotificationAPI
import web.typings.rcNotification.esHooksUseNotificationMod.NotificationConfig
import web.typings.rcNotification.esNotificationProviderMod.NotificationProviderProps
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-notification", "Notice")
  @js.native
  val Notice: ReactComponentClass[NoticePropstimesnumberund] = js.native
  
  @JSImport("rc-notification", "NotificationProvider")
  @js.native
  val NotificationProvider: ReactComponentClass[NotificationProviderProps] = js.native
  
  @scala.inline
  def useNotification(): js.Tuple2[NotificationAPI, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotification")().asInstanceOf[js.Tuple2[NotificationAPI, ReactElement]]
  @scala.inline
  def useNotification(rootConfig: NotificationConfig): js.Tuple2[NotificationAPI, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotification")(rootConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NotificationAPI, ReactElement]]
}
