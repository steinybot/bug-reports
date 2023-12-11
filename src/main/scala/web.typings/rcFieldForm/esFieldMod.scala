package web.typings.rcFieldForm

import web.typings.rcFieldForm.anon.Source
import web.typings.rcFieldForm.esInterfaceMod.EventArgs
import web.typings.rcFieldForm.esInterfaceMod.FormInstance
import web.typings.rcFieldForm.esInterfaceMod.InternalFormInstance
import web.typings.rcFieldForm.esInterfaceMod.InternalNamePath
import web.typings.rcFieldForm.esInterfaceMod.Meta
import web.typings.rcFieldForm.esInterfaceMod.NamePath
import web.typings.rcFieldForm.esInterfaceMod.Rule
import web.typings.rcFieldForm.esInterfaceMod.Store
import web.typings.rcFieldForm.esInterfaceMod.StoreValue
import web.typings.rcFieldForm.rcFieldFormBooleans.`false`
import web.typings.rcFieldForm.rcFieldFormStrings.parallel
import web.typings.react.mod.JSX.Element
import web.typings.std.Record
import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFieldMod {
  
  @JSImport("rc-field-form/es/Field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Values](param0: FieldProps[Values]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ChildProps = StringDictionary[Any]
  
  /* Inlined parent std.Omit<rc-field-form.rc-field-form/es/Field.InternalFieldProps<Values>, 'name' | 'fieldContext'> */
  @js.native
  trait FieldProps[Values] extends StObject {
    
    var children: js.UndefOr[
        ReactElement | (js.Function3[
          /* control */ ChildProps, 
          /* meta */ Meta, 
          /* form */ FormInstance[Values], 
          ReactElement
        ])
      ] = js.native
    
    var dependencies: js.UndefOr[js.Array[NamePath[Any]]] = js.native
    
    var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.native
    
    var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, Record[String, Any]]] = js.native
    
    var initialValue: js.UndefOr[Any] = js.native
    
    var isList: js.UndefOr[Boolean] = js.native
    
    var isListField: js.UndefOr[Boolean] = js.native
    
    var messageVariables: js.UndefOr[Record[String, String]] = js.native
    
    var name: js.UndefOr[NamePath[Values]] = js.native
    
    var normalize: js.UndefOr[
        js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
      ] = js.native
    
    var onMetaChange: js.UndefOr[js.Function1[/* meta */ MetaEvent, Unit]] = js.native
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.native
    
    var preserve: js.UndefOr[Boolean] = js.native
    
    var rules: js.UndefOr[js.Array[Rule]] = js.native
    
    var shouldUpdate: js.UndefOr[ShouldUpdate[Values]] = js.native
    
    var trigger: js.UndefOr[String] = js.native
    
    var validateDebounce: js.UndefOr[Double] = js.native
    
    var validateFirst: js.UndefOr[Boolean | parallel] = js.native
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
    
    var valuePropName: js.UndefOr[String] = js.native
  }
  object FieldProps {
    
    @scala.inline
    def apply[Values](): FieldProps[Values] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldProps[Values]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FieldProps[_], Values] (val x: Self with FieldProps[Values]) extends AnyVal {
      
      @scala.inline
      def setChildren(
        value: ReactElement | (js.Function3[
              /* control */ ChildProps, 
              /* meta */ Meta, 
              /* form */ FormInstance[Values], 
              ReactElement
            ])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(
        value: (/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values]) => ReactElement
      ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDependencies(value: js.Array[NamePath[Any]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: NamePath[Any]*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = StObject.set(x, "getValueFromEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueFromEventUndefined: Self = StObject.set(x, "getValueFromEvent", js.undefined)
      
      @scala.inline
      def setGetValueProps(value: /* value */ StoreValue => Record[String, Any]): Self = StObject.set(x, "getValueProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValuePropsUndefined: Self = StObject.set(x, "getValueProps", js.undefined)
      
      @scala.inline
      def setInitialValue(value: Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListFieldUndefined: Self = StObject.set(x, "isListField", js.undefined)
      
      @scala.inline
      def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      @scala.inline
      def setMessageVariables(value: Record[String, String]): Self = StObject.set(x, "messageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageVariablesUndefined: Self = StObject.set(x, "messageVariables", js.undefined)
      
      @scala.inline
      def setName(value: NamePath[Values]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = StObject.set(x, "normalize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setOnMetaChange(value: /* meta */ MetaEvent => Unit): Self = StObject.set(x, "onMetaChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMetaChangeUndefined: Self = StObject.set(x, "onMetaChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setShouldUpdate(value: ShouldUpdate[Values]): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUpdateFunction3(value: (Values, Values, /* info */ Source) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setValidateDebounce(value: Double): Self = StObject.set(x, "validateDebounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateDebounceUndefined: Self = StObject.set(x, "validateDebounce", js.undefined)
      
      @scala.inline
      def setValidateFirst(value: Boolean | parallel): Self = StObject.set(x, "validateFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFirstUndefined: Self = StObject.set(x, "validateFirst", js.undefined)
      
      @scala.inline
      def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      @scala.inline
      def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
      
      @scala.inline
      def setValuePropName(value: String): Self = StObject.set(x, "valuePropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePropNameUndefined: Self = StObject.set(x, "valuePropName", js.undefined)
    }
  }
  
  @js.native
  trait FieldState extends StObject {
    
    var resetCount: Double = js.native
  }
  object FieldState {
    
    @scala.inline
    def apply(resetCount: Double): FieldState = {
      val __obj = js.Dynamic.literal(resetCount = resetCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldState]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FieldState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResetCount(value: Double): Self = StObject.set(x, "resetCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InternalFieldProps[Values] extends StObject {
    
    var children: js.UndefOr[
        ReactElement | (js.Function3[
          /* control */ ChildProps, 
          /* meta */ Meta, 
          /* form */ FormInstance[Values], 
          ReactElement
        ])
      ] = js.native
    
    /**
      * Set up `dependencies` field.
      * When dependencies field update and current field is touched,
      * will trigger validate rules and render.
      */
    var dependencies: js.UndefOr[js.Array[NamePath[Any]]] = js.native
    
    /** @private Pass context as prop instead of context api
      *  since class component can not get context in constructor */
    var fieldContext: js.UndefOr[InternalFormInstance] = js.native
    
    var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.native
    
    var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, Record[String, Any]]] = js.native
    
    var initialValue: js.UndefOr[Any] = js.native
    
    /** @private Passed by Form.List props. Do not use since it will break by path check. */
    var isList: js.UndefOr[Boolean] = js.native
    
    /** @private Passed by Form.List props. Do not use since it will break by path check. */
    var isListField: js.UndefOr[Boolean] = js.native
    
    var messageVariables: js.UndefOr[Record[String, String]] = js.native
    
    var name: js.UndefOr[InternalNamePath] = js.native
    
    var normalize: js.UndefOr[
        js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
      ] = js.native
    
    var onMetaChange: js.UndefOr[js.Function1[/* meta */ MetaEvent, Unit]] = js.native
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.native
    
    var preserve: js.UndefOr[Boolean] = js.native
    
    var rules: js.UndefOr[js.Array[Rule]] = js.native
    
    var shouldUpdate: js.UndefOr[ShouldUpdate[Values]] = js.native
    
    var trigger: js.UndefOr[String] = js.native
    
    /**
      * Trigger will after configured milliseconds.
      */
    var validateDebounce: js.UndefOr[Double] = js.native
    
    var validateFirst: js.UndefOr[Boolean | parallel] = js.native
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
    
    var valuePropName: js.UndefOr[String] = js.native
  }
  object InternalFieldProps {
    
    @scala.inline
    def apply[Values](): InternalFieldProps[Values] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalFieldProps[Values]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalFieldProps[_], Values] (val x: Self with InternalFieldProps[Values]) extends AnyVal {
      
      @scala.inline
      def setChildren(
        value: ReactElement | (js.Function3[
              /* control */ ChildProps, 
              /* meta */ Meta, 
              /* form */ FormInstance[Values], 
              ReactElement
            ])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction3(
        value: (/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values]) => ReactElement
      ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDependencies(value: js.Array[NamePath[Any]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: NamePath[Any]*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setFieldContext(value: InternalFormInstance): Self = StObject.set(x, "fieldContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldContextUndefined: Self = StObject.set(x, "fieldContext", js.undefined)
      
      @scala.inline
      def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = StObject.set(x, "getValueFromEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueFromEventUndefined: Self = StObject.set(x, "getValueFromEvent", js.undefined)
      
      @scala.inline
      def setGetValueProps(value: /* value */ StoreValue => Record[String, Any]): Self = StObject.set(x, "getValueProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValuePropsUndefined: Self = StObject.set(x, "getValueProps", js.undefined)
      
      @scala.inline
      def setInitialValue(value: Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListFieldUndefined: Self = StObject.set(x, "isListField", js.undefined)
      
      @scala.inline
      def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      @scala.inline
      def setMessageVariables(value: Record[String, String]): Self = StObject.set(x, "messageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageVariablesUndefined: Self = StObject.set(x, "messageVariables", js.undefined)
      
      @scala.inline
      def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = StObject.set(x, "normalize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setOnMetaChange(value: /* meta */ MetaEvent => Unit): Self = StObject.set(x, "onMetaChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMetaChangeUndefined: Self = StObject.set(x, "onMetaChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setShouldUpdate(value: ShouldUpdate[Values]): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUpdateFunction3(value: (Values, Values, /* info */ Source) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setValidateDebounce(value: Double): Self = StObject.set(x, "validateDebounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateDebounceUndefined: Self = StObject.set(x, "validateDebounce", js.undefined)
      
      @scala.inline
      def setValidateFirst(value: Boolean | parallel): Self = StObject.set(x, "validateFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFirstUndefined: Self = StObject.set(x, "validateFirst", js.undefined)
      
      @scala.inline
      def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      @scala.inline
      def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
      
      @scala.inline
      def setValuePropName(value: String): Self = StObject.set(x, "valuePropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePropNameUndefined: Self = StObject.set(x, "valuePropName", js.undefined)
    }
  }
  
  @js.native
  trait MetaEvent
    extends StObject
       with Meta {
    
    var destroy: js.UndefOr[Boolean] = js.native
  }
  object MetaEvent {
    
    @scala.inline
    def apply(
      errors: js.Array[String],
      name: InternalNamePath,
      touched: Boolean,
      validated: Boolean,
      validating: Boolean,
      warnings: js.Array[String]
    ): MetaEvent = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MetaEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    }
  }
  
  type ShouldUpdate[Values] = Boolean | (js.Function3[/* prevValues */ Values, /* nextValues */ Values, /* info */ Source, Boolean])
}
