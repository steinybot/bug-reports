package web.typings.rcCascader

import web.typings.react.mod.JSX.Element
import web.typings.react.mod.MouseEventHandler
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListCheckboxMod {
  
  @JSImport("rc-cascader/es/OptionList/Checkbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: CheckboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait CheckboxProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var disableCheckbox: Boolean = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var halfChecked: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[org.scalajs.dom.Element]] = js.native
    
    var prefixCls: String = js.native
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(disableCheckbox: Boolean, prefixCls: String): CheckboxProps = {
      val __obj = js.Dynamic.literal(disableCheckbox = disableCheckbox.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedUndefined: Self = StObject.set(x, "halfChecked", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[org.scalajs.dom.Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
