package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.active
import web.typings.antd.antdStrings.bottom
import web.typings.antd.antdStrings.butt
import web.typings.antd.antdStrings.exception
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.normal
import web.typings.antd.antdStrings.right
import web.typings.antd.antdStrings.round
import web.typings.antd.antdStrings.square
import web.typings.antd.antdStrings.success
import web.typings.antd.antdStrings.top
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.antd.esProgressLineMod.LineProps
import web.typings.antd.esProgressProgressMod.ProgressGradient
import web.typings.antd.esProgressProgressMod.ProgressSize
import web.typings.antd.esProgressProgressMod.ProgressType
import web.typings.antd.esProgressProgressMod.SuccessProps
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Line {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineProps]))
  }
  
  @JSImport("antd/es/progress/Line", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactElement): this.type = set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def gapDegree(value: Double): this.type = set("gapDegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gapPosition(value: top | bottom | left | right): this.type = set("gapPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showInfo(value: Boolean): this.type = set("showInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double | (js.Tuple2[Double | String, Double]) | ProgressSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: normal | exception | active | success): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def steps(value: Double): this.type = set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeColor(value: String | ProgressGradient): this.type = set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinecap(value: butt | square | round): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def success(value: SuccessProps): this.type = set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def successPercent(value: Double): this.type = set("successPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trailColor(value: String): this.type = set("trailColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: ProgressType): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  type Props = LineProps
  
  def withProps(p: LineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
