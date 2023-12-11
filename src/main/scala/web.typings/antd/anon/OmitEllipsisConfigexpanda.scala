package web.typings.antd.anon

import web.typings.antd.esTooltipMod.TooltipProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd.antd/es/typography/Base.EllipsisConfig, 'expandable' | 'rows' | 'onExpand'> */
@js.native
trait OmitEllipsisConfigexpanda extends StObject {
  
  var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, scala.Unit]] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var symbol: js.UndefOr[ReactElement] = js.native
  
  var tooltip: js.UndefOr[ReactElement | TooltipProps] = js.native
}
object OmitEllipsisConfigexpanda {
  
  @scala.inline
  def apply(): OmitEllipsisConfigexpanda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitEllipsisConfigexpanda]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OmitEllipsisConfigexpanda] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnEllipsis(value: /* ellipsis */ Boolean => scala.Unit): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEllipsisUndefined: Self = StObject.set(x, "onEllipsis", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setSymbol(value: ReactElement): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setTooltip(value: ReactElement | TooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipReactElement(value: ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
