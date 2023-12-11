package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esTooltipMod.TooltipProps
import web.typings.antd.esTypographyBaseEllipsisTooltipMod.EllipsisTooltipProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EllipsisTooltip {
  
  @scala.inline
  def apply(enabledEllipsis: Boolean): Builder = {
    val __props = js.Dynamic.literal(enabledEllipsis = enabledEllipsis.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EllipsisTooltipProps]))
  }
  
  @JSImport("antd/es/typography/Base/EllipsisTooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def isEllipsis(value: Boolean): this.type = set("isEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipProps(value: TooltipProps): this.type = set("tooltipProps", value.asInstanceOf[js.Any])
  }
  
  type Props = EllipsisTooltipProps
  
  def withProps(p: EllipsisTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
