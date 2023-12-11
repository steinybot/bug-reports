package web.typings.antd

import web.typings.antd.esTooltipMod.TooltipProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypographyBaseEllipsisTooltipMod extends Shortcut {
  
  @JSImport("antd/es/typography/Base/EllipsisTooltip", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EllipsisTooltipProps] = js.native
  
  @js.native
  trait EllipsisTooltipProps extends StObject {
    
    var children: ReactElement = js.native
    
    var enabledEllipsis: Boolean = js.native
    
    var isEllipsis: js.UndefOr[Boolean] = js.native
    
    var tooltipProps: js.UndefOr[TooltipProps] = js.native
  }
  object EllipsisTooltipProps {
    
    @scala.inline
    def apply(children: ReactElement, enabledEllipsis: Boolean): EllipsisTooltipProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], enabledEllipsis = enabledEllipsis.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipsisTooltipProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: EllipsisTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledEllipsis(value: Boolean): Self = StObject.set(x, "enabledEllipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEllipsis(value: Boolean): Self = StObject.set(x, "isEllipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEllipsisUndefined: Self = StObject.set(x, "isEllipsis", js.undefined)
      
      @scala.inline
      def setTooltipProps(value: TooltipProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[EllipsisTooltipProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTypographyBaseEllipsisTooltipMod.foo` */
  override def _to: ReactComponentClass[EllipsisTooltipProps] = default
}
