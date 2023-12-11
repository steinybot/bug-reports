package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<{  children :react.react.ReactNode | undefined}> */
@js.native
trait WeakValidationMapchildren extends StObject {
  
  var children: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
  ] = js.native
}
object WeakValidationMapchildren {
  
  @scala.inline
  def apply(): WeakValidationMapchildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapchildren]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: WeakValidationMapchildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
