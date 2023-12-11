package web.typings.rcTable

import web.typings.rcTable.libFooterCellMod.SummaryCellProps
import web.typings.rcTable.libFooterRowMod.FooterRowProps
import web.typings.rcTable.rcTableStrings.bottom
import web.typings.rcTable.rcTableStrings.top
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterSummaryMod {
  
  object default {
    
    /**
      * Syntactic sugar. Do not support HOC.
      */
    @scala.inline
    def apply(param0: SummaryProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-table/lib/Footer/Summary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Cell.default` */
    @scala.inline
    def Cell(param0: SummaryCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Cell")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /* was `typeof imported_Row.default` */
    @scala.inline
    def Row(param0: FooterRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Row")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  @js.native
  trait SummaryProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var fixed: js.UndefOr[Boolean | top | bottom] = js.native
  }
  object SummaryProps {
    
    @scala.inline
    def apply(): SummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SummaryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean | top | bottom): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    }
  }
}
