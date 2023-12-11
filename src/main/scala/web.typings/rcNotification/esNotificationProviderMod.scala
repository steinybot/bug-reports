package web.typings.rcNotification

import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationProviderMod extends Shortcut {
  
  @JSImport("rc-notification/es/NotificationProvider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NotificationProviderProps] = js.native
  
  @JSImport("rc-notification/es/NotificationProvider", "NotificationContext")
  @js.native
  val NotificationContext: Context[NotificationContextProps] = js.native
  
  @js.native
  trait NotificationContextProps extends StObject {
    
    var classNames: js.UndefOr[web.typings.rcNotification.anon.List] = js.native
  }
  object NotificationContextProps {
    
    @scala.inline
    def apply(): NotificationContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NotificationContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: web.typings.rcNotification.anon.List): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    }
  }
  
  @js.native
  trait NotificationProviderProps
    extends StObject
       with NotificationContextProps {
    
    var children: ReactElement = js.native
  }
  object NotificationProviderProps {
    
    @scala.inline
    def apply(children: ReactElement): NotificationProviderProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationProviderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NotificationProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[NotificationProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `esNotificationProviderMod.foo` */
  override def _to: ReactComponentClass[NotificationProviderProps] = default
}
