package web.typings.antd

import web.typings.antd.esCheckboxGroupMod.CheckboxOptionType
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCheckboxGroupContextMod extends Shortcut {
  
  @JSImport("antd/es/checkbox/GroupContext", JSImport.Default)
  @js.native
  val default: Context[CheckboxGroupContext | Null] = js.native
  
  @js.native
  trait CheckboxGroupContext extends StObject {
    
    def cancelValue(`val`: String): Unit = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def registerValue(`val`: String): Unit = js.native
    
    var toggleOption: js.UndefOr[js.Function1[/* option */ CheckboxOptionType, Unit]] = js.native
    
    var value: js.UndefOr[Any] = js.native
  }
  object CheckboxGroupContext {
    
    @scala.inline
    def apply(cancelValue: String => Unit, registerValue: String => Unit): CheckboxGroupContext = {
      val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1(cancelValue), registerValue = js.Any.fromFunction1(registerValue))
      __obj.asInstanceOf[CheckboxGroupContext]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CheckboxGroupContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelValue(value: String => Unit): Self = StObject.set(x, "cancelValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegisterValue(value: String => Unit): Self = StObject.set(x, "registerValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleOption(value: /* option */ CheckboxOptionType => Unit): Self = StObject.set(x, "toggleOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleOptionUndefined: Self = StObject.set(x, "toggleOption", js.undefined)
      
      @scala.inline
      def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = Context[CheckboxGroupContext | Null]
  
  /* This means you don't have to write `default`, but can instead just say `esCheckboxGroupContextMod.foo` */
  override def _to: Context[CheckboxGroupContext | Null] = default
}
