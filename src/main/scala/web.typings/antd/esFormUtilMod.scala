package web.typings.antd

import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esFormFormItemMod.ValidateStatus
import web.typings.rcFieldForm.esInterfaceMod.InternalNamePath
import web.typings.rcFieldForm.esInterfaceMod.Meta
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormUtilMod {
  
  @JSImport("antd/es/form/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFieldId(namePath: InternalNamePath): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldId")(namePath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def getFieldId(namePath: InternalNamePath, formName: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldId")(namePath.asInstanceOf[js.Any], formName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getStatus[DefaultValue](
    errors: js.Array[ReactElement],
    warnings: js.Array[ReactElement],
    meta: Meta,
    defaultValidateStatus: DefaultValue
  ): ValidateStatus | DefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], defaultValidateStatus.asInstanceOf[js.Any])).asInstanceOf[ValidateStatus | DefaultValue]
  @scala.inline
  def getStatus[DefaultValue](
    errors: js.Array[ReactElement],
    warnings: js.Array[ReactElement],
    meta: Meta,
    defaultValidateStatus: DefaultValue,
    hasFeedback: Boolean
  ): ValidateStatus | DefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], defaultValidateStatus.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any])).asInstanceOf[ValidateStatus | DefaultValue]
  @scala.inline
  def getStatus[DefaultValue](
    errors: js.Array[ReactElement],
    warnings: js.Array[ReactElement],
    meta: Meta,
    defaultValidateStatus: DefaultValue,
    hasFeedback: Boolean,
    validateStatus: ValidateStatus
  ): ValidateStatus | DefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], defaultValidateStatus.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any], validateStatus.asInstanceOf[js.Any])).asInstanceOf[ValidateStatus | DefaultValue]
  @scala.inline
  def getStatus[DefaultValue](
    errors: js.Array[ReactElement],
    warnings: js.Array[ReactElement],
    meta: Meta,
    defaultValidateStatus: DefaultValue,
    hasFeedback: Unit,
    validateStatus: ValidateStatus
  ): ValidateStatus | DefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], defaultValidateStatus.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any], validateStatus.asInstanceOf[js.Any])).asInstanceOf[ValidateStatus | DefaultValue]
  @scala.inline
  def getStatus[DefaultValue](
    errors: js.Array[ReactElement],
    warnings: js.Array[ReactElement],
    meta: Meta,
    defaultValidateStatus: ValidateStatus
  ): ValidateStatus | DefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], defaultValidateStatus.asInstanceOf[js.Any])).asInstanceOf[ValidateStatus | DefaultValue]
  @scala.inline
  def getStatus[DefaultValue](
    errors: js.Array[ReactElement],
    warnings: js.Array[ReactElement],
    meta: Meta,
    defaultValidateStatus: ValidateStatus,
    hasFeedback: Boolean
  ): ValidateStatus | DefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], defaultValidateStatus.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any])).asInstanceOf[ValidateStatus | DefaultValue]
  @scala.inline
  def getStatus[DefaultValue](
    errors: js.Array[ReactElement],
    warnings: js.Array[ReactElement],
    meta: Meta,
    defaultValidateStatus: ValidateStatus,
    hasFeedback: Boolean,
    validateStatus: ValidateStatus
  ): ValidateStatus | DefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], defaultValidateStatus.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any], validateStatus.asInstanceOf[js.Any])).asInstanceOf[ValidateStatus | DefaultValue]
  @scala.inline
  def getStatus[DefaultValue](
    errors: js.Array[ReactElement],
    warnings: js.Array[ReactElement],
    meta: Meta,
    defaultValidateStatus: ValidateStatus,
    hasFeedback: Unit,
    validateStatus: ValidateStatus
  ): ValidateStatus | DefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(errors.asInstanceOf[js.Any], warnings.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], defaultValidateStatus.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any], validateStatus.asInstanceOf[js.Any])).asInstanceOf[ValidateStatus | DefaultValue]
  
  @scala.inline
  def toArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](candidate: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(candidate.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](candidate: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(candidate.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def toArray_false[T](candidate: `false`): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(candidate.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
