package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.info
import web.typings.antd.antdStrings.success
import web.typings.antd.antdStrings.warning
import web.typings.antd.esAlertAlertMod.AlertProps
import web.typings.antd.esAlertErrorBoundaryMod.ErrorBoundaryProps
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Alert {
  
  object ErrorBoundary {
    
    @JSImport("antd", "Alert.ErrorBoundary")
    @js.native
    val component: js.Object = js.native
    
    type Props = ErrorBoundaryProps
    
    implicit def make(companion: ErrorBoundary.type): SharedBuilder_ErrorBoundaryProps1272393588[web.typings.antd.mod.Alert.ErrorBoundary] = new SharedBuilder_ErrorBoundaryProps1272393588[web.typings.antd.mod.Alert.ErrorBoundary](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ErrorBoundaryProps): SharedBuilder_ErrorBoundaryProps1272393588[web.typings.antd.mod.Alert.ErrorBoundary] = new SharedBuilder_ErrorBoundaryProps1272393588[web.typings.antd.mod.Alert.ErrorBoundary](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Alert")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def action(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def banner(value: Boolean): this.type = set("banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: Boolean | ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeText(value: ReactElement): this.type = set("closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def message(value: ReactElement): this.type = set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: success | info | warning | error): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  type Props = AlertProps
  
  implicit def make(companion: Alert.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
