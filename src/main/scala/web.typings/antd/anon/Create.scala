package web.typings.antd.anon

import web.typings.antd.esFormContextMod.FormProviderProps
import web.typings.antd.esFormErrorListMod.ErrorListProps
import web.typings.antd.esFormFormItemMod.CompoundedComponent
import web.typings.antd.esFormFormListMod.FormListProps
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create extends StObject {
  
  var ErrorList: ReactComponentClass[ErrorListProps] = js.native
  
  var Item: CompoundedComponent = js.native
  
  var List: ReactComponentClass[FormListProps] = js.native
  
  var Provider: ReactComponentClass[FormProviderProps] = js.native
  
  /** @deprecated Only for warning usage. Do not use. */
  def create(): scala.Unit = js.native
  
  var useForm: FnCallForm = js.native
  
  var useFormInstance: Fn1 = js.native
  
  var useWatch: FnCallDependenciesForm = js.native
}
object Create {
  
  @scala.inline
  def apply(
    ErrorList: ReactComponentClass[ErrorListProps],
    Item: CompoundedComponent,
    List: ReactComponentClass[FormListProps],
    Provider: ReactComponentClass[FormProviderProps],
    create: () => scala.Unit,
    useForm: FnCallForm,
    useFormInstance: Fn1,
    useWatch: FnCallDependenciesForm
  ): Create = {
    val __obj = js.Dynamic.literal(ErrorList = ErrorList.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], List = List.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), useForm = useForm.asInstanceOf[js.Any], useFormInstance = useFormInstance.asInstanceOf[js.Any], useWatch = useWatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => scala.Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorList(value: ReactComponentClass[ErrorListProps]): Self = StObject.set(x, "ErrorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: CompoundedComponent): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: ReactComponentClass[FormListProps]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: ReactComponentClass[FormProviderProps]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseForm(value: FnCallForm): Self = StObject.set(x, "useForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFormInstance(value: Fn1): Self = StObject.set(x, "useFormInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWatch(value: FnCallDependenciesForm): Self = StObject.set(x, "useWatch", value.asInstanceOf[js.Any])
  }
}
