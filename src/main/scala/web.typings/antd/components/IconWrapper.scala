package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esButtonIconWrapperMod.IconWrapperProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLSpanElement
import slinky.web.html.span.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconWrapper {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconWrapperProps with RefAttributes[HTMLSpanElement]]))
  }
  
  @JSImport("antd/es/button/IconWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLSpanElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = IconWrapperProps with RefAttributes[HTMLSpanElement]
  
  def withProps(p: IconWrapperProps with RefAttributes[HTMLSpanElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
