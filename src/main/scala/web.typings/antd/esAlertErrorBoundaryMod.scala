package web.typings.antd

import web.typings.antd.anon.ComponentStack
import web.typings.antd.anon.Error
import web.typings.react.mod.Component
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAlertErrorBoundaryMod {
  
  @JSImport("antd/es/alert/ErrorBoundary", JSImport.Default)
  @js.native
  class default () extends ErrorBoundary
  
  @js.native
  trait ErrorBoundary extends Component[ErrorBoundaryProps, ErrorBoundaryStates, Any] {
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: js.Error, info: js.Object): Unit = js.native
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: Null, info: js.Object): Unit = js.native
    
    @JSName("state")
    var state_ErrorBoundary: Error = js.native
  }
  
  @js.native
  trait ErrorBoundaryProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var message: js.UndefOr[ReactElement] = js.native
  }
  object ErrorBoundaryProps {
    
    @scala.inline
    def apply(): ErrorBoundaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ErrorBoundaryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait ErrorBoundaryStates extends StObject {
    
    var error: js.UndefOr[js.Error | Null] = js.native
    
    var info: js.UndefOr[ComponentStack] = js.native
  }
  object ErrorBoundaryStates {
    
    @scala.inline
    def apply(): ErrorBoundaryStates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryStates]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ErrorBoundaryStates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: ComponentStack): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    }
  }
}
