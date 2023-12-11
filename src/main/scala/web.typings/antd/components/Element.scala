package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.circle
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.large
import web.typings.antd.antdStrings.round
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.square
import web.typings.antd.esSkeletonElementMod.SkeletonElementProps
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Element {
  
  @JSImport("antd/es/skeleton/Element", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shape(value: circle | square | round | default): this.type = set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: large | small | default | Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = SkeletonElementProps
  
  implicit def make(companion: Element.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonElementProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
