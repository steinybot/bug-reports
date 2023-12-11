package web.typings.rcMotion

import web.typings.rcMotion.anon.MotionContextPropschildre
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod {
  
  @JSImport("rc-motion/es/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: MotionContextPropschildre): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-motion/es/context", "Context")
  @js.native
  val Context: web.typings.react.mod.Context[MotionContextProps] = js.native
  
  @js.native
  trait MotionContextProps extends StObject {
    
    var motion: js.UndefOr[Boolean] = js.native
  }
  object MotionContextProps {
    
    @scala.inline
    def apply(): MotionContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MotionContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MotionContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMotion(value: Boolean): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    }
  }
}
