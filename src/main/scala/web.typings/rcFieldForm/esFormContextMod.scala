package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.FieldData
import web.typings.rcFieldForm.esInterfaceMod.FormInstance
import web.typings.rcFieldForm.esInterfaceMod.Store
import web.typings.rcFieldForm.esInterfaceMod.ValidateMessages
import web.typings.react.mod.Context
import web.typings.std.Record
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormContextMod extends Shortcut {
  
  @JSImport("rc-field-form/es/FormContext", JSImport.Default)
  @js.native
  val default: Context[FormContextProps] = js.native
  
  @JSImport("rc-field-form/es/FormContext", "FormProvider")
  @js.native
  val FormProvider: ReactComponentClass[FormProviderProps] = js.native
  
  @js.native
  trait FormChangeInfo extends StObject {
    
    var changedFields: js.Array[FieldData] = js.native
    
    var forms: Forms = js.native
  }
  object FormChangeInfo {
    
    @scala.inline
    def apply(changedFields: js.Array[FieldData], forms: Forms): FormChangeInfo = {
      val __obj = js.Dynamic.literal(changedFields = changedFields.asInstanceOf[js.Any], forms = forms.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormChangeInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedFields(value: js.Array[FieldData]): Self = StObject.set(x, "changedFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedFieldsVarargs(value: FieldData*): Self = StObject.set(x, "changedFields", js.Array(value :_*))
      
      @scala.inline
      def setForms(value: Forms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormContextProps
    extends StObject
       with FormProviderProps {
    
    def registerForm(name: String, form: FormInstance[Any]): Unit = js.native
    
    def triggerFormChange(name: String, changedFields: js.Array[FieldData]): Unit = js.native
    
    def triggerFormFinish(name: String, values: Store): Unit = js.native
    
    def unregisterForm(name: String): Unit = js.native
  }
  object FormContextProps {
    
    @scala.inline
    def apply(
      registerForm: (String, FormInstance[Any]) => Unit,
      triggerFormChange: (String, js.Array[FieldData]) => Unit,
      triggerFormFinish: (String, Store) => Unit,
      unregisterForm: String => Unit
    ): FormContextProps = {
      val __obj = js.Dynamic.literal(registerForm = js.Any.fromFunction2(registerForm), triggerFormChange = js.Any.fromFunction2(triggerFormChange), triggerFormFinish = js.Any.fromFunction2(triggerFormFinish), unregisterForm = js.Any.fromFunction1(unregisterForm))
      __obj.asInstanceOf[FormContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegisterForm(value: (String, FormInstance[Any]) => Unit): Self = StObject.set(x, "registerForm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTriggerFormChange(value: (String, js.Array[FieldData]) => Unit): Self = StObject.set(x, "triggerFormChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTriggerFormFinish(value: (String, Store) => Unit): Self = StObject.set(x, "triggerFormFinish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnregisterForm(value: String => Unit): Self = StObject.set(x, "unregisterForm", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FormFinishInfo extends StObject {
    
    var forms: Forms = js.native
    
    var values: Store = js.native
  }
  object FormFinishInfo {
    
    @scala.inline
    def apply(forms: Forms, values: Store): FormFinishInfo = {
      val __obj = js.Dynamic.literal(forms = forms.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFinishInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormFinishInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForms(value: Forms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Store): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.native
    
    var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.native
    
    var validateMessages: js.UndefOr[ValidateMessages] = js.native
  }
  object FormProviderProps {
    
    @scala.inline
    def apply(): FormProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProviderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): Self = StObject.set(x, "onFormChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFormChangeUndefined: Self = StObject.set(x, "onFormChange", js.undefined)
      
      @scala.inline
      def setOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): Self = StObject.set(x, "onFormFinish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFormFinishUndefined: Self = StObject.set(x, "onFormFinish", js.undefined)
      
      @scala.inline
      def setValidateMessages(value: ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
    }
  }
  
  type Forms = Record[String, FormInstance[Any]]
  
  type _To = Context[FormContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esFormContextMod.foo` */
  override def _to: Context[FormContextProps] = default
}
