package web.typings.antd.anon

import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.primary
import web.typings.antd.esTourInterfaceMod.TourStepProps
import web.typings.rcComponentTour.anon.Placeholder
import web.typings.rcComponentTour.esHooksUseTargetMod.Gap
import web.typings.rcComponentTour.esPlacementsMod.PlacementType
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.std.ScrollIntoViewOptions
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/es/tour/interface.TourProps> */
@js.native
trait PartialTourProps extends StObject {
  
  var animated: js.UndefOr[Boolean | Placeholder] = js.native
  
  var arrow: js.UndefOr[Boolean | web.typings.rcComponentTour.anon.PointAtCenter] = js.native
  
  var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closeIcon: js.UndefOr[ReactElement] = js.native
  
  var current: js.UndefOr[Double] = js.native
  
  var defaultCurrent: js.UndefOr[Double] = js.native
  
  var gap: js.UndefOr[Gap] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  
  var indicatorsRender: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, ReactElement]] = js.native
  
  var mask: js.UndefOr[Boolean | web.typings.rcComponentTour.anon.Color] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* current */ Double, scala.Unit]] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* current */ Double, scala.Unit]] = js.native
  
  var onFinish: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, scala.Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var placement: js.UndefOr[PlacementType] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var scrollIntoViewOptions: js.UndefOr[Boolean | ScrollIntoViewOptions] = js.native
  
  var steps: js.UndefOr[js.Array[TourStepProps]] = js.native
  
  var `type`: js.UndefOr[default | primary] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object PartialTourProps {
  
  @scala.inline
  def apply(): PartialTourProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTourProps]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialTourProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean | Placeholder): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setArrow(value: Boolean | web.typings.rcComponentTour.anon.PointAtCenter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
    
    @scala.inline
    def setGap(value: Gap): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
    
    @scala.inline
    def setIndicatorsRender(value: (/* current */ Double, /* total */ Double) => ReactElement): Self = StObject.set(x, "indicatorsRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndicatorsRenderUndefined: Self = StObject.set(x, "indicatorsRender", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean | web.typings.rcComponentTour.anon.Color): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* current */ Double => scala.Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* current */ Double => scala.Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnFinish(value: () => scala.Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    @scala.inline
    def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => scala.Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPlacement(value: PlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setScrollIntoViewOptions(value: Boolean | ScrollIntoViewOptions): Self = StObject.set(x, "scrollIntoViewOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollIntoViewOptionsUndefined: Self = StObject.set(x, "scrollIntoViewOptions", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[TourStepProps]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: TourStepProps*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setType(value: default | primary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
