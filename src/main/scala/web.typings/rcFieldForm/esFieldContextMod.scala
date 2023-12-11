package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.InternalFormInstance
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFieldContextMod extends Shortcut {
  
  @JSImport("rc-field-form/es/FieldContext", JSImport.Default)
  @js.native
  val default: Context[InternalFormInstance] = js.native
  
  @JSImport("rc-field-form/es/FieldContext", "HOOK_MARK")
  @js.native
  val HOOK_MARK: /* "RC_FORM_INTERNAL_HOOKS" */ String = js.native
  
  type _To = Context[InternalFormInstance]
  
  /* This means you don't have to write `default`, but can instead just say `esFieldContextMod.foo` */
  override def _to: Context[InternalFormInstance] = default
}
