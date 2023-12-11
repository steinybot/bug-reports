package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esBadgeScrollNumberMod.ScrollNumberProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollNumber {
  
  @scala.inline
  def apply(show: Boolean): Builder = {
    val __props = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollNumberProps with RefAttributes[HTMLElement]]))
  }
  
  @JSImport("antd/es/badge/ScrollNumber", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactComponentClass[Any]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def count(value: String | Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def countNull: this.type = set("count", null)
    
    @scala.inline
    def motionClassName(value: String): this.type = set("motionClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String | Double): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleNull: this.type = set("title", null)
  }
  
  type Props = ScrollNumberProps with RefAttributes[HTMLElement]
  
  def withProps(p: ScrollNumberProps with RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
