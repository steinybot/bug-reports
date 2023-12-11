package web.typings.antd

import web.typings.antd.esProgressProgressMod.ProgressProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esProgressStepsMod extends Shortcut {
  
  @JSImport("antd/es/progress/Steps", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ProgressStepsProps] = js.native
  
  @js.native
  trait ProgressStepsProps
    extends StObject
       with ProgressProps {
    
    @JSName("steps")
    var steps_ProgressStepsProps: Double = js.native
    
    @JSName("strokeColor")
    var strokeColor_ProgressStepsProps: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ProgressStepsProps {
    
    @scala.inline
    def apply(steps: Double): ProgressStepsProps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressStepsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ProgressStepsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColor(value: String | js.Array[String]): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[ProgressStepsProps]
  
  /* This means you don't have to write `default`, but can instead just say `esProgressStepsMod.foo` */
  override def _to: ReactComponentClass[ProgressStepsProps] = default
}
