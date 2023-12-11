package web.typings.rcMotion

import web.typings.react.mod.Component
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDomWrapperMod {
  
  @JSImport("rc-motion/es/DomWrapper", JSImport.Default)
  @js.native
  class default () extends DomWrapper
  
  @js.native
  trait DomWrapper
    extends Component[DomWrapperProps, js.Object, Any]
  
  @js.native
  trait DomWrapperProps extends StObject {
    
    var children: ReactElement = js.native
  }
  object DomWrapperProps {
    
    @scala.inline
    def apply(children: ReactElement): DomWrapperProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomWrapperProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DomWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
}
