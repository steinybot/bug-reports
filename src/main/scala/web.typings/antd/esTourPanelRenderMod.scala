package web.typings.antd

import web.typings.antd.antdStrings.primary
import web.typings.antd.esTourInterfaceMod.TourStepProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTourPanelRenderMod extends Shortcut {
  
  @JSImport("antd/es/tour/panelRender", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TourPanelProps] = js.native
  
  @js.native
  trait TourPanelProps extends StObject {
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var current: Double = js.native
    
    var indicatorsRender: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, ReactElement]] = js.native
    
    var stepProps: TourStepProps = js.native
    
    var `type`: js.UndefOr[web.typings.antd.antdStrings.default | primary] = js.native
  }
  object TourPanelProps {
    
    @scala.inline
    def apply(current: Double, stepProps: TourStepProps): TourPanelProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], stepProps = stepProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[TourPanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TourPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsRender(value: (/* current */ Double, /* total */ Double) => ReactElement): Self = StObject.set(x, "indicatorsRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndicatorsRenderUndefined: Self = StObject.set(x, "indicatorsRender", js.undefined)
      
      @scala.inline
      def setStepProps(value: TourStepProps): Self = StObject.set(x, "stepProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: web.typings.antd.antdStrings.default | primary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TourPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTourPanelRenderMod.foo` */
  override def _to: ReactComponentClass[TourPanelProps] = default
}
