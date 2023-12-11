package web.typings.rcComponentTour

import web.typings.rcComponentTour.anon.Color
import web.typings.rcComponentTour.anon.PointAtCenter
import web.typings.rcComponentTour.esPlacementsMod.PlacementType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import web.typings.std.ScrollIntoViewOptions
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTourStepMod {
  
  @JSImport("@rc-component/tour/es/TourStep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: TourStepProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait TourStepInfo extends StObject {
    
    var arrow: js.UndefOr[Boolean | PointAtCenter] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var mask: js.UndefOr[Boolean | Color] = js.native
    
    var placement: js.UndefOr[PlacementType] = js.native
    
    var scrollIntoViewOptions: js.UndefOr[Boolean | ScrollIntoViewOptions] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var target: js.UndefOr[HTMLElement | (js.Function0[HTMLElement | Null]) | Null] = js.native
    
    var title: ReactElement = js.native
  }
  object TourStepInfo {
    
    @scala.inline
    def apply(title: ReactElement): TourStepInfo = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TourStepInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TourStepInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow(value: Boolean | PointAtCenter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean | Color): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setPlacement(value: PlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setScrollIntoViewOptions(value: Boolean | ScrollIntoViewOptions): Self = StObject.set(x, "scrollIntoViewOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollIntoViewOptionsUndefined: Self = StObject.set(x, "scrollIntoViewOptions", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | (js.Function0[HTMLElement | Null])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TourStepProps
    extends StObject
       with TourStepInfo {
    
    var current: js.UndefOr[Double] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onNext: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPrev: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderPanel: js.UndefOr[js.Function2[/* step */ this.type, /* current */ Double, ReactElement]] = js.native
    
    var total: js.UndefOr[Double] = js.native
  }
  object TourStepProps {
    
    @scala.inline
    def apply(title: ReactElement): TourStepProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TourStepProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TourStepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      @scala.inline
      def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      @scala.inline
      def setOnPrev(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderPanel(value: (TourStepProps, /* current */ Double) => ReactElement): Self = StObject.set(x, "renderPanel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderPanelUndefined: Self = StObject.set(x, "renderPanel", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
