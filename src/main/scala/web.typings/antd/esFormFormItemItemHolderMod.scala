package web.typings.antd

import web.typings.antd.anon.Icons
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdStrings.parallel
import web.typings.antd.esFormContextMod.ReportMetaChange
import web.typings.antd.esFormFormItemLabelMod.LabelTooltipType
import web.typings.antd.esFormFormItemMod.ValidateStatus
import web.typings.antd.esFormInterfaceMod.FormLabelAlign
import web.typings.antd.esGridColMod.ColProps
import web.typings.rcFieldForm.anon.Source
import web.typings.rcFieldForm.esFieldMod.MetaEvent
import web.typings.rcFieldForm.esFieldMod.ShouldUpdate
import web.typings.rcFieldForm.esInterfaceMod.EventArgs
import web.typings.rcFieldForm.esInterfaceMod.Meta
import web.typings.rcFieldForm.esInterfaceMod.NamePath
import web.typings.rcFieldForm.esInterfaceMod.Rule
import web.typings.rcFieldForm.esInterfaceMod.Store
import web.typings.rcFieldForm.esInterfaceMod.StoreValue
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.Key
import web.typings.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormFormItemItemHolderMod {
  
  @JSImport("antd/es/form/FormItem/ItemHolder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: ItemHolderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined parent antd.antd/es/form/FormItem.FormItemProps<any> */
  @js.native
  trait ItemHolderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colon: js.UndefOr[Boolean] = js.native
    
    var dependencies: js.UndefOr[js.Array[NamePath[Any]]] = js.native
    
    var errors: js.Array[ReactElement] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var fieldId: js.UndefOr[String] = js.native
    
    /** @deprecated No need anymore */
    var fieldKey: js.UndefOr[Key | js.Array[Key]] = js.native
    
    var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.native
    
    var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, Record[String, Any]]] = js.native
    
    var hasFeedback: js.UndefOr[Boolean | Icons] = js.native
    
    var help: js.UndefOr[ReactElement] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var htmlFor: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var initialValue: js.UndefOr[Any] = js.native
    
    var isList: js.UndefOr[Boolean] = js.native
    
    var isListField: js.UndefOr[Boolean] = js.native
    
    var isRequired: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var labelAlign: js.UndefOr[FormLabelAlign] = js.native
    
    var labelCol: js.UndefOr[ColProps] = js.native
    
    var messageVariables: js.UndefOr[Record[String, String]] = js.native
    
    var meta: Meta = js.native
    
    var name: js.UndefOr[NamePath[Any]] = js.native
    
    var noStyle: js.UndefOr[Boolean] = js.native
    
    var normalize: js.UndefOr[
        js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
      ] = js.native
    
    var onMetaChange: js.UndefOr[js.Function1[/* meta */ MetaEvent, Unit]] = js.native
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSubItemMetaChange: ReportMetaChange = js.native
    
    var prefixCls: String = js.native
    
    var preserve: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rules: js.UndefOr[js.Array[Rule]] = js.native
    
    var shouldUpdate: js.UndefOr[ShouldUpdate[Any]] = js.native
    
    var status: js.UndefOr[ValidateStatus] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tooltip: js.UndefOr[LabelTooltipType] = js.native
    
    var trigger: js.UndefOr[String] = js.native
    
    var validateDebounce: js.UndefOr[Double] = js.native
    
    var validateFirst: js.UndefOr[Boolean | parallel] = js.native
    
    var validateStatus: js.UndefOr[ValidateStatus] = js.native
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
    
    var valuePropName: js.UndefOr[String] = js.native
    
    var warnings: js.Array[ReactElement] = js.native
    
    var wrapperCol: js.UndefOr[ColProps] = js.native
  }
  object ItemHolderProps {
    
    @scala.inline
    def apply(
      errors: js.Array[ReactElement],
      meta: Meta,
      onSubItemMetaChange: (/* meta */ Meta, /* uniqueKeys */ js.Array[Key]) => Unit,
      prefixCls: String,
      warnings: js.Array[ReactElement]
    ): ItemHolderProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], onSubItemMetaChange = js.Any.fromFunction2(onSubItemMetaChange), prefixCls = prefixCls.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHolderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ItemHolderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      @scala.inline
      def setDependencies(value: js.Array[NamePath[Any]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: NamePath[Any]*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      @scala.inline
      def setFieldKey(value: Key | js.Array[Key]): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldKeyUndefined: Self = StObject.set(x, "fieldKey", js.undefined)
      
      @scala.inline
      def setFieldKeyVarargs(value: Key*): Self = StObject.set(x, "fieldKey", js.Array(value :_*))
      
      @scala.inline
      def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = StObject.set(x, "getValueFromEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueFromEventUndefined: Self = StObject.set(x, "getValueFromEvent", js.undefined)
      
      @scala.inline
      def setGetValueProps(value: /* value */ StoreValue => Record[String, Any]): Self = StObject.set(x, "getValueProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValuePropsUndefined: Self = StObject.set(x, "getValueProps", js.undefined)
      
      @scala.inline
      def setHasFeedback(value: Boolean | Icons): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
      
      @scala.inline
      def setHelp(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
      def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMessageVariables(value: Record[String, String]): Self = StObject.set(x, "messageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageVariablesUndefined: Self = StObject.set(x, "messageVariables", js.undefined)
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: NamePath[Any]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setNoStyle(value: Boolean): Self = StObject.set(x, "noStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStyleUndefined: Self = StObject.set(x, "noStyle", js.undefined)
      
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
      def setOnSubItemMetaChange(value: (/* meta */ Meta, /* uniqueKeys */ js.Array[Key]) => Unit): Self = StObject.set(x, "onSubItemMetaChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setShouldUpdate(value: ShouldUpdate[Any]): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUpdateFunction3(value: (Any, Any, /* info */ Source) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      @scala.inline
      def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltip(value: LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipReactElement(value: ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
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
      def setValidateStatus(value: ValidateStatus): Self = StObject.set(x, "validateStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
      
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
      
      @scala.inline
      def setWarnings(value: js.Array[ReactElement]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: ReactElement*): Self = StObject.set(x, "warnings", js.Array(value :_*))
      
      @scala.inline
      def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
}
