package web.typings.antd

import web.typings.antd.esFormFormItemMod.ValidateStatus
import web.typings.antd.esGridColMod.ColProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormFormItemInputMod extends Shortcut {
  
  @JSImport("antd/es/form/FormItemInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormItemInputProps with FormItemInputMiscProps] = js.native
  
  @js.native
  trait FormItemInputMiscProps extends StObject {
    
    var children: ReactElement = js.native
    
    var errors: js.Array[ReactElement] = js.native
    
    var marginBottom: js.UndefOr[Double | Null] = js.native
    
    var onErrorVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var warnings: js.Array[ReactElement] = js.native
  }
  object FormItemInputMiscProps {
    
    @scala.inline
    def apply(
      children: ReactElement,
      errors: js.Array[ReactElement],
      prefixCls: String,
      warnings: js.Array[ReactElement]
    ): FormItemInputMiscProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormItemInputMiscProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormItemInputMiscProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setOnErrorVisibleChanged(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onErrorVisibleChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorVisibleChangedUndefined: Self = StObject.set(x, "onErrorVisibleChanged", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: js.Array[ReactElement]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: ReactElement*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FormItemInputProps extends StObject {
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var fieldId: js.UndefOr[String] = js.native
    
    var help: js.UndefOr[ReactElement] = js.native
    
    var status: js.UndefOr[ValidateStatus] = js.native
    
    var wrapperCol: js.UndefOr[ColProps] = js.native
  }
  object FormItemInputProps {
    
    @scala.inline
    def apply(): FormItemInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemInputProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormItemInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      @scala.inline
      def setHelp(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormItemInputProps with FormItemInputMiscProps]
  
  /* This means you don't have to write `default`, but can instead just say `esFormFormItemInputMod.foo` */
  override def _to: ReactComponentClass[FormItemInputProps with FormItemInputMiscProps] = default
}
