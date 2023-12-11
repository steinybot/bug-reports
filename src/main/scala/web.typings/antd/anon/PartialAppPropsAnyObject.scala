package web.typings.antd.anon

import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esMessageInterfaceMod.ConfigOptions
import web.typings.antd.esNotificationInterfaceMod.NotificationConfig
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.antd.esUtilTypeMod.CustomComponent
import web.typings.react.mod.CSSProperties
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/es/app.AppProps<antd.antd/es/_util/type.AnyObject>> */
@js.native
trait PartialAppPropsAnyObject extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[CustomComponent[AnyObject] | `false`] = js.native
  
  var message: js.UndefOr[ConfigOptions] = js.native
  
  var notification: js.UndefOr[NotificationConfig] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object PartialAppPropsAnyObject {
  
  @scala.inline
  def apply(): PartialAppPropsAnyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAppPropsAnyObject]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialAppPropsAnyObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setComponent(value: CustomComponent[AnyObject] | `false`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentReactComponentClass(value: ReactComponentClass[AnyObject]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setMessage(value: ConfigOptions): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setNotification(value: NotificationConfig): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
