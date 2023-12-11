package web.typings.antd

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderMotionWrapperMod {
  
  @JSImport("antd/es/config-provider/MotionWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: MotionWrapperProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @js.native
  trait MotionWrapperProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
  }
  object MotionWrapperProps {
    
    @scala.inline
    def apply(): MotionWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MotionWrapperProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MotionWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
