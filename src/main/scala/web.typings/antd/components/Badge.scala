package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Indicator
import web.typings.antd.anon.Root
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.small
import web.typings.antd.esBadgeMod.BadgeProps
import web.typings.antd.esBadgeRibbonMod.RibbonProps
import web.typings.antd.esThemeInterfacePresetColorsMod.PresetColorKey
import web.typings.antd.esUtilColorsMod.PresetStatusColorType
import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.html.span.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  object Ribbon {
    
    @JSImport("antd", "Badge.Ribbon")
    @js.native
    val component: js.Object = js.native
    
    type Props = RibbonProps
    
    implicit def make(companion: Ribbon.type): SharedBuilder_RibbonProps1749950343 = new SharedBuilder_RibbonProps1749950343(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RibbonProps): SharedBuilder_RibbonProps1749950343 = new SharedBuilder_RibbonProps1749950343(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Badge")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLSpanElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNames(value: Indicator): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: LiteralUnion[PresetColorKey]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def count(value: ReactElement): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dot(value: Boolean): this.type = set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: js.Tuple2[Double | String, Double | String]): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowCount(value: Double): this.type = set("overflowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollNumberPrefixCls(value: String): this.type = set("scrollNumberPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showZero(value: Boolean): this.type = set("showZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: PresetStatusColorType): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: Root): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  type Props = BadgeProps with RefAttributes[HTMLSpanElement]
  
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BadgeProps with RefAttributes[HTMLSpanElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
