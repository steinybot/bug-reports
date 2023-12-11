package web.typings.antd.anon

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
import web.typings.antd.esProgressProgressMod.ProgressGradient
import web.typings.antd.esProgressProgressMod.ProgressSize
import web.typings.antd.esProgressProgressMod.ProgressType
import web.typings.antd.esProgressProgressMod.SuccessProps
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/es/progress/Circle.CircleProps> */
@js.native
trait PartialCircleProps extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[
    js.Function2[
      /* percent */ js.UndefOr[Double], 
      /* successPercent */ js.UndefOr[Double], 
      ReactElement
    ]
  ] = js.native
  
  var gapDegree: js.UndefOr[Double] = js.native
  
  var gapPosition: js.UndefOr[top | bottom | left | right] = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var progressStatus: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var showInfo: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double | (js.Tuple2[Double | String, Double]) | ProgressSize] = js.native
  
  var status: js.UndefOr[normal | exception | active | success] = js.native
  
  var steps: js.UndefOr[Double] = js.native
  
  var strokeColor: js.UndefOr[String | ProgressGradient] = js.native
  
  var strokeLinecap: js.UndefOr[butt | square | round] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var success: js.UndefOr[SuccessProps] = js.native
  
  var successPercent: js.UndefOr[Double] = js.native
  
  var trailColor: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[ProgressType] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialCircleProps {
  
  @scala.inline
  def apply(): PartialCircleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCircleProps]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialCircleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setFormat(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactElement): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGapDegree(value: Double): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapDegreeUndefined: Self = StObject.set(x, "gapDegree", js.undefined)
    
    @scala.inline
    def setGapPosition(value: top | bottom | left | right): Self = StObject.set(x, "gapPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapPositionUndefined: Self = StObject.set(x, "gapPosition", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setProgressStatus(value: String): Self = StObject.set(x, "progressStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressStatusUndefined: Self = StObject.set(x, "progressStatus", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
    
    @scala.inline
    def setSize(value: Double | (js.Tuple2[Double | String, Double]) | ProgressSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: normal | exception | active | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: butt | square | round): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuccess(value: SuccessProps): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessPercent(value: Double): Self = StObject.set(x, "successPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessPercentUndefined: Self = StObject.set(x, "successPercent", js.undefined)
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
    
    @scala.inline
    def setType(value: ProgressType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
