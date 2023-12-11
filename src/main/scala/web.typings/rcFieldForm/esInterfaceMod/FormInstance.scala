package web.typings.rcFieldForm.esInterfaceMod

import web.typings.rcFieldForm.rcFieldFormBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormInstance[Values] extends StObject {
  
  def getFieldError(name: NamePath[Any]): js.Array[String] = js.native
  
  def getFieldValue(name: NamePath[Any]): StoreValue = js.native
  
  def getFieldWarning(name: NamePath[Any]): js.Array[String] = js.native
  
  def getFieldsError(): js.Array[FieldError] = js.native
  def getFieldsError(nameList: js.Array[NamePath[Any]]): js.Array[FieldError] = js.native
  
  var getFieldsValue: js.Function0[Values] with (js.Function2[
    /* nameList */ js.Array[NamePath[Any]] | `true`, 
    /* filterFunc */ js.UndefOr[FilterFunc], 
    Any
  ]) with (js.Function1[/* config */ GetFieldsValueConfig, Any]) = js.native
  
  def isFieldTouched(name: NamePath[Any]): Boolean = js.native
  
  def isFieldValidating(name: NamePath[Any]): Boolean = js.native
  
  var isFieldsTouched: (js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath[Any]]], 
    /* allFieldsTouched */ js.UndefOr[Boolean], 
    Boolean
  ]) with (js.Function1[/* allFieldsTouched */ js.UndefOr[Boolean], Boolean]) = js.native
  
  def isFieldsValidating(): Boolean = js.native
  def isFieldsValidating(nameList: js.Array[NamePath[Any]]): Boolean = js.native
  
  def resetFields(): Unit = js.native
  def resetFields(fields: js.Array[NamePath[Any]]): Unit = js.native
  
  def setFieldValue(name: NamePath[Any], value: Any): Unit = js.native
  
  def setFields(fields: js.Array[FieldData]): Unit = js.native
  
  def setFieldsValue(values: RecursivePartial[Values]): Unit = js.native
  
  def submit(): Unit = js.native
  
  var validateFields: ValidateFields[Values] = js.native
}
