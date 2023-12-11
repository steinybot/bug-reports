package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.InternalNamePath
import web.typings.rcFieldForm.esInterfaceMod.InternalValidateOptions
import web.typings.rcFieldForm.esInterfaceMod.RuleError
import web.typings.rcFieldForm.esInterfaceMod.RuleObject
import web.typings.rcFieldForm.esInterfaceMod.StoreValue
import web.typings.rcFieldForm.rcFieldFormStrings.parallel
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsValidateUtilMod {
  
  @JSImport("rc-field-form/es/utils/validateUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: InternalValidateOptions,
    validateFirst: Boolean
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  @scala.inline
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: InternalValidateOptions,
    validateFirst: Boolean,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any], messageVariables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  
  @scala.inline
  def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: InternalValidateOptions,
    validateFirst: parallel
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
  @scala.inline
  def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: InternalValidateOptions,
    validateFirst: parallel,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[RuleError]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRules")(namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validateFirst.asInstanceOf[js.Any], messageVariables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RuleError]]]
}
