package web.typings.rcFieldForm

import web.typings.rcFieldForm.anon.FnCall
import web.typings.rcFieldForm.anon.FnCallDependenciesForm
import web.typings.rcFieldForm.anon.FnCallForm
import web.typings.rcFieldForm.anon.FnCallParam0
import web.typings.rcFieldForm.anon.Ref
import web.typings.rcFieldForm.esFieldMod.FieldProps
import web.typings.rcFieldForm.esFormContextMod.FormProviderProps
import web.typings.rcFieldForm.esFormMod.FormProps
import web.typings.rcFieldForm.esInterfaceMod.FormInstance
import web.typings.rcFieldForm.esInterfaceMod.InternalFormInstance
import web.typings.rcFieldForm.esInterfaceMod.NamePath
import web.typings.rcFieldForm.esInterfaceMod.WatchOptions
import web.typings.rcFieldForm.esListContextMod.ListContextProps
import web.typings.rcFieldForm.esListMod.ListProps
import web.typings.rcFieldForm.esUseWatchMod.GetGeneric
import web.typings.react.mod.Context
import web.typings.react.mod.JSX.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-field-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-field-form", JSImport.Default)
  @js.native
  val default: RefFormType = js.native
  
  @scala.inline
  def Field[Values](param0: FieldProps[Values]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-field-form", "FieldContext")
  @js.native
  val FieldContext: Context[InternalFormInstance] = js.native
  
  @JSImport("rc-field-form", "FormProvider")
  @js.native
  val FormProvider: ReactComponentClass[FormProviderProps] = js.native
  
  @scala.inline
  def List[Values](param0: ListProps[Values]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("List")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-field-form", "ListContext")
  @js.native
  val ListContext: Context[ListContextProps] = js.native
  
  @scala.inline
  def useForm[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")().asInstanceOf[js.Array[FormInstance[Values]]]
  @scala.inline
  def useForm[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  @scala.inline
  def useWatch[TForm /* <: FormInstance[Any] */](dependencies: NamePath[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Any]
  @scala.inline
  def useWatch[TForm /* <: FormInstance[Any] */](dependencies: NamePath[Any], form: TForm): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def useWatch[ValueType](dependencies: NamePath[Any], form: FormInstance[Any]): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  @scala.inline
  def useWatch[TForm /* <: FormInstance[Any] */](dependencies: NamePath[Any], form: WatchOptions[TForm]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def useWatch[TForm /* <: FormInstance[Any] */](dependencies: js.Array[Any]): GetGeneric[TForm] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[GetGeneric[TForm]]
  @scala.inline
  def useWatch[TForm /* <: FormInstance[Any] */](dependencies: js.Array[Any], form: TForm): GetGeneric[TForm] = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[GetGeneric[TForm]]
  @scala.inline
  def useWatch[TForm /* <: FormInstance[Any] */](dependencies: js.Array[Any], form: WatchOptions[TForm]): GetGeneric[TForm] = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[GetGeneric[TForm]]
  @scala.inline
  def useWatch[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: TDependencies): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  @scala.inline
  def useWatch[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: TDependencies, form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  @scala.inline
  def useWatch[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: TDependencies, form: WatchOptions[TForm]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  @scala.inline
  def useWatch[ValueType, TSelected](selector: js.Function1[/* values */ ValueType, TSelected]): TSelected = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(selector.asInstanceOf[js.Any]).asInstanceOf[TSelected]
  @scala.inline
  def useWatch[TForm /* <: FormInstance[Any] */, TSelected](selector: js.Function1[/* values */ GetGeneric[TForm], TSelected], form: TForm): TSelected = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(selector.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[TSelected]
  @scala.inline
  def useWatch[ValueType, TSelected](selector: js.Function1[/* values */ ValueType, TSelected], form: FormInstance[Any]): TSelected = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(selector.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[TSelected]
  @scala.inline
  def useWatch[ValueType, TSelected](selector: js.Function1[/* values */ ValueType, TSelected], form: WatchOptions[FormInstance[Any]]): TSelected = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(selector.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[TSelected]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */](dependencies: js.Tuple2[TDependencies1, TDependencies2]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */](dependencies: js.Tuple2[TDependencies1, TDependencies2], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */](dependencies: js.Tuple2[TDependencies1, TDependencies2], form: WatchOptions[TForm]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */](dependencies: js.Tuple3[TDependencies1, TDependencies2, TDependencies3]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */](dependencies: js.Tuple3[TDependencies1, TDependencies2, TDependencies3], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */](dependencies: js.Tuple3[TDependencies1, TDependencies2, TDependencies3], form: WatchOptions[TForm]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */, TDependencies4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any */](dependencies: js.Tuple4[TDependencies1, TDependencies2, TDependencies3, TDependencies4]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */, TDependencies4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any */](
    dependencies: js.Tuple4[TDependencies1, TDependencies2, TDependencies3, TDependencies4],
    form: TForm
  ): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any]
  @scala.inline
  def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */, TDependencies4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any */](
    dependencies: js.Tuple4[TDependencies1, TDependencies2, TDependencies3, TDependencies4],
    form: WatchOptions[TForm]
  ): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any]
  
  @scala.inline
  def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: js.Array[TDependencies]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  @scala.inline
  def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: js.Array[TDependencies], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  @scala.inline
  def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: js.Array[TDependencies], form: WatchOptions[TForm]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  
  @scala.inline
  def useWatch_TFormTSelected[TForm /* <: FormInstance[Any] */, TSelected](selector: js.Function1[/* values */ GetGeneric[TForm], TSelected]): TSelected = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(selector.asInstanceOf[js.Any]).asInstanceOf[TSelected]
  @scala.inline
  def useWatch_TFormTSelected[TForm /* <: FormInstance[Any] */, TSelected](selector: js.Function1[/* values */ GetGeneric[TForm], TSelected], form: WatchOptions[TForm]): TSelected = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(selector.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[TSelected]
  
  @scala.inline
  def useWatch_ValueType_ValueType[ValueType](dependencies: NamePath[Any]): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[ValueType]
  @scala.inline
  def useWatch_ValueType_ValueType[ValueType](dependencies: NamePath[Any], form: WatchOptions[FormInstance[Any]]): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  
  @js.native
  trait InternalFormType extends StObject {
    
    def apply[Values](props: FormProps[Values] with Ref[Values]): ReactElement = js.native
  }
  
  @js.native
  trait RefFormType
    extends StObject
       with InternalFormType {
    
    var Field: FnCall = js.native
    
    var FormProvider: ReactComponentClass[FormProviderProps] = js.native
    
    var List: FnCallParam0 = js.native
    
    var useForm: FnCallForm = js.native
    
    var useWatch: FnCallDependenciesForm = js.native
  }
}
