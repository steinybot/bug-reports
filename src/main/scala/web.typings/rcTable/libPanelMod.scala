package web.typings.rcTable

import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelMod {
  
  @JSImport("rc-table/lib/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: TitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait TitleProps extends StObject {
    
    var children: ReactElement = js.native
    
    var className: String = js.native
  }
  object TitleProps {
    
    @scala.inline
    def apply(children: ReactElement, className: String): TitleProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
}
