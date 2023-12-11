package web.typings.rcFieldForm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esInterfaceMod {
  
  type EventArgs = js.Array[scala.Any]
  
  type FilterFunc = js.Function1[/* meta */ web.typings.rcFieldForm.esInterfaceMod.Meta, scala.Boolean]
  
  type InternalNamePath = js.Array[java.lang.String | scala.Double]
  
  type NamePath[T] = web.typings.rcFieldForm.esNamePathTypeMod.DeepNamePath[T, js.Array[scala.Any]]
  
  /** Only return partial when type is not any */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    std.NonNullable<T> extends object ? {[ P in keyof T ]:? std.NonNullable<T[P]> extends std.Array<infer U>? std.Array<rc-field-form.rc-field-form/es/interface.RecursivePartial<U>> : std.NonNullable<T[P]> extends object? rc-field-form.rc-field-form/es/interface.RecursivePartial<T[P]> : T[P]} : T
    }}}
    */
  type RecursivePartial[T] = T
  
  type Rule = web.typings.rcFieldForm.esInterfaceMod.RuleObject | web.typings.rcFieldForm.esInterfaceMod.RuleRender
  
  type RuleRender = js.Function1[
    /* form */ web.typings.rcFieldForm.esInterfaceMod.FormInstance[scala.Any], 
    web.typings.rcFieldForm.esInterfaceMod.RuleObject
  ]
  
  type Store = web.typings.std.Record[java.lang.String, web.typings.rcFieldForm.esInterfaceMod.StoreValue]
  
  type StoreValue = scala.Any
  
  type ValidateMessage = java.lang.String | js.Function0[java.lang.String]
  
  type Validator = js.Function3[
    /* rule */ web.typings.rcFieldForm.esInterfaceMod.RuleObject, 
    /* value */ web.typings.rcFieldForm.esInterfaceMod.StoreValue, 
    /* callback */ js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit], 
    (js.Promise[scala.Unit | scala.Any]) | scala.Unit
  ]
  
  type ValuedNotifyInfo = web.typings.rcFieldForm.esInterfaceMod.NotifyInfo with web.typings.rcFieldForm.anon.Store
  
  type WatchCallBack = js.Function3[
    /* values */ web.typings.rcFieldForm.esInterfaceMod.Store, 
    /* allValues */ web.typings.rcFieldForm.esInterfaceMod.Store, 
    /* namePathList */ js.Array[web.typings.rcFieldForm.esInterfaceMod.InternalNamePath], 
    scala.Unit
  ]
}
