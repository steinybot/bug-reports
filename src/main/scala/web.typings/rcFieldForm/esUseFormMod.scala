package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.FormInstance
import web.typings.rcFieldForm.esInterfaceMod.InternalFormInstance
import web.typings.rcFieldForm.esInterfaceMod.InternalNamePath
import web.typings.rcFieldForm.esInterfaceMod.StoreValue
import web.typings.rcFieldForm.rcFieldFormStrings.updateValue
import web.typings.rcFieldForm.rcFieldFormStrings.validateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUseFormMod {
  
  @JSImport("rc-field-form/es/useForm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[FormInstance[Values]]]
  @scala.inline
  def default[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  @JSImport("rc-field-form/es/useForm", "FormStore")
  @js.native
  class FormStore protected () extends StObject {
    def this(forceRootUpdate: js.Function0[Unit]) = this()
    
    /* private */ var callbacks: Any = js.native
    
    /* private */ var destroyForm: Any = js.native
    
    /* private */ var dispatch: Any = js.native
    
    /* private */ var fieldEntities: Any = js.native
    
    /* private */ var forceRootUpdate: Any = js.native
    
    /* private */ var formHooked: Any = js.native
    
    /* private */ var getDependencyChildrenFields: Any = js.native
    
    /**
      * Get registered field entities.
      * @param pure Only return field which has a `name`. Default: false
      */
    /* private */ var getFieldEntities: Any = js.native
    
    /* private */ var getFieldEntitiesForNamePathList: Any = js.native
    
    /* private */ var getFieldError: Any = js.native
    
    /* private */ var getFieldValue: Any = js.native
    
    /* private */ var getFieldWarning: Any = js.native
    
    /* private */ var getFields: Any = js.native
    
    /* private */ var getFieldsError: Any = js.native
    
    /* private */ var getFieldsMap: Any = js.native
    
    /* private */ var getFieldsValue: Any = js.native
    
    def getForm(): InternalFormInstance = js.native
    
    /* private */ var getInitialValue: Any = js.native
    
    /* private */ var getInternalHooks: Any = js.native
    
    /**
      * This only trigger when a field is on constructor to avoid we get initialValue too late
      */
    /* private */ var initEntityValue: Any = js.native
    
    /* private */ var initialValues: Any = js.native
    
    /* private */ var isFieldTouched: Any = js.native
    
    /* private */ var isFieldValidating: Any = js.native
    
    /* private */ var isFieldsTouched: Any = js.native
    
    /* private */ var isFieldsValidating: Any = js.native
    
    /* private */ var isMergedPreserve: Any = js.native
    
    /* private */ var lastValidatePromise: Any = js.native
    
    /* private */ var notifyObservers: Any = js.native
    
    /* private */ var notifyWatch: Any = js.native
    
    /* private */ var preserve: Any = js.native
    
    /**
      * Record prev Form unmount fieldEntities which config preserve false.
      * This need to be refill with initialValues instead of store value.
      */
    /* private */ var prevWithoutPreserves: Any = js.native
    
    /* private */ var registerField: Any = js.native
    
    /* private */ var registerWatch: Any = js.native
    
    /* private */ var resetFields: Any = js.native
    
    /**
      * Reset Field with field `initialValue` prop.
      * Can pass `entities` or `namePathList` or just nothing.
      */
    /* private */ var resetWithFieldInitialValue: Any = js.native
    
    /* private */ var setCallbacks: Any = js.native
    
    /* private */ var setFieldValue: Any = js.native
    
    /* private */ var setFields: Any = js.native
    
    /* private */ var setFieldsValue: Any = js.native
    
    /**
      * First time `setInitialValues` should update store with initial value
      */
    /* private */ var setInitialValues: Any = js.native
    
    /* private */ var setPreserve: Any = js.native
    
    /* private */ var setValidateMessages: Any = js.native
    
    /* private */ var store: Any = js.native
    
    /* private */ var submit: Any = js.native
    
    /* private */ var subscribable: Any = js.native
    
    /* private */ var timeoutId: Any = js.native
    
    /**
      * Notify dependencies children with parent update
      * We need delay to trigger validate in case Field is under render props
      */
    /* private */ var triggerDependenciesUpdate: Any = js.native
    
    /* private */ var triggerOnFieldsChange: Any = js.native
    
    /* private */ var updateStore: Any = js.native
    
    /* private */ var updateValue: Any = js.native
    
    /* private */ var useSubscribe: Any = js.native
    
    /* private */ var validateFields: Any = js.native
    
    /* private */ var validateMessages: Any = js.native
    
    /* private */ var warningUnhooked: Any = js.native
    
    /* private */ var watchList: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcFieldForm.esUseFormMod.UpdateAction
    - `web.typings`.rcFieldForm.esUseFormMod.ValidateAction
  */
  trait ReducerAction extends StObject
  object ReducerAction {
    
    @scala.inline
    def UpdateAction(namePath: InternalNamePath, value: StoreValue): web.typings.rcFieldForm.esUseFormMod.UpdateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("updateValue")
      __obj.asInstanceOf[web.typings.rcFieldForm.esUseFormMod.UpdateAction]
    }
    
    @scala.inline
    def ValidateAction(namePath: InternalNamePath, triggerName: String): web.typings.rcFieldForm.esUseFormMod.ValidateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("validateField")
      __obj.asInstanceOf[web.typings.rcFieldForm.esUseFormMod.ValidateAction]
    }
  }
  
  @js.native
  trait UpdateAction
    extends StObject
       with ReducerAction {
    
    var namePath: InternalNamePath = js.native
    
    var `type`: updateValue = js.native
    
    var value: StoreValue = js.native
  }
  object UpdateAction {
    
    @scala.inline
    def apply(namePath: InternalNamePath, value: StoreValue): UpdateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("updateValue")
      __obj.asInstanceOf[UpdateAction]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UpdateAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamePath(value: InternalNamePath): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePathVarargs(value: (String | Double)*): Self = StObject.set(x, "namePath", js.Array(value :_*))
      
      @scala.inline
      def setType(value: updateValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: StoreValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidateAction
    extends StObject
       with ReducerAction {
    
    var namePath: InternalNamePath = js.native
    
    var triggerName: String = js.native
    
    var `type`: validateField = js.native
  }
  object ValidateAction {
    
    @scala.inline
    def apply(namePath: InternalNamePath, triggerName: String): ValidateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("validateField")
      __obj.asInstanceOf[ValidateAction]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ValidateAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamePath(value: InternalNamePath): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePathVarargs(value: (String | Double)*): Self = StObject.set(x, "namePath", js.Array(value :_*))
      
      @scala.inline
      def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: validateField): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
