package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.primary
import web.typings.antd.esTourInterfaceMod.TourStepProps
import web.typings.antd.esTourPanelRenderMod.TourPanelProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelRender {
  
  @scala.inline
  def apply(current: Double, stepProps: TourStepProps): Builder = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], stepProps = stepProps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TourPanelProps]))
  }
  
  @JSImport("antd/es/tour/panelRender", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorsRender(value: (/* current */ Double, /* total */ Double) => ReactElement): this.type = set("indicatorsRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def `type`(value: default | primary): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  type Props = TourPanelProps
  
  def withProps(p: TourPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
