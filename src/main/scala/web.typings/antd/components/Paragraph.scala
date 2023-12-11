package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esSkeletonParagraphMod.SkeletonParagraphProps
import web.typings.antd.esSkeletonParagraphMod.widthUnit
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Paragraph {
  
  @JSImport("antd/es/skeleton/Paragraph", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: widthUnit | js.Array[widthUnit]): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthVarargs(value: widthUnit*): this.type = set("width", js.Array(value :_*))
  }
  
  type Props = SkeletonParagraphProps
  
  implicit def make(companion: Paragraph.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonParagraphProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
