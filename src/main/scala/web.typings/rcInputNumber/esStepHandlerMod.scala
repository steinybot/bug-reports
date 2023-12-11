package web.typings.rcInputNumber

import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStepHandlerMod {
  
  @JSImport("rc-input-number/es/StepHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: StepHandlerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait StepHandlerProps extends StObject {
    
    var downDisabled: js.UndefOr[Boolean] = js.native
    
    var downNode: js.UndefOr[ReactElement] = js.native
    
    def onStep(up: Boolean): Unit = js.native
    
    var prefixCls: String = js.native
    
    var upDisabled: js.UndefOr[Boolean] = js.native
    
    var upNode: js.UndefOr[ReactElement] = js.native
  }
  object StepHandlerProps {
    
    @scala.inline
    def apply(onStep: Boolean => Unit, prefixCls: String): StepHandlerProps = {
      val __obj = js.Dynamic.literal(onStep = js.Any.fromFunction1(onStep), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepHandlerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StepHandlerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownDisabled(value: Boolean): Self = StObject.set(x, "downDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownDisabledUndefined: Self = StObject.set(x, "downDisabled", js.undefined)
      
      @scala.inline
      def setDownNode(value: ReactElement): Self = StObject.set(x, "downNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownNodeUndefined: Self = StObject.set(x, "downNode", js.undefined)
      
      @scala.inline
      def setOnStep(value: Boolean => Unit): Self = StObject.set(x, "onStep", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpDisabled(value: Boolean): Self = StObject.set(x, "upDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpDisabledUndefined: Self = StObject.set(x, "upDisabled", js.undefined)
      
      @scala.inline
      def setUpNode(value: ReactElement): Self = StObject.set(x, "upNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpNodeUndefined: Self = StObject.set(x, "upNode", js.undefined)
    }
  }
}
