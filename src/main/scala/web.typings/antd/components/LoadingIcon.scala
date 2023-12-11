package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esButtonLoadingIconMod.LoadingIconProps
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoadingIcon {
  
  @scala.inline
  def apply(existIcon: Boolean, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(existIcon = existIcon.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LoadingIconProps]))
  }
  
  @JSImport("antd/es/button/LoadingIcon", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean | js.Object): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = LoadingIconProps
  
  def withProps(p: LoadingIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
