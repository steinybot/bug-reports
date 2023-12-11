package web.typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponentElement[P]
  extends StObject
     with ReactElement {
  
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'ref' extends keyof P ? P extends {  ref :infer R | undefined} ? R : never : never */ js.Any
  ] = js.native
}
object FunctionComponentElement {
  
  @scala.inline
  def apply[P](props: Any, `type`: Any): FunctionComponentElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionComponentElement[P]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FunctionComponentElement[_], P] (val x: Self with FunctionComponentElement[P]) extends AnyVal {
    
    @scala.inline
    def setRef(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'ref' extends keyof P ? P extends {  ref :infer R | undefined} ? R : never : never */ js.Any
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
