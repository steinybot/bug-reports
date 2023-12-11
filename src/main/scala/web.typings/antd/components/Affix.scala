package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esAffixMod.AffixProps
import web.typings.antd.esAffixMod.AffixRef
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Affix {
  
  @JSImport("antd", "Affix")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, AffixRef] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetBottom(value: Double): this.type = set("offsetBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* affixed */ js.UndefOr[Boolean] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: () => Window | HTMLElement | Null): this.type = set("target", js.Any.fromFunction0(value))
  }
  
  type Props = AffixProps with RefAttributes[AffixRef]
  
  implicit def make(companion: Affix.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AffixProps with RefAttributes[AffixRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
