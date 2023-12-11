package web.typings.antd

import web.typings.antd.anon.Errors
import web.typings.antd.anon.Required
import web.typings.antd.esFormFormItemMod.FeedbackIcons
import web.typings.antd.esFormFormItemMod.ValidateStatus
import web.typings.antd.esFormFormMod.RequiredMark
import web.typings.antd.esFormHooksUseFormMod.FormInstance
import web.typings.antd.esFormInterfaceMod.FormLabelAlign
import web.typings.antd.esGridColMod.ColProps
import web.typings.rcFieldForm.esFormContextMod.FormChangeInfo
import web.typings.rcFieldForm.esFormContextMod.FormFinishInfo
import web.typings.rcFieldForm.esInterfaceMod.Meta
import web.typings.react.mod.Context
import web.typings.react.mod.Key
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormContextMod {
  
  @JSImport("antd/es/form/context", "FormContext")
  @js.native
  val FormContext: Context[FormContextProps] = js.native
  
  @JSImport("antd/es/form/context", "FormItemInputContext")
  @js.native
  val FormItemInputContext: Context[FormItemStatusContextProps] = js.native
  
  @JSImport("antd/es/form/context", "FormItemPrefixContext")
  @js.native
  val FormItemPrefixContext: Context[FormItemPrefixContextProps] = js.native
  
  @JSImport("antd/es/form/context", "FormProvider")
  @js.native
  val FormProvider: ReactComponentClass[FormProviderProps] = js.native
  
  @JSImport("antd/es/form/context", "NoFormStyle")
  @js.native
  val NoFormStyle: ReactComponentClass[NoFormStyleProps] = js.native
  
  @JSImport("antd/es/form/context", "NoStyleItemContext")
  @js.native
  val NoStyleItemContext: Context[ReportMetaChange | Null] = js.native
  
  @js.native
  trait FormContextProps extends StObject {
    
    var colon: js.UndefOr[Boolean] = js.native
    
    var feedbackIcons: js.UndefOr[FeedbackIcons] = js.native
    
    var form: js.UndefOr[FormInstance[Any]] = js.native
    
    def itemRef(name: js.Array[String | Double]): js.Function1[/* node */ ReactElement, Unit] = js.native
    
    var labelAlign: js.UndefOr[FormLabelAlign] = js.native
    
    var labelCol: js.UndefOr[ColProps] = js.native
    
    var labelWrap: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var requiredMark: js.UndefOr[RequiredMark] = js.native
    
    var vertical: Boolean = js.native
    
    var wrapperCol: js.UndefOr[ColProps] = js.native
  }
  object FormContextProps {
    
    @scala.inline
    def apply(
      itemRef: js.Array[String | Double] => js.Function1[/* node */ ReactElement, Unit],
      vertical: Boolean
    ): FormContextProps = {
      val __obj = js.Dynamic.literal(itemRef = js.Any.fromFunction1(itemRef), vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      @scala.inline
      def setFeedbackIcons(
        value: /* itemStatus */ Errors => /* import warning: importer.ImportType#apply Failed type conversion: {[ key in antd.antd/es/form/FormItem.ValidateStatus ]:? react.react.ReactNode} */ js.Any
      ): Self = StObject.set(x, "feedbackIcons", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFeedbackIconsUndefined: Self = StObject.set(x, "feedbackIcons", js.undefined)
      
      @scala.inline
      def setForm(value: FormInstance[Any]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setItemRef(value: js.Array[String | Double] => js.Function1[/* node */ ReactElement, Unit]): Self = StObject.set(x, "itemRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
      
      @scala.inline
      def setLabelWrap(value: Boolean): Self = StObject.set(x, "labelWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapUndefined: Self = StObject.set(x, "labelWrap", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequiredMark(value: RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredMarkFunction2(value: (/* labelNode */ ReactElement, /* info */ Required) => ReactElement): Self = StObject.set(x, "requiredMark", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
  
  @js.native
  trait FormItemPrefixContextProps extends StObject {
    
    var prefixCls: String = js.native
    
    var status: js.UndefOr[ValidateStatus] = js.native
  }
  object FormItemPrefixContextProps {
    
    @scala.inline
    def apply(prefixCls: String): FormItemPrefixContextProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormItemPrefixContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormItemPrefixContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait FormItemStatusContextProps extends StObject {
    
    var errors: js.UndefOr[js.Array[ReactElement]] = js.native
    
    var feedbackIcon: js.UndefOr[ReactElement] = js.native
    
    var hasFeedback: js.UndefOr[Boolean] = js.native
    
    var isFormItemInput: js.UndefOr[Boolean] = js.native
    
    var status: js.UndefOr[ValidateStatus] = js.native
    
    var warnings: js.UndefOr[js.Array[ReactElement]] = js.native
  }
  object FormItemStatusContextProps {
    
    @scala.inline
    def apply(): FormItemStatusContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemStatusContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormItemStatusContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setFeedbackIcon(value: ReactElement): Self = StObject.set(x, "feedbackIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedbackIconUndefined: Self = StObject.set(x, "feedbackIcon", js.undefined)
      
      @scala.inline
      def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
      
      @scala.inline
      def setIsFormItemInput(value: Boolean): Self = StObject.set(x, "isFormItemInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFormItemInputUndefined: Self = StObject.set(x, "isFormItemInput", js.undefined)
      
      @scala.inline
      def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setWarnings(value: js.Array[ReactElement]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      @scala.inline
      def setWarningsVarargs(value: ReactElement*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  /* Inlined parent std.Omit<rc-field-form.rc-field-form/es/FormContext.FormProviderProps, 'validateMessages'> */
  @js.native
  trait FormProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.native
    
    var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
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
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* Inlined react.react.PropsWithChildren<{  status :boolean | undefined,   override :boolean | undefined}> */
  @js.native
  trait NoFormStyleProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var `override`: js.UndefOr[Boolean] = js.native
    
    var status: js.UndefOr[Boolean] = js.native
  }
  object NoFormStyleProps {
    
    @scala.inline
    def apply(): NoFormStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoFormStyleProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NoFormStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type ReportMetaChange = js.Function2[/* meta */ Meta, /* uniqueKeys */ js.Array[Key], Unit]
}
