package web.typings.rcComponentTour.components

import web.typings.StBuildingComponent
import web.typings.rcComponentTour.anon.Color
import web.typings.rcComponentTour.anon.Placeholder
import web.typings.rcComponentTour.anon.PointAtCenter
import web.typings.rcComponentTour.esHooksUseTargetMod.Gap
import web.typings.rcComponentTour.esPlacementsMod.PlacementType
import web.typings.rcComponentTour.esTourMod.TourProps
import web.typings.rcComponentTour.esTourStepMod.TourStepInfo
import web.typings.rcComponentTour.esTourStepMod.TourStepProps
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.std.ScrollIntoViewOptions
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tour {
  
  @JSImport("@rc-component/tour", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def animated(value: Boolean | Placeholder): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrow(value: Boolean | PointAtCenter): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultCurrent(value: Double): this.type = set("defaultCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: Gap): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def mask(value: Boolean | Color): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* current */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: /* current */ Double => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFinish(value: () => Unit): this.type = set("onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): this.type = set("onPopupAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: PlacementType): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderPanel(value: (/* props */ TourStepProps, /* current */ Double) => ReactElement): this.type = set("renderPanel", js.Any.fromFunction2(value))
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollIntoViewOptions(value: Boolean | ScrollIntoViewOptions): this.type = set("scrollIntoViewOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def steps(value: js.Array[TourStepInfo]): this.type = set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepsVarargs(value: TourStepInfo*): this.type = set("steps", js.Array(value :_*))
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  type Props = TourProps
  
  implicit def make(companion: Tour.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TourProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
