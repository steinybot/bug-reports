package web.typings.rcSteps

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  @js.native
  trait Icons extends StObject {
    
    var error: ReactElement = js.native
    
    var finish: ReactElement = js.native
  }
  object Icons {
    
    @scala.inline
    def apply(error: ReactElement, finish: ReactElement): Icons = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icons]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinish(value: ReactElement): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcSteps.rcStepsStrings.error
    - `web.typings`.rcSteps.rcStepsStrings.process
    - `web.typings`.rcSteps.rcStepsStrings.finish
    - `web.typings`.rcSteps.rcStepsStrings.wait
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def error: web.typings.rcSteps.rcStepsStrings.error = "error".asInstanceOf[web.typings.rcSteps.rcStepsStrings.error]
    
    @scala.inline
    def finish: web.typings.rcSteps.rcStepsStrings.finish = "finish".asInstanceOf[web.typings.rcSteps.rcStepsStrings.finish]
    
    @scala.inline
    def process: web.typings.rcSteps.rcStepsStrings.process = "process".asInstanceOf[web.typings.rcSteps.rcStepsStrings.process]
  }
}
