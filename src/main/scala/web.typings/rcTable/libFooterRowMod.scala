package web.typings.rcTable

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterRowMod {
  
  @JSImport("rc-table/lib/Footer/Row", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: FooterRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait FooterRowProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object FooterRowProps {
    
    @scala.inline
    def apply(): FooterRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterRowProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FooterRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
