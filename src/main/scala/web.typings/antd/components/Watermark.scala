package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Color
import web.typings.antd.esWatermarkMod.WatermarkProps
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Watermark {
  
  @JSImport("antd", "Watermark")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: String | js.Array[String]): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentVarargs(value: String*): this.type = set("content", js.Array(value :_*))
    
    @scala.inline
    def font(value: Color): this.type = set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: js.Tuple2[Double, Double]): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inherit(value: Boolean): this.type = set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: js.Tuple2[Double, Double]): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  type Props = WatermarkProps
  
  implicit def make(companion: Watermark.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WatermarkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
