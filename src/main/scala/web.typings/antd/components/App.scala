package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esAppMod.AppProps
import web.typings.antd.esMessageInterfaceMod.ConfigOptions
import web.typings.antd.esNotificationInterfaceMod.NotificationConfig
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.antd.esUtilTypeMod.CustomComponent
import web.typings.react.mod.CSSProperties
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  @JSImport("antd", "App")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: CustomComponent[AnyObject] | `false`): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentReactComponentClass(value: ReactComponentClass[AnyObject]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def message(value: ConfigOptions): this.type = set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notification(value: NotificationConfig): this.type = set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = AppProps[AnyObject]
  
  implicit def make(companion: App.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AppProps[AnyObject]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
