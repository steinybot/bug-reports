package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esEmptyMod.EmptyProps
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Empty {
  
  @JSImport("antd", "Empty")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def image(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageStyle(value: CSSProperties): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = EmptyProps
  
  implicit def make(companion: Empty.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EmptyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
