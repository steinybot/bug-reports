package web.typings.antd

import web.typings.antd.anon.`3`
import web.typings.antd.esFormFormItemMod.ValidateStatus
import web.typings.rcFieldForm.esInterfaceMod.Meta
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormFormItemStatusProviderMod {
  
  @JSImport("antd/es/form/FormItem/StatusProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: StatusProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait StatusProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var errors: js.Array[ReactElement] = js.native
    
    var hasFeedback: js.UndefOr[Boolean | `3`] = js.native
    
    var meta: Meta = js.native
    
    var noStyle: js.UndefOr[Boolean] = js.native
    
    var prefixCls: String = js.native
    
    var validateStatus: js.UndefOr[ValidateStatus] = js.native
    
    var warnings: js.Array[ReactElement] = js.native
  }
  object StatusProviderProps {
    
    @scala.inline
    def apply(errors: js.Array[ReactElement], meta: Meta, prefixCls: String, warnings: js.Array[ReactElement]): StatusProviderProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusProviderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StatusProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setHasFeedback(value: Boolean | `3`): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStyle(value: Boolean): Self = StObject.set(x, "noStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStyleUndefined: Self = StObject.set(x, "noStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateStatus(value: ValidateStatus): Self = StObject.set(x, "validateStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
      
      @scala.inline
      def setWarnings(value: js.Array[ReactElement]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: ReactElement*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
}
