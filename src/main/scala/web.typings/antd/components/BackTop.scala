package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esBackTopMod.BackTopProps
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackTop {
  
  @JSImport("antd", "BackTop")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: () => HTMLElement | Window | Document): this.type = set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def visibilityHeight(value: Double): this.type = set("visibilityHeight", value.asInstanceOf[js.Any])
  }
  
  type Props = BackTopProps
  
  implicit def make(companion: BackTop.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BackTopProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
