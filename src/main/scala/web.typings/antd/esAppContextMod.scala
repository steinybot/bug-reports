package web.typings.antd

import web.typings.antd.esMessageInterfaceMod.ConfigOptions
import web.typings.antd.esMessageInterfaceMod.MessageInstance
import web.typings.antd.esModalUseModalMod.HookAPI
import web.typings.antd.esNotificationInterfaceMod.NotificationConfig
import web.typings.antd.esNotificationInterfaceMod.NotificationInstance
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAppContextMod extends Shortcut {
  
  @JSImport("antd/es/app/context", JSImport.Default)
  @js.native
  val default: Context[useAppProps] = js.native
  
  @JSImport("antd/es/app/context", "AppConfigContext")
  @js.native
  val AppConfigContext: Context[AppConfig] = js.native
  
  @js.native
  trait AppConfig extends StObject {
    
    var message: js.UndefOr[ConfigOptions] = js.native
    
    var notification: js.UndefOr[NotificationConfig] = js.native
  }
  object AppConfig {
    
    @scala.inline
    def apply(): AppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AppConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: ConfigOptions): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setNotification(value: NotificationConfig): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
  
  type _To = Context[useAppProps]
  
  /* This means you don't have to write `default`, but can instead just say `esAppContextMod.foo` */
  override def _to: Context[useAppProps] = default
  
  @js.native
  trait useAppProps extends StObject {
    
    var message: MessageInstance = js.native
    
    var modal: HookAPI = js.native
    
    var notification: NotificationInstance = js.native
  }
  object useAppProps {
    
    @scala.inline
    def apply(message: MessageInstance, modal: HookAPI, notification: NotificationInstance): useAppProps = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[useAppProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: useAppProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: MessageInstance): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: HookAPI): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(value: NotificationInstance): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
