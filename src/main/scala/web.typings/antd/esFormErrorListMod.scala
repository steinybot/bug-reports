package web.typings.antd

import web.typings.antd.esFormFormItemMod.ValidateStatus
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormErrorListMod extends Shortcut {
  
  @JSImport("antd/es/form/ErrorList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ErrorListProps] = js.native
  
  @js.native
  trait ErrorListProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var errors: js.UndefOr[js.Array[ReactElement]] = js.native
    
    var fieldId: js.UndefOr[String] = js.native
    
    var help: js.UndefOr[ReactElement] = js.native
    
    var helpStatus: js.UndefOr[ValidateStatus] = js.native
    
    var onVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var warnings: js.UndefOr[js.Array[ReactElement]] = js.native
  }
  object ErrorListProps {
    
    @scala.inline
    def apply(): ErrorListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorListProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ErrorListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      @scala.inline
      def setHelp(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpStatus(value: ValidateStatus): Self = StObject.set(x, "helpStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpStatusUndefined: Self = StObject.set(x, "helpStatus", js.undefined)
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setOnVisibleChanged(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangedUndefined: Self = StObject.set(x, "onVisibleChanged", js.undefined)
      
      @scala.inline
      def setWarnings(value: js.Array[ReactElement]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      @scala.inline
      def setWarningsVarargs(value: ReactElement*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[ErrorListProps]
  
  /* This means you don't have to write `default`, but can instead just say `esFormErrorListMod.foo` */
  override def _to: ReactComponentClass[ErrorListProps] = default
}
