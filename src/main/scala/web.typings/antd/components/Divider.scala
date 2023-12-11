package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.center
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.right
import web.typings.antd.antdStrings.vertical
import web.typings.antd.esDividerMod.DividerProps
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Divider {
  
  @JSImport("antd", "Divider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dashed(value: Boolean): this.type = set("dashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientation(value: left | right | center): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientationMargin(value: String | Double): this.type = set("orientationMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: horizontal | vertical): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  type Props = DividerProps
  
  implicit def make(companion: Divider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DividerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
