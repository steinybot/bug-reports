package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esSpinMod.SpinProps
import web.typings.antd.esSpinMod.SpinSize
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spin {
  
  @JSImport("antd", "Spin")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicator(value: ReactElement): this.type = set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SpinSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spinning(value: Boolean): this.type = set("spinning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tip(value: ReactElement): this.type = set("tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
  }
  
  type Props = SpinProps
  
  implicit def make(companion: Spin.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpinProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
