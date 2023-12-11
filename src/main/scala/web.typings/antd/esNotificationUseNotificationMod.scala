package web.typings.antd

import web.typings.antd.esNotificationInterfaceMod.NotificationConfig
import web.typings.antd.esNotificationInterfaceMod.NotificationInstance
import web.typings.std.VoidFunction
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationUseNotificationMod {
  
  @JSImport("antd/es/notification/useNotification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Tuple2[NotificationInstance, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[NotificationInstance, ReactElement]]
  @scala.inline
  def default(notificationConfig: NotificationConfig): js.Tuple2[NotificationInstance, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(notificationConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NotificationInstance, ReactElement]]
  
  @scala.inline
  def useInternalNotification(): js.Tuple2[NotificationInstance, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInternalNotification")().asInstanceOf[js.Tuple2[NotificationInstance, ReactElement]]
  @scala.inline
  def useInternalNotification(notificationConfig: HolderProps): js.Tuple2[NotificationInstance, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInternalNotification")(notificationConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NotificationInstance, ReactElement]]
  
  @js.native
  trait HolderProps
    extends StObject
       with NotificationConfig {
    
    var onAllRemoved: js.UndefOr[VoidFunction] = js.native
  }
  object HolderProps {
    
    @scala.inline
    def apply(): HolderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HolderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HolderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnAllRemoved(value: () => Unit): Self = StObject.set(x, "onAllRemoved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAllRemovedUndefined: Self = StObject.set(x, "onAllRemoved", js.undefined)
    }
  }
}
