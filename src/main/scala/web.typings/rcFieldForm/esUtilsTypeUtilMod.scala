package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.FormInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsTypeUtilMod {
  
  @JSImport("rc-field-form/es/utils/typeUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isFormInstance[T](form: T): /* is rc-field-form.rc-field-form/es/interface.FormInstance<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormInstance")(form.asInstanceOf[js.Any]).asInstanceOf[/* is rc-field-form.rc-field-form/es/interface.FormInstance<any> */ Boolean]
  @scala.inline
  def isFormInstance[T](form: FormInstance[Any]): /* is rc-field-form.rc-field-form/es/interface.FormInstance<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormInstance")(form.asInstanceOf[js.Any]).asInstanceOf[/* is rc-field-form.rc-field-form/es/interface.FormInstance<any> */ Boolean]
  
  @scala.inline
  def toArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
