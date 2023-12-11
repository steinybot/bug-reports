package web.typings.rcFieldForm.esInterfaceMod

import web.typings.rcFieldForm.rcFieldFormBooleans.`false`
import web.typings.rcFieldForm.rcFieldFormBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rc-field-form.rc-field-form/es/interface.FormInstance<any>, 'validateFields'> & {  validateFields :rc-field-form.rc-field-form/es/interface.InternalValidateFields<any>,   prefixName :rc-field-form.rc-field-form/es/interface.InternalNamePath | undefined,   validateTrigger :string | std.Array<string> | false | undefined, getInternalHooks (secret : string): rc-field-form.rc-field-form/es/interface.InternalHooks | null,   _init :boolean | undefined} */
@js.native
trait InternalFormInstance extends StObject {
  
  /** @private Internal usage. Do not use it in your production */
  var _init: js.UndefOr[Boolean] = js.native
  
  var getFieldError: js.Function1[/* name */ NamePath[Any], js.Array[String]] = js.native
  
  var getFieldValue: js.Function1[/* name */ NamePath[Any], StoreValue] = js.native
  
  var getFieldWarning: js.Function1[/* name */ NamePath[Any], js.Array[String]] = js.native
  
  var getFieldsError: js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath[Any]]], js.Array[FieldError]] = js.native
  
  var getFieldsValue: js.Function0[Any] with (js.Function2[
    /* nameList */ js.Array[NamePath[Any]] | `true`, 
    /* filterFunc */ js.UndefOr[FilterFunc], 
    Any
  ]) with (js.Function1[/* config */ GetFieldsValueConfig, Any]) = js.native
  
  /**
    * Form component should register some content into store.
    * We pass the `HOOK_MARK` as key to avoid user call the function.
    */
  def getInternalHooks(secret: String): InternalHooks | Null = js.native
  
  var isFieldTouched: js.Function1[/* name */ NamePath[Any], Boolean] = js.native
  
  var isFieldValidating: js.Function1[/* name */ NamePath[Any], Boolean] = js.native
  
  var isFieldsTouched: (js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath[Any]]], 
    /* allFieldsTouched */ js.UndefOr[Boolean], 
    Boolean
  ]) with (js.Function1[/* allFieldsTouched */ js.UndefOr[Boolean], Boolean]) = js.native
  
  var isFieldsValidating: js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath[Any]]], Boolean] = js.native
  
  /**
    * Passed by field context props
    */
  var prefixName: js.UndefOr[InternalNamePath] = js.native
  
  var resetFields: js.Function1[/* fields */ js.UndefOr[js.Array[NamePath[Any]]], Unit] = js.native
  
  var setFieldValue: js.Function2[/* name */ NamePath[Any], /* value */ Any, Unit] = js.native
  
  var setFields: js.Function1[/* fields */ js.Array[FieldData], Unit] = js.native
  
  var setFieldsValue: js.Function1[/* values */ RecursivePartial[Any], Unit] = js.native
  
  var submit: js.Function0[Unit] = js.native
  
  var validateFields: InternalValidateFields[Any] = js.native
  
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
}
object InternalFormInstance {
  
  @scala.inline
  def apply(
    getFieldError: /* name */ NamePath[Any] => js.Array[String],
    getFieldValue: /* name */ NamePath[Any] => StoreValue,
    getFieldWarning: /* name */ NamePath[Any] => js.Array[String],
    getFieldsError: /* nameList */ js.UndefOr[js.Array[NamePath[Any]]] => js.Array[FieldError],
    getFieldsValue: js.Function0[Any] with (js.Function2[
      /* nameList */ js.Array[NamePath[Any]] | `true`, 
      /* filterFunc */ js.UndefOr[FilterFunc], 
      Any
    ]) with (js.Function1[/* config */ GetFieldsValueConfig, Any]),
    getInternalHooks: String => InternalHooks | Null,
    isFieldTouched: /* name */ NamePath[Any] => Boolean,
    isFieldValidating: /* name */ NamePath[Any] => Boolean,
    isFieldsTouched: (js.Function2[
      /* nameList */ js.UndefOr[js.Array[NamePath[Any]]], 
      /* allFieldsTouched */ js.UndefOr[Boolean], 
      Boolean
    ]) with (js.Function1[/* allFieldsTouched */ js.UndefOr[Boolean], Boolean]),
    isFieldsValidating: /* nameList */ js.UndefOr[js.Array[NamePath[Any]]] => Boolean,
    resetFields: /* fields */ js.UndefOr[js.Array[NamePath[Any]]] => Unit,
    setFieldValue: (/* name */ NamePath[Any], /* value */ Any) => Unit,
    setFields: /* fields */ js.Array[FieldData] => Unit,
    setFieldsValue: /* values */ RecursivePartial[Any] => Unit,
    submit: () => Unit,
    validateFields: InternalValidateFields[Any]
  ): InternalFormInstance = {
    val __obj = js.Dynamic.literal(getFieldError = js.Any.fromFunction1(getFieldError), getFieldValue = js.Any.fromFunction1(getFieldValue), getFieldWarning = js.Any.fromFunction1(getFieldWarning), getFieldsError = js.Any.fromFunction1(getFieldsError), getFieldsValue = getFieldsValue.asInstanceOf[js.Any], getInternalHooks = js.Any.fromFunction1(getInternalHooks), isFieldTouched = js.Any.fromFunction1(isFieldTouched), isFieldValidating = js.Any.fromFunction1(isFieldValidating), isFieldsTouched = isFieldsTouched.asInstanceOf[js.Any], isFieldsValidating = js.Any.fromFunction1(isFieldsValidating), resetFields = js.Any.fromFunction1(resetFields), setFieldValue = js.Any.fromFunction2(setFieldValue), setFields = js.Any.fromFunction1(setFields), setFieldsValue = js.Any.fromFunction1(setFieldsValue), submit = js.Any.fromFunction0(submit), validateFields = validateFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFormInstance]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: InternalFormInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFieldError(value: /* name */ NamePath[Any] => js.Array[String]): Self = StObject.set(x, "getFieldError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFieldValue(value: /* name */ NamePath[Any] => StoreValue): Self = StObject.set(x, "getFieldValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFieldWarning(value: /* name */ NamePath[Any] => js.Array[String]): Self = StObject.set(x, "getFieldWarning", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFieldsError(value: /* nameList */ js.UndefOr[js.Array[NamePath[Any]]] => js.Array[FieldError]): Self = StObject.set(x, "getFieldsError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFieldsValue(
      value: js.Function0[Any] with (js.Function2[
          /* nameList */ js.Array[NamePath[Any]] | `true`, 
          /* filterFunc */ js.UndefOr[FilterFunc], 
          Any
        ]) with (js.Function1[/* config */ GetFieldsValueConfig, Any])
    ): Self = StObject.set(x, "getFieldsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInternalHooks(value: String => InternalHooks | Null): Self = StObject.set(x, "getInternalHooks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFieldTouched(value: /* name */ NamePath[Any] => Boolean): Self = StObject.set(x, "isFieldTouched", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFieldValidating(value: /* name */ NamePath[Any] => Boolean): Self = StObject.set(x, "isFieldValidating", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFieldsTouched(
      value: (js.Function2[
          /* nameList */ js.UndefOr[js.Array[NamePath[Any]]], 
          /* allFieldsTouched */ js.UndefOr[Boolean], 
          Boolean
        ]) with (js.Function1[/* allFieldsTouched */ js.UndefOr[Boolean], Boolean])
    ): Self = StObject.set(x, "isFieldsTouched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFieldsValidating(value: /* nameList */ js.UndefOr[js.Array[NamePath[Any]]] => Boolean): Self = StObject.set(x, "isFieldsValidating", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefixName(value: InternalNamePath): Self = StObject.set(x, "prefixName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixNameUndefined: Self = StObject.set(x, "prefixName", js.undefined)
    
    @scala.inline
    def setPrefixNameVarargs(value: (String | Double)*): Self = StObject.set(x, "prefixName", js.Array(value :_*))
    
    @scala.inline
    def setResetFields(value: /* fields */ js.UndefOr[js.Array[NamePath[Any]]] => Unit): Self = StObject.set(x, "resetFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFieldValue(value: (/* name */ NamePath[Any], /* value */ Any) => Unit): Self = StObject.set(x, "setFieldValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFields(value: /* fields */ js.Array[FieldData] => Unit): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFieldsValue(value: /* values */ RecursivePartial[Any] => Unit): Self = StObject.set(x, "setFieldsValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateFields(value: InternalValidateFields[Any]): Self = StObject.set(x, "validateFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
    
    @scala.inline
    def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
    
    @scala.inline
    def set_init(value: Boolean): Self = StObject.set(x, "_init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUndefined: Self = StObject.set(x, "_init", js.undefined)
  }
}
