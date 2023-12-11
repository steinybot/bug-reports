package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.H
import web.typings.antd.antdStrings.L
import web.typings.antd.antdStrings.M
import web.typings.antd.antdStrings.Q
import web.typings.antd.antdStrings.active
import web.typings.antd.antdStrings.canvas
import web.typings.antd.antdStrings.expired
import web.typings.antd.antdStrings.loading
import web.typings.antd.antdStrings.svg
import web.typings.antd.esQrCodeInterfaceMod_.ImageSettings
import web.typings.antd.esQrCodeInterfaceMod_.QRCodeProps
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QRCode {
  
  @scala.inline
  def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[QRCodeProps]))
  }
  
  @JSImport("antd", "QRCode")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def bgColor(value: String): this.type = set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorLevel(value: L | M | Q | H): this.type = set("errorLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageSettings(value: ImageSettings): this.type = set("imageSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def includeMargin(value: Boolean): this.type = set("includeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRefresh(value: () => Unit): this.type = set("onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: active | expired | loading): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: canvas | svg): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  type Props = QRCodeProps
  
  def withProps(p: QRCodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
