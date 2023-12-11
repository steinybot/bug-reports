package web.typings.antd

import web.typings.antd.esNotificationInterfaceMod.ArgsProps
import web.typings.antd.esNotificationInterfaceMod.GlobalConfigProps
import web.typings.antd.esNotificationInterfaceMod.NotificationConfig
import web.typings.antd.esNotificationInterfaceMod.NotificationInstance
import web.typings.antd.esNotificationPurePanelMod.PurePanelProps
import web.typings.react.mod.Key
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationMod extends Shortcut {
  
  @JSImport("antd/es/notification", JSImport.Default)
  @js.native
  val default: NoticeMethods with BaseMethods = js.native
  
  @js.native
  trait BaseMethods extends StObject {
    
    /** @private Internal Component. Do not use in your production. */
    var _InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[PurePanelProps] = js.native
    
    def config(config: GlobalConfigProps): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(key: Key): Unit = js.native
    
    def open(config: ArgsProps): Unit = js.native
    
    var useNotification: js.Function1[
        /* notificationConfig */ js.UndefOr[NotificationConfig], 
        js.Tuple2[NotificationInstance, ReactElement]
      ] = js.native
  }
  
  @js.native
  trait NoticeMethods extends StObject {
    
    var error: StaticFn = js.native
    
    var info: StaticFn = js.native
    
    var success: StaticFn = js.native
    
    var warning: StaticFn = js.native
  }
  object NoticeMethods {
    
    @scala.inline
    def apply(
      error: /* config */ ArgsProps => Unit,
      info: /* config */ ArgsProps => Unit,
      success: /* config */ ArgsProps => Unit,
      warning: /* config */ ArgsProps => Unit
    ): NoticeMethods = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), success = js.Any.fromFunction1(success), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[NoticeMethods]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NoticeMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* config */ ArgsProps => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: /* config */ ArgsProps => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccess(value: /* config */ ArgsProps => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarning(value: /* config */ ArgsProps => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
  
  type StaticFn = js.Function1[/* config */ ArgsProps, Unit]
  
  type _To = NoticeMethods with BaseMethods
  
  /* This means you don't have to write `default`, but can instead just say `esNotificationMod.foo` */
  override def _to: NoticeMethods with BaseMethods = default
}
