package web.typings.rcFieldForm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNamePathTypeMod {
  
  type BaseNamePath = String | Double | Boolean | (js.Array[String | Double | Boolean])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ParentNamePath['length'] extends 10 ? never : true extends Store extends rc-field-form.rc-field-form/es/namePathType.BaseNamePath ? true : false ? ParentNamePath['length'] extends 0 ? Store | rc-field-form.rc-field-form/es/namePathType.BaseNamePath : Store extends std.Array<any> ? [...ParentNamePath, number] : never : Store extends std.Array<any> ? [...ParentNamePath, number] | rc-field-form.rc-field-form/es/namePathType.DeepNamePath<Store[number], [...ParentNamePath, number]> : keyof Store extends never ? Store : {[ FieldKey in keyof Store ]: Store[FieldKey] extends std.Function? never : ParentNamePath['length'] extends 0? FieldKey : never | [...ParentNamePath, FieldKey] | rc-field-form.rc-field-form/es/namePathType.DeepNamePath<std.Required<Store>[FieldKey], [...ParentNamePath, FieldKey]>}[keyof Store]
    }}}
    */
  type DeepNamePath[Store, ParentNamePath /* <: js.Array[Any] */] = Store | BaseNamePath
}
